define(['jquery','classutil','service'],function($,util,service){
	var AjaxDataProxy = util.defineClass({
		serviceName:'',
		fieldCodeTypes:{},
		initialize: function(options){
			var defaultOpts = {
				serviceName:'',
				fieldCodeTypes:{},
				_fieldCodeValues:{},
				selectCode:'none'
			}
			var cfg = $.extend(true,{},defaultOpts,options);
			for(var op in cfg){
				this[op] = cfg[op];
			}
		},
		loadData:function(queryInfo){
			var _this = this;
			//获取serviceName
			var serviceName = this.serviceName;
			//获取后台数据
			queryInfo.fieldCodeTypes = this.fieldCodeTypes;
			var post = null;
			var sc = this.selectCode;
			if(sc == 'none'){
				post = service.service(serviceName,{queryInfo:queryInfo});
			}else{
				post = service.service(serviceName,{selectCode:sc,queryInfo:queryInfo});
			}
			post.done(function(queryData){
				if(queryData!=null && queryData.selectCodeValues!=undefined && queryData.selectCodeValues!=null){
					_this._fieldCodeValues = queryData.selectCodeValues;
				}else{
					_this._fieldCodeValues ={};
				}
			});
			return post;
		},
		getLabelValue:function(fieldName,val){
			var result;
			var selectCode = this.fieldCodeTypes[fieldName];
			var values = this._fieldCodeValues[selectCode];
			if(values!=undefined && values!= null){
				result = values[val];
			}	
			if(result!=undefined && result!= null){
				return result;
			}
			if(val == null){	
				return "";
			}else{
				return val;
			}
		},
		setSelectCodeValue:function(selectCode,key,label){
			var _this = this;
			var codeValues = _this._fieldCodeValues;
			if(codeValues!=null){
				if(codeValues[selectCode]!=null){
				}else{
					codeValues[selectCode]={};
				}
			}else{
				codeValues = {};
				codeValues[selectCode]={};
			}
			codeValues[selectCode][key]=label;
		}
	});
	return AjaxDataProxy;
	
});