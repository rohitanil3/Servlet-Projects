package com.rohit.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rohit.model.Coupon;

public class CouponDAO {
	
	public void save(Coupon coupon){
		
		Connection connection = ConnectionUtility.getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement("insert into coupon(code,discount,exp_date) values(?,?,?)");
			statement.setString(1, coupon.getCode());
			statement.setInt(2, coupon.getDiscount());
			statement.setString(3, coupon.getExp_date());
			int executeUpdate = statement.executeUpdate();
			System.out.println(executeUpdate+" record saved");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	public Coupon findCoupon(String couponCode){
		Coupon coupon=new Coupon();
		Connection connection = ConnectionUtility.getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement("select * from coupon where code=?");
			statement.setString(1, couponCode);
			ResultSet resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				coupon.setCode(resultSet.getString(2));
				coupon.setDiscount(resultSet.getInt(3));
				coupon.setExp_date(resultSet.getString(4));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return coupon;
		
	}


}
