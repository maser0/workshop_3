<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Exercise list</title>
</head>
<body>
<%@include file="header.jsp"%>
<table>
    <tr>
        <th>Title</th>
        <th>Description</th>
        <th>Actions</th>
    </tr>
    <c:forEach items="${requestScope.exercises}" var="exercise">
        <tr>
            <td>${exercise.title}</td>
            <td>${exercise.description}</td>
            <td><a href="/editExercise?id=${exercise.id}">Edit</a> </td>
        </tr>
    </c:forEach>
</table>
<a href="/addExercise">Add exercise</a>
<%@include file="footer.jsp"%>
</body>
</html>