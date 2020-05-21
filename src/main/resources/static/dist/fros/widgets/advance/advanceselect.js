define(['jquery'],function($) {
	$.advSel = $.advSel || {};
	$.extend($.advSel,{
		afterSearchData:function(advConfigs,row,$self){
			var selectCode = $self.prop("opt").selectCode;
			var config = advConfigs[selectCode];
			if (config['labelFieldName'] == undefined) {
				alert(selectCode + "配置错误");
				return;
			}
			$self.val(row[config.labelFieldName]);
			if(config['keyFieldName'] != undefined && $self.prop("hidInput") != undefined){
				$self.prop("hidInput").val(row[config.keyFieldName]);
			}
			$self.trigger('input');
			$self.triggerHandler('onSelectedRow',[row]);
			
			if($self.triggerHandler('beforeClose') == false){
				return;
			};
		}
	});
	
	$.fn.advanceselect = function(options) {
		if (typeof options == 'string') {
			var fn = $.advSel[options];
			if (!fn) {
				throw ("advancedSelect - No such method: " + options);
			}
			var args = $.makeArray(arguments).slice(1);
			args.push($(this));	
			return fn.apply($.advSel, args);
		}else{
			return this.each( function() {
				if(options==undefined ||options==null){
					options={};
					}
				if(options.hidInput !=undefined && options.hidInput!=null){
					$(this).prop("hidInput", options.hidInput);
				}
				$(this).prop("opt", options);
				var $this = $(this);
				$(this).next().on('click',function(){
					require(['fros/widgets/advance/advance','dialog'],function(module,dialog){
						if($this.triggerHandler('beforeOpen') == false){
							return;
						};
						//此处假设界面上不可能出现同时打开多个选择框
						module.setLabelInput($this);
						dialog.open(module,{
							
						});
					});
				});
			});
			
		}
	};
});
