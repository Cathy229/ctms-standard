<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>组件集成测试</title>
	<style type="text/css">
		.panelhide{
			display:none;
		}
	</style>
</head>

<body>
	<div class="row" style="margin-top:20px;">
		<form id="searchForm" class="form-horizontal">
			<div class="col-sm-12">
            	<div class="form-group col-sm-6">
				    <label for="content" class="col-sm-2 control-label">工作内容:</label>
				    <div class="col-sm-8">
				    	<input class="form-control" type="text" id="content" name="content" operator='likeAnywhere' />
				    </div>
				 </div>
	            <div class="form-group col-sm-6">
				    <label for="worktypeName" class="col-sm-2 control-label">工作类型:</label>
				    <div class="col-sm-8">
					    <div class="input-group">
							<input type="text" class="form-control" id="worktypeName"/>
							<div class="input-group-addon" role="button">
								<i class="icon-search" ></i>
							</div>
						</div>
						<input type="hidden" class="form-control" id="worktypeId" name="worktypeId"/>
				    </div>
				 </div>
			 </div>
		
			<div class="col-sm-12" style="margin-top:10px;">
	            <div class="form-group col-sm-6">
				    <label for="workDateBegin" class="col-sm-2 control-label">开始日期:</label>
				    <div class="col-sm-8">
				    	<div class="input-group">
					    	<input class="form-control" type="text" id="workDateBegin" name="workDateBegin" fieldName='workDate' operator=">=" fieldType="Date" />
							<div class="input-group-addon" role="button">
								<i class="icon-calendar"></i>
							</div>
						</div>
				    </div>
				 </div>
	            
	            <div class="form-group col-sm-6">
				    <label for="workDateEnd" class="col-sm-2 control-label">结束日期:</label>
				    <div class="col-sm-8">
					    <div class="input-group">
					      <input class="form-control" type="text" id="workDateEnd" name="workDateEnd" fieldName='workDate' fieldType="Date" operator='<=' />
					      <div class="input-group-addon" role="button">
								<i class="icon-calendar"></i>
							</div>
					    </div>
				    </div>
				 </div>
			 </div>
            
            <div class="col-sm-12" style="margin-top:10px;">
	            <div class="form-group  col-sm-6">
				    <label for="workDateEnd" class="col-sm-2 control-label">优先级:</label>
				    <div class="col-sm-4">
				    	<input type="checkbox" name="workLevel" value="1" operator='in' fieldType='String[]'>紧急</input> 
						<input type="checkbox" name="workLevel" value="2" operator='in' fieldType='String[]'>高级</input> 
						<input type="checkbox" name="workLevel" value="3" operator='in' fieldType='String[]'>中级</input> 
						<input type="checkbox" name="workLevel" value="4" operator='in' fieldType='String[]'>低级</input>
				    </div>
				 </div>
				
	            <div class="form-group  col-sm-6">
				    <label for="userName" class="col-sm-2 control-label">用户:</label>
				    <div class="col-sm-8">
					    <div class="input-group">
							<input type="text" class="form-control" id="userName"/>
							<div class="input-group-addon" role="button">
								<i class="icon-search" ></i>
							</div>
						</div>
						<input type="hidden" class="form-control" id="userId" name="userId"/>
				    </div>
				 </div>
			 </div>
            
		</form>
	</div>

	<div class="row" style="margin:20px 0 2px 0">
		<button id='searchBtn' type="button" class="btn btn-default">查询</button>
		<button id='newBtn' type="button" class="btn btn-info">新建</button>
		<button id='editBtn' type="button" class="btn btn-yellow">编辑</button>
		<button id='delBtn' type="button" class="btn btn-danger">删除</button>
	</div>

	<div class="row">
		<table id="onetomanylistGrid" width="100%"></table>
		<div id="onetomanylistGridPager"></div>
	</div>

	<div id='tplpanel1' style="position: absolute; z-index: 120; overflow: hidden;  width: 200px; height: auto; display: none;border: 1px solid #7F9DB9;">
		<table id="tpltable1" style="width:200px;padding:0;margin:0;border:0;background: none repeat scroll 0 0 #FFFFFF;" cellspacing="0" cellpadding="0">
		</table>
	</div>
</body>
</html>