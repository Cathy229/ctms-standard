define(['jquery','advanceSelectConfig','service','templateac'],function($,advConfigs,service){
	$.selectCodeTplac = $.selectCodeTplac || {};
	$.extend($.selectCodeTplac,$.tplac,{//注意此继承不允许重写_init
		_initselectcode:function(options,$self){
			var selectCode = options.selectCode;
			var advCfg = advConfigs[selectCode];
			var result = $.Deferred();
			if(advCfg.isLoaded == true){
				result.resolve();
			}else{
				var dtd = service.service("GET_SELECTCODE_DEF",{selectCode:options.selectCode});
				dtd.done(function(def){
					advConfigs[selectCode].keyFieldName = def.keyFieldName;
					advConfigs[selectCode].labelFieldName = def.labelFieldName;
					advConfigs[selectCode].queryType = def.queryType;
					advConfigs[selectCode].fieldCodeTypes = def.fieldCodeTypes;
					advConfigs[selectCode].isLoaded = true;
					result.resolve();
				});
			}
			result.done(function(){
				var cfg = advConfigs[selectCode];
				var defaultOptions={
					isPage:true,
					selectCode:null,
					rowNum:10,
					dataAttr:'dataList',
					serviceName:"SelectCodeQuery-"+selectCode,
					colNames:null,
					colModel:null,
					keyFieldName:null,
					labelFieldName:null
				};
				var op = $.extend(defaultOptions,cfg,options);
				
				$self.templateac(op);
				$self.on("handleServiceParam",function(event,val,currentPage){
					var param ={};
					param.selectCode = op.selectCode;
					var queryInfo = {};
					var queryField = advCfg.queryFilterCond[0];
					queryField.fieldStringValue = val;
					var pagingInfo = {
						pageSize:op.rowNum,
						currentPage:currentPage
					};
					var queryFields = [queryField];
					//只允许更改条件部分
					$self.triggerHandler("onCustomFilterCond",[queryFields]);
					queryInfo.queryFields = queryFields;
					queryInfo.pagingInfo = pagingInfo;
					param.queryInfo = queryInfo;
					return param;
				});
				$self.on("getPagingInfo",function(event,data){
					var pagingInfo ={
						totalRows:data.pagingInfo.totalRows,
						currentPage:data.pagingInfo.currentPage,
						pageSize:data.pagingInfo.pageSize
					};
					return pagingInfo;
				});
			});
		}
	});
	$.fn.autoSelect = function(options) {
		if (typeof options == 'string') {
			var fn = $.selectCodeTplac[options];
			if (!fn) {
				throw ("selectCodeTplac - No such method: " + options);
			}
			var args = $.makeArray(arguments).slice(1);
			args.push($(this));	
			return fn.apply($.selectCodeTplac, args);
		}else{
			return this.each( function() {
				$(this).autoSelect('_initselectcode',options);
			});
		}
	};
});