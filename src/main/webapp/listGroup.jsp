<%--
  Created by IntelliJ IDEA.
  User: Witek
  Date: 2020-04-25
  Time: 23:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>AllGroups</title>
</head>
<body>
<%@include file="header.jsp" %>
<table>
    <tr>
        <th>Group name</th>
        <th>Group Id</th>
        </tr>
    <c:forEach items="${requestScope.groups}" var="group">
        <tr>
            <td>${group.name}</td>
            <td>${group.id}</td>
            <td><a href="/user?id=${group.id}">Details</a></td>
            <td><a href="/editGroup?id=${group.id}">Action</a> </td>
        </tr>
    </c:forEach>
</table>
<%@include file="footer.jsp" %>
</body>
</html>
