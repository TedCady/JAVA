<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
	<%@ page isErrorPage="true" %>    
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>    
	<div>
		<a href="/">DashBoard</a>
	</div>
	<h1><c:out value="${dojo.name} Ninjas"/></h1>
	<table>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Age</th>
		<c:forEach items="${ninja}" var="n">
			<tr>
				<td><c:out value="${n.firstName}"/></td>
				<td><c:out value="${n.lastName}"/></td>
				<td><c:out value="${n.age}"/></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>