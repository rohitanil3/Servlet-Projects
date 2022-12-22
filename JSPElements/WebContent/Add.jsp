<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<!-- here in the below request is a implicit object of a jsp -->
<body>
<%!
 int c;
%>
<% int num1 =  Integer.parseInt(request.getParameter("num1")); 
   int num2 =  Integer.parseInt(request.getParameter("num2")); 
   c=num1+num2;
%>
<!-- here below note that semi colon is not used , to show or evaluate any value this is used -->
sum is: <%= c %>
</body>
</html>