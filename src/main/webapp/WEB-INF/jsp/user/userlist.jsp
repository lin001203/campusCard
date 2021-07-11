<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2021/7/11
  Time: 0:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>卡用户信息列表</title>
    <script>
        function frmSubmit(){
            document.form1.submit();
        }
    </script>
</head>
<body>
<center>卡用户信息</center>
<div align="left">
    <form action="userselectbyuid">用户编号：<input type="text" name="uid"><input type="submit" value="查询"></form>
    <form action="userselectbyusername" method="post">姓名：<input type="text" name="username"><input type="submit" value="查询"></form>
</div>
<div align="right"><a href="userpreinsert">添加</a>&nbsp;&nbsp;<a href="#" onclick="javascript:frmSubmit();">删除</a></div>
<form id="form1" name="form1" method="post" action="userdelete">
    <table align="center" width="100%" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF">
        <tr>
            <td>选择</td>
            <td>编号</td>
            <td>姓名</td>
            <td>密码</td>
            <td>所持卡号</td>
            <td>操作&nbsp;&nbsp;</td>
        </tr>
        <c:forEach items="${userList}" var="user">
            <tr>
                <td><input type="checkbox" name="uidArray" value="${user.uid}"></td>
                <td>${user.uid}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td>${user.cid}</td>
                <td>
                    <a href = "javascript:location.href=encodeURI( 'userpreupdate?uid=${user.uid}&username=${user.username}&password=${user.password}&cid=${user.cid}')">修改</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>

