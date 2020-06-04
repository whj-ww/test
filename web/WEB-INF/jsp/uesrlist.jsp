<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/29
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table cellspacing="1" bgcolor="#006400" width="60%" align="center">
    <tr bgcolor="white">
        <th>ID</th>
        <th>名字</th>
        <th>性别</th>
        <th>爱好</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="d">
        <tr bgcolor="white">
            <td>${d.id}</td>
            <td>${d.uname}</td>
            <td>${d.sex}</td>
            <td>${d.aihao}</td>
            <td><a>修改</a><a>删除</a><a href="${pageContext.request.contextPath}/user/toqx?id=${d.id}">权限管理</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
