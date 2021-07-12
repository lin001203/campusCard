<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2021/7/12
  Time: 3:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>管理员主页</title>
</head>
<body>
管理员${MANAGER_SESSION.mname }，欢迎回来！<br>
<a href="/userlist">创建/查询/删除卡用户</a>
<a href="">查询卡信息</a>
<a href="">开卡</a>
<a href="managerpreupdate?mid=${MANAGER_SESSION.mid}&mname=${MANAGER_SESSION.mname}}">密码修改</a>
<a href="managerlogout">退出</a>

</body>
</html>
