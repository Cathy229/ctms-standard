define(['jquery','basemodule','dialog','LocalProxy','templateac','autoSelect','advanceSuggest','editgrid','tooltip','bootstrapValidator'],function($,basemodule,dialog,LocalProxy) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/controls/tplacdemo.vc',
			title:'新控件'
		},
		events:{
			init:function(){
				var ctx = this.context;
				$("#whName",ctx).templateac({
					serviceName:"SelectCodeQuery-WAREHOUSE",
					colNames:["ID","名称"],
					colModel:[
					   {name:'bswhId',index:'bswhId'},
					   {name:'bswhName',index:'bswhName'}
					],
					dataAttr:"dataList",
					keyFieldName:"bswhId",
					labelFieldName:"bswhName"
				});
				$("#whName",ctx).on("handleServiceParam",function(event,val,currentPage){
					var param ={};
					param.selectCode = "WAREHOUSE";
					var queryInfo = {};
					var queryField = {
						fieldName:"[bswhName,bswhEnName]",
						operator:"ilikeAnywhere",
						fieldStringValue:val
					};
					var pagingInfo = {
						pageSize:2,
						currentPage:currentPage
					};
					var queryFields = [queryField];
					queryInfo.queryFields = queryFields;
					queryInfo.pagingInfo = pagingInfo;
					param.queryInfo = queryInfo;
					return param;
				});
				//
				$("#whName",ctx).on("getPagingInfo",function(event,data){
					var pagingInfo ={
						totalRows:data.pagingInfo.totalRows,
						currentPage:data.pagingInfo.currentPage,
						pageSize:data.pagingInfo.pageSize
					};
					return pagingInfo;
				});
				var cfg = $("#whName").templateac("getConfig");
				cfg.abc = 1;
				$("#test",ctx).on("click",function(event){
					var cfg2 = $("#whName").templateac("getConfig");
					alert(cfg2.abc);
				});
				
				
				//selectCodeTplac
				$("#whName2",ctx).autoSelect({
					selectCode:"WAREHOUSE",
					rowNum:3
				});
				
				//
				$("#whName3",ctx).advanceSuggest({
					selectCode:"WAREHOUSE",
					hidInput:$("#whId",ctx)
				});

				/**
                 * 表单验证
                 */
                $('#form', this.context).bootstrapValidator({
	                message: 'This value is not valid',
	                feedbackIcons: {
	                    valid: 'glyphicon glyphicon-ok',
	                    invalid: 'glyphicon glyphicon-remove',
	                    validating: 'glyphicon glyphicon-refresh'
	                },
	                fields: {
	                	whName: {
                            validators: {
                                notEmpty: {
                                        message: '该输入项不能为空'
                                }
                            }
                        },
                        whName2: {
                            validators: {
                                notEmpty: {
                                        message: '该输入项不能为空'
                                },
                                stringLength : {  
                                	min : 4,  
                                    message : '只能输入4个及以上文字'  
                                } 
                            }
                        },
                        whName3: {
                            validators: {
                                notEmpty: {
                                        message: '该输入项不能为空'
                                },
                                stringLength : {  
                                	min : 4,  
                                    message : '只能输入4个及以上文字'  
                                } 
                            }
                        }
	                }
	            });
				
				
				$("#whName3",ctx).on("onSelectedRow",function(event,row){
					$("#whName3Text",ctx).text(row.bswhName);
				});
				
				$("#whName3",ctx).on("onClear",function(event,row){
					$("#whName3Text",ctx).text("");
				});
				
				//
				$("#testDlg",ctx).on("click",function(event){
					require(["modules/js/controls/dlgtplacdemo"],function(editModule){
						dialog.open(editModule,{
							callback:function(){
								
							}
						});
					});
				});
				//testSet
				$("#testSet",ctx).on("click",function(event){
					$("#whName3",ctx).val("山东保税");
				});
				
				
				//test_grid
				var proxy = new LocalProxy({});
				proxy.data = [
				    {id:1,username:'1',regDate:"2015-10-01 10:10:10",lastLogin:new Date()},
				    {id:"2",username:"2",regDate:"2016-10-21 20:10:10",lastLogin:new Date()},
				    {id:"3",username:"3",regDate:"2017-09-01 10:14:10",lastLogin:new Date()},
				    {id:"4",username:"4",regDate:"2016-04-21 20:40:10",lastLogin:new Date()}
				];
				var gid = "testTplGrid";
				var $this = this;
				var ctx = this.context;
				$('#'+gid).editgrid({
					colNames:['ID','仓库','注册日期','最近登录'],
					colModel:[
						{name:'id',index:'id', width:150,editable:true},
						{name:'username',index:'username', width:300,selectCode:"WAREHOUSE",editable:true,edittype:'advance'},
						{name:'regDate',index:'regDate',width:150,formatter:'dateFmatter',editable:true,edittype:'date'},
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
				
				//test_grid2
				var gid = "test_grid2";
				var $this = this;
				var ctx = this.context;
				$('#'+gid).editgrid({
					colNames:['ID','仓库','注册日期','最近登录'],
					colModel:[
						{name:'id',index:'id', width:150,editable:true},
						{name:'username',index:'username', width:300,selectCode:"WAREHOUSE",editable:true,edittype:'advance'},
						{name:'regDate',index:'regDate',width:150,formatter:'dateFmatter',editable:true,edittype:'date'},
						{name:'lastLogin',index:'lastLogin',width:150,formatter:'datetimeFmatter'}
					],
					proxy:proxy,
					shrinkToFit:false,
					autowidth:true,
//					multiselect: true,
   					caption: "列表",
   					regional:'cn',
   					pager:'#'+gid+'Pager',
					//查询条件
					beforeReload:function(){
					},
					autoLoad:true
				});
			}
		}
	});
});
