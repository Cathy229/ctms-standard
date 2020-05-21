<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
</head>
<body>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
		<button id="saveBtn" type="button" class="btn btn-primary">保存</button>
		</div>
		<form id="receiverForm">
		<div class="col-md-12 form-horizontal">
			<div class="form-group">
				<label class="col-md-4">Receiver名称</label>
				<div class="col-md-8">
					<input class="form-control" name="earvName"></input>
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4">Receiver代码</label>
				<div class="col-md-8">
					<input class="form-control" name="earvCode"></input>
				</div>
			</div>
		</div>
		<input type="hidden" name="earvId"/>
		<input type="hidden" name="recVer"/>
		</form>
	</div>
</div>
</body>
</html>