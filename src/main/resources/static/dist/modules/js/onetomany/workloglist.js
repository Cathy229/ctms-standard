define(['jquery','basemodule','formValues','AjaxProxy','dialog','service','fmatter','datagrid','datePicker','advanceSuggest'],function($,basemodule,FormUtil,AjaxProxy,dialog,service) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/onetomany/workloglist.vc',
			title:'集成案例列表页'
		},
		events:{
			init:function(){
				var proxy = new AjaxProxy({
					serviceName:'CommonQuery-FjWorklogModel',
					fieldCodeTypes:{
						'userId':'SYSUSER',
						'worktypeId' : 'WORKTYPES'
					}	
				});
				var gid = "onetomanylistGrid";
				var ctx = this.context;
				
				$('#workDateBegin', ctx).datePicker({});
				$('#workDateEnd', ctx).datePicker({});
				
				function levelFormatter(cellvalue, options, rowObject) {
					if (cellvalue == '1') {
						return '紧急';
					}
					if (cellvalue == '2') {
						return '高级';
					}
					if (cellvalue == '3') {
						return '中级';
					}
					if (cellvalue == '4') {
						return '低级';
					}
				};
				
				$('#'+gid).datagrid({
					colNames:['ID', '优先级', '工作日期', '工作内容', '人员', '工作类型'],
					colModel:[
						{name:'id',index:'id', width:60, hidden:true},
						{name:'workLevel',index:'workLevel', width:50, formatter:levelFormatter},
						{name:'workDate',index:'workDate', width:90, formatter:'dateFmatter'},
						{name:'content',index:'content', width:500},
						{name:'userId',index:'userId', width:50, formatter:'selectCode'},
						{name:'worktypeId',index:'worktypeId', width:250, formatter:'selectCode'}
					],
					proxy:proxy,
					shrinkToFit:false,
					autowidth:true,
					height:300,
//					width:600,
					multiselect: false,
   					caption: "工作日志列表",
   					regional:'cn',
   					pager:'#'+gid+'Pager',
   					sortname : 'workDate',
   					viewrecords : true,
   					sortorder : "desc",
   					shrinkToFit : false,
   					multiselect : true,
					//查询条件
					beforeReload:function(){
						$(this).datagrid("clearUserFilterCond");
						var filterCond = FormUtil.buildGridSearchFilterCondByForm("searchForm",ctx);
						$(this).datagrid("addUserFilterCond",filterCond);
					},
					autoLoad:true,
					onSelectRow:function(rowid,status,e){
						if(status == true){
							var row = $(this).datagrid("getRowData",rowid);
							var easdId = row.easdId;
							$("#searchSenderId",ctx).val(easdId);
							$("#senderservice_grid").datagrid("reload");
						}
					}
				});
				
				
				$("#worktypeName", ctx).advanceSuggest({
					selectCode:"WORKTYPES",
					hidInput:$("#worktypeId",ctx)
					//suggestBox:true
				});
				
				$("#userName", ctx).advanceSuggest({
					selectCode:"SYSUSER",
					hidInput:$("#userId",ctx)
					// suggestBox:true
				});
				
				$('#searchBtn',ctx).bind('click', function() {
					$('#'+gid).datagrid("reload");
				});
				
				$('#newBtn',ctx).bind('click', function() {
					require(["modules/js/onetomany/worklogtabedit"],function(editModule){
						$('#maintab').tab('open', editModule);
					});
				});
				
				$("#editBtn",ctx).on("click",function(){
					var ids = $('#'+gid).datagrid("getGridParam",'selarrrow');
					if(ids!=null && ids.length == 1){
						var rid = ids[0];
						var row = $('#'+gid).datagrid("getRowData",rid);
						require(["modules/js/onetomany/worklogtabedit"],function(editModule){
							$('#maintab').tab('open', editModule,{
								callback:function(){
									editModule.edit(row.id);
								}
							});
						});
					}else{
						alert("请选择一条数据进行编辑!");
					}
				});
				
				$("#delBtn",this.context).on("click",function(){
					var rowids = $('#'+gid).datagrid("getSelRowids");
					if(rowids!=null && rowids.length > 0){
						if(confirm("确认删除选中的数据及其关联的操作日志吗？")){
							var ids = [];
							for(var i in rowids){
								var row = $('#'+gid).datagrid("getRowData", rowids[i]);
								ids.push(row.id);
							}
							var dtd = service.service("FJWORKLOGMANAGER_DELETEBYPKS",{ids:ids});
							dtd.done(function(){
								alert('删除数据成功！');
								$('#'+gid).datagrid().trigger('reloadGrid');
							});
						}
					}else{
						alert("请选择数据进行删除!");
					}
				});
				
				
				
			},
			onShow:function(){}
		},
		refreshGrid:function(){
			var gid = "onetomanylistGrid";
			$('#'+gid).datagrid().trigger('reloadGrid');
		}
	});
});