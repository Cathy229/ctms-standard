define(['jquery','jqueryui','jqueryui_dtp','inputmask'],function($) {
	$.dateSel = $.dateSel || {};
	$.extend($.dateSel,{
		_init:function(self,options){
			var $self = $(self);
			var defaultOption = {
					showOn: "button",
					showButtonPanel:true,
					afterShow:this._afterShow,
					inputmask:true,   //是否显示格式
					format:'date',
					onClose:function(dateText,inst){
						$self.trigger('input');
						$self.focus();
					}
			},
			options = $.extend(true,defaultOption,options);
			if($(self).triggerHandler('beforeOpen') == false){
				return;
			};
			if(options.format != null && options.format == "datetime"){
				if($(self).next().length  > 0){
					$(self).next().addClass("dt-trigger");
						options.timeFormat='HH:mm:ss';
						$(self).datetimepicker(options);
						$(self).on('focus.dt',function(event){
							$self.datetimepicker( "hide" );
						});
				}
				if(options.inputmask){
					$(self).inputmask("yyyy-mm-dd hh:mm:ss",{ 
						placeholder: "____-__-__ __:__:__",
						clearIncomplete: true
					});
				}
			}else{
				if($(self).next().length > 0){
						$(self).next().addClass("dt-trigger");
						$(self).datepicker(options);
						$(self).on('focus.dt',function(event){
							$self.datepicker( "hide" );
						});
					}
				if(options.inputmask){
					$(self).inputmask("yyyy-mm-dd",{ 
						placeholder: "____-__-__",
						clearIncomplete: true
					});
				}
			}
		},
	
		_afterShow:function(input,inst){
			if(!$('.ui-datepicker-close',inst.dpDiv).hasClass('btn')){
				$('.ui-datepicker-close',inst.dpDiv).addClass('btn btn-info');
			}
			if(!$('.ui-datepicker-current',inst.dpDiv).hasClass('btn')){
				$('.ui-datepicker-current',inst.dpDiv).addClass('btn btn-info');
			}
		}
	});
	
	$.fn.datePicker = function(options) {
		if (typeof options == 'string') {
			var fn = $.dateSel[options];
			if (!fn) {
				throw ("datePicket - No such method: " + options);
			}
			var args = $.makeArray(arguments).slice(1);
			args.push($(this));	
			return fn.apply($.dateSel, args);
		}else{
			return this.each( function() {
				if ($.isFunction(options.beforeOpen)){
					$(this).on('beforeOpen',options.beforeOpen);
				}
				$(this).datePicker('_init',this,options);
			});
		}
	};
});