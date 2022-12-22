package com.rohit.DAO;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionUtility {
	
	public static Connection getConnection(){
		Connection connection =null;
		try {
			Context initialContext = new InitialContext();
			DataSource ds= (DataSource) initialContext.lookup("java:comp/env/myds");
			try {
				 connection = ds.getConnection();
				System.out.println(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return connection;
		
	}

}
