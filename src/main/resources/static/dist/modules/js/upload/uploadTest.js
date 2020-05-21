define(['jquery','basemodule','uploadControl'],function($,basemodule) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/upload/uploadTest.vc',
			title:'上传'
		},
		events:{
			init:function(){
				var type = 'blob';
				var $ctl = $("#openBtn",this.context);
				
				/**
				 * 自定义参数 
				 */
				function myParam(){
					return "buesinessType=123,p1=123";
				}
				
				$ctl.uploadControl({
					//uploadUrl:"MultiFilesUploadServlet?type=file",
					//statusUrl:"FileUploadStatusServlet",
					uploadUrl:"file/upload.vc?type=" + type,
					statusUrl:"file/uploadStatus.vc",
					showStatus:true,
					getExtraParam:myParam
				});
				
				$ctl.on("checkFile",function(event,fileName,c){
					if((fileName.indexOf('png')==-1) && (fileName.indexOf('jpg')==-1)){
						alert('只能选择PNG/JPG文件');
						event.preventDefault();
					}
				});
				
				$ctl.on("succussUpload", function(event,ret,params){
					if (typeof(params) == 'undefined') return; 
					
					// type=blob时params的值为所有保存的文件id集合,example:[6c3f81b3-51f8-4d5e-b72a-e9ff76882552,7c3f81b3-51f8-4d5e-b72a-e2ff76772872],type=file时,["D:\img\1.png", "D:\img\2.png"]
					var requestParams = 'imgPath';
					if (type == 'blob') requestParams = 'imgId';
					
					var imgContainerHtml = '';
					for(var i=0; i<params.length; i++){
						var imgPath = params[i];
						// 1.request img
						var imgUrl = 'file/showImage.vc?'+requestParams+'='+imgPath;
						imgUrl = encodeURI(encodeURI(imgUrl)); // 页面上进行两次编码操作，这样后台自动的那次就可以抵消掉一次  
						imgContainerHtml += '<img src="'+imgUrl+'">';
						// Note:若需要在数据库中保存图片信息，可通过ajax请求将imgPath发送给相关manager
					}
					$("#imgContainer", this.context).html(imgContainerHtml);
					return;
					
				});
				
				$ctl.on('failUpload',function(event,ret,params){
					alert('上传失败！');
				});
				
			}
		}
	});
});