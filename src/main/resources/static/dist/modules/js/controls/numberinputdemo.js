define(['jquery','basemodule','numberinput'],function($,basemodule) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/controls/numberinputdemo.vc',
			title:'数字控件'
		},
		events:{
			init:function(){
				var ctx = this.context;
				$("#intInput",ctx).numberinput({});
				$("#intInput2",ctx).numberinput({
					allowMinus:false
				});
				
				$("#floatInput",ctx).numberinput({
					digits:2
				});
			}
		}
	});
});
