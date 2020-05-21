<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
</head>
<body>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-12" style="margin-bottom:20px">
			<h4>欢迎进入Fros管理平台<h4>
		</div>
		<form id="form">
			<div class="col-md-12">
				<h5>1.templateac方式联想控件级联示例：</h5>
				<div class="col-md-6">
					<div class="form-group">
						<span class="col-md-1"></span>
						<label class="col-md-1">省份</label>
						<div class="col-md-8">
							<input class="form-control" id="province1" name="province1"></input>
						</div>
						<input class="form-control" type="hidden" id="province1Value" name="province1Value"></input>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<label class="col-md-1">城市</label>
						<div class="col-md-8">
							<input class="form-control" id="city1" name="city1"></input>
						</div>
						<input class="form-control" type="hidden" id="city1Value" name="city1Value"></input>
					</div>
				</div>
			</div>
			<div class="col-md-12" style="margin-top:10px;">
				<h5>2.autoSelect方式联想控件级联示例：</h5>
				<div class="col-md-6">
					<div class="form-group">
						<span class="col-md-1"></span>
						<label class="col-md-1">省份</label>
						<div class="col-md-8">
							<input class="form-control" id="province2" name="province2"></input>
						</div>
						<input class="form-control" type="hidden" id="province2Value" name="province2Value"></input>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<label class="col-md-1">城市</label>
						<div class="col-md-8">
							<input class="form-control" id="city2" name="city2"></input>
						</div>
						<input class="form-control" type="hidden" id="city2Value" name="city2Value"></input>
					</div>
				</div>
			</div>
			<div class="col-md-12" style="margin-top:10px;">
				<h5>3.advanceSuggest方式联想控件级联示例：</h5>
				<div class="col-md-6">
					<div class="form-group">
						<span class="col-md-1"></span>
						<label class="col-md-1">省份</label>
						<div class="col-md-8">
								<div class="input-group">
									<input type="text" class="form-control"   id="province3" >
									<div class="input-group-addon" role="button">
										<i class="icon-search" ></i>
									</div>
								</div>
								<input type="hidden" class="form-control"  id="province3Value" name="province3Value"/>
						</div>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<label class="col-md-1">城市</label>
						<div class="col-md-8">
							<div class="input-group">
								<input type="text" class="form-control" id="city3" >
								<div class="input-group-addon" role="button">
									<i class="icon-search" ></i>
								</div>
							</div>
							<input type="hidden" class="form-control"  id="city3Value" name="city3Value"/>
						</div>
					</div>
				</div>
			</div>
			
			<div class="col-md-12" style="margin-top:10px;">
				<h5>4.使用自定义query做为selectCode的queryType：</h5>
				<div class="col-md-6">
					<div class="form-group">
						<span class="col-md-1"></span>
						<label class="col-md-2">城市省份关联</label>
						<div class="col-md-8">
							<div class="input-group">
								<input type="text" class="form-control"   id="province4" >
								<div class="input-group-addon" role="button">
									<i class="icon-search" ></i>
								</div>
							</div>
							<input type="hidden" class="form-control"  id="province4Value" name="province4Value"/>
						</div>
					</div>
				</div>
			</div>
			
			
		</form>
	</div>
</div>
</body>
</html>
