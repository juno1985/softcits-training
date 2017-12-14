<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<sf:form modelAttribute="user" method="post"> 
		id:<sf:input path="id"/><sf:errors path="id"/><br/>
		用户名:<sf:input path="username"/><sf:errors path="username"/><br/>
		密码:<sf:password path="password" /><br/>
		电话:<sf:input path="phone" /> <sf:errors path="phone" /><br/>
		<input type="submit" value="添加用户"/>
	</sf:form>
</body>
</html>