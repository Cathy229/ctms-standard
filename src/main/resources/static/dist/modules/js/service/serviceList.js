define(['jquery','basemodule','formValues','AjaxProxy','dialog','service','fmatter','datagrid','advanceSuggest'],function($,basemodule,FormUtil,AjaxProxy,dialog,service) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/service/serviceList.vc',
			title:'服务配置'
		},
		events:{
			init:function(params){
				var ctx = this.context;
				this.initById("service_grid");
			},
			onShow:function(){
//				alert("show app1");
			}
		},
		refreshGrid:function(){
			var gid = "service_grid";
			$('#'+gid).datagrid().trigger('reloadGrid');
		},
		initById:function(gid){
			var proxy = new AjaxProxy({
				serviceName:'CommonQuery-EaiServiceModel',
				fieldCodeTypes:{
					eascEarvId:'RECEIVER'
				}
			});
//			proxy.data = [{id:1,name:'Jack1'},{id:"2",name:"penny1"}];
//			var gid = "service_grid";
			var $this = this;
			var ctx = this.context;
			function statusFormatter(val){
				var result = "";
				if(val == 0){
					result = "待审批";
				}
				if(val == 1){
					result = "启用";
				}
				if(val == 2){
					result = "停用";
				}
				return result;
			};
			$('#'+gid).datagrid({
				colNames:['ID','接收方','服务名称','服务代码','URL','URI','状态'],
				colModel:[
					{name:'eascId',index:'eascId', width:100},
					{name:'eascEarvId',index:'eascEarvId', width:150,formatter:'selectCode'},
					{name:'eascServiceName',index:'eascServiceName', width:150},
					{name:'eascServiceCode',index:'eascServiceCode', width:150},
					{name:'eascReceiverUrl',index:'eascReceiverUrl', width:250},
					{name:'eascServiceUri',index:'eascServiceUri', width:100},
					{name:'eascStatus',index:'eascStatus', width:100,formatter:statusFormatter}
				],
				proxy:proxy,
				shrinkToFit:false,
				autowidth:true,
//				width:600,
				multiselect: true,
					caption: "服务列表",
					pager:'#'+gid+'Pager',
				//查询条件
				beforeReload:function(){
					$(this).datagrid("clearUserFilterCond");
					var filterCond = FormUtil.buildGridSearchFilterCondByForm("searchForm",ctx);
					$(this).datagrid("addUserFilterCond",filterCond);
				},
				autoLoad:true
			});
			$("#newBtn",this.context).on("click",function(){
				require(["modules/service/serviceEdit"],function(editModule){
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
					require(["modules/service/serviceEdit"],function(editModule){
						dialog.open(editModule,{
							callback:function(){
								editModule.editById(row.eascId);
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
				var ids = $('#'+gid).datagrid("getSelRowids");
				if(ids!=null &&ids.length > 0){
					if(confirm("确认删除选中数据？")){
						var eascIds = [];
						for(var i in ids){
							var row = $('#'+gid).datagrid("getRowData",ids[i]);
							eascIds.push(row.eascId);
						}
						var dtd = service.service("DELETE_SERVICES",{ids:eascIds});
						dtd.done(function(count){
							alert('成功删除'+count+'条数据');
							$('#'+gid).datagrid().trigger('reloadGrid');
						});
					}
				}else{
					alert("请选择数据进行删除!");
				}
			});
			$("#eascEarvIdAdv",this.context).advanceSuggest({
				selectCode:"RECEIVER",
				hidInput:$("#eascEarvId",ctx),
				suggestBox:true
			});
		}
	});
});