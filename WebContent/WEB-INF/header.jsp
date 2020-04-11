<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/bootstrap.min.css" type="text/css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/layout.css" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/jquery-1.12.2.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/bootstrap.min.js"></script>
<body>
	<header>
		<div class="header_layout">
			<div class="left" style="margin-top: 5px;">校园社团网，欢迎您！</div>
			<div class="right" style="margin-top: 5px;">
				<c:choose>
					<c:when test="${sessionScope.user!=null}">
						<strong>尊敬的${user.userName}用户,欢迎您！<a href="${pageContext.request.contextPath }/user/logout">注销</a></strong>
					</c:when>
					<c:otherwise>
						<a href="${pageContext.request.contextPath }/login.jsp">登录</a>&nbsp;丨&nbsp; <a href="${pageContext.request.contextPath }/enroll.jsp">注册</a>
					</c:otherwise>
				</c:choose>
			</div>
			<div class="clear"></div>
		</div>
	</header>
</body>
</html>