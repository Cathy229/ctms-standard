define(['jquery'],function($){
	var _stringFormatExp = /{{|}}|{(\d+)}/gi;
    var KEYCODE_CHAR_TABLE = {
        106:'*',107:'+', 109:'-', 110:'`', 111:'/', 186:';', 187:'=', 188:',', 189:'-', 190:'.', 191:'/', 192:'`', 219:'[', 220:'\\', 221:']', 222:"'"
    };

    var dateRegexForText = new RegExp("^((\\d{1,4})[^\\da-zA-Z]+(\\d{1,2})[^\\da-zA-Z]+(\\d{1,2}))((T|[^\\da-zA-Z]+)(\\d{1,2})[^\\da-zA-Z]+(\\d{1,2})([^\\da-zA-Z]+(\\d{1,2}))?)?$");

    var dateFormatRex = new RegExp(/[yMmdhs]{1,4}/g);

	var _exs = [];

	var suggestBoxUtil ={
			throwException : function(ex){
				
				_exs.push(ex);
				var type = ex.type, handler;
				
				if($.type(type) == 'string'){

					handler = suggestBoxUtil.expHandlers[type];
					//if(handler == null) suggestBoxUtil.throwException('没有找到匹配的方法');
					//是否取消抛出异常
					if(handler != null && handler(ex) === false) return;
				}
				//$.error(ex);
				throw ex;
			},
			
	        /**
	         * 事件对象
	         * @param {Object} event
	         */
	        getEvent: function(event){
	            if (!event) 
	                event = window.event;
	            return event;
	        },
	        
			/**
	         * 根据事件获取目标dom对象
	         * @param {Object} event
	         */
	        getTargetByEvent: function(event){
	            event = suggestBoxUtil.getEvent(event);
				if(event instanceof jQuery.Event){ 
					return event.target||event.srcElement;
				}else if (suggestBoxUtil.checkBrowser().msie) {
	                return event.srcElement;
	            }else {
	                return event.target;
	            }
	        },
			
		       /*
	         <method name="suggestBoxUtil.isEmpty">
	         <summary>判断对象是否为空，或者空字符串</summary>
	         <param name="val" type="Any">
	         	判断的对象
	         </param>
	         <example>
	         <javascript>

	         alert(suggestBoxUtil.isEmpty('')); //true
	         alert(suggestBoxUtil.isEmpty(null)); //true
	         alert(suggestBoxUtil.isEmpty(' ')); //false
	         alert(suggestBoxUtil.isEmpty({})); //false
	         alert(suggestBoxUtil.isEmpty([])); //false
	         </javascript>
	         </example>
	         <returns type="Boolean">返回判断结果</returns>
	         </method>
	         */
			isEmpty:function(val){
				if(val == null || val.valueOf() === '') return true;
				
				return false;
			},

	        /*
	         <method name="suggestBoxUtil.format">
	         <summary>根据占位符格式化字符串</summary>
	         <param name="str" type="String">
	            要格式化的字符串，如：var str = "test{0}";
	         </param>
	         <param name="args" type="Any">
	            要替换的值
	         </param>
	         <example>
	         <javascript>
	         var str = "根据{0}格式化{1}";
	         alert(suggestBoxUtil.format(str, '占位符', '字符串')); //根据占位符格式化字符串
	         </javascript>
	         </example>
	         </method>
	         */
	        format:function(str){

	            var exp = _stringFormatExp, index, args = arguments;

	            return str.replace(exp, function($1, $2) {
	                switch ($1) {
	                    case "{{" :
	                        return "{";
	                        break;
	                    case "}}" :
	                        return "}";
	                        break;
	                    default :
	                        index = parseInt($2);
	                        return args[index + 1];
	                }
	            });
	        },
			
	        /*
	         <method name="suggestBoxUtil.get">
	         <summary>根据ID获取元素并转换为jqueryObject，简化$('#id')的写法</summary>
	         <param name="id" type="String,Element">
	            要查询的元素ID，id前不需要加#
	         </param>
	         <returns type="jqueryObject">返回封装后的对象</returns>
	         <example>
	         <html>
	            <input type="text" id="name" />
	         </html>
	         <javascript>
	            var box = suggestBoxUtil.get('name');
	         </javascript>
	         </example>
	         </method>
	         */
			get :function(id){
				return $.type(id) == 'string' ?$('#' + id): $(id);
			},
			
	        /*
	         <method name="suggestBoxUtil.emptyToDef">
	         <summary>判断对象是否为空，或者空字符串，如果是true则返回默认值</summary>
	         <param name="val" type="Any">
	         要判断的对象
	         </param>
	         <param name="defVal" type="Any">
	         默认值
	         </param>
	         <example>
	         <javascript>

	         alert(suggestBoxUtil.emptyToDef(''， 'default')); //'default'
	         alert(suggestBoxUtil.emptyToDef(null, 1)); //1
	         alert(suggestBoxUtil.emptyToDef(' ', 1)); //' '
	         </javascript>
	         </example>
	         <returns type="Boolean">返回默认值或判断的值</returns>
	         </method>
	         */
			emptyToDef:function(val, defVal){
				if(val == null || val === '') return defVal;
				
				return val;
			},
			
	        /*
	         <method name="suggestBoxUtil.getPropertyValue">
	         <summary>取得对象的属性值</summary>
	         <param name="obj" type="Object">
	            要取值的对象
	         </param>
	         <param name="propName" type="String">
	            要获取的属性
	         </param>
	         <example>
	             <javascript>
	                var obj = {a:{b:{c:1}}};

	                alert(suggestBoxUtil.getPropertyValue(obj, "b.c"));  //1
	             </javascript>
	         </example>
	         <returns type="any">返回属性名称对应的值</returns>
	         </method>
	         */
	        getPropertyValue:function(obj, propName){

	            var temp = propName.split('.'), curr, result = [];
	            curr = obj;
	            $.each(temp, function () {
	                curr = curr[this];
	                if(curr == null) return false;
	            });

	            return curr;
	        },
	        
	        /*
	         <method name="suggestBoxUtil.reverseListPropertyValues">
	         <summary>将集合中的值反向填充到集合对象中</summary>
	         <param name="propName" type="String">
	            要赋值的属性名，支持N级属性
	         </param>
	         <param name="vals" type="Array">
	         属性值集合，vals的长度必须和list的长度一样
	         </param>
	         <param name="list" type="Array">
	         要遍历赋值的数组对象
	         </param>
	         <example>
	         <javascript>
	         var ar = [{a:1, b:{c:2}}, {a:2, b:{c:3}}, {a:3, b:{c:4}}]
	         var vals = [1,1,1];
	         alert(suggestBoxUtil.getListPropertyValues(ar, "b.c"));  //[2,3,4]
	         suggestBoxUtil.reverseListPropertyValues("b.c", vals, ar);
	         alert(suggestBoxUtil.getListPropertyValues(ar, "b.c")); //[1,1,1]
	         </javascript>
	         </example>
	         <returns type="Array">返回修改后的数组对象</returns>
	         </method>
	         */
//	        reverseListPropertyValues:function(propName, vals, list){
//	            if(list == null) list = [];
//
//	            var row, depthNames = propName.split('.'), curr, depthCount = depthNames.length - 1;
//	            $.each(vals, function(index, val){
//
//	                row = list[index];
//	                if(row == null) {
//	                    row = {};
//	                    list.push(row);
//	                }
//
//	                curr = row;
//	                $.each(depthNames, function(depth, name){
//
//	                    if(depth == depthCount) return false;
//	                    if(curr[name] == null) curr[name] = {};
//	                    curr = curr[name];
//	                });
//
//	                curr[depthNames[depthCount]] = val;
//	            });
//
//	            return list;
//	        },
	       
		    /*
	        <method name="suggestBoxUtil.bindFirst">
	        <summary>将events事件绑定到元素$t的第一个触发队列</summary>
	        <param name="$el" type="jQueryObject">
	            要绑定的元素
	        </param>
	        <param name="events" type="String">
	            事件类型
	        </param>
	        <param name="handler" type="Function">
	            事件处理方法
	        </param>
	        <example>
	        <javascript>

	            $('#id').bind('click', function(){
	                alert('bind');
	            });
	            suggestBoxUtil.bindFirst($('#id'), 'click', function(){
	                alert('firstBind');
	            });

	            $('#id').click(); // alert('firstBind');
	        </javascript>
	        </example>
	        <returns type="jQueryObject">返回jQueryObject对象</returns>
	        </method>
	        */
	        bindFirst:function($el, events, handler){

	            $el.bind(events, handler);
	            var types = events.split(' ');

	            $.each(types, function(){
//	                var events = $el.data('events')[this];
	                var events=$._data($el[0],'events')[this];

	                if(events.length > 1){
	                    var handler = events.pop();

	                    events.unshift(handler);
	                }
	            });
	            return $el;
	        },
	        /*
	         <method name="suggestBoxUtil.indexOfProp">
	         <summary>根据item和propName获取数据中的项所在位置</summary>
	         <param name="array" type="Array">
	         要操作的数组
	         </param>
	         <param name="item" type="Object">
	         要匹配的对象
	         </param>
	         <param name="propName" type="String">
	         要匹配的属性，支持N级属性
	         </param>
	         <returns type="Number">返回匹配对象所在的索引，若为-1则是不存在</returns>
	         <example>

	         <javascript>

	         var ar = [{a:1, b:{c:2}}, {a:1, b:{c:3}}];

	         suggestBoxUtil.indexOfProp(ar, ar[0]);//0
	         suggestBoxUtil.indexOfProp(ar, {b:{c:3}}, "b.c");//1
	         </javascript>
	         </example>
	         </method>
	         */
	        indexOfProp:function(array, item, propName){
	            if(propName == null){
	                return array.indexOf(item);
	            }
	            else{
	                var val1, val2, _index = - 1;
	                $.each(array, function(index){

	                    val1 = suggestBoxUtil.getPropertyValue(this, propName);
	                    val2 = suggestBoxUtil.getPropertyValue(item, propName);

	                    if(val1 == val2){
	                        _index = index;
	                        return false;
	                    }
	                })

	                return _index;
	            }
	        },
	        
	        //判断浏览器版本
	        checkBrowser:function() {
	        	matched = suggestBoxUtil.browserMatch(navigator.userAgent);
	        	browser = {};

	        	if ( matched.browser ) {
	        		browser[ matched.browser ] = true;
	        		browser.version = matched.version;
	        	}

	        	// Chrome is Webkit, but Webkit is also Safari.
	        	if ( browser.chrome ) {
	        		browser.webkit = true;
	        	} else if ( browser.webkit ) {
	        		browser.safari = true;
	        	}

	        	return browser;
	        },
	        browserMatch: function(ua) {
	        	ua = ua.toLowerCase();

	        	var match = /(chrome)[ \/]([\w.]+)/.exec( ua ) ||
	        		/(webkit)[ \/]([\w.]+)/.exec( ua ) ||
	        		/(opera)(?:.*version|)[ \/]([\w.]+)/.exec( ua ) ||
	        		/(msie) ([\w.]+)/.exec( ua ) ||
	        		ua.indexOf("compatible") < 0 && /(mozilla)(?:.*? rv:([\w.]+)|)/.exec( ua ) ||
	        		[];

	        	return {
	        		browser: match[ 1 ] || "",
	        		version: match[ 2 ] || "0"
	        	};
	        },
	        /*
	         <method name="suggestBoxUtil.removeItem">
	         <summary>根据item和propName移除数据中的项</summary>
	         <param name="array" type="Array">
	            要操作的数组
	         </param>
	         <param name="item" type="Object">
	            要匹配移除的对象
	         </param>
	         <param name="propName" type="String">
	         要匹配的属性，支持N级属性
	         </param>
	         <example>

	         <javascript>

	            var ar = [{a:1, b:{c:2}}, {a:1, b:{c:3}}];

	            suggestBoxUtil.removeItem(ar, ar[0]);//[{a:1, b:{c:3}]
	            suggestBoxUtil.removeItem(ar, {b:{c:3}}, "b.c");//[]
	         </javascript>
	         </example>
	         </method>
	         */
	        removeItem:function(array, item, propName){

	            var index;
	            if(propName == null){
	                index = array.indexOf(item);
	            }
	            else{
	                index = suggestBoxUtil.indexOfProp(array, item, propName);
	            }
	            if(index == -1) return;
	            array.splice(index, 1);
	        },
	        
	        /*
	         <method name="suggestBoxUtil.getListPropertyValues">
	         <summary>取得集合中每个对象的属性值</summary>
	         <param name="list" type="Array">
	            要遍历取值的数组
	         </param>
	         <param name="propName" type="String">
	            要获取的属性
	         </param>
	         <example>
	         <javascript>
	         var ar = [{a:1, b:{c:2}}, {a:2, b:{c:3}}, {a:3, b:{c:4}}]

	         alert(suggestBoxUtil.getListPropertyValues(ar, "b.c"));  //[2,3,4]
	         </javascript>
	         </example>
	         <returns type="Array">返回获取到的值的集合</returns>
	         </method>
	         */
	        getListPropertyValues:function(list, propName){
	            if (propName == null) return list;

	            var result = [];
	            $.each(list, function () {
	                result.push(suggestBoxUtil.getPropertyValue(this, propName));
	            });
	            return result;
	        },
	        
	        formatDate: function (date, format) { //格式化日期
	            format = format || 'yyyy-MM-dd hh:mm:ss';
	            var result = format.match(dateFormatRex);
	            var text = format;

	            for (var i = 0; i < result.length; i++) {

	                var exp = result[i];
	                text = text.replace(exp, suggestBoxUtil.getDatePart(date, exp));
	            }

	            return text;
	        },
	        
	        parseDate: function (str) {

	            var value = dateRegexForText.exec(str);

	            if (value == null) throw suggestBoxUtil.format('cant parse str “{0}” to datetime', str);

	            var year = value[2] || 0, month = value[3] || 0, day = value[4] || 0, hour = value[7] || 0, minute = value[8] || 0, second = value[10] || 0;

	            date = new Date(year, parseInt(month) - 1, day, hour, minute, second);

	            return date;
	        },
	        
			throwConvertException:function(type, val, format){
				
				var ex = {
					type:'convert',
	                message:suggestBoxUtil.format('cant convert “{0}” to type “{1}”', val.toString(), type),
					context :{
						type:type,
						val:val
					}
				};
				
				suggestBoxUtil.throwException(ex);
			},
		     getDatePart: function (date, part) {//根据part取得时间的部分值

		            var value;
		            if (suggestBoxUtil.isEmpty(date)) return '';
		            switch (part) {
		                case 'yyyy':
		                case 'yyy':
		                case 'yy':
		                case 'y':
		                    value = date.getFullYear();
		                    break;
		                case "MM":
		                case "M":
		                    value = date.getMonth() + 1;
		                    break;
		                case "dd":
		                case "d":
		                    value = date.getDate();
		                    break;
		                case "mm":
		                case "m":
		                    value = date.getMinutes();
		                    break;
		                case "hh":
		                case "h":
		                    value = date.getHours();
		                    break;
		                case "ss":
		                case "s":
		                    value = date.getSeconds();
		                    break;
		                default:
		                    return null;
		            }

		            value = value.toString();
		            while (value.length < part.length) value = '0' + value; //填充前置0

		            return value;
		        },
	};
	return suggestBoxUtil;
});
