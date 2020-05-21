define(['jqueryui'],function(){
	$.widget("ui.dialog", $.extend({}, $.ui.dialog.prototype, {
		_title : function(title) {
			var $title = this.options.title || '&nbsp;'
			if (("title_html" in this.options)
					&& this.options.title_html == true)
				title.html($title);
			else
				title.text($title);
		}
	}));
	return {
		open:function(module,config){
//			if(config == undefined){
//				config = {
//					params:{}
//				};
//			}
			config = $.extend({
				callback:undefined,
				params:{},
				viewparams:{}
			},config);
			var context = $(document.body);
			var id = (new Date()).valueOf();
			module.setTabid(id);
			var dlg = $("<div id="+id+"></div>");
			var defaultOptions = {
				title:"<div class='widget-header widget-header-small'><h4 class='smaller'>选择框</h4></div>",
				title_html:true,
				modal:true,
				width:560//,
//				autoOpen:false
//				height:300
			};
			var options = $.extend({},defaultOptions,module.dialogopt);
			options.title = "<div class='widget-header widget-header-small'><h4 class='smaller'>"+module.opt.title+"</h4></div>";
			dlg.appendTo(context);
			dlg.dialog(options);
			dlg.dialog({
				close: function(event, ui) {
					module.setTabid(null);
					module.setContext(null);
					$(this).remove();
					module.events.afterClose.call(module);
				},
				beforeClose:function(event, ui) {
					if(module.events.beforeClose.call(module) === false){
						return false;
					}
					return true;
				}
			});
			var $this = this;
			//处理动态内容加载
			if(module.opt.custom === true){
				dlg.html(module.createCustomHtml.call(module,config.viewparams));
				$this._handleAfterLoad(module,id,config);
			}else{
				dlg.load(module.opt.url+"?v=1",function() {
					$this._handleAfterLoad(module,id,config);
				});
			}
		},
		_handleAfterLoad:function(module,id,config){
			module.setContext($('#'+id));
			module._init.call(module);
			module.events.init.call(module,config.params);
			module.events.onShow.call(module);
			if($.isFunction(config.callback)){
				config.callback.call(module);
			}
		},
		close:function(module){
			var id = module.opt.tabid;
			if(id!=null && $("#"+id).length > 0){
				if(module.events.beforeClose.call(module) == false){
					return;
				}
				$("#"+id).dialog( "close" );
			}
		},
		center:function(module){
			var tabid = module.opt.tabid;
			$("#"+tabid).dialog('option',{position:{ my: "center", at: "center", of: window }});
		},
		confirm:function(msg,config){
			var module = "fros/widgets/dialog/messageDialog";
			var $this = this;
			require([module],function(m){
				$this.open(m,{
					viewparams:{
						message:msg
					},
					params:config
				});
			});
			
		}
	};
});