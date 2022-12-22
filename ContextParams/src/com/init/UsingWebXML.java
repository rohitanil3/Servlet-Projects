package com.init;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UsingWebXML extends HttpServlet{
	
	private Connection conn;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 String url1="jdbc:mysql://localhost:3306/local_db";
			  System.out.println("config obj"+config);
			  ServletContext servletContext = config.getServletContext();
			  Enumeration<String> initParameterNames = servletContext.getInitParameterNames();
			  while (initParameterNames.hasMoreElements()) {
				String paramName = (String) initParameterNames.nextElement();
				System.out.println("paramname"+paramName);
				System.out.println("param val"+servletContext.getInitParameter(paramName));
			}
			  
			 conn = DriverManager.getConnection(url1, servletContext.getInitParameter("dbuser"), servletContext.getInitParameter("pass"));
			System.out.println("created");

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}
	
	

}
