define([ 'jquery', 'basewidget','inputmask'], function($,
		basewidget) {
	$.numbeript = $.numbeript || {};
	$.extend($.numbeript, basewidget, {
		_init : function(options, $self) {
			var defaultOptions={
				digits: "0",
				radixPoint: "",
				allowMinus:true,
				numericInput:true
			};
			//如果是有小数则增加小数点
			if(options!=null && options.digits > 0){
				defaultOptions.radixPoint=".";
				defaultOptions.numericInput=false;
			}
			var op = $.extend(defaultOptions,options);
			$self.inputmask("numeric",op);
		}
	});
	$.fn.numberinput = function(options) {
		if (typeof options == 'string') {
			var fn = $.numbeript[options];
			if (!fn) {
				throw ("numbeript - No such method: " + options);
			}
			var args = $.makeArray(arguments).slice(1);
			args.push($(this));
			return fn.apply($.numbeript, args);
		} else {
			return this.each(function() {
				$(this).numberinput('_init', options);
			});
		}
	};
});