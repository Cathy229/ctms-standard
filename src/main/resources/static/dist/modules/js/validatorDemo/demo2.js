define(['jquery','basemodule','formValues','AjaxProxy','dialog','service','fmatter','datagrid','tooltip','frosBootstrapValidator'],function($,basemodule,FormUtil,AjaxProxy,dialog,service) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/validatorDemo/demo2.vc',
			title:'表单验证demo2'
		},
		events:{
			init:function(){
				// form validation
			    $('#defaultForm', this.context).bootstrapValidator({
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