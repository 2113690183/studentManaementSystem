<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AddStudent</title>
</head>
<body>
	<form action="user_register" method="POST">
		<%-- <input name="userModel.id" type="hidden"  value="${userModel.id }" /> --%>

		userName<input name="userModel.userName" type="text" /> <br> 
		
		password<input name="userModel.password" type="text" /> <br>
	    
	    status<input name="roleModel.name" type="text" /> <br> 
			 
			 <input type="submit" value="提交" />

		<!-- <button onclick="javascript:history.go(-1)">返回</button> -->
		<br>

	</form>

</body>
</html>