<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
				<li role="presentation"><a href="${pageContext.request.contextPath}/index_student.jsp">首页</a></li>
				<c:choose>
					<c:when test="${user==null}">
						<li role="presentation"><a href="${pageContext.request.contextPath }/login.jsp" onclick="message()">社团列表</a></li>
						<li role="presentation"><a href="${pageContext.request.contextPath }/login.jsp" onclick="message()">创建社团</a></li>
						<li role="presentation"><a href="${pageContext.request.contextPath }/login.jsp" onclick="message()">请求记录</a></li>
					</c:when>
					<c:otherwise>
						<li role="presentation"><a href="${pageContext.request.contextPath}/club/getClubs">社团列表</a></li>
						<li role="presentation"><a href="${pageContext.request.contextPath}/createClub.jsp">创建社团</a></li>
						<li role="presentation"><a href="${pageContext.request.contextPath}/application/getApplications">请求记录</a></li>
					</c:otherwise>
				</c:choose>
			</ul>
		</nav>
	</div>
	<script type="text/javascript">
		function message(){
			alert("您还没有登录！请先登录");
		}
	</script>
	
	
	<div class="clear"></div>
	<hr style="height: 4px; background-color: red;" />

</body>
</html>