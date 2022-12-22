<%@ page import="java.sql.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <!-- Here above u can find the jsp page directive import contenttype lang etc. -->
    
    <!-- we will override jspinit() and jspdestroy() method -->
    
    <%!
    private Connection conn;
	private Statement statement;
	int result;
	
	   public void jspInit() {
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
	   
	   public void jspDestroy(){
			try {
				statement.close();
				conn.close();
				System.out.println("closed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
	   }
    %>
    <%
    //below jsp implicit object request is used, this scriptlet code is executed as jspservice() method execution
    int acno = Integer.parseInt(request.getParameter("acno"));
	String lname = request.getParameter("LName");
	String fname = request.getParameter("Fname");
	int bal = Integer.parseInt(request.getParameter("Balance"));
	System.out.println(acno+lname+fname+bal);
	try {
	    statement = conn.createStatement();
		 result = statement.executeUpdate("insert into account values("+acno+",'"+lname+"','"+fname+"',"+bal+")");
		System.out.println(result+" row saved in db");
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    %>
    <%@ include file="info.html" %>
   
     
