package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDAO {
	
	public static void main(String[] args) {
		  String url1="jdbc:mysql://localhost:3306/local_db";

		  try {
			Connection conn = DriverManager.getConnection(url1, "root", "system123#");
			System.out.println(conn);
			Statement statement = conn.createStatement();
			int result = statement.executeUpdate("insert into account values(1,'sd','tr',2323)");
			System.out.println(result+" row saved in db");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
  
  

}
