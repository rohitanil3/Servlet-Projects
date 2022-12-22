package com.rohit.jdbcbatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/local_db", "root", "system123#");
				Statement st= conn.createStatement()){
			st.addBatch("insert into account values(10,'Vidyut','Jamwal','10000000')");
			st.addBatch("insert into account values(11,'Sid','Backeham','20000000')");
			int[] executeBatch = st.executeBatch();
			for (int i : executeBatch) {
				System.out.println(i);
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
