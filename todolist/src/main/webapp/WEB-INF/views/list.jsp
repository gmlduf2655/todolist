<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>TO-DO List</title>
	<link rel="stylesheet" href="/todolist/css/listStyle.css">
	<link rel="stylesheet" href="/todolist/css/menuStyle.css">
</head>

<body>
	<dir id="todomenu">
		<dir id="menu">
			<h1>현재 시간</h1>
			<h1 id="time"></h1>
			<h1 id="day"></h1>
			<form id="login-form">
			<label class="login-label" for="login" >아이디 : &nbsp;</label>
			<input type="text" id="login" size="25"><br>
			<label class="login-label" for="password">비밀번호 : </label>
			<input type="password" id="password" size="25"><br><br>
			<span id="login-submit-flex">
				<input type="submit" value="로그인" id="login-submit">
			</span>
			</form>
		</dir>
	
		<dir id="context">
			<h1>TO-DO 리스트</h1>
			<form action="write" method="POST">
				<input name="content" type="text" id="input-content"> <input
					type="submit" value="전송" id="input-content-submit">
			</form>
			<ul class="todolist">
				<c:forEach var="todo" items="${todolist}">
					<li><span>ㅇ </span> <span>${todo.content}</span> <a
						href="/todolist/delete/${todo.id}">❌</a>
					<li>
				</c:forEach>
			</ul>
		</dir>
		
		<dir id="menu2">
			
		</dir>		
	</dir>
	<script src="/todolist/js/background.js"></script>
	<script src="/todolist/js/time.js"></script>
</body>
</html>