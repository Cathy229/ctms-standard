define(['jquery','underscore','style!fros/widgets/bootstrap-tab/tab'],function($,_){
	(function ($){
		$.tabControl = $.tabControl || {};
		$.extend($.tabControl,{
			_template:{
				baritem:_.template('<li role="presentation" tabid="{{tabid}}">'+
									'<a href="#"><span>{{title}}</span><b style="font-size:19px">&nbsp;&nbsp;</b><span class="closearrow">×</span></a>'+
									'</li>'),
				content:_.template('<div class="panel panel-default" style="margin-bottom: 0px;height:100%;" tabid="{{tabid}}">'+
									'<div class="panel-body" style="height:100%;overflow-y: scroll;overflow-x:auto;padding:{{tabpadding}}px" >'+
									'</div></div>'),
				barframe:_.template('<div class="col-xs-11"><ul class="nav nav-pills tabbar"></ul></div>'),
				arrowframe:_.template('<div style="position:absolute;width:50px;right:0;">' +
						'<div class="col-xs-6 leftarrow" style="height: 27px;cursor:pointer;">' +
						'<span  class="icon-chevron-left"></span></div>' +
						'<div class="col-xs-6 rightarrow" style="height: 27px;cursor:pointer;">' +
						'<span class="icon-chevron-right"></span></div>' +
						'</div>'),
				contentframe:_.template('<div class="col-xs-12 tabcontent" style="height:{{tabheight}}px"></div>')
			},
			cfg:{
				activeCls:'active'
			},
			init:function($self,options){
				var opt = $.extend({
					tabheight:200,
					singleView:false
				},options);
				var $barframe = $(this._template.barframe());
				$self.append($barframe);
				$self.data("tabbar",$barframe.children("ul"));
				var $arrowframe = $(this._template.arrowframe());
				$self.append($arrowframe);
				var $contentframe = $(this._template.contentframe(opt));
				$self.append($contentframe);
				$self.data("tabcontent",$contentframe);
				$arrowframe.children(":first").on("click",function(){
					$('.tabbar',$barframe).children(":visible:first").hide();
				});
				$arrowframe.children(":last").on("click",function(){
					$('.tabbar',$barframe).children(":hidden:last").show();
				});
				//remember options
				$self.data("opt",opt);
				if(opt.singleView === true){
					$barframe.hide();
					$arrowframe.hide();
				}
			},
			isOpened:function($self,module){
				return (!(module.opt.tabid == null))&&($('[tabid="'+module.opt.tabid+'"]').length >0);
			},
			open:function($self,module,config){
				//适合于Ajax页面调用
				if(this.isOpened($self,module)){
					/*
					 * show the page without clearing all the content
					 */
					this.showTab($self,module);
					if(module.events.beforeReopen.call(module) == true){
						module.events.restore.call(module);
					}else{
						return;
					}
					if(config!=undefined && config!=null && $.isFunction(config.callback)){
						config.callback();
					}
				}else{
					this.addTab($self,module,config);
				}
			},
			refresh:function($self,module,config){
				//适合于同步调用
				if(this.isOpened($self,module)){
					//close then open it again
					this.closeTab($self,module);
				}
				this.addTab($self,module,config);
				module.events.restore.call(module);
			},
			_checkModule:function(module){
				for(var event in module.events){
					if(!$.isFunction(module.events[event])){
						alert("Config ERROR:Event["+event+"] is not a function");
						return false;
					}
				}
				return true;
			},
			addTab:function($self,module,config){
				if(arguments.length == 2){
					$self = arguments[1];
					config = {};
				}
				config = $.extend({
					closable:true,
					callback:function(){},
					params:{}
				},config);
				if(this._checkModule(module) == false){
					return;
				}
				module.setTabid((new Date()).valueOf());
				module.setContainer($self);
				var opt = $.extend({
					tabpadding:5,
					title:'Title'
				},module.opt);
				var $this = this;
				var $tabbar = $self.data("tabbar");// $(".tabbar",$self);
				var activeCls = this.cfg.activeCls;
				var $tabcontent = $self.data("tabcontent");//$(".tabcontent",$self);
				$("."+activeCls,$tabbar).removeClass(activeCls);
				var $newBar = $(this._template.baritem(opt));
				$("a",$newBar).on('click',function(){
					$this.showTab($self,module);
				});
				if(config.closable != true){
					$('.closearrow',$newBar).hide();
				}else{
					$('.closearrow',$newBar).on('click',function(){
						$this.closeTab($self,module);
					});
				}
				$newBar.addClass(activeCls);
				$newBar.data('_module',module);
				$tabcontent.children(':visible').hide();
				var $newContent = $(this._template.content(opt));
				$tabbar.append($newBar);
				$tabcontent.append($newContent);
				module.setContext($('.panel-body',$newContent));
				//TODO: send parameters
				/*
				 * {id:i,name:'bb'}
				 * -->
				 * id=1&name=bb
				 */
				var sf = "?";
				if(opt.url.indexOf('?') > 0){
					sf = "&";
				}
				$('.panel-body',$newContent).load(opt.url+sf+'v=1',function(response, status, xhr){
					if(status == 'error'){
						$(this).html(response);
					}else{
						module.events.init.call(module,config.params);
						module.events.onShow.call(module);
						module.events.resize.call(module);
						if(config!=undefined && config!=null && $.isFunction(config.callback)){
							config.callback();
						}
					}
				});
			},
			prev:function($self,module){
				var tabid = module.opt.tabid;
				var $tabbar = $self.data("tabbar");//$(".tabbar",$self);
				var $targetBar = $tabbar.children('[tabid="'+tabid+'"]');
				var $prevBar = $targetBar.prev();
				if($prevBar.length > 0){
					return $prevBar.data('_module');
				}
				return null;
			},
			next:function($self,module){
				var tabid = module.opt.tabid;
				var $tabbar = $self.data("tabbar");//$(".tabbar",$self);
				var $targetBar = $tabbar.children('[tabid="'+tabid+'"]');
				var $nextBar = $targetBar.next();
				if($nextBar.length > 0){
					return $nextBar.data('_module');
				}
				return null;
			},
			closeTab:function($self,module){
				if(module.events.beforeClose.call(module) == false){
					return;
				}
				var tabid = module.opt.tabid;
				var $tabbar = $self.data("tabbar");//$(".tabbar",$self);
				var $tabcontent = $self.data("tabcontent");//$(".tabcontent",$self);
				var $targetBar = $tabbar.children('[tabid="'+tabid+'"]');
				if($targetBar.hasClass(this.cfg.activeCls)){
					var nextModule = this.next($self,module);
					if(nextModule!=null && nextModule.opt.tabid != undefined){
						this.showTab($self,nextModule);
					}else{
						var prevModule = this.prev($self,module);
						if(prevModule!=null && prevModule.opt.tabid != undefined){
							this.showTab($self,prevModule);
						}
					}
				}
				//close itself
				$targetBar.remove();
				var $targetContent = $tabcontent.children('[tabid="'+tabid+'"]');
				$targetContent.remove();
				module.setContext(null);
				module.setContainer(null);
				module.setTabid(null);
				//this function can not get the DOM in the tab which had been closed
				module.events.afterClose.call(module);
			},
			showTab:function($self,module){
				var tabid = module.opt.tabid;
				var $tabbar = $self.data("tabbar");//$(".tabbar",$self);
				var $tabcontent = $self.data("tabcontent");// $(".tabcontent",$self);
				var $targetBar = $tabbar.children('[tabid="'+tabid+'"]');
				var activeCls = this.cfg.activeCls;
				$("."+activeCls,$tabbar).removeClass(activeCls);
				$targetBar.addClass(activeCls);
				$tabcontent.children(':visible').hide();
				$tabcontent.children('[tabid="'+tabid+'"]').show();
				module.events.onShow.call(module);
				module.events.resize.call(module);
			}
		});
		$.fn.tab = function(options) {
			if (typeof options == 'string') {
				var fn = $.tabControl[options];
				if (!fn) {
					throw ("tabControl - No such method: " + options);
				}
				var args = $.makeArray(arguments).slice(1);
				args.unshift($(this));
				return fn.apply($.tabControl, args);
			}else{
				return this.each( function() {
					$(this).tab('init',options);
				});
			}
		};
		$(window).bind('resize.tab', function() {
			var $bar = $(".module-tab").find(":first-child > ul > li.active");
			var m = $bar.data('_module');
			m.events.resize.call(m);
		});
	})($);
});