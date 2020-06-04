<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/29
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/login" method="post">
    编号：<input type="text" name="id"/><br/>
    名字：<input type="text" name="uname"/>
    <br/><input type="submit" value="提交"/>
</form>
</body>
</html>
