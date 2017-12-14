<%-- <%@page import="org.softcits.basic.model.SystemContext"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="pg" uri="http://jsptags.com/tags/navigation/pager"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 
	分页的方式有两种,一种是数据库分页 如 select * from t_user where rownum = 15
					mybatis中引入pagehelper即可
				一种是页面分页 如本案使用pager-taglib
	param.totalRecord -- 从list.jsp传进的数值并封装到param对象里了
	param.url -- 从list.jsp传进的数值并封装到param对象里了 
	url="${param.url }" -- 分页链接的根地址,pager会自动在这个链接后加上分页参数pager.offset
	items -- 总记录数
	maxPageItems -- 每页显示记录数
	pageNumber -- 页码
	export="curPage=pageNumber" -- 初始化时将页码付给curPage变量
	pageNumber在pg:pages中表示每次循环的页码号
	
	-->
	
<pg:pager export="curPage=pageNumber" items="${param.totalRecord}"
	maxPageItems="<%=3 %>" url="${param.url }">
	<span style="float: right; padding: 6px;"> 共 <pg:last>
		${pageNumber } 页[${param.totalRecord }条记录],每页显示2条,
	</pg:last> 
		<pg:first>
			<a href="${pageUrl }" class="pager_link">首页</a>
		</pg:first> <pg:prev>
			<a href="${pageUrl }" class="pager_link">上一页</a>
		</pg:prev> <pg:pages>
			<c:if test="${curPage eq pageNumber }">
			[${pageNumber }]
		</c:if>
			<c:if test="${curPage != pageNumber }">
				<a href="${pageUrl }" class="pager_link">${pageNumber }</a>
			</c:if>
		</pg:pages> <pg:next>
			<a href="${pageUrl }" class="pager_link">下一页</a>
		</pg:next> <pg:last>
			<a href="${pageUrl }" class="pager_link">尾页</a>
		</pg:last>
	</span>
</pg:pager>
