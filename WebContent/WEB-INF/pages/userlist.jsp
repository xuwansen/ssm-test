<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>校园社团管理系统</title>
</head>
<body>
	<%@include file="/WEB-INF/header.jsp"%>
	<%@include file="/WEB-INF/pages/admin/commons/nav.jsp"%>
	<div class="div_main">
		<table
			style="margin: 0px auto; width: 100%; text-align: center; border: 2px solid orange;">
			<tr>
				<th
					style="text-align: center; background-color: orange; width: 30px; height: 25px;"><strong>用  户 Id</strong></th>
				<th
					style="text-align: center; background-color: orange; width: 30px; height: 25px;"><strong>用户名</strong></th>
				<th
					style="text-align: center; background-color: orange; width: 30px; height: 25px;"><strong>电话</strong></th>
				<th
					style="text-align: center; background-color: orange; width: 30px; height: 25px;"><strong>用户身份</strong></th>
			</tr>
			<c:forEach var="user" items="${users}">
				<tr style="border: 2px solid orange; height: 30px">
					<td>${user.userId}</td>
					<td>${user.userName}</td>
					<td>${user.phone}</td>
					<td>${user.privilege}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div>
		<p>共${totalSize}条记录&nbsp;&nbsp; ${pageNo}/${totalPage}页</p>
		<a href="${pageContext.request.contextPath}/user/page?pageNo=1&privilege=${sessionScope.user.privilege}">首页</a>
		<c:choose>
			<c:when test="${pageNo==1}">
				<a href="${pageContext.request.contextPath}/user/page?pageNo=1&privilege=${sessionScope.user.privilege}">上一页</a>
			</c:when>
			<c:otherwise>
				<a
					href="${pageContext.request.contextPath}/user/page?pageNo=${pageNo-1}&privilege=${sessionScope.user.privilege}">上一页</a>
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${pageNo==totalPage}">
				<a
					href="${pageContext.request.contextPath}/user/page?pageNo=${totalPage}&privilege=${sessionScope.user.privilege}">下一页</a>
			</c:when>
			<c:otherwise>
				<a
					href="${pageContext.request.contextPath}/user/page?pageNo=${pageNo+1}&privilege=${sessionScope.user.privilege}">下一页</a>
			</c:otherwise>
		</c:choose>
		<a
			href="${pageContext.request.contextPath}/user/page?pageNo=${totalPage}&privilege=${sessionScope.user.privilege}">最后一页</a>
	</div>

	<%@include file="/WEB-INF/footer.jsp"%>
</body>
</html>