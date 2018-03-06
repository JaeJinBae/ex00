<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>이름: ${name}</p>
	<p>키: ${height}</p>
	<p>몸무게: ${weight}</p>
	<c:forEach var="item" items="${hobbys}">
		<p>취미: ${item}</p>
	</c:forEach>
	<p>bmi지수: ${bmi}</p>
</body>
</html>