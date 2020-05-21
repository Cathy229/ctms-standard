var prompt = function(message, style) {
	if(style === undefined){
		style="alert-info";
	}else if(style == "success"){
		style="alert-success";
	}else if(style == "danger"){
		style = "alert-danger";
	}else if(style == "warning"){
		style = "alert-warning";
	}else{
		style = "alert-info";
	}
	$('<div>')
		.appendTo('body')
		.addClass('alert ' + style)
		.html(message)
		.show()
		.delay(2000)
		.fadeOut();
	setTimeout(function() {
		$(".alert." + style).remove();
	}, 2000);
};