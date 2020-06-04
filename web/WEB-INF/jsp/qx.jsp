<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/29
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/addqx" method="post">
    <input type="text" name="id" value="${id}"/><br/>
    <input type="checkbox" name="qx" value="/user/add">添加员工<br/>
    <input type="checkbox" name="qx" value="/user/del">删除员工<br/>
    <input type="checkbox" name="qx" value="/user/adddept">添加部门<br/>
    <input type="checkbox" name="qx" value="/user/list">权限管理<br/>

    <br/>
    <input type="submit" value="保存"/>
</form>
</body>
</html>
