define(['jquery','basewidget'],function($,basewidget){
	$.tplgrid = $.tplgrid || {};
	$.extend($.tplgrid,basewidget,{
		_init:function(options,$self){
			var defaultOptions={
				dataAttr:"root",
				fommatters:{}
			};
			var op = $.extend(defaultOptions,options);
			var datareader = {};
			var tempTpl = op.tpl;
			var reg = new RegExp('##','g');
			var hasMore = true;
			var isTail = false;
			while(hasMore){
				var pos = tempTpl.search(reg);
				if(pos == -1){
					hasMore = false;
					continue;
				}
				if(isTail){
					var fieldName = tempTpl.substring(0,pos);
					tempTpl = tempTpl.substring(pos+2);
					datareader[fieldName] = true;
					isTail = false;
				}else{
					tempTpl = tempTpl.substring(pos+2);
					isTail = true;
				}
			}
			op.datareader = datareader;
			this.setConfig(op,$self);
		},
		parseData:function(dataList,options){
			var datareader = options.datareader;
			var rowdatas = [];
			for(var i=0;i<dataList.length;i++){
				var row = options.tpl;
				var rowdata = dataList[i];
				for(var fieldName in datareader){
					var fielddata = rowdata[fieldName];
					var reg = new RegExp('##'+fieldName+'##','g');
					if($.isFunction(options.fommatters[fieldName])){
						fielddata = options.fommatters[fieldName](fielddata,rowdata);
					}
					row = row.replace(reg,fielddata);
				}
				//行号渲染
				var reg = new RegExp('##gridRowNum##','g');
				row = row.replace(reg,i+1);
				rowdatas.push(row);
			}
			return rowdatas;
		},
		load:function(param,$self){
			var config = this.getConfig($self);
			var _this = this;
			require(["service"],function(service){
				var dtd = service.service(config.url,param);
				dtd.done(function(data){
					var dataList = [];
					if(config.dataAttr == "root"){
						dataList = data;
					}else{
						dataList = data[config.dataAttr];
					}
					var rowdatas = _this.parseData(dataList,config);
					$("[_userdata=added]",$self).remove();
					$self.append($(rowdatas.join('')).attr('_userdata','added'));
					var args  = [data];
					$self.trigger("afterload",args);
				});
			});
		}
	});
	
	$.fn.templategrid = function(options) {
		if (typeof options == 'string') {
			var fn = $.tplgrid[options];
			if (!fn) {
				throw ("tplgrid - No such method: " + options);
			}
			var args = $.makeArray(arguments).slice(1);
			args.push($(this));	
			return fn.apply($.tplgrid, args);
		}else{
			return this.each( function() {
				$(this).templategrid('_init',options);
			});
		}
	};
});