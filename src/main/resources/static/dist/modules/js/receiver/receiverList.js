define(['jquery','basemodule','formValues','AjaxProxy','dialog','service','fmatter','datagrid'],function($,basemodule,FormUtil,AjaxProxy,dialog,service) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/receiver/receiverList.vc',
			title:'接收方配置'
		},
		events:{
			init:function(){
				var proxy = new AjaxProxy({
					serviceName:'CommonQuery-EaiReceiverModel',
					fieldCodeTypes:{
					}	
				});
//				proxy.data = [{id:1,name:'Jack1'},{id:"2",name:"penny1"}];
				var gid = "receiver_grid";
				var $this = this;
				var ctx = this.context;
				$('#'+gid).datagrid({
					colNames:['ID','Receiver名称','接收方代码'],
					colModel:[
						{name:'earvId',index:'earvId', width:150},
						{name:'earvName',index:'earvName', width:300},
						{name:'earvCode',index:'earvCode', width:150}
					],
					proxy:proxy,
					shrinkToFit:false,
					autowidth:true,
//					width:600,
					multiselect: true,
   					caption: "Receiver列表",
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
				$("#newBtn",this.context).on("click",function(){
					require(["modules/js/receiver/receiverEdit"],function(editModule){
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
						require(["modules/js/receiver/receiverEdit"],function(editModule){
							dialog.open(editModule,{
								callback:function(){
									editModule.editById(row.earvId);
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
							var earvIds = [];
							for(var i in ids){
								var row = $('#'+gid).datagrid("getRowData",ids[i]);
								earvIds.push(row.earvId);
							}
							var dtd = service.service("DELETE_RECEIVERS",{ids:earvIds});
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
			var gid = "receiver_grid";
			$('#'+gid).datagrid().trigger('reloadGrid');
		}
	});
});