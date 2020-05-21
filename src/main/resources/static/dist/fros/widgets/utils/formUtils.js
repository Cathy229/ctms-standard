define(['jquery','jqueryform'],function($){
	var formValues ={
			buildGridSearchFilterCondByForm:function(formid,context){
				var filterCond = [];
				var _this = this;
				var c = _this.getFormValuesBySelector("#"+formid,context);
				$.each(c,function(key,value){
					var type = "String";
					if(_this.isNotNull(value,true)){
						var elem = $('[name="'+key+'"]',$('#'+formid,context));
						var operator = '=';
						var fieldName = key;
						if(elem!=null && elem.push !=null){
							for(var i=0;i<elem.length;i++){
								var o = $(elem[i]).attr('operator');
								if(o!=null){
									operator = o;
									break;
								}
							}
							for(var i=0;i<elem.length;i++){
								var ft =$(elem[i]).attr('fieldType');
								if(ft!=null){
									type = ft;
									break;
								}
							}
							for(var i=0;i<elem.length;i++){
								var fn = $(elem[i]).attr('fieldName');
								if(fn!=null){
									fieldName = fn;
									break;
								}
							}
						}
						if(value instanceof Date){
							type = "Date";
							value = value.getTime();
						}else if(value instanceof Array){
							value = value.join(',');
						}
						var sqlCond = {fieldName:fieldName,operator:operator,fieldStringValue:value,fieldType:type};
                        filterCond.push(sqlCond);
					}
				});
				return filterCond;
			},
	
		 getFormValuesBySelector:function(selector,context){
			var _this = this;
			var fa = $(selector,context).formToArray();
			var o = _this.array2Json(fa);
			//FROS-96
			$(':checkbox',$(selector,context)).each(function(){
				var boxname = $(this).attr("name");
				var boxvalue =_this.getValue(o,boxname);
				var arrayFlag =$.isArray(boxvalue);
				if(boxvalue == undefined || boxvalue==null){
					_this.setValue(o, boxname,[]);
				}else if(arrayFlag==false){
					var arr = $.makeArray(boxvalue);
					o[boxname]=arr;
				}
			});
			return o;
		},

		array2Json:function(arr){
			var $this = this;
			var o = {};
			$.each(arr, function(i,val){      
				var name = val.name;
				var v = val.value;
				$this.setValue(o, name, v);
			  }); 
			return o;
		},

		setValue:function(obj,name,value){
			if(name && name.indexOf(".")>0){
				var valueArr = name.split(".");
				var attrname = valueArr[0];
				var newname = "";
				for(var i=1;i<valueArr.length;i++){
					newname += valueArr[i]+".";
				}
				newname = newname.substring(0,newname.length-1);
				if(obj[attrname]){
					
				}else{
					obj[attrname]={};
				}
				this.setValue(obj[attrname],newname,value);
			}else{
				if(obj[name]){
					//Array 处理
					if(obj[name].push){
						//Array
						obj[name].push(value);
					}else{
						//value to array
						var val = obj[name];
						var a = [];
						a.push(val);
						a.push(value);
						obj[name] = a;
					}
				}else{
					obj[name]=value;
				}
			}
		},
		getValue:function(obj,name){
			if(name && typeof(obj)==  'object' && obj!={}){
				if(name.indexOf(".")>0){
					var valueArr = name.split(".");
					var attrname = valueArr[0];
					var newname = "";
					for(var i=1;i<valueArr.length;i++){
						newname += valueArr[i]+".";
					}
					newname = newname.substring(0,newname.length-1);
					var newobj = obj[attrname];
					return this.getValue(newobj,newname);
				}else{
					return obj[name];
				}
			}else{
				return null;
			}
		},
		isNotNull:function(value,checknullstr){
			if(checknullstr){
				if(value!=null && value!='null' && value!=""&& value!=undefined){
					return true;
				}
			}else{
				if(value!=null && value!=""&& value!=undefined){
					return true;
				}
			}
			return false;
		},
		
		setFormValuesBySelector:function(selector,data,context){
			var $this= this;
			//不再依赖frostag
			var formElms = $(selector,context).find("input:text,input:password,textarea,input:checkbox,input:radio,input:hidden,select");
			formElms.each(function(){
				var name = $(this).attr('name');
				var $e = $(this);
				if(name){
					var value = $this.getValue(data,name);
					var tag = this.tagName.toLowerCase();
					var t = this.type;
					//如果name在data中没有定义，不做任何操作 2011-03-17
					if(value == undefined){
						if(t == 'radio' || t == 'checkbox'){
							this.checked = false;
						}else{
							$e.val('');
						}
						return true;
					}
					if(tag == 'select' && t != 'select-one'){
						return true; 
					}
					if (t == 'checkbox' )  {
						this.checked = false;
						if(value && value.push){
							for(var i=0;i<value.length;i++){
								if(value[i] == $e.val()){
									this.checked = true;
									break;
								}
							}
						}else{
							if(value == $e.val()){
								this.checked = true;
							}
						}
						return true;
					}
					if (t == 'radio') {
						this.checked = false;
						if($e.val() == value){
							this.checked = true;
						}
						return true;
					}
					if($e.attr('fieldtype') == 'date'){
						$e.val(value.substring(0, 10));
					}else{
						if(value == null){
							value = '';
						}
						$e.val(value);
					}
				}
			});
		},
		
		
	};
	return formValues;
});