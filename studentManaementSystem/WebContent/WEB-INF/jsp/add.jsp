<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AddUser </title>
</head>
<body>
<form action="userAction!addUser" method="get">
<%-- <input name="userModel.id" type="hidden"  value="${userModel.id }" /> --%>

age<input name="userModel.age" type="text" /><br>

name<input name="userModel.name" type="text"/><br>

<input type="submit" value="保存"/>

<button onclick="javascript:history.go(-1)">返回</button><br>

</form>

</body>
</html>