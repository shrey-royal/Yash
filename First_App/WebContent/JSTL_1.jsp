<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Tag</title>
</head>
<body>
	<c:out value="this is value"/>
	<c:set var="income" scope="session" value="${ 4000*4 }"/>
	<c:if test="${ income > 8000 }">
		<p>My income is: <c:out value="${ income }"/> </p>
	</c:if>
	
	<c:forEach var="i" begin="0" end="5">
		<p> Item <c:out value="${ i }"/> </p>
	</c:forEach>
	
	<c:choose>
		<c:when test="${ income <= 4000 }"> Income is not good </c:when>
		<c:when test="${ income > 10000 }"> Income is average </c:when>
		<c:otherwise> Go get some money </c:otherwise>
	</c:choose>
</body>
</html>

<!-- 

JSTL -> Java Standard tag Library

control statement / new custom tag

Advantages of JSP -> 1. Fast Development, 2. code reuseability, 3. code simplicity


4 tags: core(c) / function(fn) / formatting(fmt) / xml(x) / sql(sql)

 -->