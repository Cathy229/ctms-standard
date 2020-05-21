define(['jquery','dialog'],function($,dialog) {
	$.frosupload = $.frosupload || {};
	$.extend($.frosupload,{
		defaultOpt : {
			openEvent:'click.upload',
			onHoverClass:'',
			limit:-1,
			uploadUrl:null,
			statusUrl:null,
			interval:1000,
			showStatus:false,
			getExtraParam:null
		},
		_init:function(options,$self){
			//this stands for $.frosupload
			var defaultOpt = this.defaultOpt;
			options = $.extend({},defaultOpt,options);
			this.setConfig(options,$self);
			var cpt = this;
			if(this.isValidOpt(options) == false){
				return;
			}
			$self.on(options.openEvent,function(event){
				var beforeEvent = $.Event( "beforeOpen" );
				cpt.triggerEvent(beforeEvent,$self);
				if(beforeEvent.isDefaultPrevented()){
					//do not open the window
					return;
				}
				require(["fros/widgets/upload/uploadPanel"],function(m){
					dialog.open(m,{
						params:{
							triggerCtl:$self
						},
						viewparams:{
							uploadUrl:options.uploadUrl
						}
					});
				});
			});
		},
		isValidOpt:function(options){
			if(options.uploadUrl==null){
				alert("未提供上传URL[uploadUrl]");
				return false;
			}
			if(options.showStatus == true){
				if(options.statusUrl == null){
					alert("显示进度条，但未提供更新进度URL[statusUrl]");
					return false;
				}
			}
			return true;
		},
		triggerEvent:function(event){
			var args  = $.makeArray(arguments).slice(1);
			//获取最后一个参数
			var $self = args.pop();
			return $self.trigger(event,args);
		},
		setConfig:function(options,$self){
			return this.setCache("_config",options,$self);
		},
		getConfig:function($self){
			return this.getCache("_config",$self);
		},
		setCache:function(key,value,$self){
			return $self.data(key,value);
		},
		getCache:function(key,$self){
			return $self.data(key);
		}
	});
	
	$.fn.uploadControl = function(options) {
		if (typeof options == 'string') {
			var fn = $.frosupload[options];
			if (!fn) {
				throw ("frosupload - No such method: " + options);
			}
			var args = $.makeArray(arguments).slice(1);
			args.push($(this));	
			return fn.apply($.frosupload, args);
		}else{
			return this.each( function() {
				$(this).uploadControl('_init',options);
			});
		}
	};
});