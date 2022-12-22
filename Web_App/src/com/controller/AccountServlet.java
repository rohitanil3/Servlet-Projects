package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AccountServlet extends HttpServlet {
	Connection conn;
	Statement statement;
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		//super.init();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 String url1="jdbc:mysql://localhost:3306/local_db";

		  try {
			  
			 conn = DriverManager.getConnection(url1, "root", "system123#");
			System.out.println("Initiated");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(arg0, arg1);
		int acno = Integer.parseInt(req.getParameter("acno"));
		String lname = req.getParameter("LName");
		String fname = req.getParameter("Fname");
		int bal = Integer.parseInt(req.getParameter("Balance"));
		System.out.println(acno+lname+fname+bal);
		try {
		    statement = conn.createStatement();
			int result = statement.executeUpdate("insert into account values("+acno+",'"+lname+"','"+fname+"',"+bal+")");
			System.out.println(result+" row saved in db");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
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

}
