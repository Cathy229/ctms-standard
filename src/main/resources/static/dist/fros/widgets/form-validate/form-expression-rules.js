define(['jquery'],function($){
   return $.expRules = {
		   email: {
				regex:"/^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$/",
				messageText: "E-mail格式错误"
			},
			//非空验证
			notNull:{
				messageText: "输入框不可为空"
			},
			//长度验证
			maxLength:{
				messageText: "输入长度不可超过5个字符，汉字按两个字符算"
			},
			//数字验证
			isnumber:{
				regex:"/^[0-9]*$/",
				messageText: "请输入数字"
			},
			isconvert:{
				messageText:"数据格式不正确，无法转换"
			},
			//自定义验证
			customExpression:{
				messageText: "数据格式不正确"
			}
    };
})

