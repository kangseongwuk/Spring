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
	<h1>test1.jsp</h1>	
	 <form:form modelAttribute="dataBean" action="result">
		이름: <form:input  path="user_name"/><br>
		아이디: <form:input  path="user_id"/><br>
		비번: <form:password  path="user_pw" showPassword="true"/><br>
		우편번호 : <form:input  path="user_postcode"/><br>
		주소1 : <form:input  path="user_address1"/><br>
		주소2 : <form:input  path="user_address2"/><br>		
		<form:button>전송확인</form:button>
		<form:button disabled="true">전송확인</form:button>
	</form:form>
</body>
</html>