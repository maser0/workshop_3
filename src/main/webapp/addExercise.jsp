<%--
  Created by IntelliJ IDEA.
  User: Witek
  Date: 2020-04-27
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add exercise</title>
</head>
<body>
<%@include file="header.jsp"%>
<h1>Adding exercise:</h1>
<form action="/addExercise" method="post">
    <label>
        Title
        <textarea name="title"></textarea>
    </label>
    <label>
        Description
        <textarea name="description"></textarea>
    </label>
    <input type="submit" value="Confirm">
</form>
<%@include file="footer.jsp"%>
</body>
</html>