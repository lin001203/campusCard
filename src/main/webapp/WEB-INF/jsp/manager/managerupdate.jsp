<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2021/7/12
  Time: 3:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>修改管理员信息</title>
</head>
<body>
<form id="form1" name="form1" method="post" action="managerupdate">
    <table align="center" width="500" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF">
        <tr>
            <td width="116" height="30" align="right" valign="middle">编号：</td>
            <td width="378" align="left" valign="middle">
                <input type="text" name="mid" readonly="readonly" id="mid" value="${manager.mid}"/></td>
        </tr>
        <tr>
            <td width="116" height="30" align="right" valign="middle">姓名：</td>
            <td width="378" align="left" valign="middle">
                <input type="text" name="mname" readonly="readonly" id="mname" value="${manager.mname}"/></td>
        </tr>
        <tr>
            <td width="116" height="30" align="right" valign="middle">密码：</td>
            <td width="378" align="left" valign="middle">
                <input type="text" name="mpassword" id="mpassword" value="${manager.mpassword}" /></td>
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
