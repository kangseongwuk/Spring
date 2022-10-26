<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>       
<c:url var='root' value='/'/>  
<!-- 세션에 대한 문자열이 없이(따라붙지 않고) 사용 합니다. 
<c:set var='root' value="${pageContext.request.contextPath }/"/>
  -->
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>top.jsp</title>
</head>
<body>

<!-- 상단 메뉴 부분 -->
<nav class="navbar navbar-expand-md bg-dark navbar-dark fixed-top shadow-lg">
	<a class="navbar-brand" href="${root }index">Ezen Academy</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
	        data-target="#navMenu">
		<span class="navbar-toggler-icon"></span>        
	</button>
	<div class="collapse navbar-collapse" id="navMenu">
		<ul class="navbar-nav">
			<c:forEach var="obj" items="${topMenuList }"> 
				<li class="nav-item">
					<a href="${root }board/main?board_info_idx=${obj.board_info_idx}" 
									class="nav-link">${obj.board_info_name}</a>
				</li>			
			</c:forEach>
		
		
			<%-- <li class="nav-item">
				<a href="${root }board/main" class="nav-link">자바게시판</a>
			</li>
			<li class="nav-item">
				<a href="${root }board/main" class="nav-link">JSP게시판</a>
			</li>
			<li class="nav-item">
				<a href="${root }board/main" class="nav-link">Spring게시판</a>
			</li>
			<li class="nav-item">
				<a href="${root }board/main" class="nav-link">DataBase게시판</a>
			</li> --%>
		</ul>
		
		<ul class="navbar-nav ml-auto">
			<li class="nav-item">
				<a href="${root }user/login" class="nav-link">로그인</a>
			</li>
			<li class="nav-item">
				<a href="${root }user/join" class="nav-link">회원가입</a>
			</li>
			<li class="nav-item">
				<a href="${root }user/modify" class="nav-link">정보수정</a>
			</li>
			<li class="nav-item">
				<a href="${root }user/logout" class="nav-link">로그아웃</a>
			</li>
		</ul>
	</div>
</nav>
</body>
</html>