<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/21
  Time: 9:06
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
        <td>name</td>
        <td>birthday</td>
    </tr>
    <c:forEach items="${list.list}" var="c">
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
            <td>${c.birthday}</td>
        </tr>
    </c:forEach>
</table>

<a href="/list?pageNum=1">首页</a>
<a href="/list?pageNum=${list.prePage}">上一页</a>
<c:forEach var="c" items="${list.navigatepageNums}">
    <a href="/list?pageNum=${c}">${c}</a>
</c:forEach>
<a href="/list?pageNum=${list.nextPage}">下一页</a>
<a href="/list?pageNum=${list.pages}">尾页</a>

</body>
</html>
