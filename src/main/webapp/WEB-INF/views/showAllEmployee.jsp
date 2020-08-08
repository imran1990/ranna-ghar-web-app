<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="employee" items="${employeeList}">
<div>
ID : ${employee.id}<br>
First Name: ${employee.firstName}<br>
Last Name : ${employee.lastName}<br>
Email : ${employee.email}<br>
Age : ${employee.age}<br>
Gender : ${employee.gender}<br>
City : ${employee.city}<br>
</div>
<hr>
</c:forEach>

</body>
</html>