<%--
  Created by IntelliJ IDEA.
  User: 孙韬
  Date: 2020/9/25
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>success</title>
</head>
<body>
<h1>Successed.</h1>
<c:forEach items="${list}" var="account">
    ${account.name}----${account.money}<br>
</c:forEach>
</body>
</html>
