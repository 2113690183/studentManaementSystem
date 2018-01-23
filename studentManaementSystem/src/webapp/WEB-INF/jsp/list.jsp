<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	<script src="js\jquery-3.2.1.slim.min.js">
</script>
</head>
<body>
	方向: 全部
	<a href="" id="java">Java开发</a>
	<a href="" id="bigdata">大数据</a>
	<a href="" id="test">软件测试</a>
	<a href="" id="web">web前端</a>
	<br> 性别: 全部
	<a href="" id="man">男</a>
	<a href="" id="woman">女</a>
	<table border="1" id="mytable">
		<thead>
			<tr>
				<th>学号</th>
				<th>姓名</th>
				<th>性别</th>
				<th>专业</th>
				<th>方向</th>
				<th>技术</th>
				<th>能力</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="temp" varStatus="vs">
				<tr>
					<td>${temp.id }</td>
					<td>${temp.name }</td>
					<td>${temp.sex }"</td>
					<td>${temp.major }</td>
					<td>${temp.intention}</td>
					<td>${temp.skill }</td>
					<td>${temp.power }</td>
					<td><a href="userAction!delete?userModel.id=${temp.id }">删除</a>
						<a href="userAction!to_edit?userModel.id=${temp.id }">修改</a> <a
						href="userAction!info?userModel.id=${temp.id }">详情</a></td>
				</tr>
			</c:forEach>
		</tbody>
		<tfoot></tfoot>
	</table>
	<a href="userAction!add">添加数据</a>
</body>

</html>