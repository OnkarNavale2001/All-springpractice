<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>Login</h1>
    <c:if test="${not empty error}">
        <p><font color="red">${error}</font></p>
    </c:if>
    <form action="${pageContext.request.contextPath}/login" method="post">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required="true"/>
        <br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required="true"/>
        <br>
        <button type="submit">Login</button>
    </form>
</body>
</html>
