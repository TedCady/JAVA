<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Insert title here</title>
</head>
<body>
	<div class ="container">
		<p>Submitted Info</p>
		<table>
			<tr>
				<td>Name:</td>
				<td><c:out value="${name}"/></td>
			</tr>
			<tr>
				<td>Dojo Location:</td>
				<td><c:out value="${location}"/></td>
			</tr>
			<tr>
				<td>Favorite Language:</td>
				<td><c:out value="${language}"/></td>
			</tr>
			<tr>
				<td>Comment:</td>
				<td><c:out value="${comment}"/></td>
			</tr>				
				
				
				
				
		</table>
		<input type="submit" value="Go Back" onclick="window.location='/'">
	
	
	
	</div>

</body>
</html>