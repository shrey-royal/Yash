<%@page import="java.text.DateFormatSymbols"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Action Tag 1</title>
</head>
<body>
	<% 
		String dayNames[] = new DateFormatSymbols().getWeekdays();
		Calendar c = Calendar.getInstance();
		
		out.print("Today is " + dayNames[c.get(Calendar.DAY_OF_WEEK)]);
		
		
		out.print("<br><br>" + request.getParameter("royal"));
	%>
	This was Action tag 1 Page
</body>
</html>