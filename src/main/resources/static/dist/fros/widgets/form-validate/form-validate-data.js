define(['jquery','formUtils','formValidateBase','isExpressionRules','style!fros/widgets/form-validate/form-validate-base'],function ($,formUtils,formValidateBase,isExpressionRules){
	
	 handleformdata = {
			expressionFlag: true,
			throwValidException:function(validType, $el, val, config, message){
				var ex = {
					type:'valid',
                    message:message,
					context :{
						validType:validType,
						target:$el,
						val:val,
						config:config,
						message : message
					}
				};
				handleformdata.expressionFlag=false;
				formValidateBase.initValidateRules(ex);
//				formUtils.throwException(ex);
			},
            
            //验证方法
			validHandlers:{

				required:function($el, val, config){
					
					if(val == null || val == ''){
						handleformdata.throwValidException('required', $el, val, config, isExpressionRules.notNull.messageText);
					}
				},
				
				maxLength:function($el, val, config){
					
					if(formUtils.isEmpty(val)) return;					
					var cn = val.match(/[\u4e00-\u9fa5]/g);
					var cnLen = cn == null ? 0 : cn.length;
					var len = cnLen + val.length;
				//	var maxLen = $el.attr('valid-maxlength');
					var maxLen = config.maxLen;
					
					if(len > maxLen){
                        handleformdata.throwValidException('maxLength', $el, val, config, isExpressionRules.maxLength.messageText);
					}
				},
				//自定义验证 customExpression:'/^[0-9]*$/'
				customExpression:function($el, val, config){
					var reg =eval( config.expression);
					if(!reg.test(val)){
						handleformdata.throwValidException('customExpression', $el, val, config, isExpressionRules.customExpression.messageText);
					}
				},
				isEmail: function($el, val, config){
					var regex =isExpressionRules.email.regex;
					var messageText =isExpressionRules.email.messageText;
					var reg =eval(regex);
					if(!reg.test(val)){
						handleformdata.throwValidException('isEmail', $el, val, config, messageText);
					}
				},
				isNumber: function($el, val, config){
					var regex =isExpressionRules.isnumber.regex;
					var messageText =isExpressionRules.isnumber.messageText;
					var reg =eval(regex);
					if(!reg.test(val)){
						handleformdata.throwValidException('isNumber', $el, val, config, messageText);
					}
				}
				
			},
			
			validControl : function($el, val, config) {
				
				var validType = $el.attr('valid');
				if(formUtils.isEmpty(validType)) return;
				var valids = validType.split(','), handler;
				//
				handleformdata.throwValidException('', $el, val, config,'');
				handleformdata.expressionFlag=true;
				//遍历验证类型
				$.each(valids, function(index, validType){
					var index2=validType.indexOf(":");
					var length =validType.split(":");				
					if(length[0]=="maxLength"){
						config.maxLen=length[1];
					}
					if(index2>0){
						config.expression=eval(validType);
						validType=validType.substr(0,index2);
					}
					handler = handleformdata.validHandlers[validType];
					
					if(handler == null){
						formUtils.throwException('未找到验证类型');
					}
					
					handler($el, val, config);
					
				});
			},
			SubmitVerification: function (formId){
				var  $el, val,  config = {},flag = true;
				$form = formUtils.get(formId);
				$form.find(formUtils.format("[formname='{0}'],input,select,textarea", formId))
				.each(function(index, el) {
					$el = $(el);
					val =el.value;
					if(val !== undefined){
						try{
							handleformdata.validControl($el, val, config);
						}
						catch(e){ 
							flag = false; 					
						}
					}
				})
				if(flag == false) return;		
			},


            initChangeObject:function(objectData,schema){
            	handleformdata.defaults.oriFormData=objectData;
            	handleformdata.defaults.formSchema=schema;
            },
            buildArrayObject:function(ori, now, schema){
            	var newVal = {};
				var oriVal, nowVal,  flag = false;
				$.each(now, function(name, val){
					nowVal = val;
					oriVal = ori[name];
                    if($.isArray(oriVal || nowVal)){
                        var arraydata =   handleformdata.buildArrayObject(oriVal, nowVal, name);
						if(arraydata != null && arraydata != undefined){
							 newVal[name] =arraydata;
						}
                    }else if(oriVal != nowVal){
                        flag = true;
                        return false;
                    }
				})
                if(flag){
                    return now;
                }
                else return null;
            },
			buildChangeObject:function(ori, now, schema){

				var newVal = {};
				var oriVal, nowVal,  flag = false;

				$.each(now, function(name, val){
					
					nowVal = val;
					oriVal = ori[name];

                    if($.isArray(oriVal || nowVal)){
                        var arraydata =   handleformdata.buildArrayObject(oriVal, nowVal, name);
						if(arraydata != null && arraydata != undefined){
							 newVal[name] =arraydata;
						}
                      
                    }
                    else if(oriVal != nowVal){

                            flag = true;
                            if(nowVal == null || nowVal == undefined){
                                newVal[name] = null;
                            }
                            else{
                                newVal[name] = nowVal;
                            }
                    }

                    delete ori[name];
                    delete now[name];
				});

                if(flag){
                    return newVal;
                }
                else return null;
			},
		};

	 handleformdata.defaults = {
		validSingle:true,
		validShow: handleformdata.validShowAlert,
		validHide: null,
	    checkboxValueType:'string',
	    updateSuccessMessage:'提交成功',
	    oriFormData:null,
	    formSchema:null,
	};

	$.extend(formUtils.expHandlers, {
		valid:function(ex){

			var config = ex.context.config;

			if(config.validShow){
				config.validShow(ex);
			}
			else{
				throw ex.message;
			}
			
            
		}
	});

	 return handleformdata;
});