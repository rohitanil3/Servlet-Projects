package com.rk;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("get");

		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		if(uname.equalsIgnoreCase("rohit")&& pass.equalsIgnoreCase("rk")){
			request.setAttribute("attr", "You have looged in to Home page");
			RequestDispatcher rd=request.getRequestDispatcher("homeServlet");
			rd.forward(request, response);
		}else{
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("post");
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		if(uname.equalsIgnoreCase("rohit")&& pass.equalsIgnoreCase("rk")){
			request.setAttribute("attr", "You have looged in to Home page");
			RequestDispatcher rd=request.getRequestDispatcher("homeServlet");
			rd.forward(request, response);
		}else{
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}	}

}
