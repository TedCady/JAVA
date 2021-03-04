<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<%@ page isErrorPage="true" %>
			<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

				<!DOCTYPE html>
				<html>

				<head>
					<meta charset="ISO-8859-1">
					<title>List of Languages</title>
				</head>

				<body>
					<div>
						<table>
							<thead>
								<tr>
									<th scope="col">Name</th>
									<th scope="col">Creator</th>
									<th scope="col">Version</th>
									<th scope="col">Action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${languages}" var="language">
									<tr>
										<td><a href="languages/"<c:out value=" ${language.id}"/>
											<c:out value="${language.name}" /></a>
										</td>
										<td>
											<c:out value="${language.creator}" />
										</td>
										<td>
											<c:out value="${language.version}" />
										</td>
										<td><a href="/languages/delete/<c:out value=" ${language.id}" />">Delete</a> <a
												href="languages/edit/<c:out value=" ${language.id}" />">Edit</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						<div>
							<form:form action="/languages" method="post" modelAttribute="addNew">
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
					</div>
				</body>

				</html>