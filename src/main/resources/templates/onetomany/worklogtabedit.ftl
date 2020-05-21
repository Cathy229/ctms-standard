<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>组件集成测试</title>
	<style type="text/css">
		html,body{margin:0;width:100%;background-color:#F0FFF0}
	</style>

</head>
<body>
	<div class="row" style="margin:10px 0 2px 0">
		<button id='saveBtn' type="button" class="btn btn-success">保存</button>
		<button id='closeBtn' type="button" class="btn btn-danger">关闭</button>
	</div>
	
	<div class="row" style="margin-top:20px;">
		<form id="editForm" class="form-horizontal">
			<div class="col-sm-12">
			
            	<div class="form-group col-sm-6">
				    <label for="worktypeName" class="col-sm-2 control-label">工作类型:</label>
				    <div class="col-sm-8">
					    <div class="input-group">
							<input type="text" class="form-control" id="worktypeName" name="worktypeName"/>
							<div class="input-group-addon" role="button">
								<i class="icon-search" ></i>
							</div>
						</div>
						<input type="hidden" class="form-control" id="worktypeId" name="worktypeId"/>
				    </div>
				</div>
				
	            <div class="form-group col-sm-6">
				    <label for="workDate" class="col-sm-2 control-label">工作日期:</label>
				    <div class="col-sm-8">
					    <div class="input-group">
					    	<input class="form-control" type="text" id="workDate" name="workDate"/>
							<div class="input-group-addon" role="button">
								<i class="icon-calendar"></i>
							</div>
						</div>
				    </div>
				 </div>
			 </div>
			 
			 <div class="col-sm-12">
            	<div class="form-group col-sm-6">
				    <label for="content" class="col-sm-2 control-label">优先级:</label>
				    <div class="col-sm-8">
				    	<input type="radio" name="workLevel" value="1">紧急</input> 
						<input type="radio" name="workLevel" value="2">高级</input>
						<input type="radio" name="workLevel" value="3">中级</input>
						<input type="radio" name="workLevel" value="4">低级</input>
				    </div>
				 </div>
				 
				 <div class="form-group col-sm-6">
				    <label for="content" class="col-sm-2 control-label">工作内容:</label>
				    <div class="col-sm-8">
				    	<textarea id="content" name="content" class="form-control" rows="2"></textarea>
				    </div>
				 </div>
				 
			 </div>
			 
			 <div class="col-sm-12">
            	<div class="form-group col-sm-6">
				    <label for="testNum1" class="col-sm-2 control-label">数字字段:</label>
				    <div class="col-sm-8">
				    	<input id="testNum1" name="testNum1" class="form-control"></input>
				    </div>
				 </div>
	            <div class="form-group col-sm-6">
				    <label for="attribute4" class="col-sm-2 control-label">日期时间字段:</label>
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
				    <label for="attribute7" class="col-sm-2 control-label">非必输email:</label>
				    <div class="col-sm-8">
				    	<input id="attribute7" name="attribute7" class="form-control" />
				    </div>
				 </div>
	            <div class="form-group col-sm-6">
				    <label for="attribute8" class="col-sm-2 control-label">必输email:</label>
				    <div class="col-sm-8">
					    <input id="attribute8" name="attribute8" class="form-control"></input>
				    </div>
				 </div>
			 </div>
			 
			 <div class="col-sm-12">
            	<div class="form-group col-sm-6">
				    <label for="userName" class="col-sm-2 control-label">工作人员:</label>
				    <div class="col-sm-8">
						<div class="input-group">
							<input type="text" class="form-control" id="userName" name="userName"/>
							<div class="input-group-addon" role="button">
								<i class="icon-search" ></i>
							</div>
						</div>
						<input type="hidden" class="form-control" id="userId" name="userId"/>
				    </div>
				 </div>
	            <div class="form-group col-sm-6">
				    <label for="attribute20" class="col-sm-2 control-label">attribute20:</label>
				    <div class="col-sm-8">
					    <input id="attribute20" name="attribute20" class="form-control"></input>
				    </div>
				 </div>
			 </div>
			 
			 <div class="col-sm-12">
            	<div class="form-group col-sm-6">
				    <label for="attribute12" class="col-sm-2 control-label">attribute12:</label>
				    <div class="col-sm-8">
				    	<input type="checkbox" name="attribute12" value="1" >紧急</input> 
						<input type="checkbox" name="attribute12" value="2" >高级</input> 
						<input type="checkbox" name="attribute12" value="3" >中级</input> 
						<input type="checkbox" name="attribute12" value="4" >低级</input>
				    </div>
				 </div>
			 </div>
			 
			<input id="id" name='id' type="hidden"></input>
			<input id="recVer" name='recVer' type="hidden"></input>
			<!-- file path input --> 
			<input type="hidden" id="attribute11" name="attribute11"></input>
		</form>
	</div>
	
	<!--
	<div class="row">
		<div class="col-md-12">
			<button id="uploadBtn" type="button" class="btn btn-default">上传图片</button>
		</div>
		<div id="imgContainer" class="col-md-12" style="margin-top:10px;"></div>
	</div>
	-->
	
	<div class="row" style="margin-top:20px;">
		<button id='itemNewBtn' type="button" class="btn btn-info">新建</button>
		<button id='itemEditBtn' type="button" class="btn btn-yellow">编辑</button>
		<button id='itemDelBtn' type="button" class="btn btn-danger">删除</button>
	</div>
	
	<!-- searchForm -->
	<div class="row" style="display:none">
		<form id="searchForm" name="searchForm" class="form-horizontal">
			<input type="hidden" class="form-control" id="worklogId" name="worklogId" operator='=' value="default"/>
		</form>
	</div>
	
	<div class="row">
		<table id="worklogitemGrid" width="100%"></table>
		<div id="worklogitemGridPager"></div>
	</div>

</body>
</html>