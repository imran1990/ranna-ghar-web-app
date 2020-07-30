<%--
  Created by IntelliJ IDEA.
  User: shuvo
  Date: 7/8/2020
  Time: 10:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <style>

        table, th, td {
        border: 1px solid black;
    }
    </style>
</head>
<body>

<table style="width:100%">
    <tr>
        <th>ID</th>
        <th>City Code</th>
        <th>City Name</th>
    </tr>
    <c:forEach var="city" items="${cityList}">
    <tr>
        <td>${city.id}</td>
        <td>${city.cityCode}</td>
        <td>${city.cityName}</td>
    </tr>
    </c:forEach>

</table>

</body>
</html>
