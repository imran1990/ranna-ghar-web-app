<%--
  Created by IntelliJ IDEA.
  User: shuvo
  Date: 6/25/2020
  Time: 10:37 AM
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>addEmployee</title>
</head>
<body>
<h1>Add employee</h1>

<form:form action="${pageContext.request.contextPath }/add-employee" modelAttribute="employee">
    ID : <form:input path="id" />
    <br><br>
    First name: <form:input path="firstName" />
    <br><br>
    Last name: <form:input path="lastName" />
    <br><br>

    Email: <form:input path="email" />
    <br><br>

    Age: <form:input path="age" />
    <br><br>

    <form:radiobuttons path="gender" items="${genders}" ></form:radiobuttons>
    <br><br>

   <%-- <form:select path="city">
        <form:options items="${cities}"  ></form:options>
    </form:select><br><br>--%>

    <form:select path="city">
    <form:options items="${cities}"  itemLabel="cityName"   itemValue="cityCode" ></form:options>

    </form:select><br><br>

    <%--Gender: <form:input path="" />
    <br><br>--%>
    <input type="submit" value="Submit" />
    <br><br>


</form:form>

</body>
</html>
