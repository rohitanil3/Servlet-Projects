package com.rohit.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.rohit.model.Product;

public class ProductDAO {
	
public void save(Product product){
		
		Connection connection = ConnectionUtility.getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement("insert into coupon(name,description,price) values(?,?,?)");
			statement.setString(1, product.getP_name());
			statement.setString(3, product.getDescription());
			statement.setInt(2, product.getPrice());
			int executeUpdate = statement.executeUpdate();
			System.out.println(executeUpdate+" record saved");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
