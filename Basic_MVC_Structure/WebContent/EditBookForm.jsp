<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Book Store</h1>
		<h2>
			<a href="AddBookForm.html">Add New Book</a>
			&nbsp;&nbsp;&nbsp;
			<a href="list">List All Books</a>
		</h2>
	</center>
	<div align="center">
			<form action="#" method="post">
			<table border="1" cellpadding="5">
				<caption> <h2> Edit Book </h2> </caption>
				<input type="hidden" name="id" value="<c:out value='${ book.id }' />" />
				<tr>
					<th>Title: </th>
					<td>
						<input type="text" name="title" size="45" value="<c:out value='${ book.title }' />" />
					</td>
				</tr>
				<tr>
					<th>Author: </th>
					<td>
						<input type="text" name="author" size="45" value="<c:out value='${ book.author }' />" />
					</td>
				</tr>
				<tr>
					<th>Price: </th>
					<td>
						<input type="text" name="price" size="5" value="<c:out value='${ book.price }' />" />
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="Update"/>
					</td>
				</tr>
			</table>
		</div>
</body>
</html>