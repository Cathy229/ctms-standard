define(['jquery','basemodule','datePicker','tooltip','bootstrapValidator'],function($,basemodule) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/controls/datedemo.vc',
			title:'日期控件'
		},
		events:{
			init:function(){
				var ctx = this.context;
				$("#intInput",ctx).datePicker({});
				
				$("#intInput2",ctx).datePicker({
					format:"datetime"
				});
				
				/**
                 * 表单验证
                 */
                $('#form', this.context).bootstrapValidator({
	                message: 'This value is not valid',
	                feedbackIcons: {
	                    valid: 'glyphicon glyphicon-ok',
	                    invalid: 'glyphicon glyphicon-remove',
	                    validating: 'glyphicon glyphicon-refresh'
	                },
	                fields: {
	                	intInput: {
                            validators: {
                                notEmpty: {
                                        message: '该输入项不能为空'
                                },
                                date : {  
                                    format : 'YYYY-MM-DD',  
                                    message : '日期格式不正确'  
                                } 
                            }
                        },
                        intInput2: {
                            validators: {
                                notEmpty: {
                                        message: '该输入项不能为空'
                                },
                                date : {  
                                    format : 'YYYY-MM-DD HH:mm:ss',  
                                    message : '日期时间格式不正确'  
                                } 
                            }
                        }
	                }
	            });
				
				
			}
		}
	});
});
