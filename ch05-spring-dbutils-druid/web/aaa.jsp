<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/23
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <td>id</td>
            <td>deptname</td>
        </tr>
        <c:forEach items="${list}" var="c">
            <tr>
                <td>${c.id}</td>
                <td>${c.deptname}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
