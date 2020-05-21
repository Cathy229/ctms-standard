<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name=”renderer” content=”webkit” />
<link href="dist/third-party/bootstrap/css/bootstrap.css" rel="stylesheet">
<link href="dist/third-party/bootstrap/css/font-awesome.css" rel="stylesheet">
<link href="dist/fros/css/custom-button.css" rel="stylesheet">
<link href="dist/fros/css/fros-jquery-debug.css" rel="stylesheet">
<link href="dist/fros/css/fros-color.css" rel="stylesheet">
<link href="dist/fros/css/fros-custom.css" rel="stylesheet">
<script src="dist/fros/js/frosconfig.js?v=3"></script>
<script data-main="modules/js/main/main" src="dist/third-party/require/require.js"></script>

<style type="text/css">
	html,body{height:100%;margin:0;width:100%;}
	.main{
		width:100%;
		height:100%;
		margin:0;
	}
	.indexheader{
		width:100%;
		height:45px;
		margin:0;
		background: none repeat scroll 0 0 #438eb9;
	}
	.toolbar{
		float:left;
		width:150px;
		margin:0;
		position:relative;
		overflow: hidden;
	}
	.main > .content{
		float:right;
		margin:0;
	}
	.menuicon{
		border-top: 1px dotted #e4e4e4;
	    color: #616161;
	    display: block;
	    margin-top: 0px;
	    padding: 3px 0 5px 12px;
	    position: relative;
	}
	.menuicon:before {
	    border-top: 1px dotted #9dbdd6;
	    content: "";
	    display: inline-block;
	    left: 0px;
	    position: absolute;
	    top: 12px;
	    width: 7px;
	}
	.menuicon:hover{
		background-color: #f5f7fa;
		text-decoration: none;
	}
	.menuicon:focus{
		text-decoration: none;
	}
	.submenu{
		list-style: none outside none;
		margin: 0;
	    padding: 0;
	    position: relative;
	    border-bottom: 1px dotted #e4e4e4;
	}
	.submenu .submenu{
		display: none;
		border-bottom: none;
	}
	.submenu li:before{
		display: none;
	}
	.submenu .submenu li > a{
		margin-left: 7px;
	}
	.submenu .submenu .submenu li > a{
		margin-left: 14px;
	}
	.dropdown-toggle-a .arrow{
		position: absolute;
	    right: 11px;
	}
	.ui-accordion .ui-accordion-content {
		padding: 2px 1px;
	}
	.index-brand{
		padding-left: 10px;
		padding-right: 10px;
		height:45px;
	}
	.index-title{
		font-size: 24px;
		color: #ffffff;
	}
	.index-title:hover,
	.index-title:focus{
		color: #ffffff;
		text-decoration: none;
	}
</style>
<!--[if lt IE 9]>
	<script src="dist/third-party/html5shiv/html5shiv.js"></script>
	<script src="dist/third-party/respond/respond.js"></script>
<![endif]-->
</head>
<body>
	
	<div class='main'>
		<div class='indexheader'>
			<div class="index-brand pull-left">
			<a href="#" class="index-title">
			<small>
			<i class="icon-leaf"></i>
			Fros Admin
			</small>
			</a>
			</div>
			<ul class="nav ace-nav pull-right">
			<li class="light-blue">
			  <a data-toggle="dropdown" href="#" class="dropdown-toggle">
								<img class="nav-user-photo" src="dist/modules/images/user.jpg" alt="Jason's Photo" />
								<span class="user-info">
									<small>Welcome,</small>
									Admin
								</span>

								<i class="icon-caret-down"></i>
							</a>
			  <ul class="user-menu dropdown-menu dropdown-yellow dropdown-caret dropdown-closer pull-right">
								<li>
									<a href="#">
										<i class="icon-cog"></i>
										Settings
									</a>
								</li>

								<li>
									<a href="#">
										<i class="icon-user"></i>
										Profile
									</a>
								</li>

								<li class="divider"></li>

								<li>
									<a id="logoutBtn" href="#">
										<i class="icon-off"></i>
										Logout
									</a>
								</li>
							</ul>
			</li>
			</ul>
		</div>
		<div id="toolbar" class='toolbar'>
			<div id="accordionbar" style="height:100%">
				<h3><a href="#">菜单样例</a></h3>
				<div>
				<ul class="submenu" style="">
				<li>
				<a class="btn btn-app btn-yellow btn-xs" href="#">
				<i class="icon-shopping-cart bigger-160"></i>
				测试列表
				</a>
				<a class="btn btn-app btn-light btn-xs" href="#">
				<i class="icon-print bigger-160"></i>
				Print
				</a>
				</li>
				<li>
					<a href="#" class="menuicon dropdown-toggle-a">
						Test<b class="arrow icon-angle-down"></b>
					</a>
					<ul class="submenu" style="">
						<li>
							<a href="#" class="menuicon">Test</a>
						</li>
						<li>
							<a href="#" class="menuicon">Test</a>
						</li>
					</ul>
				</li>
				</ul>
				</div>
			</div>
		</div>
		<div class='content'>
			<div id="maintab" class="apTabs module-tab" style="width:100%; height:100%"></div>
		</div>
	</div>
</body>
</html>