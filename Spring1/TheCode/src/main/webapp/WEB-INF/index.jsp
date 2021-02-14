<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


    <div class="container">
		<p class="error"><c:out value="${error}"/></p>
		<form method="post" action="/submit">
			<label>What is the code? <input type="text" name="code"></label>
			<button>Try Code</button>
		</form>
	</div>
</body>
</html>