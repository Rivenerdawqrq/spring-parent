<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/18
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<tr>
    <td>id</td>
   <td>name</td>
    <td>address</td>
    <td>birthday</td>

</tr>
<c:forEach var="c" items="${all}">
    <tr>${c.id}</tr>
    <tr>${c.name}</tr>
    <tr>${c.address}</tr>
    <tr>${c.birthday}</tr>
</c:forEach>
