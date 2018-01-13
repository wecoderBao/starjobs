<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>

	<div align="center">
		<font size="5"> 刷新列表</font>
	</div>
	<br />
	<label>导出</label>
	<input type="text" name="start" id="start" placeholder="起始位置"/> 
	<input type="text" name="limit" id="limit" placeholder="结束位置"/>
	<input type="button" onclick="exportFile('excel')" value="EXCEL导出"/>
	<br />
	<table border="1" width="100%">
		<tr>
			<td>区域</td>
			<td>名称</td>
			<td>手机号</td>
			<td>地址</td>
			<td>次数</td>
			<td>金额</td>
		</tr>

		<c:if test="${empty page.list }">
			<tr>
				<td colspan="8" align="center">没有商品</td>
			</tr>
		</c:if>
		<c:forEach items="${page.list }" var="refresh">
			<tr>
				<td>${refresh.area}</td>
				<td>${refresh.name}</td>
				<td>${refresh.phone}</td>
				<td>${refresh.address}</td>
				<td>${refresh.refreshTimes}</td>
				<td>${refresh.money}</td>
			</tr>
		</c:forEach>

	</table>
	<br />
	<div align="center">
		<c:if test="${page.currPage>1 }">
			<a
				href="${pageContext.request.contextPath }/home?page=${page.currPage-1}">上一页</a>
		</c:if>
		<a href="${pageContext.request.contextPath }/home?page=${1}">首页</a>
		<c:forEach begin="1" end="${page.totalPage }" step="1" var="i">
			<c:if test="${page.currPage==i }">
				<a href="${pageContext.request.contextPath }/home?page=${i}"><font
					color="#ff0000">${i}</font></a>
			</c:if>
			<c:if test="${page.currPage!=i }">
				<a href="${pageContext.request.contextPath }/home?page=${i}">${i}</a>
			</c:if>
		</c:forEach>
		<a
			href="${pageContext.request.contextPath }/home?page=${page.totalPage}">末页</a>
		<c:if test="${page.currPage< page.totalPage }">
			<a
				href="${pageContext.request.contextPath }/home?page=${page.currPage+1}">下一页</a>
		</c:if>
	</div>
	<script>
		//导出文件
		function exportFile(exportFile) {
			//var start = $("#start").val()
			//var limit = $("#limit").val()
			var url = 'admin/refresh/export/' + exportFile + '/'
					+ start + '/' + limit;
			//window.location.href = url + '?' + buildUrlParam(buildReqParam());
			window.location.href = "/poi/export2007";
		}
	</script>
</body>
</html>