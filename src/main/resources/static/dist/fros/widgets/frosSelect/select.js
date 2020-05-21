define([ 'jquery','advanceSelectConfig','json','select2'], function($,advConfigs) {
	$.fn.select2.amd.define('select2/data/customAdapter', [
			'select2/data/array', 'select2/utils' ], function(ArrayAdapter,
			Utils) {
		function CustomDataAdapter($element, options) {
			CustomDataAdapter.__super__.constructor.call(this, $element,
					options);
		}
		Utils.Extend(CustomDataAdapter, ArrayAdapter);
		CustomDataAdapter.prototype.updateOptions = function(data) {
			this.$element.find('option').remove(); // remove all options
			this.addOptions(this.convertToOptions(data));
		}
		return CustomDataAdapter;
	});
	$.fn.select2.amd.define('select2/customDropdownAdapter',
	    ['select2/dropdown', 'select2/utils'],
	    function (Dropdown, Utils) {
	        function CustomDropdownAdapter ($element, options) {
	        	this.$element = $element;
	            this.options = options;
	        	CustomDropdownAdapter.__super__.constructor.call(this, $element, options);
	        }
	        Utils.Extend(CustomDropdownAdapter, Dropdown);
	        CustomDropdownAdapter.prototype.render = function () {
	        	var btnCtx = "";
	        	var self = this;
	        	if(this.options.get("multiple")){
	        		btnCtx = '<div class="btn-group btn-group-justified" role="group">'+
	        		'<div class="btn-group selectAllBtn" role="group"><button class="selectAllBtn btn btn-info"><i class="icon-check bigger-140" aria-hidden="true"></i></button></div>'+
	        		'<div class="btn-group clearAllBtn" role="group"><button type="button" class="btn btn-default"><i class="icon-remove-circle bigger-140" aria-hidden="true"></i></button></div></div>';
	        	}
	        	var $dropdown = $(
    		      '<span class="select2-dropdown">' +
    		      	btnCtx+
    		        '<span class="select2-results"></span>' +
    		      '</span>'
    		    );
		          if(this.options.get("multiple")){
		    	    $(".selectAllBtn",$dropdown).on("click",function(){
		    	    	var $results = $dropdown.find('.select2-results__option[aria-selected=false]');
		    	    	$results.each(function () {
		                var $result = $(this);
		                // Get the data object for it
		                var data = $result.data('data');
		                // Trigger the select event
		                self.trigger('select', {
		                  data: data
		                });
		              });
		    	    });
		    	    $(".clearAllBtn",$dropdown).on("click",function(){
		    	    	var $results = $dropdown.find('.select2-results__option[aria-selected=true]');
		    	    	$results.each(function () {
			                var $result = $(this);
			                // Get the data object for it
			                var data = $result.data('data');
			                // Trigger the select event
			                self.trigger('unselect', {
			                  data: data
			                });
		    	    	});
		    	    });
		        }
    		    $dropdown.attr('dir', this.options.get('dir'));
    		    this.$dropdown = $dropdown;
    		    return $dropdown;
	        };
	        return CustomDropdownAdapter;
	    }
	);
	$.selectCmp = $.selectCmp || {};
	$.extend($.selectCmp, {
		_init : function(options, $self) {
			var defaultOptions = {
				placeholder : "",
				closeOnSelect : true,
				allowClear : true
			};
			if (options.multiple) {
				options.closeOnSelect = false; // 可多选时设置select在选择时不关闭 
			}
			var op = $.extend(defaultOptions, options);
			var Utils = $.fn.select2.amd.require('select2/utils');
			// 固定逻辑
			if (op.dataAdapter == null) {
				// 覆盖原有逻辑
				if (op.ajax != null || op.selectCode != null || op.service != null) {
					var AjaxData = $.fn.select2.amd
							.require('select2/data/ajax');
					op.dataAdapter = AjaxData;
				} else if (options.data != null) {
					var customArrayAdapter = $.fn.select2.amd
							.require('select2/data/customAdapter');
					op.dataAdapter = customArrayAdapter;
				} else {
					var SelectData = $.fn.select2.amd
							.require('select2/data/select');
					op.dataAdapter = SelectData;
				}

				if (op.minimumInputLength > 0) {
					var MinimumInputLength = $.fn.select2.amd
							.require('select2/data/minimumInputLength');
					op.dataAdapter = Utils.Decorate(op.dataAdapter,
							MinimumInputLength);
				}

				if (op.maximumInputLength > 0) {
					var MaximumInputLength = $.fn.select2.amd
							.require('select2/data/maximumInputLength');
					op.dataAdapter = Utils.Decorate(op.dataAdapter,
							MaximumInputLength);
				}

				if (op.maximumSelectionLength > 0) {
					var MaximumSelectionLength = $.fn.select2.amd
							.require('select2/data/maximumSelectionLength');
					op.dataAdapter = Utils.Decorate(op.dataAdapter,
							MaximumSelectionLength);
				}

				if (op.tags) {
					var Tags = $.fn.select2.amd.require('select2/data/tags');
					op.dataAdapter = Utils.Decorate(op.dataAdapter, Tags);
				}

				if (op.tokenSeparators != null || op.tokenizer != null) {
					var Tokenizer = $.fn.select2.amd
							.require('select2/data/tokenizer');
					op.dataAdapter = Utils.Decorate(op.dataAdapter, Tokenizer);
				}

				if (op.query != null) {
					var Query = $.fn.select2.amd
							.require('select2/compat/query');

					op.dataAdapter = Utils.Decorate(op.dataAdapter,
							Query);
				}

				if (op.initSelection != null) {
					var InitSelection = $.fn.select2.amd
					.require('select2/compat/initSelection');

					op.dataAdapter = Utils.Decorate(op.dataAdapter,
							InitSelection);
				}
			}
			
			if (op.dropdownAdapter == null) {
			  //原有dropdownAdapter逻辑
			  var multiple = $self.prop("multiple");
			  var customDropdownAdapter = $.fn.select2.amd.require('select2/customDropdownAdapter');
		      if (multiple) {
		    	  op.dropdownAdapter = customDropdownAdapter;
		      } else {
		    	var DropdownSearch = $.fn.select2.amd.require('select2/dropdown/search');
		        var SearchableDropdown = Utils.Decorate(customDropdownAdapter, DropdownSearch);
		        op.dropdownAdapter = SearchableDropdown;
		      }

		      if (op.minimumResultsForSearch !== 0) {
		    	  var MinimumResultsForSearch = $.fn.select2.amd.require('select2/dropdown/minimumResultsForSearch');
		    	  op.dropdownAdapter = Utils.Decorate(
			    	  op.dropdownAdapter,
			          MinimumResultsForSearch
			        );
		      }

		      if (op.closeOnSelect) {
		    	  var CloseOnSelect = $.fn.select2.amd.require('select2/dropdown/closeOnSelect');
			      op.dropdownAdapter = Utils.Decorate(
			    	  op.dropdownAdapter,
			          CloseOnSelect
			        );
		      }

		      if (
		    		  op.dropdownCssClass != null ||
		    		  op.dropdownCss != null ||
		    		  op.adaptDropdownCssClass != null
		      ) {
		        var DropdownCSS = $.fn.select2.amd.require('select2/compat/dropdownCss');

		        op.dropdownAdapter = Utils.Decorate(
		          op.dropdownAdapter,
		          DropdownCSS
		        );
		      }
		      
		      var AttachBody = $.fn.select2.amd.require('select2/dropdown/attachBody');
		      op.dropdownAdapter = Utils.Decorate(
		    	op.dropdownAdapter,
		        AttachBody
		      );
		    }
			
			/**
			 * selectCode,service,data format(id, text)
			 */
			if (op.selectCode) {
				// 2.select code
				var selectCodeConfig = $.extend(true,{},advConfigs[op.selectCode]);
				var colModelArray = selectCodeConfig.colModel;
				var select2Id = colModelArray[0].name || 'id';
				var select2Text = colModelArray[1].name || 'text';
				if (op.id) {
					select2Id = op.id;
					delete op.id;
				}
				if (op.text) {
					select2Text = op.text;
					delete op.text;
				}
				
				var selectCode = op.selectCode;
				var serviceName = "SelectCodeQuery-" + selectCode;
				var selectCodeParameter = {selectCode:selectCode, queryInfo:{"queryFields":[],"fieldCodeTypes":null}};
				var queryFields = [];
				
				delete op.selectCode;
				var pageSize = op.pageSize || 10;
				delete op.pageSize;
				
				var url = getServiceUrl(serviceName);
				var pagingInfo = {"pageSize":pageSize,"currentPage":1};
				selectCodeParameter.queryInfo.pagingInfo = pagingInfo;
				var ajaxConfig = {
				    url: url,
				    type:"POST",
				    dataType: 'json',
				    delay: 600,
				    data: function(params){
				    	var queryFields = [];
				    	if(params.term){
				    		$.each(selectCodeConfig.queryFilterCond,function(index,queryField){
					    		delete queryField.fieldLabel;
					    		delete queryField.rowkey;
					    		queryField.fieldStringValue=params.term;
					    		queryFields.push(queryField);
					    	});
			    		}
				    	
				    	if(params.page){
				    		selectCodeParameter.queryInfo.pagingInfo.currentPage=params.page;
				    	}
				    	
				    	$self.triggerHandler("onCustomFilterCond",[params,queryFields]);
				    	selectCodeParameter.queryInfo.queryFields = queryFields;
				    	var selectCodeParameterStr = JSON.stringify(selectCodeParameter);
				    	return selectCodeParameterStr;
				    },
				    processResults: function (data, params) {
				    	var dataResult = $.map(data.data.dataList, function (obj) {
			    		  obj.id = obj[select2Id];
			    		  obj.text = obj[select2Text];
			    		  return obj;
			    		});
				    	params.page = params.page || 1;
				    	var hasMore = false;
				    	if (data.data.pagingInfo && data.data.pagingInfo.totalRows) {
				    		hasMore = ((params.page * pageSize) < (data.data.pagingInfo.totalRows))
				    	}
				    	
					    return {
				    		results: dataResult,
					        pagination: {
					        	more: hasMore
					        }
					    };
				    },
				    cache: true
				};
				
				op.ajax = ajaxConfig;
				return $self.select2(op);
				
			}else if (op.service){
				// 1.service
				var serviceName = op.service.serviceName;
				if (typeof(serviceName) == 'undefined' || serviceName == '') {
					return false;
				}
				var select2Id = op.id || 'id';
				delete op.id;
				var select2Text = op.text || 'text';
				delete op.text;
				var serviceParameter = op.service.parameter;
				var dataAttr = op.service.dataAttr || 'data.dataList';
				var totalRowsAttr = op.service.totalRowsAttr || 'data.pagingInfo.totalRows';
				delete op.service;
				var pageSize = op.pageSize || 10;
				delete op.pageSize;
				var url = getServiceUrl(serviceName);
				var ajaxConfig = {
				    url: url,
				    type:"POST",
				    dataType: 'json',
				    delay: 600,
				    data: function(params){
				    	if (serviceName.indexOf('CommonQuery-') != -1) {
				    		params.page = params.page || 1;
				    		var pagingInfo = {"pageSize":pageSize,"currentPage":params.page};
							serviceParameter.queryInfo.pagingInfo = pagingInfo;
				    	}
				    	
				    	$(this).triggerHandler("handleServiceParam",[params,serviceParameter]);
				    	var serviceParameterStr = JSON.stringify(serviceParameter);
				    	return serviceParameterStr;
				    },
				    processResults: function (data, params) {
				    	var dataResult = $.map(eval("data." + dataAttr), function (obj) {
			    		  obj.id = obj[select2Id];
			    		  obj.text = obj[select2Text];
			    		  return obj;
			    		});
				    	params.page = params.page || 1;
				    	var hasMore = false;
				    	var totalRows = eval("data." + totalRowsAttr) || 0;
				    	if (totalRows) {
				    		hasMore = ((params.page * pageSize) < (totalRows))
				    	}
					    return {
				    		results: dataResult,
					        pagination: {
					        	more: hasMore
					        }
					    };
				    },
				    cache: true
				};
				op.ajax = ajaxConfig;
				return $self.select2(op);
				
			}else if ((op.data) && (op.id || op.text)) {
				// 包含data属性同时也包含id或者text属性的时 
				var dataResult = $.map(op.data, function (obj) {
	    		  obj.id = obj[op.id] || obj.id;
	    		  obj.text = obj[op.text] || obj.text;
	    		  return obj;
	    		});
				op.data = dataResult;
				delete op.id;
				delete op.text;
				return $self.select2(op);
			}else {
				// ajax 和其他情况不做任何处理，直接调用原生的select2
				return $self.select2(op);
			}
			
			
			/**
			 * 获取项目名称 
			 */
			function getServiceUrl(serviceName) {
				var baseUrl = require.toUrl("MYFLAG");
				baseUrl = baseUrl.substring(0,baseUrl.indexOf("MYFLAG") - 5);//必须是dist
				var serviceUrl = baseUrl+'service/'+serviceName;
				return serviceUrl;
			}
			
		},
		destroy : function($self) {
			$self.select2("destroy");
		},
		updateOptions : function(data, $self) {
			$self.data('select2').dataAdapter.updateOptions(data);
		}
	});

	$.fn.select = function(options) {
		if (typeof options == 'string') {
			var fn = $.selectCmp[options];
			if (!fn) {
				throw ("selectCmp - No such method: " + options);
			}
			var args = $.makeArray(arguments).slice(1);
			args.push($(this));
			return fn.apply($.selectCmp, args);
		} else {
			return this.each(function() {
				$(this).select('_init', options);
			});
		}
	};
});