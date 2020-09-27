<%--
  Created by IntelliJ IDEA.
  User: 孙韬
  Date: 2020/9/25
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addAccount</title>
</head>
<body>'
<h1>添加账户</h1>
<form action="account/addAccount" method="post">
    name:<input type="text" name="name"><br>
    money:<input type="text" name="money"><br>
    <input type="submit" value="commit">
</form>
</body>
</html>
