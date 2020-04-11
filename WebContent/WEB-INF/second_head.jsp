<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="left" style="width: 80%;">
			<div class="left" style="width: 70%;">
				<img src="${pageContext.request.contextPath }/statics/img/logo.png" width="80%" />
			</div>
			<div class="right" style="width: 30%; margin-top: 40px;">
				<form action="${pageContext.request.contextPath}/club/search" method="post">
					<input id="clubName" type="text" name="clubName" placeholder="输入要查询的社团名" />
					<input name="privilege" value="${sessionScope.user.privilege}" hidden="true">
					 <input type="submit" class="btn-primary" value="搜索" />
				</form>
			</div>
			<div class="clear"></div>
		</div>
		<div class="right" style="width: 20%;">
			<img src="${pageContext.request.contextPath}/statics/img/balloon.png" width="70%" />
		</div>
</body>
</html>