<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
	<!DOCTYPE html>
	<html>

	<head>
		<%@ page isErrorPage="true" %>
			<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
				<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
					<link rel="stylesheet" type="text/css" href="css/style.css">
	</head>

	<body>

		<div class="container">
			<div class="Dojos">
				<ul>
					<c:forEach items="${dojos}" var="dj">
						<li><a href="/dojos/${dj.id}">
								<c:out value="${dj.name}" />
							</a></li>
					</c:forEach>
				</ul>

			</div>
			<div class="forms">
				<form:form action="/dojos/new" method="post" modelAttribute="dojo">
					<h2>New Dojo</h2>
					<form:label path="name">Dojo Name</form:label>
					<form:errors path="name" />
					<form:textarea type="text" path="name" />
					<button>Submit</button>
				</form:form>
				<form:form action="/ninjas/new" method="post" modelAttribute="ninja">
					<h2>New Student</h2>
					<ul>
						<li>
							<select name="dojo">
								<c:forEach items="${dojos}" var="dojo">
									<option value="${dojo.id}">
										<c:out value="${dojo.name}" />
									</option>
								</c:forEach>
							</select>
						</li>
						<li>
							<form:label path="firstName" minlength="3">First Name: </form:label>
							<form:errors path="firstName" />
							<form:textarea type="firstName" path="firstName" />
						</li>
						<li>
							<form:label path="lastName" minlength="3">Last Name: </form:label>
							<form:errors path="lastName" />
							<form:textarea type="lastName" path="lastName" />
						</li>
						<li>
							<form:label path="age">Age: </form:label>
							<form:errors path="age" />
							<form:textarea type="number" min="1" path="age" />
						</li>
					</ul>
					<button>Submit</button>
				</form:form>
			</div>
		</div>

	</body>

	</html>