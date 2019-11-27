<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/21
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/insertWithDel">
    <input type="text" name="id"/>${id}
    <input type="text" name="name"/>${name}
    <input type="date" name="birthday"/>${birthday}
    <input type="submit" value="提交"/>
</form>
</body>
</html>
