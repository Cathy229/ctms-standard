define([],function() {
	var baseModule = {
		context:null,
		container:null,
		setTabid:function(tabid){
			this.opt.tabid = tabid;
		},
		setContext:function(context){
			this.context = context;
		},
		setContainer:function(container){
			this.container = container;
		},
		events:{
			beforeReopen:function(){
				return true;
			},
			restore:function(){},
			onShow:function(){},
			init:function(){},
			beforeClose:function(){
				return true;
			},
			afterClose:function(){},
			defaultAction:function(){},
			resize:function(){}
		},
		opt:{
			isDailog:false,
			tabid:null,
			custom:false
		},
		/*
		 * 动态创建HTML模版，此时opt.url失效
		 * 需标明opt.custom＝true后生效，默认返回空	 
		 */
		createCustomHtml:function(){
			return "";
		},
		_init:function(){
			var ctx = this.context;
			var _this = this;
			var container = ctx.parent(".ui-dialog");
			container.attr("tabindex",0);
			container.focus();
			container.on("keydown",function(event){
				if(event.ctrlKey && event.keyCode == 13){
					_this.events.defaultAction.call(_this);
					event.preventDefault();
				}
			});
		}
	};
	return baseModule;
});