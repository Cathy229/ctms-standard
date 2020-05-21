define(['jquery','basemodule','formValues','AjaxProxy','dialog','service','fmatter','datagrid'],function($,basemodule,FormUtil,AjaxProxy,dialog,service) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/user/roleList.vc',
			title:'角色配置'
		},
		events:{
			init:function(){
				var gid = "role_grid";
				this.initById(gid);
				$("#newBtn",this.context).on("click",function(){
					require(["modules/user/roleEdit"],function(editModule){
						dialog.open(editModule,{
							callback:function(){
								editModule.addInit();
							}
						});
					});
				});
				$("#editBtn",this.context).on("click",function(){
					var ids = $('#'+gid).datagrid("getGridParam",'selarrrow');
					if(ids!=null &&ids.length == 1){
						var rid = ids[0];
						var row = $('#'+gid).datagrid("getRowData",rid);
						require(["modules/user/roleEdit"],function(editModule){
							dialog.open(editModule,{
								callback:function(){
									editModule.editById(row.earlId);
								}
							});
						});
					}else{
						alert("请选择一条数据进行编辑!");
					}
					
				});
				
				$("#delBtn",this.context).on("click",function(){
					var ids = $('#'+gid).datagrid("getSelRowids");
					if(ids!=null &&ids.length > 0){
						if(confirm("确认删除选中数据？")){
							var earlIds = [];
							for(var i in ids){
								var row = $('#'+gid).datagrid("getRowData",ids[i]);
								earlIds.push(row.earlId);
							}
							var dtd = service.service("DEL_ROLE",{ids:earlIds});
							dtd.done(function(count){
								alert('成功删除'+count+'条数据');
								$('#'+gid).datagrid().trigger('reloadGrid');
							});
						}
					}else{
						alert("请选择数据进行删除!");
					}
				});
			},
			onShow:function(){
//				alert("show app1");
			}
		},
		refreshGrid:function(){
			var gid = "role_grid";
			$('#'+gid).datagrid().trigger('reloadGrid');
		},
		initById:function(gid){
			var proxy = new AjaxProxy({
				serviceName:'CommonQuery-EaiRoleModel',
				fieldCodeTypes:{
				}	
			});
			var $this = this;
			var ctx = this.context;
			$('#'+gid).datagrid({
				colNames:['ID','角色名称'],
				colModel:[
					{name:'earlId',index:'earlId', width:300},
					{name:'earlRoleName',index:'earlRoleName', width:300},
				],
				proxy:proxy,
				shrinkToFit:false,
				autowidth:true,
//				width:600,
				multiselect: true,
					caption: "角色列表",
					regional:'cn',
					pager:'#'+gid+'Pager',
				//查询条件
				beforeReload:function(){
					$(this).datagrid("clearUserFilterCond");
					var filterCond = FormUtil.buildGridSearchFilterCondByForm("searchForm",ctx);
					$(this).datagrid("addUserFilterCond",filterCond);
				},
				autoLoad:true
			});
			$("#searchBtn",this.context).on("click",function(){
				$('#'+gid).datagrid("reload");
			});
		}
	});
});