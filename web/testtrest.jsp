<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/29
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/test/emp" method="post">
    <input type="hidden" name="_method" value="get"/>

    <input type="submit" value="提交"/>
</form>
</body>
</html>
