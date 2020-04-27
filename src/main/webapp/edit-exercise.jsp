<%--
  Created by IntelliJ IDEA.
  User: Witek
  Date: 2020-04-27
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Edit exercise</title>
</head>
<body>
<%@include file="header.jsp" %>
<h1>Edit exercise</h1>
<form method="post">
    <label>
        Title:
        <textarea name="title">${requestScope.exercise.title}</textarea>
    </label>
    <label>
        Description:
        <textarea name="description">${requestScope.exercise.description}</textarea>
    </label>
    <input type="submit" />
</form>
<%@include file="footer.jsp" %>
</body>
</html>

