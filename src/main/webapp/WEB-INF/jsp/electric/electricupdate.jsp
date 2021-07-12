<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2021/7/11
  Time: 0:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>电费充值</title>
</head>
<body>
<form id="form1" name="form1" method="post" action="electricupdate">
    <table align="center" width="500" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF">
        <tr>
            <td width="116" height="30" align="right" valign="middle">宿舍号：</td>
            <td width="378" align="left" valign="middle">
                <input type="text" name="eno" readonly="readonly" id="eno" value="${electric.eno}"/></td>
        </tr>
        <tr>
            <td width="116" height="30" align="right" valign="middle">金额（元）：</td>
            <td width="378" align="left" valign="middle">
                <input type="text" name="eremain" readonly="readonly" id="eremain" value="${eletric.eremain}"/></td>
        </tr>

        <tr>
            <td height="30" align="right" valign="middle">&nbsp;</td>
            <td align="left" valign="middle"><input type="submit" name="button" id="button" value="提交" />
                <input type="reset" name="button2" id="button2" value="重置" /></td>
        </tr>
    </table>
</form>

</body>
