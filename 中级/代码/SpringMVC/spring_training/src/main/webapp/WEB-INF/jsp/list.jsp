<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/userList.css"
	type="text/css">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table class="usersList">
		<tr>
			<th>员工号</th>
			<th>员工名</th>
			<th>密码</th>
			<th>电话</th>
			<th></th>
		</tr>

		<c:forEach items="${umap }" var="u">
			<tr>
				<td>${u.value.id}</td>
				<td><a href="${u.value.username}"> ${u.value.username}</a></td>
				<td>${u.value.password}</td>
				<td>${u.value.phone}</td>
				<td><a href="delete/${u.value.username}">删除</a></td>
			</tr>
		</c:forEach>

	</table>
	
	<a href="<%=request.getContextPath()%>/users/add">添加用户</a>
</body>
</html>