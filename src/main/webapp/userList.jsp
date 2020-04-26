<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Users list</title>
</head>
<body>
<%@include file="header.jsp"%>
<table>
    <tr>
        <th>User name</th>
        <th>Actions</th>
    </tr>
    <c:forEach items="${requestScope.users}" var="user">
        <tr>
            <td>${user.username}</td>
            <td><a href="/editUser?id=${user.id}">Edit</a></td>
        </tr>
    </c:forEach>
</table>
<a href="/addUser">Add user</a>
<%@include file="footer.jsp"%>
</body>
</html>