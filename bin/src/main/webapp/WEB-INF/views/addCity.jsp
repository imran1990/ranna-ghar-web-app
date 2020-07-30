<%--
  Created by IntelliJ IDEA.
  User: shuvo
  Date: 7/8/2020
  Time: 10:16 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath }/add-city" modelAttribute="city">
    <input name="id" type="hidden"/>
    <br><br>

    City Code: <form:input path="cityCode" />
    <br><br>

    City Name : <form:input path="cityName" />
    <br><br>


    <input type="submit" value="Submit" />
    <br><br>


</form:form>

</body>
</html>
