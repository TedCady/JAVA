<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<c:if test="${lazy == 'index'}">
		<div class="p">
			<h2>Products</h2>
			<a href="/new/product">Add New Product</a>
			<table>
				<tr>
					<th>Product Name</th>
					<th>Description</th>
					<th>Price</th>
				</tr>
				<c:forEach items="${pList}" var="p">
				<tr>
					<td><a href="/add/category/${p.id}">${p.name}</a></td>
					<td>${p.description}</td>
					<td>${p.price}</td>
				</tr>				
				</c:forEach>
			</table>		
		</div>
		<div class="c">
			<h2>Categories</h2>
			<a href="/new/category">Add New Category</a>
			<ul>
				<c:forEach items="${cList}" var="c">
				<li><a href="/add/product/${c.id}"><c:out value="${c.name}"/></a></li>				
				</c:forEach>
			</ul>				
		</div>		
	</c:if>
	<c:if test="${lazy == 'newP'}">
		<a href="/">DashBoard</a>
		<h1>Add New Product</h1>
		<form:form method="post" action="/newP" modelAttribute="p">
			<form:label  path="name">Product Name: <form:input minlength="1" path="name"/></form:label>
			<form:label  path="description">Description: <form:input minlength="1" path="description"/></form:label>
			<form:label  path="price">Price: <form:input type="number" step="0.01" min="0.01" path="price"/></form:label>
			<button>Submit</button>
		</form:form>	
	</c:if>	
	<c:if test="${lazy == 'newC'}">
		<a href="/">DashBoard</a>
		<h1>Add New Category</h1>
		<form:form method="post" action="/newC" modelAttribute="p">
			<form:label  path="name">Category Name: <form:input minlength="1" path="name"/></form:label>
			<button>Submit</button>
		</form:form>	
	</c:if>
	<c:if test="${lazy == 'addC'}">
		<a href="/">DashBoard</a>
		<h1>${pList.name}</h1>
		
			<ul>
				<c:forEach items="${pList.categories}" var="c">
				<li><a href="/add/product/${c.id}"><c:out value="${c.name}"/></a></li>				
				</c:forEach>
			</ul>			
		<form:form method="post" action="/addC/${pList.id}">
			<select name="p">
				<c:forEach items="${cList}" var="c">
					<option value="${c.id}">
						<c:out value="${c.name}"/>
					</option>
				</c:forEach>
			</select>
			<button>Submit</button>
		</form:form>	
	</c:if>	
	<c:if test="${lazy == 'addP'}">
		<a href="/">Dashboard</a>
		<h1>${cList.name}</h1>
		
			<ul>
				<c:forEach items="${cList.products}" var="p">
				<li><a href="/add/category/${p.id}"><c:out value="${p.name}"/></a></li>				
				</c:forEach>
			</ul>			
		<form:form method="post" action="/addP/${cList.id}">
			<select name="p">
				<c:forEach items="${pList}" var="c">
					<option value="${c.id}">
						<c:out value="${c.name}"/>
					</option>
				</c:forEach>
			</select>
			<button>Submit</button>
		</form:form>	
	</c:if>		
								
	</div>
</body>
</html>