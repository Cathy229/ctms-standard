define(['jquery','formUtils'],function ($,formUtils){
	jqValidator={
			
	        validateMsgKey: "validateMsg",
	        validatePromptDivKey: "validateInfoDivId",

	        initValidateRules: function(ex){
	        	var checktype = ex.context.config.checktype;
	        	$elm=ex.context.target;
	        	validateMsg=ex.context.message;
	        	$elm.data('errorValidateMsg', validateMsg);
	        	jqValidator.createValidatePrompt($elm);

	        	if (validateMsg.length > 0 ) {
                    //显示验证信息
	        		if (checktype=="inputflag"){
	                	jqValidator.showValidatePrompt($elm);
	                	jqValidator.toggleValidateInfoDivClass($elm,true);
	        		}else{
	                	jqValidator.toggleValidateClass($elm, true);
	        		}
                }
                else {
                	//去除验证信息              
                	jqValidator.toggleValidateInfoDivClass($(ex.target),false);
                	jqValidator.hideValidatePrompt($elm);
                }
	        },
	        /**
	         * 关闭单个控件的消息提示、并去除警告标识
	         */
	        showValidatePrompt: function($elm){
	        	var left = $elm.offset().left, top = $elm.offset().top;
	            //获取当前控件的验证信息提示Div
	            var $validateInfoDiv = $('#' + $elm.data(jqValidator.validatePromptDivKey));
	            //重新给 信息提示Div 定位
	            if(left == 0 && top == 0){
	            	return;
	            }
	            $validateInfoDiv.css({
	                'left': left 
	            });
	            $validateInfoDiv.css({
	                'top': top +$elm.height() + 4
	            });
	            $validateInfoDiv.css({
	                'position': 'absolute'
	            });
	            //获取当前控件 不能通过验证的信息
	            var errorValidateMsg = $elm.data("errorValidateMsg");
	            if (!formUtils.isEmpty(errorValidateMsg)) {
	                //信息提示Div 的内容
	                var msgHtml = '<div class="backimage"></div><em><span class="pointer">'+ errorValidateMsg +'</span></em>';
	                jqValidator.toggleValidateInfoDivClass($elm, true).show().html(msgHtml);
	            }
	            else {
	                jqValidator.toggleValidateInfoDivClass($elm, false).hide();
	            }
	        },
	        
	        /**
	         * 关闭单个控件的 消息提示、并去除警告标识
	         */
	        hideValidatePrompt: function($elm){
	            jqValidator.toggleValidateInfoDivClass($elm, false).hide();
	            //2.去除警告标识
	            jqValidator.toggleValidateClass($elm, false);
	        },
	        
	        /**
	         * 切换验证样式
	         */
	        toggleValidateClass: function($elm, flag){
	            if (!$elm.hasClass("validatebox-invalid") && flag) {
	                $elm.addClass("validatebox-invalid");
	            }
	            else 
	                if ($elm.hasClass("validatebox-invalid") && !flag) {
	                    $elm.removeClass("validatebox-invalid");
	                }
	        },
	        /**
	         * 切换验证信息提示Div样式
	         */
	        toggleValidateInfoDivClass: function($elm, flag){
	            //获取到验证提示Div ID
	            $validateInfoDiv = $('#' + $elm.data(jqValidator.validatePromptDivKey));
	            if (flag === true) {
	                $validateInfoDiv.addClass("prompt");
	                $validateInfoDiv.removeClass("unprompt");
	            }
	            else {
	                $validateInfoDiv.addClass("unprompt");
	                $validateInfoDiv.removeClass("prompt");
	            }
	            return $validateInfoDiv;
	        },
	        /**
	         * 创建 验证提示信息
	         */
	        createValidatePrompt: function($target){
	            var target = $target[0];
	            var $validateInfoDiv;
	            if ($target.data(jqValidator.validatePromptDivKey)) {
	                //获取到验证提示Div ID
	                $validateInfoDiv = $('#' + $target.data(jqValidator.validatePromptDivKey));
	            }
	            else {
	                //验证提示Div ID
	                var validateInfoDivId = $target.attr("id") + "ValidateDiv";
	                $target.data(jqValidator.validatePromptDivKey, validateInfoDivId);
	                
	                //创建验证提示Div对象
	                $validateInfoDiv = $(document.createElement("div"));
	                $validateInfoDiv.attr("id", validateInfoDivId);
	                
	                //验证提示DivID存到当前控件上
	                $target.data(jqValidator.validatePromptDivKey, validateInfoDivId);
	                
	                $validateInfoDiv.addClass('prompt');
	                //$validateInfoDiv.css({
	                //    'width': 30
	                //});
	                $(document.body).append($validateInfoDiv);
	            }
	            
	            if (formUtils.checkBrowser().msie) {
//	                $(target).bind('mouseout mouseover blur', hideInfoDivFunc);
	            	$(target).bind('mouseout',hideInfoDivFunc);
//	            	$(target).bind('blur',showAndHideInfoDivDelay);
	            	$(target).bind('mouseenter',showInfoDivFunc);
//	            	$(target).bind('click',showInfoDivFunc);
	            	$(target).bind('focus',hideMessageFunc);
	            }
	            else {
	                target.addEventListener('mouseout', hideInfoDivFunc, true);
//	                target.addEventListener('blur', showAndHideInfoDivDelay, true);
	                target.addEventListener('mouseenter', showInfoDivFunc, true);
//	                target.addEventListener('click', showInfoDivFunc, true);
	                target.addEventListener('focus',hideMessageFunc,true);
	            }
	            
	            function hideMessageFunc(e){
	                jqValidator.setIsShowValidateMsg($target,true);
	            }
	            
	            function hideInfoDivFunc(e){
	                $elm = $(formUtils.getTargetByEvent(e));
	                //获取当前控件的验证信息提示Div
	                var $validateInfoDiv = $('#' + $elm.data(jqValidator.validatePromptDivKey));
	                jqValidator.toggleValidateInfoDivClass($elm, false).hide();
	            }
	            function showAndHideInfoDivDelay(e){
	            	var $elm = $(formUtils.getTargetByEvent(e));
	           	 	var errorValidateMsg = $elm.data("errorValidateMsg");
	           	 	if(!formUtils.isEmpty(errorValidateMsg)){
		                showInfoDivFunc(e); 
		               
		                setTimeout(function(){
		                		//获取当前控件的验证信息提示Div
			                    var $validateInfoDiv = $('#' + $elm.data(jqValidator.validatePromptDivKey));
			                    jqValidator.toggleValidateInfoDivClass($elm, false).hide();
		                    },500); 
	           	 	}
	            }

	            function showInfoDivFunc(e){
	                //获取当前控件
	                $elm = $(formUtils.getTargetByEvent(e));
	                //获取当前控件的验证信息提示Div
	                var $validateInfoDiv = $('#' + $elm.data(jqValidator.validatePromptDivKey));
	                //重新给 信息提示Div 定位
	                $validateInfoDiv.css({
	                    'left': $elm.offset().left 
	                });
	                $validateInfoDiv.css({
	                    'top': $elm.offset().top +$elm.height +4
	                });
	                $validateInfoDiv.css({
	                    'position': 'absolute'
	                });
	                //获取当前控件 不能通过验证的信息
	                var errorValidateMsg = "";
	                if ($elm.data("isShowValidateMsg") == "true" || $elm.data("isShowValidateMsg") === true) {
	                	errorValidateMsg = $elm.data("errorValidateMsg");
	                }
	                if (!formUtils.isEmpty(errorValidateMsg)) {
	                    //信息提示Div 的内容
	                    var msgHtml = '<div class="backimage"></div><em><span class="pointer">'+ errorValidateMsg +'</span></em>';
	                    jqValidator.toggleValidateInfoDivClass($elm, true).show().html(msgHtml);
	                }
	                else {
	                    jqValidator.toggleValidateInfoDivClass($elm, false).hide();
	                }
	            }
	        },
	        
	        setIsShowValidateMsg: function(selector, bol){
		       	 var $ele= $(selector);
		         $ele.data("isShowValidateMsg", bol);
		         if($ele.is("form")){
		         	$ele.find("input,select,textarea").data("isShowValidateMsg", bol);            	
		         }
	        }	
	};
	
	return jqValidator;
});