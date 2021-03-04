<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<%@ page isErrorPage="true" %>
			<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

				<!DOCTYPE html>
				<html>

				<head>
					<meta charset="ISO-8859-1">
					<title>Edit a Language</title>
				</head>

				<body>
					<div>
						<div>
							<a href="/languages">>Dashboard</a>
							<a href="/languages/delete/<c:out value=" ${language.id}" />">Delete</a>
						</div>
						<form:form action="/languages/${language.id}" method="post" modelAttribute="language">
							<input type="hidden" name="_method" value="put">
							<p>
								<form:label path="name">Name</form:label>
								<form:input path="name" />
								<form:errors path="name" />

							</p>
							<p>
								<form:label path="creator">Creator</form:label>
								<form:input path="creator" />
								<form:errors path="creator" />
							</p>
							<p>
								<form:label path="version">Version</form:label>
								<form:input path="version" />
								<form:errors path="version" />
							</p>
							<input id="btn" type="submit" value="Submit" />
						</form:form>
					</div>
				</body>

				</html>