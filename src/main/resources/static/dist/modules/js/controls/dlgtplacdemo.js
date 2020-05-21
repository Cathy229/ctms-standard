define(['jquery','basemodule','dialog'],function($,basemodule,dialog) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/controls/dlgtplacdemo',
			title:'联想控件',
			isDailog:true
		},
		dialogopt:{
			modal:true,
			width:560,
			height:300
		},
		events:{
			init:function(){
				var ctx = this.context;
				var module = this;
				$("#whName",ctx).templateac({});
			},
			defaultAction:function(){
				
			}
		}
	});
});