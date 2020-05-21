<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>添加操作日志</title>
</head>

<body>
	<div class="row" style="margin:10px 0 2px 0">
		<button id='saveData' type="button" class="btn btn-success">保存</button>
	</div>
	
	<div class="row" style="margin-top:20px;">
		<form id="worklogitemForm" class="form-horizontal">
			<div class="col-sm-12">
				<div class="form-group col-sm-6">
				    <label for="attribute1" class="col-sm-4 control-label">attribute1:</label>
				    <div class="col-sm-8">
				    	<input id='attribute1' name="attribute1" class="form-control"></input>
				    </div>
				 </div>
				
	            <div class="form-group col-sm-6">
				    <label for="attribute4" class="col-sm-4 control-label">attribute4:</label>
				    <div class="col-sm-8">
					    <div class="input-group">
					    	<input class="form-control" type="text" id="attribute4" name="attribute4"/>
							<div class="input-group-addon" role="button">
								<i class="icon-calendar"></i>
							</div>
						</div>
				    </div>
				 </div>
			 </div>
			 
			 <div class="col-sm-12">
				<div class="form-group col-sm-6">
				    <label for="attribute7" class="col-sm-4 control-label">attribute7:</label>
				    <div class="col-sm-8">
				    	<input id='attribute7' name="attribute7" class="form-control"></input>
				    </div>
				 </div>
				
	            <div class="form-group col-sm-6">
				    <label for="attribute5" class="col-sm-4 control-label">attribute5:</label>
				    <div class="col-sm-8">
					    <div class="input-group">
					    	<input class="form-control" type="text" id="attribute5" name="attribute5"/>
							<div class="input-group-addon" role="button">
								<i class="icon-calendar"></i>
							</div>
						</div>
				    </div>
				 </div>
			 </div>
			 
			 <div class="col-sm-12">
				<div class="form-group col-sm-6">
				    <label for="content" class="col-sm-4 control-label">工作内容:</label>
				    <div class="col-sm-8">
				    	<textarea id="content" name="content" class="form-control" rows="2"></textarea>
				    </div>
				 </div>
				
	            <div class="form-group col-sm-6"></div>
			 </div>
			 
			<input id="id" name='id' type="hidden"></input>
			<input id="worklogitemWorklogId" name='worklogId' type="hidden"></input>
			<input id="recVer" name='recVer' type="hidden"></input>
		</form>
	</div>
		
</body>
</html>