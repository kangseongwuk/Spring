<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>result15.jsp</h2>
	<h3>data1 : ${dataBean3.data1}</h3>
	<h3>data2 : ${requestScope.dataBean3.data2}</h3>
	<h3>덧셈의 결과는 sum : ${param.data1 + requestScope.dataBean3.data2}</h3>
</body>
</html>