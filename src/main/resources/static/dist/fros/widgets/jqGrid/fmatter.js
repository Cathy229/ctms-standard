define(['jquery','third-party/jqGrid/src/grid.base'],function($){
	$.fmatter = {};
	$.extend($.fmatter,{
		isBoolean : function(o) {
			return typeof o === 'boolean';
		},
		isObject : function(o) {
			return (o && (typeof o === 'object' || $.isFunction(o))) || false;
		},
		isString : function(o) {
			return typeof o === 'string';
		},
		isNumber : function(o) {
			return typeof o === 'number' && isFinite(o);
		},
		isValue : function (o) {
			return (this.isObject(o) || this.isString(o) || this.isNumber(o) || this.isBoolean(o));
		},
		isEmpty : function(o) {
			if(!this.isString(o) && this.isValue(o)) {
				return false;
			}
			if (!this.isValue(o)){
				return true;
			}
			o = $.trim(o).replace(/\&nbsp\;/ig,'').replace(/\&#160\;/ig,'');
			return o==="";	
		},
		formatDate:function(format, date, settings) {
			var monthNames= ['January','February','March','April','May','June','July','August','September','October','November','December']; // Names of months for drop-down and formatting
			var monthNamesShort = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']; // For formatting
			var dayNames= ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']; // For formatting
			var dayNamesShort=['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat']; // For formatting
			if (!date)
				return '';
			// Check whether a format character is doubled
			var lookAhead = function(match) {
				var matches = (iFormat + 1 < format.length && format.charAt(iFormat + 1) == match);
				if (matches)
					iFormat++;
				return matches;
			};
			// Format a number, with leading zero if necessary
			var formatNumber = function(match, value, len) {
				var num = '' + value;
				if (lookAhead(match))
					while (num.length < len)
						num = '0' + num;
				return num;
			};
			// Format a name, short or long as requested
			var formatName = function(match, value, shortNames, longNames) {
				return (lookAhead(match) ? longNames[value] : shortNames[value]);
			};
			var output = '';
			var literal = false;
			if (date)
				for (var iFormat = 0; iFormat < format.length; iFormat++) {
					if (literal)
						if (format.charAt(iFormat) == "'" && !lookAhead("'"))
							literal = false;
						else
							output += format.charAt(iFormat);
					else
						switch (format.charAt(iFormat)) {
							case 'd':
								output += formatNumber('d', date.getDate(), 2);
								break;
							case 'D':
								output += formatName('D', date.getDay(), dayNamesShort, dayNames);
								break;
							case 'o':
								output += formatNumber('o',
									(date.getTime() - new Date(date.getFullYear(), 0, 0).getTime()) / 86400000, 3);
								break;
							case 'M':
								output += formatNumber('M', date.getMonth() + 1, 2);
								break;
	//						case 'M':
	//							output += formatName('M', date.getMonth(), monthNamesShort, monthNames);
	//							break;
							case 'y':
								output += (lookAhead('y') ? date.getFullYear() :
									(date.getYear() % 100 < 10 ? '0' : '') + date.getYear() % 100);
								break;
							case 'h':
								output += formatNumber('h',date.getHours(),2);
								break;
							case 'm':
								output += formatNumber('m',date.getMinutes(),2);
								break;
							case 's':
								output += formatNumber('s',date.getSeconds(),2);
								break;
							case '@':
								output += date.getTime();
								break;
							case '!':
								//output += date.getTime() * 10000 + this._ticksTo1970;
								break;
							case "'":
								if (lookAhead("'"))
									output += "'";
								else
									literal = true;
								break;
							default:
								output += format.charAt(iFormat);
						}
				}
			return output;
		}
	});
	$.fn.fmatter = function(formatType, cellval, opts, rwd, act) {
		// build main options before element iteration
		var v=cellval;
		opts = $.extend({}, $.jgrid.getRegional(this, 'formatter') , opts);

		try {
			v = $.fn.fmatter[formatType].call(this, cellval, opts, rwd, act);
		} catch(fe){
			throw fe;
		}
		return v;
	};
	function formatDate(format, date, settings) {
		if (!date)
			return '';
		var output = date.substring(0, format.length+2);
		return output;
	};
	$.extend($.fn.fmatter , {
	    dateFmatter : function(cellvalue, options, rowdata,act) {
	    	if($.fmatter.isObject(cellvalue)){
	    		return $.fmatter.formatDate('yy-MM-dd',cellvalue,null)
	    	}
	    	if(cellvalue!=null && cellvalue != ''){
	    		return formatDate('yy-MM-dd',cellvalue,null);
	    	}else{
	    		return '';
	    	}
		},
		datetimeFmatter : function(cellvalue, options, rowdata,act) {
	    	if($.fmatter.isObject(cellvalue)){
	    		return $.fmatter.formatDate('yy-MM-dd hh:mm:ss',cellvalue,null);
	    	}
	    	if(cellvalue!=null && cellvalue != ''){
	    		return formatDate('yy-MM-dd hh:mm:ss',cellvalue,null);
	    	}else{
	    		return '';
	    	}
	    	return cellvalue;
		},
		selectCode:function(cellvalue, options, rowdata,act) {
			var ts = this;
			var proxy = ts.p.proxy;
			var fieldName = options.colModel.name;
			if($.isFunction(proxy.getLabelValue)){
				return proxy.getLabelValue(fieldName,cellvalue);
			}
			return cellvalue;
		}
	});
	
	$.fmatter.util = {
			// Taken from YAHOO utils
			NumberFormat : function(nData,opts) {
				if(!$.fmatter.isNumber(nData)) {
					nData *= 1;
				}
				if($.fmatter.isNumber(nData)) {
					var bNegative = (nData < 0);
					var sOutput = String(nData);
					var sDecimalSeparator = opts.decimalSeparator || ".";
					var nDotIndex;
					if($.fmatter.isNumber(opts.decimalPlaces)) {
						// Round to the correct decimal place
						var nDecimalPlaces = opts.decimalPlaces;
						var nDecimal = Math.pow(10, nDecimalPlaces);
						sOutput = String(Math.round(nData*nDecimal)/nDecimal);
						nDotIndex = sOutput.lastIndexOf(".");
						if(nDecimalPlaces > 0) {
						// Add the decimal separator
							if(nDotIndex < 0) {
								sOutput += sDecimalSeparator;
								nDotIndex = sOutput.length-1;
							}
							// Replace the "."
							else if(sDecimalSeparator !== "."){
								sOutput = sOutput.replace(".",sDecimalSeparator);
							}
						// Add missing zeros
							while((sOutput.length - 1 - nDotIndex) < nDecimalPlaces) {
								sOutput += "0";
							}
						}
					}
					if(opts.thousandsSeparator) {
						var sThousandsSeparator = opts.thousandsSeparator;
						nDotIndex = sOutput.lastIndexOf(sDecimalSeparator);
						nDotIndex = (nDotIndex > -1) ? nDotIndex : sOutput.length;
						var sNewOutput = sOutput.substring(nDotIndex);
						var nCount = -1, i;
						for (i=nDotIndex; i>0; i--) {
							nCount++;
							if ((nCount%3 === 0) && (i !== nDotIndex) && (!bNegative || (i > 1))) {
								sNewOutput = sThousandsSeparator + sNewOutput;
							}
							sNewOutput = sOutput.charAt(i-1) + sNewOutput;
						}
						sOutput = sNewOutput;
					}
					// Prepend prefix
					sOutput = (opts.prefix) ? opts.prefix + sOutput : sOutput;
					// Append suffix
					sOutput = (opts.suffix) ? sOutput + opts.suffix : sOutput;
					return sOutput;
					
				}
				return nData;
			}
		};
	$.unformat = function (cellval,options,pos,cnt) {
		// specific for jqGrid only
		var ret, formatType = options.colModel.formatter,
		op =options.colModel.formatoptions || {}, sep,
		re = /([\.\*\_\'\(\)\{\}\+\?\\])/g,
		unformatFunc = options.colModel.unformat||($.fn.fmatter[formatType] && $.fn.fmatter[formatType].unformat);
		if(unformatFunc !== undefined && $.isFunction(unformatFunc) ) {
			ret = unformatFunc.call(this, $(cellval).text(), options, cellval);
		} else if(formatType !== undefined && $.fmatter.isString(formatType) ) {
			var opts = $.jgrid.getRegional(this, 'formatter') || {}, stripTag;
			switch(formatType) {
				case 'integer' :
					op = $.extend({},opts.integer,op);
					sep = op.thousandsSeparator.replace(re,"\\$1");
					stripTag = new RegExp(sep, "g");
					ret = $(cellval).text().replace(stripTag,'');
					break;
				case 'number' :
					op = $.extend({},opts.number,op);
					sep = op.thousandsSeparator.replace(re,"\\$1");
					stripTag = new RegExp(sep, "g");
					ret = $(cellval).text().replace(stripTag,"").replace(op.decimalSeparator,'.');
					break;
				case 'currency':
					op = $.extend({},opts.currency,op);
					sep = op.thousandsSeparator.replace(re,"\\$1");
					stripTag = new RegExp(sep, "g");
					ret = $(cellval).text();
					if (op.prefix && op.prefix.length) {
						ret = ret.substr(op.prefix.length);
					}
					if (op.suffix && op.suffix.length) {
						ret = ret.substr(0, ret.length - op.suffix.length);
					}
					ret = ret.replace(stripTag,'').replace(op.decimalSeparator,'.');
					break;
				case 'checkbox':
					var cbv = (options.colModel.editoptions) ? options.colModel.editoptions.value.split(":") : ["Yes","No"];
					ret = $('input',cellval).is(":checked") ? cbv[0] : cbv[1];
					break;
				case 'select' :
					ret = $.unformat.select(cellval,options,pos,cnt);
					break;
				case 'actions':
					return "";
				default:
					ret= $(cellval).text();
			}
		}
		return ret !== undefined ? ret : cnt===true ? $(cellval).text() : $.jgrid.htmlDecode($(cellval).html());
	};
});
//(function( factory ) {
//	"use strict";
//	if ( typeof define === "function" && define.amd ) {
//		// AMD. Register as an anonymous module.
//		define(["jquery","jqGrid"
//		], factory );
//	} else {
//		// Browser globals
//		factory( jQuery );
//	}
//}(function( $ ) {
//	$.fmatter = {};
//	$.fn.fmatter = function(formatType, cellval, opts, rwd, act) {
//		// build main options before element iteration
//		var v=cellval;
//		opts = $.extend({}, $.jgrid.getRegional(this, 'formatter') , opts);
//
//		try {
//			v = $.fn.fmatter[formatType].call(this, cellval, opts, rwd, act);
//		} catch(fe){}
//		return v;
//	};
//	
//}));