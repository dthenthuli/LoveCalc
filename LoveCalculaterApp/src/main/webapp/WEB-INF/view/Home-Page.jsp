<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
.error {
	color: red;
	position: fixed;
}
</style>

</head>
<body>
	<h1>Love Calculator</h1>

	<form:form action="process-result" method="get"
		modelAttribute="userinfo">
		<label for="yn">YourName</label>
		<form:input path="yourname" />
		<form:errors cssClass="error" path="yourname" />
		</br>	</br>
		<label for="cn">CurshName</label>
		<form:input path="curshname" />
		<form:errors cssClass="error" path="curshname" />
		</br>
			</br>
		<form:checkbox path="termsandcon" />
		<label>i am agreeing that this is for fun</label>
		<form:errors cssClass="error" path="termsandcon" />	</br>	</br>
		<input type="submit" value="Login" />


	</form:form>

</body>
</html>