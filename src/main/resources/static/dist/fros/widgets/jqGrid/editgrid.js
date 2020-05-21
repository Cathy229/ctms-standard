define(['jquery','datagrid','third-party/jqGrid/src/grid.celledit','third-party/jqGrid/src/grid.common'],function($){
	$.jgrid.extend({
		_createDatePicker:function(value,options){
			var p = this.p;
			var div = document.createElement("div");
			$(div).addClass('input-group');
			var el = document.createElement("input");
			$(el).addClass("MyDatepicker").addClass("canBlur").addClass("tofocus").addClass('form-control');
			$(el).appendTo($(div));
			var $addon = $('<div class="input-group-addon" role="button"><i class="icon-calendar"></i></div>');
			$addon.appendTo($(div)).mouseenter(function(){
				p.editTab = false;
			});
			$addon.hover(function(){
				$(el).removeClass("canBlur");
				p.editout = true;
			},function(){
				$(el).addClass("canBlur");
			});
				require(['datePicker'],function(){
						if(options.dateType != null){
							$(el).datePicker({
								format:options.dateType,
								beforeShow:function(input,inst){
									var $this = $(input);
									var c = $(document.body);
									$('#ui-datepicker-div',c).hover(function(){
									},function(){
										p.editout = false;
										$this[0].focus();
									});
								}
							});
							$(el).on("incomplete",function(event){
								$(el).val("");
							});
						}
						//FROS-252
					if(value!=null && value!=''){
						$(el).val(value);
					}
				});
			return div;
		},
		_handleDatePickerValue:function(elem, type,value){
			var $el = $('.MyDatepicker',$(elem));
			if(type=='get') {
				if($el.val() == null || $el.val() == ''){
					return '';
				}
				var dateStr = $el.val();
				if(dateStr!=null && dateStr != ""){
					if(!$el.inputmask("isComplete")){
						return "";
					}
				}
				return $el.val();
			}else if(type == 'set') {
				$el.val(value);
			}
		},
		
		_createNumber:function(value,options){
			var div = document.createElement("div");
			$(div).addClass('input-group');
			var el = document.createElement("input");
			$(el).addClass("tofocus").addClass('form-control');
			$(el).appendTo($(div));
			var cfg = options.cfg || {};
			//numberinput
			require(['numberinput'],function(){
				$(el).numberinput(cfg);
				$(el).val(value);
			});
			return div;
		},
		_handleNumberValue:function(elem, type,value){
			var $el = $(".tofocus",elem);
			if(type=='get') {
				if($el.val() == null || $el.val() == ''){
					return '';
				}
				return $el.val();
			}else if(type == 'set') {
				$el.val(value);
			}
		},
		
		_createAdvanceSuggest:function(value,options){
			var $grid = $(this);
			var p = this.p;
			var rid = options.rowId;
			var div = document.createElement("div");
			$(div).addClass('input-group');
			var el = document.createElement("input");
			$(el).attr('id','ad_'+options.id);
			$(el).addClass("canBlur").addClass("tofocus").addClass('form-control');
			$(el).appendTo($(div));
			var $addon = $('<div class="input-group-addon" role="button"><i class="icon-search"></i></div>');
			$addon.appendTo($(div)).mouseenter(function(){
				p.editTab = false;
			});
			$addon.hover(function(){
				p.editout = true;
				$(el).removeClass("canBlur");
			},function(){
				$(el).addClass("canBlur");
			});
			var hl = document.createElement("input");
			$(hl).addClass('form-control').addClass("hidInput");
			$(hl).attr('type','hidden');
			$(hl).attr('id','adhd_'+options.id);
			$(hl).appendTo($(div));
			require(['advanceSelectConfig','advanceSuggest'],function(advConfigs){
				if(options.selectCode != null){
					$(el).advanceSuggest({
						selectCode:options.selectCode,
						hidInput:$(hl),
						suggestBox:true
					});
					//afterShow
					$(el).on("afterShow",function(event,cfg){
						cfg.container.hover(function(){
							$(el).removeClass("canBlur");
							p.editout = true;
						},function(){
							p.editout = false;
							$(el).addClass("canBlur");
							p.editTab = false;
							$(el).focus();
						});
					});
					$(el).on("onSelectedRow",function(event,row){
						$(el).addClass("canBlur");
//						$(el).attr('IEPopFlag','visible');//FROS-211
						p.editTab = false;
						p.editout = false;
						//设置selectCodeValues
						p.proxy.setSelectCodeValue(options.selectCode,$(hl).val(),$(el).val());
						$(el).attr("oldvalue",$(el).val());
						$(el).trigger('focus');
					});
					$(el).on("afterClose",function(event){
						p.editout = false;
					});
					$(el).on("onCustomFilterCond",function(event,queryFields){
						if(options.cfg!=null && $.isFunction(options.cfg.onCustomFilterCond)){
							options.cfg.onCustomFilterCond.apply($grid,[rid,queryFields]);
						}
					});
					$(el).on("onClear",function(event){
						if(options.cfg!=null && $.isFunction(options.cfg.onClear)){
							options.cfg.onClear.apply($grid,[rid]);
						}
					});
				};
				//FROS-252
				if(value!=null && value!=''){
					$(hl).val(value);//隐藏ID值
					var fieldName = options.name;
					var labelValue = p.proxy.getLabelValue(fieldName,value);
					$(el).val(labelValue);
					$(el).attr("oldvalue",labelValue);
				}
			});
			
			return div;
		},
		
		_handleAdvanceSuggestValue:function(elem, type,value){
			if(type=='get') {
				return $('.hidInput',$(elem)).val();
			}else if(type == 'set') {
				$('.hidInput',$(elem)).val(value);
			}
		},
		
		_selectCodeFormatter:function(cellvalue, options, rowdata,act,$this_p){
			var keyValue = "";
			var labelValue = "";
			//使用SelectCode认为必须使用CommonQuery
			var proxy;
			if (!this.p) {
				proxy = $this_p.proxy;
			} else {
				proxy = this.p.proxy;
			}
			var fieldName = options.colModel.name;
			if(cellvalue != null && proxy!=null){
				keyValue = cellvalue;
				if($.isFunction(proxy.getLabelValue)){
					labelValue = proxy.getLabelValue(fieldName,cellvalue);
				}else{
					labelValue = cellvalue;
				}
			}
			return "<span keyValue='"+keyValue+"'>"+labelValue+"</span>";
		},
		
		_selectCodeUnFormatter:function(cellvalue, options,cell){
			return $('span',cell).attr('keyValue');
		},
		
		/**
		 * get all data of the grid 
		 */
		getAllData:function(){
			$this=$(this);
			var allDataArray = new Array();
			var rowIds = $this.jqGrid('getDataIDs');
			for(var i=0;i<rowIds.length;i++){
				var singleData = $this.jqGrid('getRowData',rowIds[i]);
				allDataArray.push(singleData);
			}
			return allDataArray;
		},
		
		addRow:function(rowData,position){
			$this=$(this);
			if(isNaN($this[0].p.currSeq+1)){
				$this[0].p.currSeq=1;
			}
			 var newRowId = $this[0].p.currSeq+1;
			 $this[0].p.currSeq =newRowId; 
			rowData['rowState'] = 'Added';
			position = position ? position : "first";
			$this.editgrid("addRowData", newRowId, rowData, position);  
			$this[0].p.changedData = $this[0].p.changedData || {};
			$this[0].p.changedData[newRowId] = rowData;
		},
		
		deleteRows:function(rowIds){
			$this=$(this);
			for(var i=0;i<rowIds.length;i++){
				$this.editgrid("deleteRow",rowIds[i]);
			}
		},
		
		deleteRow:function(rowid){
			$this=$(this);
			var r = $this.editgrid("getRowData",rowid);
			if($this.editgrid("delRowData", rowid)==true){
				if($this[0].p.changedData[rowid] !=undefined  && $this[0].p.changedData[rowid]['rowState'] == 'Added'){
					delete  $this[0].p.changedData[rowid];
				}else{
					var deletedRow = $.extend({},r);
					deletedRow['rowState'] = 'Deleted';
					$this[0].p.changedData[rowid] = deletedRow;
				}
			}
		},
		getChangedData:function(){
			var ret = [];
			var data = $(this)[0].p.changedData;
			for(var key in data){
				ret.push(data[key]);
			}
			return ret;
		},
		clearChangedData:function(){
			this[0].p.changedData = {};
		},
		updateRowCell:function(rowid,colName,value){
			$(this).editgrid("setCell",rowid,colName,value,'dirty-cell',{},true);
			$(this).editgrid("updateChangedData",rowid,colName,value);
		},
		//
		updateChangedData:function(rowid,columnName,value){
			if(this[0].p.changedData[rowid]==undefined){
				//在更改的数据中不存在，需要将数据先从p.queryData拷贝，再更改
				var r = $(this).editgrid("getRowData",rowid);
				var changeRow = $.extend({},r);
				changeRow[columnName] = value;
				changeRow['rowState'] = 'Modified';
				this[0].p.changedData[rowid] = changeRow;
			}else{
				//在更改的数据中存在，直接更改数据
				var r = this[0].p.changedData[rowid];
				r[columnName] = value;
			}
		},
		getRowData:function(rowid){
			if(this[0].p.changedData[rowid]!=undefined){
				//this[0].p.changedData为{rowid:{rowdata}...}
				if(this[0].p.changedData[rowid]['rowState'] == 'Deleted'){
					return null;
				}
				return this[0].p.changedData[rowid];
			}else{
				//在changeData中不存在,在querydata中查找
				//querydata为[{rowdata}...]
				if(this[0].p.querydata!=null && this[0].p.querydata.length > 0){
					return this[0].p.querydata[rowid-1];
				}
			}
			return null;
		},
		_blurHandler:function(id){
			if($("#"+id).prop('p').savedRow[0]!=undefined){
//				window.setTimeout(function(){
					$("#"+id).jqGrid("saveCell",$("#"+id).prop('p').savedRow[0].id,$("#"+id).prop('p').savedRow[0].ic);
//				},10);
			}
		},
		
		_initEdit:function(self,options){
			if(self.grid) {return;}
			var grid = self.id;
			var defaultOption = {
				cellEdit: true,
				cellsubmit: 'clientArray',
				afterSaveCell : function(rowid,name,val,iRow,iCol) {
					if(this.p.changedData[rowid]==undefined){
						//在更改的数据中不存在，需要将数据先从p.queryData拷贝，再更改
						var r = $("#"+this.p.id).editgrid("getRowData",rowid);
						var changeRow = $.extend({},r);
						changeRow[name] = val;
						changeRow['rowState'] = 'Modified';
						this.p.changedData[rowid] = changeRow;
					}else{
						//在更改的数据中存在，直接更改数据
						var r = this.p.changedData[rowid];
						r[name] = val;
					}
				}
			};
			var newoptions = $.extend(true,defaultOption,options);
			if(newoptions!=null && newoptions.colModel!=null){
				var ncm = newoptions.colModel;
				for(var i=0;i<ncm.length;i++){
					if(ncm[i].editable==true&&(ncm[i].edittype =='date' || ncm[i].edittype =='datetime' )){
						var dateType=ncm[i].edittype;
						ncm[i].edittype = 'custom';
						var eo = $.extend(true,{},ncm[i].editoptions,{
							dateType:dateType,
							custom_element:$.jgrid.getMethod('_createDatePicker'),
							custom_value:$.jgrid.getMethod('_handleDatePickerValue')
						});
						ncm[i].editoptions = eo;
					}
					if(ncm[i].editable==true&&ncm[i].edittype =='advance'){
						var selectCode=ncm[i].selectCode;
						ncm[i].edittype = 'custom';
						var eo = $.extend(true,{},ncm[i].editoptions,{
							selectCode:selectCode,
							custom_element:$.jgrid.getMethod('_createAdvanceSuggest'),
							custom_value:$.jgrid.getMethod('_handleAdvanceSuggestValue'),
							cfg:ncm[i].cfg
						});
						ncm[i].editoptions = eo;
						ncm[i].formatter = $.jgrid.getMethod("_selectCodeFormatter");
						ncm[i].unformat = $.jgrid.getMethod("_selectCodeUnFormatter");
					}
					if(ncm[i].editable==true&&ncm[i].edittype =='number'){
						ncm[i].edittype = 'custom';
						var eo = $.extend(true,{},ncm[i].editoptions,{
							cfg:ncm[i].cfg,
							custom_element:$.jgrid.getMethod('_createNumber'),
							custom_value:$.jgrid.getMethod('_handleNumberValue')
						});
						ncm[i].editoptions = eo;
					}
				}
			}
			$("#"+grid).on("blur",":input:not(.cannotBlur):not(.MyDatepicker):not(.suggestBox)", function () { 
//				$(this).editgrid('_blurHandler',grid);
			});
			$("#"+grid).on("blur",":text.MyDatepicker.canBlur", function () { 
//				$(this).editgrid('_blurHandler',grid);
			});
			$("#"+grid).on("blur",":text.suggestBox.canBlur", function () { 
//				$(this).editgrid('_blurHandler',grid);
			});
			$.extend(true,options,newoptions);
		}
	});
	
	$.fn.editgrid = function(options){
		if (typeof options == 'string') {
			var fn = $.jgrid.getMethod(options);
			if (!fn) {
				throw ("jqGrid - No such method: " + options);
			}
			var args = $.makeArray(arguments).slice(1);
			return fn.apply(this,args);
		}
		return this.each( function() {
			var $t = $(this);
			$(this).editgrid('_initEdit',this,options);
			//依赖datagrid，因此_init方法已经存在
			$(this).editgrid('_init',this,options);
			var t = this;
			t.p.editTab = true;//
			$(this).focusin(function(event){
				if(t.p.editTab === true && !t.p.mousedown && t.p.shiftKey!=true){
					//tab键进入并且非鼠标点击
					if(t.p.multiselect == true){
						$t.jqGrid("editCell",1,1,false);
					}else{
						$t.jqGrid("editCell",1,0,false);
					}
				}
			});
		});
	};
	
});
