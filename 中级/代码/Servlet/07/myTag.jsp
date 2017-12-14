<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- 导入标签库，并指定前缀 -->
<%@ taglib uri="http://www.softcits.com/mytaglib" prefix="myFirstTag"%>

<html>
<head>
<title>自定义标签案例</title>
</head>
<body>
<!-- 使用标签，myFirstTag是前缀，根据uri可以定义到tld文件，并通过标签名mytag可以找到处理类 -->
<myFirstTag:mytag/>
</body>
</html>