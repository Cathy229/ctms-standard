define(['jquery','basemodule','formValues','AjaxProxy','dialog','service','fmatter','datagrid','tooltip','frosBootstrapValidator'],function($,basemodule,FormUtil,AjaxProxy,dialog,service) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/validatorDemo/demo1.vc',
			title:'表单验证demo2'
		},
		events:{
			init:function(){
				// form validation
				// form validation
			    $('#defaultForm', this.context).bootstrapValidator({
			        message: 'This value is not valid',
			        feedbackIcons: {
			            valid: 'glyphicon glyphicon-ok',
			            invalid: 'glyphicon glyphicon-remove',
			            validating: 'glyphicon glyphicon-refresh'
			        },
			        fields: {
			            firstName: {
			                container: '#firstNameMessage',
			                validators: {
			                    notEmpty: {
			                        message: '姓氏不能为空'
			                    }
			                }
			            },
			            lastName: {
			                container: '.lastNameMessage',
			                validators: {
			                    notEmpty: {
			                        message: '名称不能为空'
			                    }
			                }
			            },
			            username: {
			                message: 'The username is not valid',
			                validators: {
			                    notEmpty: {
			                        message: '用户名不能为空'
			                    },
			                    stringLength: {
			                        min: 6,
			                        max: 30,
			                        message: '用户名长度必须6-30之间'
			                    }
			                }
			            }
			        },
			        submitHandler: function(validator, form, submitButton) {
			            alert("验证通过");
			        }
			    });
			},
			onShow:function(){
//				alert("show app1");
			}
		}
		
	});
});