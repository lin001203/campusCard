<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2021/7/11
  Time: 8:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
</head>
<body>
<center>
    ${msg}
    <form id="form1" name="form1" method="post" action="${pageContext.request.contextPath}/ulogin">
        <table width="344" height="95" border="0" cellpadding="0" cellspacing="1" style="background-color: #3A8ECD; color: #000;">
            <tr>
                <td height="30" colspan="2" align="center" valign="middle" bgcolor="#FFFFFF">用户登录</td>
            </tr>
            <tr>
                <td width="114" height="30" align="right" valign="middle" bgcolor="#FFFFFF">用户id：</td>
                <td width="227" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                    <input type="text" name="uid" /></td>
            </tr>
            <tr>
                <td height="30" align="right" valign="middle" bgcolor="#FFFFFF">密码：</td>
                <td height="20" align="left" valign="middle" bgcolor="#FFFFFF"><label for="textfield2"></label>
                    <input type="password" name="password" /></td>
            </tr>
            <tr>
                <td height="30" colspan="2" align="center" valign="middle" bgcolor="#FFFFFF"><input type="submit" name="button" id="button" value="提交" />&nbsp;&nbsp;
                    <input type="reset" name="button2" id="button2" value="重置" /></td>
            </tr>
        </table>
    </form>
</center>

</body>
</html>
