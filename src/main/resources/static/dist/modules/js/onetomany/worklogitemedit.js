define(['jquery','basemodule','dialog','service','formValues','tooltip','frosBootstrapValidator'],function($,basemodule,dialog,service,FormUtil) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/onetomany/worklogitemedit.vc',
			title:'工作日志编辑',
			isDailog:true
		},
		dialogopt:{
			modal:true,
			width:680,
			height:300
		},
		events:{
			init:function(){
				var ctx = this.context;
				var module = this;
				
				$('#worklogitemForm #attribute4', ctx).datePicker({});
				$('#worklogitemForm #attribute5', ctx).datePicker({});
				
				// Note:尽量将bootstrapValidator方法写在其他控件代码的后面 
				$('#worklogitemForm', this.context).bootstrapValidator({
			        message: 'This value is not valid',
			        feedbackIcons: {
			            valid: 'glyphicon glyphicon-ok',
			            invalid: 'glyphicon glyphicon-remove',
			            validating: 'glyphicon glyphicon-refresh'
			        },
			        fields: {
			        	attribute1: {
			        		validators: {
			        			notEmpty: {
			        				message: '该字段不能为空'
			        			}
			        		}
			        	},
			        	attribute4: {
			                validators: {
			                    notEmpty: {
			                        message: '该字段不能为空'
			                    },
			                    date: {
			                    	message:'该字段必须为日期格式'
			                    }
			                }
			            },
			            attribute5: {
			                validators: {
			                    notEmpty: {
			                        message: '该字段不能为空'
			                    },
			                    date: {
			                    	message:'该字段必须为日期格式'
			                    }
			                }
			            },
			            attribute7: {
			            	validators: {
			            		numeric: {
			            			message: '该字段必须是数字'
			            		}
			            	}
			            },
			            content: {
			            	validators: {
			            		stringLength: {
			            			min: 1,
			            			max: 300,
			            			message: '该字段长度应该1-300之间'
			            		}
			            	}
			            }
			        }
			    });
				
				$('#saveData',ctx).bind('click',function(){
					var bootstrapValidator = $('#worklogitemForm', this.context).data('bootstrapValidator');
					bootstrapValidator.validate();
					if(bootstrapValidator.isValid()){
						var model = FormUtil.getFormValuesBySelector("#worklogitemForm",ctx);
						var dtd = service.service("FJWORKLOGITEMMANAGER_SAVE",{model:model});
						dtd.done(function(newModel){
							alert("保存成功");
							dialog.close(module);
							require(["modules/js/onetomany/worklogtabedit"],function(m){
								m.refreshGrid();
							});
						});
					} else {
						return false;
					}
					
			 	});
			}
		},
		addInit:function(worklogId){
			$("#worklogitemWorklogId", this.context).val(worklogId);
		},
		edit:function(id){
			$('#id',this.context).val(id);
			// 为表单赋值
			var dtd = service.service("FJWORKLOGITEMMANAGER_GET",{id:id});
			dtd.done(function(model){
				FormUtil.setFormValuesBySelector($('#worklogitemForm'), model, this.context);
			});
		}
	});
});