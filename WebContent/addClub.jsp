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
		<form action="${pageContext.request.contextPath}/club/addClub" method="post" class="form-horizontal" style="width: 350px;margin: 5px auto;" >
			<div class="form-group center">
				<label for="username" class="col-sm-3 control-label">社团名称</label>
				<div class="col-sm-7">
					<input name="clubName" type="text" class="form-control" id="clubName" placeholder="请输入社团名称" required="required">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label">社  长  Id </label>
				<div class="col-sm-7">
					<input name="userId" type="text" class="form-control" id="userId" placeholder="请输入社长ID " required="required">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label">社团简介</label>
				<div class="col-sm-7">
					<input name="clubInfo" type="text" class="form-control" id="clubInfo" placeholder="请输入社团简介" required="required">
				</div>
			</div>
			
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-8">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<button type="submit" class="btn btn-default" >创建</button> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<button type="reset" class="btn btn-default">重置</button>
				</div>
			</div>
		</form>
	</div>
	<%@include file="/WEB-INF/footer.jsp"%>
</body>
</html>