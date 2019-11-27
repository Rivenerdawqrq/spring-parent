<%--
  User: cj
  Date: 2019/11/16
  Time: 12:53
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script src="/static/js/jquery-3.3.1.min.js"></script>
</head>
<body>
<h1>index jsp</h1>

<input type="button" value="list" id="btnList"/>
<input type="button" value="insert" id="btnInsert"/>
<input type="button" value="insert2" id="btnInsert2"/>

<script>

    $(function(){

        $("#btnList").click(function () {
            $.ajax({
                url:"/list",
                type:"GET",
                success:function (data) {
                    console.log(data);
                    alert(data.birthday);
                }

            });
        });// btnList end

        /**
         * ajax方法的参数含义如下:
         * 1.data:表明请求传递的数据
         * 2. type:表明请求的方法(比如get,post)
         * 3.contentType:表明请求的内容类型
         * 4. dataType:是"期望"服务端返回的数据类型
         */
        $("#btnInsert").click(function () {
            var data = {id:100,address:"client"};
           $.ajax({
               url:"/insert",
               data: JSON.stringify(data),
               type:"POST",
               contentType:"application/json",
               dataType:"json",
               success:function (data) {
                   alert(data.id);
               }

           });
        });


        $("#btnInsert2").click(function () {
            var data = {id:101,username:"client"};
            $.ajax({
                url:"/insert2",

                type:"POST",

                success:function (data) {
                    alert(data.id);
                }

            });
        });









    });
</script>
</body>
</html>
