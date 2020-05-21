define(['jquery','basemodule'],function($,basemodule) {
	return $.extend(true,{},basemodule,{
		opt:{
			isDailog:true,
			custom:true,
			title:'自定义模版'
		},
		createCustomHtml:function(){
			return "<span style='color:red'>ABC</span>";
		}
	});
});