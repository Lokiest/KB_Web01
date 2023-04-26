<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Result</h1>
<h3>
id : ${memberDTO.id }
name : ${memberDTO.name }
age : ${memberDTO.age }
addr : ${memberDTO.addr }
</h3>

<h1>Result - @ModelAttribute</h1>
<h3>
id : ${dto.id }<br>
name : ${dto.name }<br>
age : ${dto.age }<br>
addr : ${dto.addr }<br>
</h3>

<h2>
hobbys : ${hobbys } <br>
info : ${info }<br>
</h2>

<hr>
<fieldset>
	<legend>hobbys</legend>
	<c:forEach items="${hobbys}" var="h">
		<input type="checkbox" name="hobby"> ${h}
	</c:forEach>
</fieldset>
</body>
</html>