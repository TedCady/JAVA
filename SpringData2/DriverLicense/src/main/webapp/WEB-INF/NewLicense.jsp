<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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
			<h1>New License</h1>
			<form:form action="/newLicense" method="post" modelAttribute="licenseObject">
				<h2>
			        <form:label class="left" path="person">Person:</form:label>
			        <form:select class="box" path="person">
						<c:forEach items="${personList}" var="person">
							<form:option value="${person.id}"><c:out value="${person.firstName} ${person.lastName}"/></form:option>
						</c:forEach>
					</form:select>
			    </h2>	  
			    <h2>
			        <form:label class="left" path="state">State:</form:label>
					<form:label class="left" path="state">State:</form:label>
    			    <form:select class="box" path="state">
						<c:forEach items="${states}" var="state">
							<form:option value="${state}"><c:out value="${state}"/></form:option>
						</c:forEach>
					</form:select>
			    </h2>
			    <h2>
			        <form:label class="left" path="expirationDate">Expiration Date:</form:label>
			        <form:input class="box" type="date" path="expirationDate"/>
			    </h2>
			    <input id="btn" type="submit" value="Create"/>	 
			</form:form>
		</div>
		<div id="right">
		<form:errors class="red" path="licenseObject.*"/>
		</div>
	</div>
	</body>
	</html>
			        