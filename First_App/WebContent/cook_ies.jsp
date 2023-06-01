<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cookies</title>
</head>
<body>
	<%
		
		Cookie name = new Cookie("name", request.getParameter("name"));
		Cookie pass = new Cookie("pass", request.getParameter("password"));
		
		name.setMaxAge(2147483647);
		pass.setMaxAge(2147483647);
		
		if(request.getParameter("cb") != null) {
			response.addCookie(name);
			response.addCookie(pass);
		}
		
	
		/*
		Cookie ck[] = request.getCookies();
		
		for(Cookie i: ck) {
			System.out.println("Cookie Name: " + i.getName());
			System.out.println("Cookie Value: " + i.getValue() + "\n\n");
		}
		*/
		
	%>
</body>
</html>