define(['jquery','basemodule','datePicker','tooltip','prompt'],function($,basemodule) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/controls/prompt.vc',
			title:'提示控件'
		},
		events:{
			init:function(){
				// 成功
				$('#prompt_success').on('click',function(e){
					prompt("成功按钮","success");
				});
				
				// 失败
				$('#prompt_danger').on('click',function(e){
					prompt("失败按钮","danger");
				});
				
				// 警告
				$('#prompt_warning').on('click',function(e){
					prompt("警告按钮","warning");
				});
				
				// 默认
				$('#prompt_info').on('click',function(e){
					prompt("默认提醒");
					// 或者使用下面形式均可调用默认提示框
					// prompt("默认提醒","info");
				});
			}
		}
	});
});
