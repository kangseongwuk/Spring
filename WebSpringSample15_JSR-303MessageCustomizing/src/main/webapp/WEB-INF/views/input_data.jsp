<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 입력</title>
</head>
<body>
	<h3>input_data</h3>
	
	<form:form action="input_pro" method="post" modelAttribute="dataBean">
	<h3>데이터를 입력하세요</h3>
		data1: <form:radiobutton path="data1" value="true"/>true
				<form:radiobutton path="data1" value="false"/>false<hr>
				<form:errors path="data1"/><br>	
		
	<h3>데이터를 입력하세요</h3>
		data2: <form:radiobutton path="data2" value="true"/>To be
			<form:radiobutton path="data2" value="false"/>not to be<hr>
			<form:errors path="data2"/>	<br>
		
	<h3>Max , Min</h3>
		data3: <form:input path="data3"/>
			<form:errors path="data3"/>	<br>
		
		data4: <form:input path="data4"/>
			<form:errors path="data4"/>	<br>
		
	<h3>Null</h3>
		data5: <form:checkbox path="data5" value="값"/>
			<form:errors path="data5"/>	<br>
		
	<h3>NotNull</h3>
		data6: <form:checkbox path="data6" value="값"/>
			<form:errors path="data6"/>	<br>
		
	<h3>Digits 소수점 자리수</h3>
		data7: <form:input path="data7"/>
			<form:errors path="data7"/>	<br>
		
	<h3>Size </h3>
		data8: <form:input path="data8"/>
			<form:errors path="data8"/>	<br>
		
	<h3>Pattern </h3>
		data9: <form:input path="data9"/>
			<form:errors path="data9"/>	<br>
	<hr style="border:4px solid blue;">	
	<h3 style="color:blue;">JSR-380 NotEmpty </h3>
		data01: <form:input path="data01"/>
			<form:errors path="data01"/>	<br>


		<form:button type="submit">확인</form:button>
	</form:form>

</body>
</html>


<!--
.JSR-303
---------------------
 - JSR-303
 1) JSR-303 어노테이션은 빈 객체에 주입되는 값의 유효성 검사를 하기 위해 제공되는 어노테이션입니다.
    여기에서는 자주 사용하는 것만 골라서 보도록 하겠습니다.
 2) https://beanvalidation.org/1.0/spec/

	@AssertTrue : true가 아닌 값이 들어오면 오류
	@AssertFalse : false가 아닌 값이 들어오면 오류
	@Max(값) : 값보다 큰 값이 들어오면 오류
	@Min(값) : 값보다 작은 값이 들어오면 오류

 3) @DecimalMax(value=값, inclusive=true/false) : 값보다 작거나 같은 값이 들어와야 합니다. 
    Inclusive가 false면 값은 포함하지 않기 때문에 작은 값이 들어와야 합니다. 생략하면 true

 4) @DecimalMin(value=값, inclusive=true/false) : 값보다 크거나 같은 값이 들어와야 합니다. 
    Inclusive가 false면 값은 포함하지 않기 때문에 큰 값이 들어와야 합니다. 생략하면 true

 5) @Null : 값이 들어오면 오류가 발생.
    @NotNull : 값이 들어오지 않으면 오류가 발생.
    @Digits(integer=자릿수,fraction=자릿수) : 지정된 자릿수의 숫자가 아닐 경우 오류가 발생. 
         Integer – 정수 자릿수, fraction – 실수 자릿수
    @Size(min=글자수,max=글자수) : 지정된 글자수 보다 짧거나 길면 오류가 발생

  6) @Pattern(regexp=정규식) : 주어진 정규식에 위배되면 오류 발생

-->