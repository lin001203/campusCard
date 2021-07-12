<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2021/7/12
  Time: 3:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>管理员信息列表</title>
    <script>
        function frmSubmit(){
            document.form1.submit();
        }
    </script>
</head>
<body>
<center>管理员信息</center>
<div align="left">
    <form action="managerselectbymid">编号：<input type="text" name="mid"><input type="submit" value="查询"></form>
    <form action="managerselectbymname" method="post">姓名：<input type="text" name="mname"><input type="submit" value="查询"></form>
</div>
<div align="right">&nbsp;<a href="#" onclick="javascript:frmSubmit();">删除</a></div>
<form id="form1" name="form1" method="post" action="managerdelete">
    <table align="center" width="100%" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF">
        <tr>
            <td>选择</td>
            <td>编号</td>
            <td>姓名</td>
            <td>密码</td>
            <td>操作&nbsp;&nbsp;</td>
        </tr>
        <c:forEach items="${managerList}" var="manager">
            <tr>
                <td><input type="checkbox" name="midArray" value="${manager.mid}"></td>
                <td>${manager.mid}</td>
                <td>${manager.mname}</td>
                <td>${manager.mpassword}</td>
                <td>
                    <a href = "javascript:location.href=encodeURI( 'managerpreupdate?mid=${manager.mid}&mname=${manager.mname}&mpassword=${manager.mpassword}')">修改</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
