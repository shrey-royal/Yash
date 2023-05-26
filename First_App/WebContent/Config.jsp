<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Config Parameters</title>
<style>
	h4 {
		color: blue;
	}
	
	hr {
		border-top: 1px solid limegreen;
	}
</style>
</head>
<body>
	<% 
		out.print("Welcome " + config.getInitParameter("username")); 
		out.println("<hr><h4>" + application.getInitParameter("uname") + "</h4>");
		out.println("<hr><h4>" + application.getInitParameter("password") + "</h4>");
	
	%>
</body>
</html>