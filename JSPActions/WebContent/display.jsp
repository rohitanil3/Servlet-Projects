<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dispolay Account details</title>
</head>
<body>
<!--using reflection below whaterver comes from request from html page is set here in beans property * is used to set all properties u can add individualy too -->
 <!-- here ref id account invokes set method of POJO class and sets property -->
 <jsp:useBean id="account" class="com.rk.Account">
 <jsp:setProperty property="*" name="account"/>
 </jsp:useBean>
 Account details

  
  acno: ${account.acno}<br>
            LName: ${account.LName}<br>
                      
            
                                                              
 
</body>
</html>