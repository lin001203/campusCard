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
    <title>交易记录信息列表</title>
    <script>
        function frmSubmit(){
            document.form1.submit();
        }
    </script>
</head>
<body>
<center>交易记录信息</center>
<div align="left">
    <form action="recordselectbycid">卡编号：<input type="text" name="cid"><input type="submit" value="查询"></form>
</div>
<div align="right"><a href="recordpreinsert">添加</a>&nbsp;&nbsp;<a href="#" onclick="javascript:frmSubmit();">删除</a></div>
<form id="form1" name="form1" method="post" action="recorddelete">
    <table align="center" width="100%" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF">
        <tr>
            <td>选择</td>
            <td>记录编号</td>
            <td>卡号</td>
            <td>类型</td>
            <td>金额</td>
            <td>时间</td>
            <td>地点</td>
            <td>操作&nbsp;&nbsp;</td>
        </tr>
        <c:forEach items="${recordList}" var="record">
            <tr>
                <td><input type="checkbox" name="reidArray" value="${record.reid}"></td>
                <td>${record.reid}</td>
                <td>${record.cid}</td>
                <td>${record.retype}</td>
                <td>${record.reamount}</td>
                <td>${record.retime}</td>
                <td>${record.re_place}</td>
                <td>
                    <a href = "javascript:location.href=encodeURI( 'recordpreupdate?reid=${record.reid}&cid=${record.cid}&retype=${record.retype}&reamount=${record.reamount}&retime=${record.retime}&re_place=${record.re_place}')">修改</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>

