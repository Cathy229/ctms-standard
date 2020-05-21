<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
</head>
<body>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			欢迎进入Fros管理平台
			<button id="test" type="button" class="btn btn-yellow">GET</button>
			<button id="testDlg" type="button" class="btn btn-yellow">Open</button>
			<button id="testSet" type="button" class="btn btn-yellow">Set</button>
		</div>
		<form id="form">
			<div class="col-md-6">
				<div class="form-group">
					<label class="col-md-4">仓库</label>
					<div class="col-md-8">
						<input class="form-control" id="whName" name="whName"></input>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<label class="col-md-4">仓库状态</label>
					<div class="col-md-8">
						<input class="form-control" name="flag"></input>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<label class="col-md-4">仓库2</label>
					<div class="col-md-8">
						<input class="form-control" id="whName2" name="whName2"></input>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<label class="col-md-4">仓库状态2</label>
					<div class="col-md-8">
						<input class="form-control" name="flag2"></input>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<label class="col-md-4">仓库3</label>
					<div class="col-md-8">
							<div class="input-group">
								<input type="text" class="form-control" id="whName3" name="whName3">
								<div class="input-group-addon" role="button">
									<i class="icon-search" ></i>
								</div>
							</div>
							<input type="hidden" class="form-control"  id="whId" name="whId">
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<label class="col-md-4">仓库状态3</label>
					<div class="col-md-8" id="whName3Text">
						
					</div>
				</div>
			</div>
		</form>
	</div>
	<div class="row">
		<div class="col-md-12">
			<table id="testTplGrid" style="width:100%"></table>
			<div id="testTplGridPager"></div>
		</div>
		<div class="col-md-12">
			<table id="test_grid2" style="width:100%"></table>
			<div id="test_grid2Pager"></div>
		</div>
	</div>
</div>
</body>
</html>
