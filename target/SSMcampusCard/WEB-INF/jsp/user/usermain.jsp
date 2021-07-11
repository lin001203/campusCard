<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2021/7/11
  Time: 8:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户主页</title>
</head>
<body>
您好，${USER_SESSION.username }！<br>
<a href="">余额查询</a>
<a href="">卡片充值</a>
<a href="">热水充值</a>
<a href="">电费充值</a>
<a href="">历史账单</a>
<a href="">挂失/解挂</a>
<a href="userpreupdate?uid=${USER_SESSION.uid}&username=${USER_SESSION.username}&cid=${USER_SESSION.cid}">密码修改</a>
<a href="userlogout">退出</a>

</body>
</html>
