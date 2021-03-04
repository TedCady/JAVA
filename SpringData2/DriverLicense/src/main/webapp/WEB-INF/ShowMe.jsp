
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New License</title>
<link rel="stylesheet" href="/css/index.css">
</head>
<body>
	<div id="container">
		<div id="left">
			<h1><c:out value="${license.person.firstName} ${license.person.lastName}"/></h1>
			<h2>License Number: <c:out value="${license.number}"/></h2>
			<h2>State: <c:out value="${license.state}"/></h2>
			<h2>Expiration Date: <fmt:formatDate pattern ="MM-dd-yyyy" value ="${license.expirationDate}"/></h2>
		</div>
	</div>
</body>
</html>
