<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/25
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/static/js/jquery-3.3.1.min.js"></script>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>birthday</td>
    </tr>
    </thead>
    <tbody id="tab_body"></tbody>
</table>
<div class="divv">

</div>

<a href="/add">添加</a>

<script>
    $(function () {
        loading(1);
    })
    function loading(pageNum) {
        $.ajax({
            url: "/list",
            method:"GET",
            data: {
                pageNum:pageNum,
                pageSize:3
            },
            dataType:"JSON"
        }).done(function (data) {
            $("#tab_body").html(null);
            $(".divv").html(null);
            data.list.forEach(function (users) {
                var dd = "<tr><td>" + users.id + "</td>"
                    + "<td>" + users.name + "</td>"
                    + "<td>" + users.birthday + "</td></tr>"
                $("#tab_body").append(dd)
            });
            //添加分页功能的按钮
            var fenye = "<button class='btn' value='1' >首页</button>"+
                "<button class='btn' value='" + data.prePage + "'>上一页</button>";
            data.navigatepageNums.forEach(function (num) {
                fenye += "<button class='btn' value='"+num+"'>"+num+"</button>"
            })
            fenye += "<button class='btn' value='"+data.nextPage+"'>下一页</button>"+
                "<button class='btn' value='"+data.pages+"'>尾页</button> ";
            $(".divv").append(fenye);
            //调用btn点击事件
            bunClick()
        }).fail(function () {
            alert("查询失败")
        })
    }

    //btn点击事件
    function bunClick() {
        $(".btn").click(function (e) {
            var pageNum = $(this).val()
            loading(pageNum)
        })
    }
</script>
</body>
</html>
