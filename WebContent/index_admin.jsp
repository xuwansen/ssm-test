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
	<div class="div_picture" style="margin-top: 5px;">
		<div id="slidershow" class="carousel slide" data-slide="carousel">
			<!--图片轮播顺序-->
			<ol class="carousel-indicators">
				<li class="active" data-target="#slidershow" data-slide-to="0"></li>
				<li class="active" data-target="#slidershow" data-slide-to="1"></li>
				<li class="active" data-target="#slidershow" data-slide-to="2"></li>
				<li class="active" data-target="#slidershow" data-slide-to="3"></li>
			</ol>
			<!--设置轮播图片-->
			<div class="carousel-inner">
				<!--第一张图片开始-->
				<div class="item active" style="margin: 0 auto;">
					<a href="#"> <img src="${pageContext.request.contextPath }/statics/img/running_logo.jpg"
						style="width: 800px; height: 450px;" style="margin: 0 auto;" />
					</a>
					<div class="carousel-caption">
						<h3>奔跑吧！兄弟</h3>
					</div>
				</div>
				<!--第一张图片结束-->
				<!--第二张图片开始-->
				<div class="item">
					<a href="#"> <img src="${pageContext.request.contextPath }/statics/img/hip-hop_logo.jpg" style="width: 800px; height: 450px;" />
					</a>
					<div class="carousel-caption">
						<h3>街舞社</h3>
					</div>
				</div>
				<!--第二张图片结束-->
				<!--第三张图片开始-->
				<div class="item">
					<a href="#"> <img src="${pageContext.request.contextPath }/statics/img/guitar_logo.jpg"
						style="width: 800px; height: 450px;" />
					</a>
					<div class="carousel-caption">
						<h3>吉他社</h3>
					</div>
				</div>
				<!--第三张图片结束-->
				<!--第四张图片开始-->
				<div class="item">
					<a href="#"> <img src="${pageContext.request.contextPath }/statics/img/skating_logo.jpg"
						style="width: 800px; height: 450px;" />
					</a>
					<div class="carousel-caption">
						<h3>轮滑社</h3>
					</div>
				</div>
				<!--第四张图片结束-->
			</div>
			<!--图片轮播控制器开始-->
			<a class="carousel-control left " href="#slidershow" role="button"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-left">&lsaquo;</span>
			</a> <a class="carousel-control right" href="#slidershow" role="button"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right">&rsaquo;</span>
			</a>
		</div>
	</div>
	<%@include file="/WEB-INF/footer.jsp"%>
</body>
</html>