<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/20
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="/upload" enctype="multipart/form-data">
        <input type="file" name="myfile">
        <input type="submit" value="提交">
    </form>
</body>
</html>
