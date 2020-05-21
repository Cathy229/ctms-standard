$("#ajaxBtn").on("click",function(event){
	alert("go");
});

$(function () {  //生成验证码
    $('#kaptchaImage').click(function () {
        $(this).hide().attr('src', '/kaptcha.jpg?' + Math.floor(Math.random() * 10000)).fadeIn();
    });
});

function changeCode() {  //刷新
    $('#kaptchaImage').hide().attr('src', '/kaptcha.jpg?' + Math.floor(Math.random() * 10000)).fadeIn();
    event.cancelBubble = true;
}