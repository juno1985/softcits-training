<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/user.css"
	type="text/css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/uploadify/uploadify.css"
	type="text/css">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/uploadify/jquery.uploadify.min.js"></script>
	
	<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/js/user.js"></script>

<title>添加用户</title>
</head>
<body>
	<!-- 用来在前端获取context root路径 -->
	<input type="hidden" id="ctx" value="<%=request.getContextPath()%>" />

	<sf:form modelAttribute="userDto" method="post">
	<!-- 注意：由于是点击form中的submit按钮 提交给controller,所以如果想让隐藏的attSrc一并提交，则需要写到form里 -->
		<input type="hidden" id="attSrc" name="attSrc">
		<table class="addUserTbl">
			<th colspan="2">添加用户</th>
			<tr>
				<td>id:</td>
				<td><sf:input path="id" /></td>
			</tr>
			<tr>
				<td>用户名:</td>
				<td><sf:input path="username" /> <sf:errors path="username"
						cssClass="sfError" /></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><sf:password path="password" /> <sf:errors path="password"
						cssClass="sfError" /></td>
			</tr>
			<tr>
				<td>电话:</td>
				<td><sf:input path="phone" /> <sf:errors path="phone"
						cssClass="sfError" /></td>
			</tr>
			<tr>
				<td>组:</td>
				<td>
					<sf:select path="gid" items="${glist }" itemLabel="groupname" itemValue="id">
						
					</sf:select>
				</td>
			</tr>
			<tr>
				<td>上传照片:</td>
				<td><input type="file" id="attach" name="attach" /></td>
				<td><input type="button" id="uploadFile" value="上传" /></td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit" value="添加"
					style="width: 100px" /></td>
			</tr>
		</table>
	</sf:form>
	
	<div id="imgPreview" ><p>照片预览</p></div>
</body>
</html>