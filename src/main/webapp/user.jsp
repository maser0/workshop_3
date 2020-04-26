<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Welcome!</title>
</head>
<body>
<%@include file="header.jsp" %>
<table>
    <tr>
        <th>User name</th>
        <th>User mail</th>
        <th>User group ID</th>
        <th>User password</th>
    </tr>

        <tr>
            <td>${user.userName}</td>
            <td>${user.email}</td>
            <td>${user.groupId}</td>
            <td>${user.password}</td>
<%--            <td><a href="/userDetails?id=${user.id}">Details</a></td>--%>
        </tr>

</table>
<table>
    <tr>
        <th>User solution</th>
          </tr>
    <c:forEach items="${solution}" var="solution">
        <tr>
            <td>${solution.description}</td>


        </tr>
    </c:forEach>
</table>


<%@include file="footer.jsp" %>
</body>
</html>