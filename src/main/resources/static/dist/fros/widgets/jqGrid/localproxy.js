define(['jquery','underscore','classutil','formUtils'],function($,_,util,formUtils){
	var LocalDataProxy = util.defineClass({
//		grid:null,
//		data:[],
		afterLoadData:function(){},
		initialize: function(options){
			this.data = options.data;
		},
		loadData:function(queryInfo){
			var queryFields=queryInfo.queryFields;
			var result = this.data;
			if(queryFields!=undefined&&queryFields!=null && queryFields.length > 0){
				result = _.filter(result, function(obj,num,arr){
					var flag = true;
					$.each(queryFields, function(index, queryField){
						// 遍历所有条件，任一一个条件不符合则返回false，所有条件都符合才返回true
						var fieldName = queryField.fieldName;
						var fieldStringValue = queryField.fieldStringValue;
						var queryVal=formUtils.getPropertyValue(obj,fieldName);
						try{
							if(fieldStringValue!=""){
								var fieldRp=new RegExp(fieldStringValue);
								if(!fieldRp.test(queryVal)){
									flag = false;
									return false;
								}
							}
						}catch(e){
							console.log(e);
						}
					});
					return flag;
				});
			}

			//sort
			if(queryInfo.orderBy!=undefined &&queryInfo.orderBy!=null){
				var fieldName = queryInfo.orderBy.split(" ")[0];
				result = _.sortBy(result,function(row){
					return row[fieldName];
				});
				if(queryInfo.orderBy.split(" ")[1]=='desc'){
					result = result.reverse();
				}
			}
			var totalRows = result.length;
			//paging
			if(queryInfo.pagingInfo!=undefined &&queryInfo.pagingInfo!=null){
				var pi = queryInfo.pagingInfo;
				var cp = pi.currentPage;
				var pageSize = pi.pageSize;
				//get data
				result = _.filter(result, function(obj,num,arr){ 
					return num>=pageSize*(cp-1) && num<pageSize*cp;
				});
			}
			var queryData = {};
			queryData.dataList = result;
			queryData.pagingInfo=queryInfo.pagingInfo;
			queryData.pagingInfo.totalRows = totalRows;
			queryData.pagingInfo.totalPages =Math.ceil(totalRows / queryInfo.pagingInfo.pageSize);
			var dtd = $.Deferred();
			dtd.resolve(queryData);
			return dtd;

		},
		loadData1:function(queryInfo){
			var queryFields=queryInfo.queryFields;
			var result = this.data;
			var result1 = this.data;
			var fieldName=queryFields.fieldName;
			var operator=queryFields.operator;
			var fieldStringValue=queryFields.fieldStringValue;

			if(fieldName!=undefined&&fieldName!=null){

				result = _.filter(result, function(obj,num,arr){ 
					var flag=false;
						$.each(fieldName, function(i){
							var queryVal=formUtils.getPropertyValue(obj,fieldName[i]);
							try{
								if(fieldStringValue!=""){
									var fieldRp=new RegExp(fieldStringValue);
									if(fieldRp.test(queryVal)){
										flag=true;
									}
										
								}else{
									flag=true;
								}
							}catch(e){
								
							}
	                    });
						return flag;
				});
			}

			if(queryInfo.orderBy!=undefined &&queryInfo.orderBy!=null){
				var fieldName = queryInfo.orderBy.split(" ")[0];
				result = _.sortBy(result,function(row){
					return row[fieldName];
				});
				if(queryInfo.orderBy.split(" ")[1]=='desc'){
					result = result.reverse();
				}
			}
			var totalRows = result1.length;
			//paging
			if(queryInfo.pagingInfo!=undefined &&queryInfo.pagingInfo!=null){
				var pi = queryInfo.pagingInfo;
				var cp = pi.currentPage;
				var pageSize = pi.pageSize;

				result = _.filter(result, function(obj,num,arr){ 
					return num>=pageSize*(cp-1) && num<pageSize*cp;
				});
			}
			var queryData = {};
			queryData.dataList = result1;
			queryData.dataListquery= result;
			queryData.pagingInfo=queryInfo.pagingInfo;
			queryData.pagingInfo.totalRows = totalRows;
			queryData.pagingInfo.totalPages =Math.ceil(totalRows / queryInfo.pagingInfo.pageSize);
			return queryData;

		}
	});
	return LocalDataProxy;
});