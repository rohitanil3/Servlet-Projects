package com.rohit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rohit.DAO.CouponDAO;
import com.rohit.model.Coupon;

/**
 * Servlet implementation class CouponController
 */
@WebServlet("/CouponController")
public class CouponController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CouponDAO couponDAO =new CouponDAO();


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("save")){
			createCoupon(request, response);
	
		}
		else
			findCoupon(request, response);
	}

	private void createCoupon(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Coupon coupon = new Coupon();
		String code = request.getParameter("code");
		int discount = Integer.parseInt(request.getParameter("discount"));
		String exp_date = request.getParameter("exp_date");
		coupon.setCode(code);
		coupon.setDiscount(discount);
		coupon.setExp_date(exp_date);
		couponDAO.save(coupon);

	}

	private void findCoupon(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String couponCode = request.getParameter("code");

		Coupon c=couponDAO.findCoupon(couponCode);
		PrintWriter writer = response.getWriter();
		writer.println(c.getCode());
		writer.println(c.getDiscount());
		writer.println(c.getExp_date());



	}
}
