<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/13
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        span{
            color: red;
            size: 12px;
        }
    </style>
</head>
<body>
<form method="get" action="/bbb">

    id：<input type="text" name="id"/> <span>${id}</span><br>
    名字：<input type="text" name="name"/> <span>${name}</span><br>
    邮箱：<input type="text" name="address"/> <span>${address}</span><br>
    出生日期：<input type="date" name="birthday"/> <span>${birthday}</span><br>
    存款：<input type="text" name="deposit"> <span>${deposit}</span><br>
    <input type="submit" value="提交"/>
</form>

<h1>${ok}</h1>
</body>
</html>
