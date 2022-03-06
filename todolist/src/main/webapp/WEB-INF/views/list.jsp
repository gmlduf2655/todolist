<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>TO-DO List</title>
	<link rel="stylesheet" href="/todolist/css/listStyle.css">
</head>
<body>
	<dir id="context">
		<h1>TO-DO 리스트</h1>
		<form action="write" method="POST">
			<input  name="content" type="text" id="input-content"> 
			<input type="submit" value="전송" id="input-content-submit">
		</form>
		<ul class="todolist">
			<c:forEach var="todo" items="${todolist}">
				<li><span>ㅇ </span> <span>${todo.content}</span> <a
					href="/todolist/delete/${todo.id}">❌</a>
				<li>
			</c:forEach>
		</ul>
	</dir>
	<script src="/todolist/js/background.js"></script>
</body>
</html>