<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/20
  Time: 9:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>欢迎${name}来到xxx</h1>

<form method="post" enctype="multipart/form-data" action="/upload">
    <input type="file" name="myfile">
    <input type="submit" value="提交">
</form>
<a href="/download?filename=12.png">下载</a>

<img src="/download?filename=12.png" width="100px" height="100px"/>
<h3>${ok}</h3>
</body>
</html>
