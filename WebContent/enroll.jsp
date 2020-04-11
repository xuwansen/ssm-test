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
		<form action="${pageContext.request.contextPath}/user/enroll" method="post" class="form-horizontal" style="width: 350px;margin: 5px auto;" >
			<div class="form-group center">
				<label for="username" class="col-sm-3 control-label">姓 名</label>
				<div class="col-sm-7">
					<input name="username" type="username" class="form-control" id="username" placeholder="请输入用户名" required="required">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label">电  话</label>
				<div class="col-sm-7">
					<input name="phone" type="text" class="form-control" id="studentno" placeholder="请输入手机号码" required="required">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label">密  码</label>
				<div class="col-sm-7">
					<input name="password" id="password" type="password" class="form-control" placeholder="Password" required="required">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label">确认密码</label>
				<div class="col-sm-7">
					<input id="password_confirm" type="password" class="form-control" placeholder="Password" required="required">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label">性 别</label>
				<div class="col-sm-7">
					<input type="radio" id="male" name="gender" required="required" value="男">男
					<input type="radio" id="female" name="gender" value="女">女
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-8">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<button type="submit" class="btn btn-default" onclick="javascript:return checkPassword()">注册</button> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<button type="reset" class="btn btn-default">重置</button>
				</div>
			</div>
		</form>
	</div>
	<script type="text/javascript">
			function checkPassword() {
				var p1 = document.getElementById("password");
				var p2 = document.getElementById("password_confirm");
				if(p1.value != p2.value) {
					window.alert("密码不一致");
					return false;
				} else {
					return true;
				}
			}
		</script>
	<%@include file="/WEB-INF/footer.jsp"%>
</body>
</html>