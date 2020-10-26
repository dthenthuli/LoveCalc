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
<form:form action="billresult" method="post" modelAttribute="billdto">
CreditCardNumber<form:input path="creditcarddto"/>

Amount<form:input path="amountdto"/>
Date<form:input path="date"/>
<input type="submit"/>


</form:form>



</body>
</html>