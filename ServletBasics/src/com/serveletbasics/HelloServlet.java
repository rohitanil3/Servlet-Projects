package com.serveletbasics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet extends GenericServlet {
	
	// to use GenericServlet here instead httpservlet is we dont need to implement intit() and destroy() method

	@Override
	public void service(ServletRequest reqest, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello servlet</h1>");
		out.println("</body>");
		out.println("</html>");


	}

}
