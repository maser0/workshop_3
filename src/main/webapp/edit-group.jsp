<%--
  Created by IntelliJ IDEA.
  User: Witek
  Date: 2020-04-27
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edytuj Grupę</title>
</head>
<body>
<%@include file="header.jsp" %>
<h1>Edit group</h1>
<form method="post">
    <label>
        Opis:
        <textarea name="name">${requestScope.group.name}</textarea>
    </label>
    <input type="submit" />
</form>
<%@include file="footer.jsp" %>
</body>
</html>
