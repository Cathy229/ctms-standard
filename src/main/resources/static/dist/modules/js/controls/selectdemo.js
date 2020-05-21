define(['jquery','basemodule','formValues','AjaxProxy','dialog','service','frosSelect','fmatter','datagrid'],function($,basemodule,FormUtil,AjaxProxy,dialog,service,frosSelect) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/controls/selectdemo.vc',
			title:'select demo'
		},
		events:{
			init:function(){
				debugger
				/**
				 * demo
				 */
				var $demoSelect = $('#demoSelect');
				var selectCodeParameter = {selectCode:"ESCOMPANY", queryInfo:{"queryFields":[],"fieldCodeTypes":null}};
				var dtd = service.service('SelectCodeQuery-ESCOMPANY', selectCodeParameter);
				dtd.done(function(data){
					debugger
					// select 只解析id,text属性
					var selectData = $.map(data.dataList, function (obj) {
					  obj.id = obj.escoId; // 将provId属性赋值为id属性
					  obj.text = obj.escoCompanyNameCn; // 将provName属性赋值为text属性
					  return obj;
					});
					
					$demoSelect = $("#demoSelect",this.context).select({
						placeholder: '请选择省份',
						data: selectData
					});
				});
//				/**
//				 * 选择省份 start
//				 */
//				var $proviceSelect;
//				var selectCodeParameter = {selectCode:"PROVINCE", queryInfo:{"queryFields":[],"fieldCodeTypes":null}};
//				var dtd = service.service('SelectCodeQuery-PROVINCE', selectCodeParameter);
//				dtd.done(function(data){
//					// select 只解析id,text属性
//					var selectData = $.map(data.dataList, function (obj) {
//					  obj.id = obj.provId; // 将provId属性赋值为id属性
//					  obj.text = obj.provName; // 将provName属性赋值为text属性
//					  return obj;
//					});
//					
//					$proviceSelect = $("#proviceSelect",this.context).select({
//						placeholder: '请选择省份',
//						data: selectData
//					});
//				});
//				/**
//				 * 选择省份 end
//				 */
//				
//				
//				/**
//				 * 选择城市 start
//				 */
//				var $citySelect;
//				var cityParameter = {"queryInfo":{"queryFields":[{"fieldName":"[cityProvId]","operator":"=","fieldValue":"1"}],"fieldCodeTypes":{}}};
//				var dtd = service.service("CommonQuery-CityCityModel", cityParameter);
//				dtd.done(function(data){
//					// select 只解析id,text属性
//					var selectData = $.map(data.dataList, function (obj) {
//					  obj.id = obj.cityId; // 将cityId属性赋值为id属性
//					  obj.text = obj.cityName; // 将cityName属性赋值为text属性
//					  return obj;
//					});
//					$citySelect = $("#citySelect",this.context).select({
//						placeholder: '请选择城市',
//						multiple: true,
//						data: selectData
//					});
//					
//				});
//				
//				/**
//				 * 当用户切换省份时清除之前选择的城市
//				 */
//				$("#proviceSelect",this.context).on('select2:select', function (evt) {
//					// 清空原来的数据 
//					$citySelect.val(null).trigger("change");
//					// update data
//					var provId = $("#proviceSelect",this.context).val();
//					if (provId !=null && provId !='' && typeof(provId) != 'undefined') {
//						// 级联查询条件
//						var queryFields = [{'fieldName':'[cityProvId]',"operator":"=",'fieldValue':provId}];
//						cityParameter.queryInfo.queryFields = queryFields;
//					}
//					
//					var dtd = service.service("CommonQuery-CityCityModel", cityParameter);
//					dtd.done(function(data){
//						// select 只解析id,text属性
//						var selectData = $.map(data.dataList, function (obj) {
//						  obj.id = obj.cityId; // 将cityId属性赋值为id属性
//						  obj.text = obj.cityName; // 将cityName属性赋值为text属性
//						  return obj;
//						});
//						$("#citySelect",this.context).select('updateOptions',selectData);
//					});
//					
//				});
//				/**
//				 * 选择城市 end
//				 */
				
			},
			onShow:function(){
			}
		}
		
	});
});