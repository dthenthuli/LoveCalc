<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="Reg-Success" method="post" modelAttribute="reginfo">
		<label for="name">Name</label>
		<form:input path="name" />
		<br>
		<label for="username">username</label>
		<form:input path="username" />
		<br>
		<label for="pass">password</label>
		<form:password path="password" />
		<br>
		<label for="country">country</label>
		<form:select path="country">
			<form:option value="ind" label="INDIA"></form:option>
			<form:option value="us" label="US"></form:option>
			<form:option value="uk" label="UK"></form:option>
		</form:select>
		<br>
		<label for="name">hobby</label>
		Sleeping<form:checkbox path="hobby" value="sleeping"/>
		Playing<form:checkbox path="hobby" value="playing" />
	Reading	<form:checkbox path="hobby" value="Reading" />
	teaching	<form:checkbox path="hobby" value="teaching"/>
		<br>

		<label for="name">gender</label>
		
		Male<form:radiobutton path="gender" value="male" />
		Female<form:radiobutton path="gender" value="female" /><br>
		<input type="submit">
	</form:form>
</body>
</html>