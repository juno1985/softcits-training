<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>


<%@ page import="java.util.*, servletdemo.ResInfo" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>统计用户在线</title>
</head>
<body>
<table width="400" border="1">
	<tr>
		<th>会话ID</th>
		<th>访问的网页</th>
		<th>客户端IP</th>
		<th>用户名</th>
		<th>打开网页时间</th>
	</tr>
	<%List<ResInfo> online = (List<ResInfo>)application.getAttribute("reqList"); 
		for (ResInfo ri: online)
		{%>
		<tr>
			<td><%=ri.getSessionId() %></td>
			<td><%=ri.getPage() %></td>
			<td><%=ri.getIp() %></td>
			<td><%=ri.getUname() %></td>
			<td><%=ri.getMills() %></td>
		</tr>
		<%} %>
</table>

</body>
</html>