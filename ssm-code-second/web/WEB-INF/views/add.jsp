<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/18
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="addDiv">
    <h3>添加用户</h3>
    <form id="addForm" method="post" action="/insert">
        <input  name="id"  placeholder="id" value="${userInfos.id}" required>${id}
        <input name="name" placeholder="name" value="${userInfos.name}"required>${name}
        <input type="date" name="birthday" value="${userInfos.birthday}"required>${birthday}
        <input type="submit" class="submit" value="提交">
        <button class="back">返回</button>
    </form>

</div>
</body>
</html>
