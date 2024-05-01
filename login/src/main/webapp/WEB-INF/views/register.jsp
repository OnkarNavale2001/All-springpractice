<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <h1>Register</h1>
    <form:form action="${pageContext.request.contextPath}/register" method="post">
        <c:if test="${errors != null}">
            <c:forEach items="${errors.allErrors}" var="error">
                <p><font color="red">${error.defaultMessage}</font></p>
            </c:forEach>
        </c:if>
        <label for="email">Email:</label>
        <form:input path="email" type="email" id="email" required="true"/>
        <br>
        <label for="password">Password:</label>
        <form:input path="password" type="password" id="password" required="true"/>
        <br>
        <button type="submit">Register</button>
    </form:form>
</body>
</html>
