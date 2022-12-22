package com.rk;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/accounts")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection conn;
	private Statement statement;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		//super.init();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 String url1="jdbc:mysql://localhost:3306/local_db";
			  
			 conn = DriverManager.getConnection(url1, "root", "system123#");
			System.out.println("Initiated");

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		//super.destroy();
				try {
					statement.close();
					conn.close();
					System.out.println("closed");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("get method");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Post method");
		int acno = Integer.parseInt(req.getParameter("acno"));
		String lname = req.getParameter("LName");
		String fname = req.getParameter("Fname");
		int bal = Integer.parseInt(req.getParameter("Balance"));
		System.out.println(acno+lname+fname+bal);
		try {
		    statement = conn.createStatement();
			int result = statement.executeUpdate("insert into account values("+acno+",'"+lname+"','"+fname+"',"+bal+")");
			System.out.println(result+" row saved in db");
			PrintWriter out = response.getWriter();
			out.println(result+" row saved in db");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
