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
    <title>卡信息列表</title>
    <script>
        function frmSubmit(){
            document.form1.submit();
        }
    </script>
</head>
<body>
<center>卡信息</center>
<div align="left">
    <form action="cardselectbselectCardByCid">卡号：<input type="text" name="cid"><input type="submit" value="查询"></form>
</div>
<div align="right"><a href="http://localhost:8080/card/">添加</a>&nbsp;&nbsp;</div>
<form id="form1" name="form1" method="post" action="createCard">
    <table align="center" width="100%" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF">
        <tr>
            <td>卡号</td>
            <td>用户编号</td>
            <td>余额</td>
            <td>卡状态</td>
        </tr>
        <c:forEach items="${cardList}" var="card">
            <tr>
                <td><input type="checkbox" name="uidArray" value="${user.uid}"></td>
                <td>${card.cid}</td>
                <td>${card.uid}</td>
                <td>${0}</td>
                <td>${true}</td>

            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
