define(['jquery','basewidget'],function($,basewidget){
	$.tplpager = $.tplpager || {};
	$.extend($.tplpager,basewidget,{
		_init:function(options,$self){
			var defaultOptions={
				tpl:'<li class="##pageClass## ##clickClass##" page="##toPage##"><a href="javascript:void(0)">##currentPage##</a></li>'
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
		_renderOne:function(data,tpl,datareader){
			var row = tpl;
			for(var fieldName in datareader){
				var fielddata = data[fieldName];
				var reg = new RegExp('##'+fieldName+'##','g');
				row = row.replace(reg,fielddata);
			}
			return row;
		},
		_bindEvent:function($self){
			$(".pagenumber",$self).on("click",function(event){
				var args  = [$(this).attr('page')];
				$self.trigger("pageclick",args);
			});
		},
		refresh:function(page,totalpages,totalrows,$self){
			var result = this.compute(page,totalpages,totalrows);
			var reader = 
			$self.empty();
			var opt = this.getConfig($self);
			var tpl = opt.tpl;
			var datareader = opt.datareader;
			var html = "";
			var row = tpl;
			var data= {};
			if(result[0] == "Disable"){
				data={
					currentPage:'<i class="icon-double-angle-left"></i>',
					pageClass:'disabled',
					clickClass:'',
					toPage:-1
				}
			}else{
				data={
					currentPage:'<i class="icon-double-angle-left"></i>',
					pageClass:'',
					clickClass:'pagenumber',
					toPage:(page-1)
				}
			}
			html = html + this._renderOne(data,tpl,datareader);
			for(i=1;i<result.length-1;i++){
				if(result[i] == '...'){
					data={
						currentPage:'...',
						pageClass:'disabled',
						clickClass:'',
						toPage:-1
					}
				}else{
					data={
						currentPage:result[i],
						pageClass:'',
						clickClass:'pagenumber',
						toPage:result[i]
					}
					if(result[i] == page){
						data.pageClass = 'active';
						data.clickClass = '';
					}
				}
				html = html + this._renderOne(data,tpl,datareader);
			}
			if(result[result.length-1] == "Disable"){
				data={
					currentPage:'<i class="icon-double-angle-right"></i>',
					pageClass:'disabled',
					clickClass:'',
					toPage:-1
				}
			}else{
				data={
					currentPage:'<i class="icon-double-angle-right"></i>',
					pageClass:'',
					clickClass:'pagenumber',
					toPage:(page+1)
				}
			}
			html = html + this._renderOne(data,tpl,datareader);
			$self.append(html);
			this._bindEvent($self);
		},
		compute:function(page,totalpages,totalrows){
			var result = [];
			//pre page
			if(page == 1){
				result.push('Disable');
			}else{
				result.push(page-1);
			}
			if(totalpages<11){
				for(i=0;i<totalpages;i++){
					result.push(i+1);
				}
			}else{
				var count = 0;
				for(i=0;i<totalpages;i++){
					if(i==0 ||i==(totalpages-1)){
						result.push(i+1);
					}else{
						if((i+1)-page>-3 && (i+1)-page<3){
							result.push(i+1);
							count = 0;
						}else{
							if(count == 0){
								result.push('...');
								count = 1;
							}
						}
					}
				}
			}
			//next page
			if(page == totalpages){
				result.push('Disable');
			}else{
				result.push(page+1);
			}
			return result;
		}
	});
	
	$.fn.templatepager = function(options) {
		if (typeof options == 'string') {
			var fn = $.tplpager[options];
			if (!fn) {
				throw ("tplpager - No such method: " + options);
			}
			var args = $.makeArray(arguments).slice(1);
			args.push($(this));	
			return fn.apply($.tplpager, args);
		}else{
			return this.each( function() {
				$(this).templatepager('_init',options);
			});
		}
	};
});