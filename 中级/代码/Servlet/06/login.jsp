<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/resources/css/admin/login.css"/>
<title>IT沙龙后台管理登录</title>
<!-- <script type="text/javascript">
function reCheckcode(img) {
	/* 防止浏览器缓存验证码图片，导致不刷新，故传递一个随机数 */
	img.src="drawCode?"+Math.random();
}

</script> -->
</head>
<body>
<span style="color:red;font-weight:bold">
<% if (request.getAttribute("err") != null){
	out.println(request.getAttribute("err")+"<br/>");
}%>
</span>
<form id="login" method="post" action="/demo/paramServlet">
用户:<input type="text" name="username"/><br/>
密码:<input type="password" name="pass"/><br/>
<input type="submit" value="登录"/>
</form>

<!-- 生成验证码URI  http://localhost:9999/demo/drawCode -->
<!-- <img src="drawCode" onclick="reCheckcode(this)"/> -->
</body>
</html>