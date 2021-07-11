<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2021/7/11
  Time: 0:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>修改卡用户信息</title>
</head>
<body>
<form id="form1" name="form1" method="post" action="userupdate">
    <table align="center" width="500" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF">
        <tr>
            <td width="116" height="30" align="right" valign="middle">编号：</td>
            <td width="378" align="left" valign="middle">
                <input type="text" name="uid" readonly="readonly" id="uid" value="${user.uid}"/></td>
        </tr>
        <tr>
            <td width="116" height="30" align="right" valign="middle">姓名：</td>
            <td width="378" align="left" valign="middle">
                <input type="text" name="username" readonly="readonly" id="username" value="${user.username}"/></td>
        </tr>
        <tr>
            <td width="116" height="30" align="right" valign="middle">密码：</td>
            <td width="378" align="left" valign="middle">
                <input type="text" name="password" id="password" value="${user.password}" /></td>
        </tr>
        <tr>
            <td width="116" height="30" align="right" valign="middle">所持卡号：</td>
            <td width="378" align="left" valign="middle">
                <input type="text" name="cid" readonly="readonly" id="cid" value="${user.cid}" /></td>
        </tr>
        <tr>
            <td height="30" align="right" valign="middle">&nbsp;</td>
            <td align="left" valign="middle"><input type="submit" name="button" id="button" value="提交" />
                <input type="reset" name="button2" id="button2" value="重置" /></td>
        </tr>
    </table>
</form>

</body>
</html>
