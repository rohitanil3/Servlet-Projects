<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Coupon</title>
</head>
<body>
<form action="CouponController" method="post">
code:<input type="text" name="code" />
discount:<input type="text" name="discount" />
Expiry_Date:<input type="text" name="exp_date" />
<input type="hidden" name="action" value="save" />
<input type="submit" value="save" />

</form>
</body>
</html>