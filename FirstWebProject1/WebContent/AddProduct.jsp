<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="add" method="post">
ProductID <input type="text" name="id" readonly="readonly" value="${prod.pid}"><br><br>
Product name<input type="text" name="name" value="${prod.pname }"><br><br>
Cost<input type="text" name="cost" value="${prod.cost }"><br><br>
Quantity<input type="text" name="quantity" value="${prod.qty }">

<input type="submit" value="Add">
</body>
</html>