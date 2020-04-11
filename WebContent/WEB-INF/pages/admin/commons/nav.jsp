<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="section">
		<%@include file="/WEB-INF/second_head.jsp"%>
		<nav>
				<ul class="nav nav nav-pills right">
					<li role="presentation">
						<a href="${pageContext.request.contextPath}/index_admin.jsp">首页</a>
					</li>
					<li role="presentation">
						<a href="${pageContext.request.contextPath}/club/getClubs?privilege=${sessionScope.user.privilege}">社团管理</a>
					</li>
					<li role="presentation">
						<a href="${pageContext.request.contextPath}/user/getUsers">用户管理</a>
					</li>
					<li role="presentation">
						<a href="#">请求管理</a>
					</li>
				</ul>
			</nav>
	</div>
	<div class="clear"></div>
	<hr style="height: 4px; background-color: red;" />

</body>
</html>