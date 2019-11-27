<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/6
  Time: 19:19
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
            <td>username</td>
        </tr>
        <c:forEach var="c" items="${pageInfo.list}">
            <tr>
                <td>${c.id}</td>
                <td>${c.username}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="/page?pageNum=1&pageSize=${pageInfo.pageSize}">首页</a>
    <a href="/page?pageNum=${pageInfo.prePage}&pageSize=${pageInfo.pageSize}">上一页</a>
    <c:forEach items="${pageInfo.navigatepageNums}" var="c">
        <a href="/page?pageNum=${c}&pageSize=${pageInfo.pageSize}">${c}</a>
    </c:forEach>
    <a href="/page?pageNum=${pageInfo.nextPage}&pageSize=${pageInfo.pageSize}">下一页</a>
    <a href="/page?pageNum=${pageInfo.pages}&pageSize=${pageInfo.pageSize}">尾页</a>

</body>
</html>
