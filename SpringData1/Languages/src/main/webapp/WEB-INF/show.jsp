<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Language Info</title>
</head>
<body>
	<div>
	<div>
		<a href="/languages">Dashboard</a>
	</div>
		<h1><c:out value="${language.name}"/></h1>
		<h1><c:out value="${language.creator}"/></h1>
		<h1><c:out value="${language.version}"/></h1>
		<a href="/languages/edit/<c:out value="${language.id}"/>">Edit</a>
		<a href="/languages/delete/<c:out value="${language.id}"/>">Delete</a>
	</div>
</body>
</html>