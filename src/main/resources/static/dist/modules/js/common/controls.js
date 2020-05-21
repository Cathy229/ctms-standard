define(['jquery','basemodule','formValues','LocalProxy','dialog','service','fmatter','datagrid'],function($,basemodule,FormUtil,LocalProxy,dialog,service) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/common/controls.vc',
			title:'控件展示'
		},
		events:{
			init:function(){
				var proxy = new LocalProxy({});
				proxy.data = [
				    {id:1,username:'Jack',regDate:"2015-10-01 10:10:10",lastLogin:new Date()},
				    {id:"2",username:"Penny1",regDate:"2016-10-21 20:10:10",lastLogin:new Date()},
				    {id:"3",username:"Jason",regDate:"2017-09-01 10:14:10",lastLogin:new Date()},
				    {id:"4",username:"Larry",regDate:"2016-04-21 20:40:10",lastLogin:new Date()},
				    {id:"5",username:"Jackson",regDate:"2015-10-01 10:10:10",lastLogin:new Date()},
				    {id:"6",username:"Meachel",regDate:"2015-10-01 10:10:10",lastLogin:new Date()},
				    {id:"7",username:"Kate",regDate:"2015-10-01 10:10:10",lastLogin:new Date()},
				    {id:"8",username:"张三",regDate:"2015-10-01 10:10:10",lastLogin:new Date()},
				    {id:"9",username:"李四",regDate:"2015-10-01 10:10:10",lastLogin:new Date()},
				    {id:"10",username:"王五",regDate:"2015-10-01 10:10:10",lastLogin:new Date()},
				    {id:"11",username:"小六子",regDate:"2015-10-01 10:10:10",lastLogin:new Date()}
				];
				var gid = "controls_grid";
				var $this = this;
				var ctx = this.context;
				$('#'+gid).datagrid({
					colNames:['ID','用户名称','注册日期','最近登录'],
					colModel:[
						{name:'id',index:'id', width:150},
						{name:'username',index:'username', width:300},
						{name:'regDate',index:'regDate',width:150,formatter:'dateFmatter'},
						{name:'lastLogin',index:'lastLogin',width:150,formatter:'datetimeFmatter'}
					],
					proxy:proxy,
					shrinkToFit:false,
					autowidth:true,
					multiselect: true,
   					caption: "列表",
   					regional:'cn',
   					pager:'#'+gid+'Pager',
					//查询条件
					beforeReload:function(){
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
			}
		}
	});
});