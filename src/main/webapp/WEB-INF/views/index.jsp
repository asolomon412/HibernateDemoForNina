<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hibernate Demo</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sketchy/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-N8DsABZCqc1XWbg/bAlIDk7AS/yNzT5fcKzg/TwfmTuUqZhGquVmpb5VvfmLcMzp"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Add Person</h1>
		<hr>
		<form action="add-person">
		 	<input type="text" name="name" placeholder="Name">
		 	<input type="text" name="location" placeholder="Location">
		 	<input type="submit" value="Add Person">
		</form>
		<hr>
		<h1>Peeps</h1>
		
		<table class="table">
			<tr>
				<th>Order Number</th>
				<th>Name</th>
				<th>Location</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
			<c:forEach var="p" items="${test }" varStatus="i">
				<tr>
					<td>${i.count}</td>
					<td>${p.name }</td>
					<td>${p.location }</td>
					<td><a class="btn btn-primary" href="update-form?id=${p.id }&name=${p.name }&location=${p.location }">Edit</a></td>
					<td>Add Link</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	
	
</body>
</html>