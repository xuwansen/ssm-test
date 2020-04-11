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
	<%@include file="/WEB-INF/pages/student/commons/nav.jsp"%>
	<div class="div_main">
			<form class="form-horizontal" style="width: 450px;margin: 20px auto;" action="${pageContext.request.contextPath}/application/createClub?userId={sessionScope.user.userId}"  method="post">
				<input hidden="true" name="userId" value="${SessionScope.user.userId}"/>
				<div class="form-group">
					<label for="clubName" class="col-sm-3 control-label">社团名</label>
					<div class="col-sm-3" style="width: 300px;">
						<input type="text" class="form-control" id="clubName" name="clubName" placeholder="请输入社团名" required="required">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-3 control-label">社团简介</label>
					<div class="col-sm-3" style="width: 300px;">
						<input name="clubInfo" type="text" class="form-control" placeholder="请输入社团简介（例：吉他社 吉他教学）" required="required">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-8">
						<button type="submit" class="btn btn-default">创建</button> &nbsp;&nbsp;&nbsp;
					</div>
				</div>
			</form>
		</div>
	
	
	<%@include file="/WEB-INF/footer.jsp"%>
</body>
</html>