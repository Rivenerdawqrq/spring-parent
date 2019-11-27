<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/20
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>需要登陆才能上传与下载</h1>
    <form method="post" action="/login">
        <input placeholder="用户名" name="name">
        <input placeholder="密码" name="pwd">

        <input type="submit" value="登陆">
    </form>

</body>
</html>
