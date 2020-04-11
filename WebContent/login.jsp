<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="/WEB-INF/header.jsp"%>
	<%@include file="/WEB-INF/pages/student/commons/nav.jsp"%>
	<div class="div_main">
			<form action="user/login" method="post" class="form-horizontal" style="width: 450px;margin: 20px auto;">
				<div class="form-group">
					<label for="username" class="col-sm-2 control-label">用户名</label>
					<div class="col-sm-3" style="width: 300px;">
						<input name="username" type="username" class="form-control" id="username"  placeholder="请输入用户名\邮箱\电话号码" required="required">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">密码</label>
					<div class="col-sm-3" style="width: 300px;">
						<input name="password" type="password" class="form-control" placeholder="请输入密码" required="required">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-3">
						<div class="checkbox">
							<label><input type="checkbox">记住我</label>
						</div>
					</div>
				</div>

				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-4">
						<button type="submit" class="btn btn-default">登录</button> &nbsp;&nbsp;&nbsp;
						<button type="reset" class="btn btn-default">重置</button>
					</div>
				</div>
			</form>
		</div>
	
	
	<%@include file="/WEB-INF/footer.jsp"%>
</body>
</html>