<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2021/7/11
  Time: 0:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>添加交易记录信息</title>
</head>
<body>
<form id="form1" name="form1" method="post" action="recordinsert">
    <table align="center" width="500" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF">
        <tr>
            <td width="116" height="30" align="right" valign="middle">编号：</td>
            <td width="378" align="left" valign="middle">
                <input type="text" name="reid" id="reid" /></td>
        </tr>
        <tr>
            <td width="116" height="30" align="right" valign="middle">卡号：</td>
            <td width="378" align="left" valign="middle">
                <input type="text" name="cid" id="cid" /></td>
        </tr>
        <tr>
            <td width="116" height="30" align="right" valign="middle">类型：</td>
            <td width="378" align="left" valign="middle">
                <input type="text" name="retype" id="retype" /></td>
        </tr>
        <tr>
            <td width="116" height="30" align="right" valign="middle">金额：</td>
            <td width="378" align="left" valign="middle">
                <input type="text" name="reamount" id="reamount" /></td>
        </tr>
        <tr>
            <td width="116" height="30" align="right" valign="middle">时间：</td>
            <td width="378" align="left" valign="middle">
                <input type="text" name="retime" id="retime" /></td>
        </tr>
        <tr>
            <td width="116" height="30" align="right" valign="middle">地点：</td>
            <td width="378" align="left" valign="middle">
                <input type="text" name="re_place" id="re_place" /></td>
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
