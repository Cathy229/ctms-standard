define([],function() {
	return {
		extend : function(target, params) {
	        target = target || {};
	        for (var prop in params) {
	            target[prop] = params[prop];
	        }
	        return target;
	    },
	    defineClass : function() {
	        //构造体
	        var Class = function() {
	            this.initialize.apply(this, arguments);
	        };
	        var extended = {};
	        var parent, superclass;
	        for (var index = 0, len = arguments.length; index < len; index++) { 
	            if (typeof arguments[index] == "function") {
	                // 如果有父类  
	                if (index == 0 && len > 1) {
	                    var initialize = arguments[index].prototype.initialize;
	                    arguments[index].prototype.initialize = function() {};
	                    extended = new arguments[index]();
	                    if (initialize === undefined) {
	                        delete arguments[index].prototype.initialize;
	                    } else {
	                        arguments[index].prototype.initialize = initialize;
	                    }
	                    superclass = arguments[index];
	                    continue;
	                }
	                parent = arguments[index].prototype;
	            } else {
	                // 如果为顶层基类
	                parent = arguments[index];
	            }
	            this.extend(extended, parent);
	        }
	        Class.prototype = extended;
	        Class.superclass = superclass;
	        return Class;
	    }
	}
});