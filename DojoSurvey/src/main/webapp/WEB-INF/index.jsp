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

	<div class="container">
		<form action="/submit" method="post">
			<label>Your Name: <input type="text" name="name"></label>
			<label>Dojo Location: <input type="text" name="location"></label>
			<label>Favorite Language: <input type="text" name="language"></label>
			<label> Comment(optional): <input type="text" name="comment"></label>
			<button>Submit</button>		
		
		</form>
	
	
	
	
	
	</div>



</body>
</html>