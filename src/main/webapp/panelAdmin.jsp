<%--
  Created by IntelliJ IDEA.
  User: Raider
  Date: 2020-04-26
  Time: 12:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Admin panel</title>
</head>
<body>
<%@include file="header.jsp"%>
<div>
    <a href="/exercisesList">Exercises</a>   // tu zrobione ale edit nie dokonczone. Tylko liste odpala
    <a href="/listGroup.jsp">Groups</a>
    <a href="/userList">Users</a>
</div>
<%@include file="footer.jsp"%>
</body>
</html>