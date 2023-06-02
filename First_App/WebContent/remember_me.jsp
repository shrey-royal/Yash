<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Remember Me</title>
</head>
<body>
	<%
	Cookie ck[] = request.getCookies();
	
	for(Cookie c: ck){
		System.out.println("\n\nCoookie -> " + c.getName());
	}
	
	%>
	
	<table border="1" style="border-collapse: collapse; border-color: red; border-spacing: 30px;">
		<thead style="font-weight: bold;">
			<tr>
					<td>Cookie Name</td>
					<td>Cookie Value</td>
			</tr>
		</thead>
		
		<tbody>
		
		<% for(Cookie c: ck) { %>
			
			<tr>
				<td><%= c.getName() %></td>
			
				<td><%= c.getValue() %></td>
			</tr>
		
		<%} %>		
		
		</tbody>
		
	</table>
</body>
</html>