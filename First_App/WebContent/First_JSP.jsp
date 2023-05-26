<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First JSP Page</title>
</head>
<body>
	<h1><% out.println("JSP Tags"); %></h1>
	<%	
		
		out.print("Welcome, " + request.getParameter("name") + "<br><br>");	
		out.print("Redirecting to Youtube...");
		out.print("" + (1+2) + "");
		/*
		out.print("<b>JSP Scriptlet Tag</b><br>");
		out.print("Used to print the data on the web app directly.<br>");
		out.print("You can write java Source code in here. and multiple lines can be written in a single tag.<br>");	
		*/
		//response.setContentType("text/html");
		//response.sendRedirect("https://www.youtube.com");
	%>
	<br><br>
	Current Time:
	<%= Calendar.getInstance().getTime().getHours() %>
	<br><br>
	
	1+2 = <%= "" + (1+2) + "" %>
	
	<br><br>
	<%! int i = 9; %>
	<%= "The value of i is " + i %>
	
</body>
</html>