define(['jquery','advanceselect','autoSelect'],function($) {
	$.advanceSug = $.advanceSug || {};
	$.extend($.advanceSug,{
		_init:function(self,options){
			var defaultOption = {
					suggestBox:true,  //是否显示联想控件
					hidInput:null
			};
			var selectCode = options.selectCode;
			options = $.extend(true,defaultOption,options);
			if($(self).next().length  > 0){
				$(self).advanceselect({
					selectCode:selectCode,
					hidInput:options.hidInput
				});
			}
			if(options.suggestBox ==false){
				
			}else{
				$(self).autoSelect({
					selectCode:selectCode,
					hidInput:options.hidInput
				});
				//如果并存，需要添加事件，保证弹出框选择后，tplac认为是合法数据
				$(self).on("onSelectedRow",function(event,row){
					$(self).attr('oldvalue',$(self).val());//合法的数据
					$(self).attr('oldlabel',$(self).val());//合法的数据
				});
			}
		}
	});
	
	$.fn.advanceSuggest = function(options) {
		if (typeof options == 'string') {
			var fn = $.advanceSug[options];
			if (!fn) {
				throw ("advanceSuggest - No such method: " + options);
			}
			var args = $.makeArray(arguments).slice(1);
			args.push($(this));	
			return fn.apply($.advanceSug, args);
		}else{
			return this.each( function() {
				$(this).advanceSuggest('_init',this,options);
			});
		}
	};
});
