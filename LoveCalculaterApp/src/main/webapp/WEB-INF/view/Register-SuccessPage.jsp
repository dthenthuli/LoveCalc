<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Name: ${reginfo.name}
Username:${reginfo.username}
Password:${reginfo.password}
Country:${reginfo.country}

Hobby:


<c:forEach var="temp" items="${reginfo.hobby}">
${temp}	
</c:forEach>
Age ${reginfo.age}
Gender:${reginfo.gender}
Email:${reginfo.communicationdto.email}
Phone:${reginfo.communicationdto.phone}
</body>
</html>