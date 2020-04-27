<%--
  Created by IntelliJ IDEA.
  User: Witek
  Date: 2020-04-27
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add User</title>
</head>
<body>
<%@include file="header.jsp" %>
<form action="/addGroup" method="post">
    <div>
        Enter group name
        <input type="text" name="addGroup">
    </div>

    <input type="submit" name="Confirm">
</form>
<%@include file="footer.jsp"%>
</body>
</html>
