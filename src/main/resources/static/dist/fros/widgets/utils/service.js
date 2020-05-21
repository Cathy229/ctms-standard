define(['jquery','json'],function($) {
	return {
		service:function(serviceName,params){
			var baseUrl = require.toUrl("MYFLAG");
			baseUrl = baseUrl.substring(0,baseUrl.indexOf("MYFLAG") - 5);//必须是dist
			var serviceUrl = baseUrl+'service/'+serviceName;
			if(params == null || params == undefined){
				params = {};
			}
			var jsonparam = JSON.stringify(params);
			var request = $.ajax({
				type: "POST",
				//datatype : "application/json",
			    contentType: "text/plain",
				url:serviceUrl,
				data:jsonparam
			});
			var dtd = $.Deferred();
			var getting = request;
			getting.done(function(data) {
				if(data!=null && data !="error"){
					var pkg = JSON.parse(data);
					if (pkg.isSuccess == "0") {
						//TODO:
						//Fros Security Handle code
						alert("login");
						dtd.reject();
					} else {
						//正常请求处理，结合FacadeController
						if(pkg.isSuccess == "Y"){
							var realData = pkg.data;
							dtd.resolve(realData);
//							if(realData.indexOf("{") == 0 ||realData.indexOf("[") == 0){
//								dtd.resolve(JSON.parse(realData));
//							}else{
//								dtd.resolve(realData);
//							}
						}else{
							//TODO:展示错误信息
							dtd.reject(pkg.errormsg);
						}
						
					}
				}else{
					
				}
				
			});
			getting.fail(function(jqXHR, statusText, error) {
				if (jqXHR.status == 403) {
					//TODO:
					alert("Unauthentication");
				}else{
//					alert(statusText);
					dtd.reject(statusText);
				}
			});
			return dtd;
		},
		remoteService:function(serviceUrl,params){
			if(params == null || params == undefined){
				params = {};
			}
			var jsonparam = JSON.stringify(params);
			var dtd = $.ajax({
				url:serviceUrl,
				data:{serviceParam:jsonparam},
				crossDomain: true, 
				dataType:"jsonp"
			});
		}
	};
});
