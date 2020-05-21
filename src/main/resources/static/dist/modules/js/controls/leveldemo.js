define(['jquery','basemodule','dialog','LocalProxy','templateac','autoSelect','advanceSuggest'],function($,basemodule,dialog,LocalProxy) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/controls/leveldemo.vc',
			title:'联想级联控件展示'
		},
		events:{
			init:function(){
				var ctx = this.context;
				/**
				 * templateac类型级联绑定 start
				 */
				$("#province1",ctx).templateac({
					serviceName:"SelectCodeQuery-PROVINCE",
					colNames:["ID","名称"],
					colModel:[
					   {name:'provId',index:'provId'},
					   {name:'provName',index:'provName'}
					],
					dataAttr:"dataList",
					keyFieldName:"provId",
					labelFieldName:"provName",
					hidInput:$("#province1Value",ctx)
				});
				$("#province1",ctx).on("handleServiceParam",function(event,val,currentPage){
					var param ={};
					param.selectCode = "PROVINCE";
					var queryInfo = {};
					var queryField = {
						fieldName:"[provName,provEnName]",
						operator:"ilikeAnywhere",
						fieldStringValue:val
					};
					var pagingInfo = {
						pageSize:5,
						currentPage:currentPage
					};
					var queryFields = [queryField];
					queryInfo.queryFields = queryFields;
					queryInfo.pagingInfo = pagingInfo;
					param.queryInfo = queryInfo;
					return param;
				});
				//
				$("#province1",ctx).on("getPagingInfo",function(event,data){
					var pagingInfo ={
						totalRows:data.pagingInfo.totalRows,
						currentPage:data.pagingInfo.currentPage,
						pageSize:data.pagingInfo.pageSize
					};
					return pagingInfo;
				});
				
				$("#city1",ctx).templateac({
					serviceName:"SelectCodeQuery-CITY",
					colNames:["ID","名称"],
					colModel:[
					    {name:'cityId',index:'cityId'},
						{name:'cityName',index:'cityName'}
					],
					dataAttr:"dataList",
					keyFieldName:"cityId",
					labelFieldName:"cityName",
					hidInput:$("#city1Value",ctx)
				});
				
				$("#city1",ctx).on("handleServiceParam",function(event,val,currentPage){
					var param ={};
					param.selectCode = "CITY";
					var queryInfo = {};
					var queryField = {
						fieldName:"[cityName,cityEnName]",
						operator:"ilikeAnywhere",
						fieldStringValue:val
					};
					var queryFields = [queryField];
					
					var province1Value = $("#province1Value",ctx).val();
					if ( province1Value!='' ) {
						var levelQueryField = {
							fieldName:"[cityProvId]",
							operator:"=",
							fieldValue:province1Value
						};
						queryFields.push(levelQueryField);
					}
					queryInfo.queryFields = queryFields;
					
					var pagingInfo = {
						pageSize:5,
						currentPage:currentPage
					};
					queryInfo.pagingInfo = pagingInfo;
					param.queryInfo = queryInfo;
					return param;
				});
				//
				$("#city1",ctx).on("getPagingInfo",function(event,data){
					var pagingInfo ={
						totalRows:data.pagingInfo.totalRows,
						currentPage:data.pagingInfo.currentPage,
						pageSize:data.pagingInfo.pageSize
					};
					return pagingInfo;
				});
				
				// province1清空时清空city1
				$("#province1",ctx).on("onClear",function(event){
					$("#city1",ctx).text("");
					$("#city1",ctx).val("");
					$("#city1Value",ctx).val("");
				});
				/**
				 * templateac类型级联绑定 end
				 */
				
				/**
				 * selectCodeTplac类型级联绑定 start
				 */
				// 定义province2控件
				$("#province2",ctx).autoSelect({
					selectCode:"PROVINCE",
					hidInput:$("#province2Value",ctx),
					rowNum:5
				});
				// 定义city2控件
				$("#city2",ctx).autoSelect({
					selectCode:"CITY",
					hidInput:$("#city2Value",ctx),
					rowNum:5
				});
				// 设置city2级联province2
				$("#city2",ctx).on("onCustomFilterCond", function(event,queryFields){
					var provId = $("#province2Value",ctx).val();
					if (provId =='' ) {
						return;
					}
					var queryField = {'fieldName':'[cityProvId]',"operator":"=",'fieldValue':provId};
					queryFields.push(queryField);
				});
				// province2清空时清空city2
				$("#province2",ctx).on("onClear",function(event){
					$("#city2",ctx).val("");
					$("#city2Value",ctx).val("");
					$("#city2",ctx).text("");
				});
				/**
				 * selectCodeTplac类型级联绑定 end
				 */
				
				/**
				 * advanceSuggest类型级联绑定 start
				 */
				// 定义province3控件
				$("#province3",ctx).advanceSuggest({
					selectCode:"PROVINCE",
					hidInput:$("#province3Value",ctx)
				});
				
				// 定义city3组件
				$("#city3",ctx).advanceSuggest({
					selectCode:"CITY",
					hidInput:$("#city3Value",ctx)
				});
				// 设置city3级联province3
				$("#city3",ctx).on("onCustomFilterCond", function(event,queryFields){
					var provId = $("#province3Value",ctx).val();
					if (provId =='' ) {
						return;
					}
					var queryField = {'fieldName':'[cityProvId]',"operator":"=",'fieldValue':provId};
					queryFields.push(queryField);
				});
				// province3清空时清空city3
				$("#province3",ctx).on("onClear",function(event){
					$("#city3",ctx).val("");
					$("#city3Value",ctx).val("");
					$("#city3",ctx).text("");
				});
				/**
				 * advanceSuggest类型级联绑定 end
				 */
				
				
				/**
				 * 使用自定义query作为SelectCode的queryType
				 */
				$("#province4",ctx).advanceSuggest({
					selectCode:"PROVINCECITY",
					hidInput:$("#province4Value",ctx)
				});
				$("#province4",ctx).on('onCustomFilterCond',function(event,filterCond){
					console.log(filterCond);
					var sqlCond = {
		                "fieldName": "CDT_provId", // query中的sqlCond条件都要加上CDT_前缀
		                "fieldStringValue": '2', 
		                "operator": "=",
		                "fieldType":"String"
		            };
                    filterCond.push(sqlCond);
				});
			}
		}
	});
});
