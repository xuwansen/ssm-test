<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>校园社团管理系统</title>
</head>
<body>
	<%@include file="/WEB-INF/header.jsp"%>
	<%@include file="/WEB-INF/pages/president/commons/nav.jsp"%>
	<div class="div_main">
		<table
			style="margin: 0px auto; width: 100%; text-align: center; border: 2px solid orange;">
			<tr style="height:25px">
				<th
					style="text-align: center; background-color: orange;"><strong>申请编号</strong></th>
				<th
					style="text-align: center; background-color: orange;"><strong>申请人</strong></th>
				<th
					style="text-align: center; background-color: orange;"><strong>申请人电话</strong></th>
				<th
					style="text-align: center; background-color: orange;"><strong>当前状态</strong></th>
				<th
					style="text-align: center; background-color: orange;"><strong>申请日期</strong></th>
				<th
					style="text-align: center; background-color: orange;"><strong>操作</strong></th>
			</tr>
			<c:forEach var="application" items="${applications}">
				<tr style="border: 2px solid orange; height: 30px">
					<td>${application.id}</td>
					<td>${application.user.userName}</td>
					<td>${application.user.phone}</td>
					<td>${application.status}</td>
					<td>${application.formatDate}</td>
					<td>
					<form action="${pageContext.request.contextPath }/application/audit" method="POST">
						<input name="_method" value="put" hidden="true">
						<input name="status" value="等待面试" hidden="true">
						<input name="id" value="${application.id}" hidden="true">
						<input name="clubId" value="${sessionScope.club.clubId}" hidden="true">
						<input type="submit" value="安排面试" onclick="javascript:return consent();">
					</form>
					<form action="${pageContext.request.contextPath }/application/audit" method="POST">
						<input name="_method" value="put" hidden="true">
						<input name="status" value="被拒" hidden="true">
						<input name="id" value="${application.id}" hidden="true">
						<input name="clubId" value="${sessionScope.club.clubId}" hidden="true">
						<input type="submit" value="拒绝申请" onclick="javascript:return refuse();">
					</form>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<script type="text/javascript">
		function consent() {
			var msg = "是否确定安排面试?\n\n请确认！";
			if (confirm(msg)==true){
				return true;
			}else{
				return false;
			}
		}
		function refuse(){
			if(confirm("是否确定拒绝此申请者")==true){
				return true;
			}elss{
				return false;
			}
		}
	</script>
	<div>
		<p>共${totalSize}条记录&nbsp;&nbsp; ${pageNo}/${totalPage}页</p>
			<a href="${pageContext.request.contextPath}/application/page?pageNo=1&privilege=${sessionScope.user.privilege}">首页</a>
		<c:choose>
			<c:when test="${pageNo==1}">
				<a href="${pageContext.request.contextPath}/application/page?pageNo=1&privilege=${sessionScope.user.privilege}">上一页</a>
			</c:when>
			<c:otherwise>
				<a href="${pageContext.request.contextPath}/application/page?pageNo=${pageNo-1}&privilege=${sessionScope.user.privilege}">上一页</a>
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${pageNo==totalPage}">
				<a href="${pageContext.request.contextPath}/application/page?pageNo=${totalPage}&privilege=${sessionScope.user.privilege}">下一页</a> 
			</c:when>
			<c:otherwise>
				<a href="${pageContext.request.contextPath}/application/page?pageNo=${pageNo+1}&privilege=${sessionScope.user.privilege}">下一页</a> 
			</c:otherwise>
		</c:choose>
		<a href="${pageContext.request.contextPath}/application/page?pageNo=${totalPage}&privilege=${sessionScope.user.privilege}">最后一页</a>
	</div>

	<%@include file="/WEB-INF/footer.jsp"%>
</body>
</html>