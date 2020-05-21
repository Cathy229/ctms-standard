define(['jquery','basemodule','dialog'],function($,basemodule,dialog) {
	return $.extend(true,{},basemodule,{
		opt:{
			isDailog:true,
			custom:true,
			title:'提示'
		},
		dialogopt:{
			width:480,
			height:200,
			buttons: [ 
				{
					text: "确认",
					"class" : "btn btn-danger",
					click: function() {
						var yesFunc = $( this ).data("dialogCfg").yes;
						yesFunc();
						$( this ).dialog( "close" ); 
					} 
				},
				{
					text: "取消",
					"class" : "btn",
					click: function() {
						var noFunc = $( this ).data("dialogCfg").no;
						noFunc();
						$( this ).dialog( "close" ); 
					} 
				}
			]
		},
		createCustomHtml:function(viewparams){
			return viewparams.message;
		},
		events:{
			init:function(params){
				var ctx = this.context;
				var defaultCfg = {
					yes:function(){},
					no:function(){}
				}
				var cfg = $.extend(true,{},defaultCfg,params);
				ctx.data("dialogCfg",cfg);
			}
		}
	});
});