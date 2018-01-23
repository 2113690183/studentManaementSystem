<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<br />
	<form action="userAction!do_edit" method="post">
		<input name="userModel.id" type="hidden" value="${userModel.id }" />
		<table>
			<tr>
				<td>name</td>
				<td><input name="userModel.name" type="text"
					value="${userModel.name }" /></td>
			</tr>
			<tr>
				<td>sex</td>
				<td><input name="userModel.sex" type="text"
					value="${userModel.sex }" /></td>
			</tr>
			<tr>
				<td>major</td>
				<td><input name="userModel.major" type="text"
					value="${userModel.major }" /></td>
			</tr>
			<tr>
				<td>intention</td>
				<td><input name="userModel.intention" type="text"
					value="${userModel.intention }" /></td>
			</tr>
			<tr>
				<td>skill</td>
				<td><input name="userModel.skill" type="text"
					value="${userModel.skill }" /></td>
			</tr>
			<tr>
				<td>power</td>
				<td><input name="userModel.power" type="text"
					value="${userModel.power }" /></td>
			</tr>
			<tr>
				<td colspan="2">
					<button onclick="javascript:history.go(-1)">返回</button> <input
					type="submit" value="保存" />
				</td>
			</tr>
		</table>
	</form>


</body>
</html>