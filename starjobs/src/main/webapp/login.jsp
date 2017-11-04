<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
<meta charset="utf-8">
<title>后台登录</title>
<meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<link href='http://fonts.useso.com/css?family=Open+Sans:400,700'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet" type="text/css"
	href="lib/bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="lib/font-awesome/css/font-awesome.css">

<script src="lib/jquery-1.11.1.min.js" type="text/javascript"></script>



<link rel="stylesheet" type="text/css" href="stylesheets/theme.css">
<link rel="stylesheet" type="text/css" href="stylesheets/premium.css">

</head>
<body class=" theme-blue">

	<!-- Demo page code -->

	<script type="text/javascript">
		$(function() {
			var match = document.cookie.match(new RegExp('color=([^;]+)'));
			if (match)
				var color = match[1];
			if (color) {
				$('body').removeClass(function(index, css) {
					return (css.match(/\btheme-\S+/g) || []).join(' ')
				})
				$('body').addClass('theme-' + color);
			}

			$('[data-popover="true"]').popover({
				html : true
			});

		});
	</script>
	<style type="text/css">
#line-chart {
	height: 300px;
	width: 800px;
	margin: 0px auto;
	margin-top: 1em;
}

.navbar-default .navbar-brand, .navbar-default .navbar-brand:hover {
	color: #fff;
}
</style>

	<script type="text/javascript">
		$(function() {
			var uls = $('.sidebar-nav > ul > *').clone();
			uls.addClass('visible-xs');
			$('#main-menu').append(uls.clone());
		});
	</script>



	<div class="navbar navbar-default" role="navigation">
		<div class="navbar-header">
			<a class="" href="index.html"><span class="navbar-brand"><span
					class="fa fa-paper-plane"></span> StarJobs</span></a>
		</div>

		<div class="navbar-collapse collapse" style="height: 1px;"></div>
	</div>
	</div>



	<div class="dialog">
		<div class="panel panel-default">
			<p class="panel-heading no-collapse">登录</p>
			<div class="panel-body">
				<form action="login" method="post">
					<div class="form-group">
						<label>用户名</label> <input type="text" name="cAdminName"
							class="form-control span12">

					</div>
					<div class="form-group">
						<label>密码</label> <input name="cAdminPassword" type="password"
							class="form-controlspan12 form-control">
					</div>
					<input type="submit" /> <label class="remember-me"><input
						type="checkbox"> 记住密码</label>
					<div class="clearfix"></div>
				</form>
			</div>
		</div>
		<!-- <p><a href="reset-password.html">忘记密码?</a></p>  -->
	</div>



	<script src="lib/bootstrap/js/bootstrap.js"></script>
	<script type="text/javascript">
		$("[rel=tooltip]").tooltip();
		$(function() {
			$('.demo-cancel-click').click(function() {
				return false;
			});
		});
	</script>


</body>
</html>
