<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>result14.jsp</h2>
	<h3>data5 : ${requestScope.data5}</h3>
	<h3>data6 : ${requestScope.data6}</h3>
	<h3>덧셈의 결과는 sum : ${requestScope.data5 + requestScope.data6}</h3>
</body>
</html>