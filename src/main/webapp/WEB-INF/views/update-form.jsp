<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sketchy/bootstrap.min.css" rel="stylesheet" integrity="sha384-N8DsABZCqc1XWbg/bAlIDk7AS/yNzT5fcKzg/TwfmTuUqZhGquVmpb5VvfmLcMzp" crossorigin="anonymous">
</head>
<body>
	<div class="container">
	
		<h1>Update Person</h1>
		<hr>
		<form action="update-person">
			<input type="hidden" name="id" value="${p.id }">
		 	<input type="text" name="name" value="${p.name }">
		 	<input type="text" name="location" value="${p.location }">
		 	<input type="submit" value="Update Person">
		</form>
	
	</div>

</body>
</html>