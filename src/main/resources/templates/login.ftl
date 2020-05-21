<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page - Fros Admin</title>
<meta name="description" content="User login page" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link href="dist/third-party/bootstrap/css/bootstrap.css" rel="stylesheet">
<link href="dist/third-party/bootstrap/css/font-awesome.css" rel="stylesheet">
<link href="dist/fros/css/fros-color.css" rel="stylesheet">
<link href="dist/fros/css/fros-custom.css" rel="stylesheet">
<link href="dist/modules/css/login.css" rel="stylesheet">
</head>
<body class="login-layout">
	<div class="main-container">
		<div class="main-content">
			<div class="row">
				<div class="col-sm-10 col-sm-offset-1">
					<div class="login-container">
						<div class="center">
							<h1>
								<i class="icon-leaf green"></i>
								<span class="red">FrosBoot</span>
								<span class="white">Application</span>
							</h1>
							<h4 class="blue">&copy; Sinotrans</h4>
						</div>

						<div class="space-6"></div>
						<div class="position-relative">
							<div id="login-box" class="login-box visible widget-box no-border">
								<div class="widget-body">
									<div class="widget-main">
										<h4 class="header blue lighter bigger">
											<i class="icon-coffee green"></i>
											Please Enter Your Information
										</h4>
	
										<#if RequestParameters['error']??>
											<p class="text-danger"><strong>用户名或密码错误，请确认后重新输入!</strong></p>
										</#if>
										<#if RequestParameters['kaptcha']??>
											<p class="text-danger"><strong>验证码错误，请确认后重新输入!</strong></p>
										</#if>
										<div class="space-6"></div>
										<form action="login" method="post">
											<fieldset>
												<label class="block clearfix">
													<span class="block input-icon input-icon-right">
														<input type="text" class="form-control" name="username" placeholder="用户名" />
														<i class="icon-user"></i>
													</span>
												</label>
												<label class="block clearfix">
													<span class="block input-icon input-icon-right">
														<input type="password" class="form-control" name="password" placeholder="密码" />
														<i class="icon-lock"></i>
													</span>
												</label>
												
												<label class="block clearfix">
													<span class="block input-icon input-icon-right">
														<img id="kaptchaImage" src="kaptcha.jpg"
											             style="width: 74px; height: 29px;"/>
													</span>
												</label>
												
												<label for="kaptcha" class="block clearfix">
													<span class="block input-icon input-icon-right">
														<input type="text" class="form-control" name="kaptcha" placeholder="验证码" />
														<i class="icon-qrcode"></i>
													</span>
											    </label>
												
												
												<div class="space"></div>
												<div class="clearfix">
													<label class="inline">
														<input type="checkbox" class="ace" name="_spring_security_remember_me" value="1"/>
														<span class="lbl"> Remember Me</span>
													</label>

													<button type="submit" class="width-35 pull-right btn btn-sm btn-primary">
														<i class="icon-key"></i>
														Login
													</button>
												</div>

												<div class="space-4"></div>
											</fieldset>
										</form>

										<div class="social-or-login center">
											<span class="bigger-110">Or Login Using</span>
										</div>

										<div class="social-login center">
											<a class="btn btn-primary">
												<i class="icon-facebook"></i>
											</a>

											<a class="btn btn-info">
												<i class="icon-twitter"></i>
											</a>

											<a class="btn btn-danger">
												<i class="icon-google-plus"></i>
											</a>
										</div>
									</div><!-- /widget-main -->
								</div><!-- /widget-body -->
							</div><!-- /login-box -->
						</div><!-- /position-relative -->
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--[if lt IE 9]>
	<script src="dist/third-party/html5shiv/html5shiv.js"></script>
	<script src="dist/third-party/respond/respond.js"></script>
	<![endif]-->
</body>
</html>