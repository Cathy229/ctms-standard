<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
</head>
<body>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
		<button id="searchBtn" type="button" class="btn btn-default">查询</button>
		<button id="newBtn" type="button" class="btn btn-info">新增</button>
		<button id="editBtn" type="button" class="btn btn-yellow">编辑</button>
		<button id="delBtn" type="button" class="btn btn-danger">删除</button>
		</div>
		<div class="col-md-12">
		查询条件
		</div>
		<form id="searchForm">
		<div class="col-md-12">
			<div class="col-md-3">
				<div class="form-group">
					<label class="col-md-4">Receiver名称</label>
					<div class="col-md-8">
						<input class="form-control" name="earvName" operator="likeAnywhere"></input>
					</div>
				</div>
			</div>
			<div class="col-md-3">
				<div class="form-group">
					<label class="col-md-4">Receiver代码</label>
					<div class="col-md-8">
						<input class="form-control" name="earvCode" operator="likeAnywhere"></input>
					</div>
				</div>
			</div>
		</div>
		</form>
		<div class="col-md-12">
			<table id="receiver_grid" style="width:100%"></table>
			<div id="receiver_gridPager"></div>
		</div>
	</div>
</div>
</body>
</html>