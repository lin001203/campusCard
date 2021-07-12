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
    <title>电费信息</title>
    <script>
        function frmSubmit(){
            document.form1.submit();
        }
    </script>
</head>
<body>
<center>电费信息</center>
<div align="left">
    <form action="electricselectbyeno">宿舍号：<input type="text" name="eno"><input type="submit" value="查询"></form>
</div>
<form id="form1" name="form1" method="post" action="electricdelete">
    <table align="center" width="100%" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF">
        <tr>
            <td>选择</td>
            <td>宿舍号</td>
            <td>剩余电量</td>
            <td>操作&nbsp;&nbsp;</td>
        </tr>
        <c:forEach items="${electricList}" var="electric">
            <tr>
                <td><input type="checkbox" name="enoArray" value="${electric.eno}"></td>
                <td>${electric.eno}</td>
                <td>${electric.eremain}</td>
                <td>
                    <a href = "javascript:location.href=encodeURI( 'electricpreupdate?eno=${electric.eno}&eremain=${electric.eremain}')">充值</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
