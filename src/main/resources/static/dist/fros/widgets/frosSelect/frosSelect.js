define(['jquery','advanceSelectConfig','service','select2','select2_zh_CN','json'],function($,advConfigs,service) {
	
	$.fn.select = function(options){
		var $selectElement = this;
		if (!(options.data) && !(options.ajax) && !(options.selectCode) && !(options.selectCode) && !(options.service)) {
			return false;
		}
		
		if (options.service){
			// 1.service
			var serviceName = options.service.serviceName;
			if (typeof(serviceName) == 'undefined' || serviceName == '') {
				return false;
			}
			var select2Id = options.id || 'id';
			delete options.id;
			var select2Text = options.text || 'text';
			delete options.text;
			var serviceParameter = options.service.parameter;
			delete options.service;
			var pageSize = options.pageSize || 10;
			delete options.pageSize;
			var url = getServiceUrl(serviceName);
			var ajaxConfig = {
			    url: url,
			    type:"POST",
			    dataType: 'json',
			    delay: 600,
			    data: function(params){
			    	if (serviceName.indexOf('CommonQuery-') != -1) {
			    		params.page = params.page || 1;
			    		var pagingInfo = {"pageSize":pageSize,"currentPage":params.page};
						serviceParameter.queryInfo.pagingInfo = pagingInfo;
			    	}
			    	
			    	$(this).triggerHandler("handleServiceParam",[params,serviceParameter]);
			    	var serviceParameterStr = JSON.stringify(serviceParameter);
			    	return serviceParameterStr;
			    },
			    processResults: function (data, params) {
			    	var dataResult = $.map(data.data.dataList, function (obj) {
		    		  obj.id = obj[select2Id];
		    		  obj.text = obj[select2Text];
		    		  return obj;
		    		});
			    	params.page = params.page || 1;
			    	var hasMore = false;
			    	if (data.data.pagingInfo && data.data.pagingInfo.totalRows) {
			    		hasMore = ((params.page * pageSize) < (data.data.pagingInfo.totalRows))
			    	}
				    return {
			    		results: dataResult,
				        pagination: {
				        	more: hasMore
				        }
				    };
			    },
			    cache: true
			};
			options.ajax = ajaxConfig;
			return $selectElement.select2(options);
			
		} else if (options.selectCode) {
			// 2.select code
			var selectCodeConfig = $.extend(true,{},advConfigs[options.selectCode]);
			var colModelArray = selectCodeConfig.colModel;
			var select2Id = colModelArray[0].name || 'id';
			var select2Text = colModelArray[1].name || 'text';
			if (options.id) {
				select2Id = options.id;
				delete options.id;
			}
			if (options.text) {
				select2Text = options.text;
				delete options.text;
			}
			
			var selectCode = options.selectCode;
			var serviceName = "SelectCodeQuery-" + selectCode;
			var selectCodeParameter = {selectCode:selectCode, queryInfo:{"queryFields":[],"fieldCodeTypes":null}};
			var queryFields = [];
			
			delete options.selectCode;
			var pageSize = options.pageSize || 10;
			delete options.pageSize;
			
			var url = getServiceUrl(serviceName);
			var pagingInfo = {"pageSize":pageSize,"currentPage":1};
			selectCodeParameter.queryInfo.pagingInfo = pagingInfo;
			var ajaxConfig = {
			    url: url,
			    type:"POST",
			    dataType: 'json',
			    delay: 600,
			    data: function(params){
			    	var queryFields = [];
			    	if(params.term){
			    		$.each(selectCodeConfig.queryFilterCond,function(index,queryField){
				    		delete queryField.fieldLabel;
				    		delete queryField.rowkey;
				    		queryField.fieldStringValue=params.term;
				    		queryFields.push(queryField);
				    	});
		    		}
			    	
			    	if(params.page){
			    		selectCodeParameter.queryInfo.pagingInfo.currentPage=params.page;
			    	}
			    	
			    	$selectElement.triggerHandler("onCustomFilterCond",[params,queryFields]);
			    	selectCodeParameter.queryInfo.queryFields = queryFields;
			    	var selectCodeParameterStr = JSON.stringify(selectCodeParameter);
			    	return selectCodeParameterStr;
			    },
			    processResults: function (data, params) {
			    	var dataResult = $.map(data.data.dataList, function (obj) {
		    		  obj.id = obj[select2Id];
		    		  obj.text = obj[select2Text];
		    		  return obj;
		    		});
			    	params.page = params.page || 1;
			    	var hasMore = false;
			    	if (data.data.pagingInfo && data.data.pagingInfo.totalRows) {
			    		hasMore = ((params.page * pageSize) < (data.data.pagingInfo.totalRows))
			    	}
			    	
				    return {
			    		results: dataResult,
				        pagination: {
				        	more: hasMore
				        }
				    };
			    },
			    cache: true
			};
			
			options.ajax = ajaxConfig;
			return $selectElement.select2(options);
			
		} else if ((options.data) && (options.id || options.text)) {
			// 包含data属性同时也包含id或者text属性的时 
			var dataResult = $.map(options.data, function (obj) {
    		  obj.id = obj[options.id] || obj.id;
    		  obj.text = obj[options.text] || obj.text;
    		  return obj;
    		});
			options.data = dataResult;
			delete options.id;
			delete options.text;
			return $selectElement.select2(options);
		}else {
			// ajax 和其他情况不做任何处理，直接调用原生的select2
			return $selectElement.select2(options);
		}
		
		
		/**
		 * 获取项目名称 
		 */
		function getServiceUrl(serviceName) {
			var baseUrl = require.toUrl("MYFLAG");
			baseUrl = baseUrl.substring(0,baseUrl.indexOf("MYFLAG") - 5);//必须是dist
			var serviceUrl = baseUrl+'service/'+serviceName;
			return serviceUrl;
		}
		
	};
	
});