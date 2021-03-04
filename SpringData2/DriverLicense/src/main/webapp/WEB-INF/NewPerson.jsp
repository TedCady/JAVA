<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Person</title>
<link rel="stylesheet" href="/css/index.css">
</head>
<body>
	<div id="container">
		<div id="left">
			<h1>New Person</h1>
			<form:form action="/addperson" method="post" modelAttribute="personObject">		  
			    <h2>
			        <form:label class="left" path="firstName">First Name:</form:label>
			        <form:input class="box" path="firstName"/>
			    </h2>
			    <h2>
			        <form:label class="left" path="lastName">Last Name:</form:label>
			        <form:input class="box" path="lastName"/>
			    </h2>
			    <input id="btn" type="submit" value="Create"/>	 
			</form:form>
		</div>
		<div id="right">
		<form:errors class="red" path="personObject.*"/>
		
		
		
		
		
		

		</div>
	</div>
</body>
</html>
		