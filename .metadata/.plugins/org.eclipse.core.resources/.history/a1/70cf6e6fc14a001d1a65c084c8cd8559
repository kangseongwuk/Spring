<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix='form' uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>test1</h2>
	<form:form modelAttribute="dataBean" action="result">
		<label>
		이름 : <form:input path="user_name"/><br>
		아이디 : <form:input path="user_id"/><br>
		비번 : <form:password path="user_pw" showPassword="true"/><br>
		비번2 : <form:input path="user_pw"/><br>
		우편번호 : <form:input path="user_postcode"/><br>
		주소 1 : <form:input path="user_address1"/><br>
		주소 2 : <form:input path="user_address2"/><br>
		<form:button type="submit">전송확인</form:button>
		<form:button type="submit" disabled="true">전송확인</form:button>
		</label>	
	</form:form>
</body>
</html>