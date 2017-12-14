<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/user.css"
	type="text/css">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>

<body>
<!-- 用来在前端获取context root路径 -->
	<input type="hidden" id="ctx" value="<%=request.getContextPath()%>" />

	<table class="usersList">
		<tr>
			<td>员工号</td>
			<td>${user.id}</td>
		</tr>
		<tr>
			<td>员工名</td>
			<td>${user.username}</td>
		</tr>
		<tr>
			<td>密码</td>
			<td>${user.password}</td>
		</tr>
		<tr>
			<td>电话</td>
			<td>${user.phone}</td>
		</tr>
		<tr>
			<td>组</td>
			<td>${user.group.groupname}</td>
		</tr>
		<tr>
			<td>照片</td>
			<td><img id="photo" src="<%=request.getContextPath()%>/resources/upload/${user.piclink}" /></td>
		</tr>
	</table>
	<a href="<%=request.getContextPath()%>/admin/users/list">返回用户列表</a>
</body>
</html>
