
<!DOCTYPE html>
<html>
<head>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div class="container">
		<div class="top">
			<p>Your Gold:</p>
			<p class="goldCount"><c:out value="${goldCount}"/></p>
		</div>
		<div class="options">
			<div>
					<p>Farm</p>
					<p>(earns 10-20 gold)</p>
				<form method="post" action="/findGold">
					<input type="hidden" name="actionChosen" value="farm">
					<button>Find Gold!</button>
				</form>
			</div>
			<div>
					<p>Cave</p>
					<p>(earns 5-10 gold)</p>
				<form method="post" action="/findGold">			
					<input type="hidden" name="actionChosen" value="cave">
					<button>Find Gold!</button>
				</form>					
			</div>
			<div>
					<p>House</p>
					<p>(earns 2-5 gold)</p>
				<form method="post" action="/findGold">			
					<input type="hidden" name="actionChosen" value="house">
					<button>Find Gold!</button>
				</form>					
			</div>
			<div>
					<p>Casino!</p>
					<p>(earns/takes 0-50 gold)</p>
				<form method="post" action="/findGold">			
					<input type="hidden" name="actionChosen" value="casino">
					<button>Find Gold!</button>
				</form>					
			</div>														
		</div>		
		<div class="activities">
			<h3>Activities:</h3>
			<div>
				<ul>
				<c:forEach items="${activities}" var="val">
					<c:if test="${val.contains('earned')}">
						<li class="green"><c:out value="${val}"/></li>
					</c:if>
					<c:if test="${val.contains('lost')}">
						<li class="red"><c:out value="${val}"/></li>
					</c:if>					
				</c:forEach>
				</ul>
					
			</div>
		</div>			
	</div>

</body>
</html>