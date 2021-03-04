<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
	<%@ page isErrorPage="true" %>    
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>    
	<div>
		<a href="/music">DashBoard</a>
		<form action="/music/${id}" method="post">
			<input type="hidden" name="_method" value="delete">
			<input type="submit" value="Delete">
		</form>
	</div>
	<form:form action="/music/${id}" method="post" modelAttribute="music">
	    <input type="hidden" name="_method" value="put">
	    <p>
	        <form:label path="name">Name</form:label>
	        <form:errors path="name"/>
	        <form:input type="text" minlength="5" path="name"/>
	    </p>
	    <p>
	        <form:label path="creator">Creator</form:label>
	        <form:errors path="creator"/>
	        <form:textarea type="text" minlength="5" path="creator"/>
	    </p>
	    <p>
	        <form:label path="rating">Rating</form:label>
	        <form:errors path="rating"/>
	        <form:input  type="number" min="1" max="10" path="rating"/>
	    </p>  
	    <input type="submit" value="Submit"/>
	</form:form>
</body>
</html>