<%--
  Created by IntelliJ IDEA.
  User: darza
  Date: 24.04.2020
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit User</title>
</head>
<body>
<%@include file="header.jsp" %>
<h1>Edit user</h1>
<form method="post">
    <label>
        Name:
        <textarea name="username">${requestScope.userName}</textarea>
    </label>
    <label>
        Email:
        <textarea name="email">${requestScope.email}</textarea>
    </label>
    <label>
        Password:
        <textarea name="passwprd">${requestScope.password}</textarea>
    </label>
    <label>
        Group id:
        <textarea name="groupId">${requestScope.groupId}</textarea>
    </label>
    <input type="submit" />
</form>
<%@include file="footer.jsp" %>
</body>
</html>
