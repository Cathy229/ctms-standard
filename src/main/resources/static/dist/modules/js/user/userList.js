define(['jquery','basemodule','formValues','AjaxProxy','dialog','service','fmatter','datagrid'],function($,basemodule,FormUtil,AjaxProxy,dialog,service) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/user/userList.vc',
			title:'用户配置'
		},
		events:{
			init:function(){
				var proxy = new AjaxProxy({
					serviceName:'CommonQuery-EaiUserModel',
					fieldCodeTypes:{
					}	
				});
//				proxy.data = [{id:1,name:'Jack1'},{id:"2",name:"penny1"}];
				var gid = "user_grid";
				var $this = this;
				var ctx = this.context;
				$('#'+gid).datagrid({
					colNames:['用户名','用户姓名'],
					colModel:[
						{name:'eaurUserCode',index:'eaurUserCode', width:300},
						{name:'eaurUserName',index:'eaurUserName', width:300},
					],
					proxy:proxy,
					shrinkToFit:false,
					autowidth:true,
//					width:600,
//					multiselect: true,
   					caption: "用户列表",
   					regional:'cn',
   					pager:'#'+gid+'Pager',
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
							var eaurId = row.eaurId;
							$("#searchUserId",ctx).val(eaurId);
							$("#userrole_grid").datagrid("reload");
						}
					}
				});
				$("#newBtn",this.context).on("click",function(){
					require(["modules/user/userEdit"],function(editModule){
						dialog.open(editModule,{
							callback:function(){
								editModule.addInit();
							}
						});
					});
				});
				$("#editBtn",this.context).on("click",function(){
					var id = $('#'+gid).datagrid("getGridParam",'selrow');
					if(id!=null){
						var rid = id;
						var row = $('#'+gid).datagrid("getRowData",rid);
						require(["modules/user/userEdit"],function(editModule){
							dialog.open(editModule,{
								callback:function(){
									editModule.editById(row.eaurId);
								}
							});
						});
					}else{
						alert("请选择一条数据进行编辑!");
					}
					
				});
				$("#searchBtn",this.context).on("click",function(){
					$('#'+gid).datagrid("reload");
				});
				$("#delBtn",this.context).on("click",function(){
					var id = $('#'+gid).datagrid("getGridParam",'selrow');
					if(id!=null){
						if(confirm("确认删除选中数据？")){
							var eaurIds = [];
							var row = $('#'+gid).datagrid("getRowData",id);
							eaurIds.push(row.eaurId);
							var dtd = service.service("DEL_USER",{ids:eaurIds});
							dtd.done(function(count){
								alert('成功删除'+count+'条数据');
								$('#'+gid).datagrid().trigger('reloadGrid');
							});
						}
					}else{
						alert("请选择数据进行删除!");
					}
				});
				this.initUserRoleList();
			},
			onShow:function(){
//				alert("show app1");
			}
		},
		refreshGrid:function(){
			var gid = "user_grid";
			$('#'+gid).datagrid().trigger('reloadGrid');
		},
		refreshRoleGrid:function(){
			var gid = "userrole_grid";
			$('#'+gid).datagrid().trigger('reloadGrid');
		},
		initUserRoleList:function(){
			var proxy = new AjaxProxy({
				serviceName:'CommonQuery-EaiUserRoleModel',
				fieldCodeTypes:{
					eaulRoleId:"ROLE"
				}	
			});
//			proxy.data = [{id:1,name:'Jack1'},{id:"2",name:"penny1"}];
			var gid = "userrole_grid";
			var $this = this;
			var ctx = this.context;
			$('#'+gid).datagrid({
				colNames:['ID','角色'],
				colModel:[
					{name:'eaulId',index:'eaulId', width:300},
					{name:'eaulRoleId',index:'eaulRoleId', width:300,formatter:"selectCode"},
				],
				proxy:proxy,
				shrinkToFit:false,
				autowidth:true,
//				width:600,
				multiselect: true,
				caption: "用户角色列表",
				pager:'#'+gid+'Pager',
				//查询条件
				beforeReload:function(){
					$(this).datagrid("clearUserFilterCond");
					var filterCond = FormUtil.buildGridSearchFilterCondByForm("roleSearchForm",ctx);
					$(this).datagrid("addUserFilterCond",filterCond);
				},
				autoLoad:false
			});
			$("#newRoleBtn",this.context).on("click",function(){
				var searchUserId = $("#searchUserId",ctx).val();
				if(searchUserId!=null && searchUserId!=""){
					require(["modules/user/selectRoleList"],function(m){
						dialog.open(m,{params:{
							searchUserId:searchUserId
						}});
					});
				}else{
					alert("请先选择用户");
				}
			});
			//
			$("#delRoleBtn",this.context).on("click",function(){
				var ids = $('#'+gid).datagrid("getSelRowids");
				if(ids!=null &&ids.length > 0){
					if(confirm("确认删除选中数据？")){
						var eaulIds = [];
						for(var i in ids){
							var row = $('#'+gid).datagrid("getRowData",ids[i]);
							eaulIds.push(row.eaulId);
						}
						var dtd = service.service("DEL_USER_ROLE",{ids:eaulIds});
						dtd.done(function(count){
							alert('成功删除'+count+'条数据');
							$('#'+gid).datagrid().trigger('reloadGrid');
						});
					}
				}else{
					alert("请选择数据进行删除!");
				}
			});
		}
	});
});