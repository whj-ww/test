<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/29
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
当前登录：${user.uname}<br/>
<c:if test="${fn:contains(moudellist,'user/add')}">
    <a href="user/add" target="cnt">添加员工</a><br/>
</c:if>

<c:if test="${fn:contains(moudellist,'user/del')}">
    <a href="user/del" target="cnt">删除员工</a><br/>
</c:if>

<c:if test="${fn:contains(moudellist,'user/adddept')}">
    <a href="user/adddept" target="cnt">添加部门</a><br/>
</c:if>

<c:if test="${fn:contains(moudellist,'user/list')}">
    <a href="user/list" target="cnt">权限管理</a>
</c:if>
</body>
</html>
