define(['jquery','basemodule','formValues','AjaxProxy','dialog','service','fmatter','datagrid','datePicker'],function($,basemodule,FormUtil,AjaxProxy,dialog,service) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/sender/senderList.vc',
			title:'发送方配置'
		},
		events:{
			init:function(){
				var proxy = new AjaxProxy({
					serviceName:'CommonQuery-EaiSenderModel',
					fieldCodeTypes:{
						creator:"USER"
					}	
				});
//				proxy.data = [{id:1,name:'Jack1'},{id:"2",name:"penny1"}];
				var gid = "sender_grid";
				var $this = this;
				var ctx = this.context;
				$('#'+gid).datagrid({
					colNames:['ID','Sender名称','访问代码','编码','创建人','创建时间'],
					colModel:[
						{name:'easdId',index:'easdId', width:150},
						{name:'easdName',index:'easdName', width:300},
						{name:'easdAccessCode',index:'easdAccessCode', width:150},
						{name:'easdEncode',index:'easdEncode', width:150},
						{name:'creator',index:'creator', width:150,formatter:'selectCode'},
						{name:'createTime',index:'createTime', width:150,formatter:'dateFmatter'}
					],
					proxy:proxy,
					shrinkToFit:false,
					autowidth:true,
//					width:600,
					multiselect: false,
   					caption: "Sender列表",
   					regional:'cn',
   					pager:'#'+gid+'Pager',
   					defaultSortname:'easdAccessCode',
   					defaultSortorder:'asc',
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
				$("#newBtn",this.context).on("click",function(){
					require(["modules/sender/senderEdit"],function(editModule){
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
						require(["modules/sender/senderEdit"],function(editModule){
							dialog.open(editModule,{
								callback:function(){
									editModule.editById(row.easdId);
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
							var easdIds = [];
							var row = $('#'+gid).datagrid("getRowData",id);
							easdIds.push(row.easdId);
							var dtd = service.service("DELETE_SENDERS",{ids:easdIds});
							dtd.done(function(count){
								alert('成功删除'+count+'条数据');
								$('#'+gid).datagrid().trigger('reloadGrid');
							});
						}
					}else{
						alert("请选择数据进行删除!");
					}
				});
				var proxy = new AjaxProxy({
					serviceName:'CommonQuery-SenderServiceQuery',
					fieldCodeTypes:{
					}	
				});
//				proxy.data = [{id:1,name:'Jack1'},{id:"2",name:"penny1"}];
				var ssgid = "senderservice_grid";
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
				$('#'+ssgid).datagrid({
					colNames:['ID','接收方','服务代码','服务名称','接收方URL','URI','状态','接收方编码'],
					colModel:[
						{name:'eassId',index:'eassId', width:60},
						{name:'earvCode',index:'earvCode', width:100},
						{name:'eascServiceCode',index:'eascServiceCode', width:150},
						{name:'eascServiceName',index:'eascServiceName', width:100},
						{name:'eascReceiverUrl',index:'eascReceiverUrl', width:200},
						{name:'eascServiceUri',index:'eascServiceUri', width:150},
						{name:'eascStatus',index:'eascStatus', width:150,formatter:statusFormatter},
						{name:'eascReceiverEncode',index:'eascReceiverEncode', width:150}
					],
					proxy:proxy,
					shrinkToFit:false,
					autowidth:true,
//					width:600,
					multiselect: true,
   					caption: "Sender的服务列表",
   					regional:'cn',
   					pager:'#'+ssgid+'Pager',
					//查询条件
					beforeReload:function(){
						$(this).datagrid("clearUserFilterCond");
						var filterCond = FormUtil.buildGridSearchFilterCondByForm("serviceSearchForm",ctx);
						$(this).datagrid("addUserFilterCond",filterCond);
					},
					autoLoad:false
				});
				$("#newServiceBtn",this.context).on("click",function(){
					var searchSenderId = $("#searchSenderId",ctx).val();
					if(searchSenderId!=null && searchSenderId!=""){
						require(["modules/service/selectServiceList"],function(m){
							dialog.open(m,{params:{
								searchSenderId:searchSenderId
							}});
						});
					}else{
						alert("请先选择Sender");
					}
				});
				//
				$("#delServiceBtn",this.context).on("click",function(){
					var ids = $('#'+ssgid).datagrid("getSelRowids");
					if(ids!=null &&ids.length > 0){
						if(confirm("确认删除选中数据？")){
							var eassIds = [];
							for(var i in ids){
								var row = $('#'+ssgid).datagrid("getRowData",ids[i]);
								eassIds.push(row.eassId);
							}
							var dtd = service.service("DEL_SENDER_SERVICE",{ids:eassIds});
							dtd.done(function(count){
								alert('成功删除'+count+'条数据');
								$('#'+ssgid).datagrid().trigger('reloadGrid');
							});
						}
					}else{
						alert("请选择数据进行删除!");
					}
				});
				//cusBtn
				$("#cusBtn",this.context).on("click",function(){
					require(["modules/sender/customContent"],function(m){
						dialog.open(m);
					});
				});
				//date
				$('#createTimeStart',this.context).datePicker({
				});
				$('#createTimeEnd',this.context).datePicker({
				});
			},
			onShow:function(){
//				alert("show app1");
			}
		},
		refreshGrid:function(){
			var gid = "sender_grid";
			$('#'+gid).datagrid().trigger('reloadGrid');
		},
		refreshServiceGrid:function(){
			var gid = "senderservice_grid";
			$('#'+gid).datagrid().trigger('reloadGrid');
		}
	});
});