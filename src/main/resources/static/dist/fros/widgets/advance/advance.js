define(['jquery','AjaxProxy','basemodule','advanceSelectConfig','service','dialog','datagrid'],function($,AjaxProxy,basemodule,advConfigs,service,dialog){
	return $.extend(true,{},basemodule,{
	opt:{
		url:'dist/fros/widgets/advance/advanceselect.html',
		title:'选择框'
	},
	dialogopt:{
		modal:true,
		width:590,
		height:350
	},
	$labelInput:null,
	setLabelInput:function($labelInput){
		this.$labelInput = $labelInput;
	},
	gridId:'jqgrid_advanceselect_mygrid',
	events:{
		init:function(){
			var module = this;
			var gid = this.gridId;
			var $el = this.$labelInput;
			var selectCode = $el.prop("opt").selectCode;
			var oriConfig = advConfigs[selectCode];
			if (oriConfig == null || oriConfig == undefined) {
				alert("未配置" + selectCode + "选择框！");
				return;
			}
			var dtd = $.Deferred();
			if (oriConfig.isLoaded == true){
				dtd.resolve();
			}else{
				var post = service.service("GET_SELECTCODE_DEF",{selectCode:selectCode});
				post.done(function(def){
					advConfigs[selectCode].keyFieldName = def.keyFieldName;
					advConfigs[selectCode].labelFieldName = def.labelFieldName;
					advConfigs[selectCode].queryType = def.queryType;
					advConfigs[selectCode].fieldCodeTypes = def.fieldCodeTypes;
					advConfigs[selectCode].isLoaded = true;
					//处理显示列
					dtd.resolve();
				});
			}
			dtd.done(function(){
				var config = $.extend(true,{},advConfigs[selectCode]);
				var cols = config.colModel;
				for(var col in cols){
					if(cols[col].labelField === true){
						cols[col].index = config.labelFieldName;
						cols[col].name = config.labelFieldName;
					}
				}
				var proxy = new AjaxProxy({
					serviceName:"SelectCodeQuery-"+selectCode,
					fieldCodeTypes:config.fieldCodeTypes,
					selectCode:selectCode
				});
				$('#'+gid).datagrid({
					colNames:config.colNames,
					colModel:config.colModel,
					proxy:proxy,
					shrinkToFit:false,
					autowidth:true,
					regional:'cn',
					pager:'#'+gid+'Pager',
					viewrecords : true,
					disableColsSetter:true,
					//
					onRowEnter:function(rowid){
						var rowData = $("#"+gid).datagrid("getRowData",rowid);
						$("#"+gid).advanceselect('afterSearchData',advConfigs,rowData,$el);
						$("#"+tabId).dialog('close');
						$el.focus();
						$el.triggerHandler('afterClose');
					},
					//查询条件
					beforeReload:function(){
						$(this).datagrid("clearUserFilterCond");
						var sqlCond = {};
						var filterCond = [];
						var dataIndex = $("#" + gid + "_Column").val();
						var searchValue = $("#" + gid + "_Search").val();
						if(searchValue != undefined && searchValue != null && searchValue != ""){
							//如果存在过滤值则增加过滤条件
							var operator = 'likeAnywhere';
							var fieldType = 'String';
							$("#" + gid + "_Column option:selected").each(function(){
								operator = $(this).attr('operator');
								fieldType = $(this).attr('fieldType');
							});
							sqlCond.fieldName = dataIndex;
							sqlCond.fieldStringValue = searchValue;
							sqlCond.operator = operator;
							sqlCond.fieldType = fieldType;
							filterCond.push(sqlCond);
						}
						$el.triggerHandler('onCustomFilterCond',[filterCond]);
						$(this).datagrid("addUserFilterCond",filterCond);
					}
				});
				$('#'+gid).on('jqGridAfterGridComplete',function(){
					$("#"+gid).focus();
				});
				if(config.queryFilterCond != undefined && config.queryFilterCond != null){
					var opts = "";
					for (var i = 0; i < config.queryFilterCond.length; i++) {
						var fieldName = config.queryFilterCond[i].fieldName;
						var fieldLabel = config.queryFilterCond[i].fieldLabel;
						var operator = config.queryFilterCond[i].operator;
						var fieldType = config.queryFilterCond[i].fieldType;
						opts += "<option value='" + fieldName + "' operator='" + operator + "' fieldType='" + fieldType + "'>" + fieldLabel + "</option>";
					}
					$("#"+gid+"_Column").html(opts);
				}
				
				$("#"+gid+"_Search").focus();
				dialog.center(module);//异步操作需要调整位置
			});
			$('#queryBtnSelect',this.context).on('click',function(){
				$("#"+gid).datagrid('reload');
			});
			
			var tabId = this.opt.tabid;
			$('#submitSelect',this.context).on('click',function(){
				var id = $("#"+gid).datagrid('getGridParam','selrow');
				if(id == undefined || id == null){
					return;
				}
				var rowData = $("#"+gid).datagrid("getRowData",id);
				$("#"+gid).advanceselect('afterSearchData',advConfigs,rowData,$el);
				$("#"+tabId).dialog('close');
				$el.triggerHandler('afterClose');
				$el.focus();
			});
			
			$("#"+gid+"_Search").keydown(function(event){
				if(event.which == 13){
					$("#"+gid).datagrid('reload');
				}
			}),
			
			$('#close',this.context).on('click',function(){
				if($el.triggerHandler('beforeClose') == false){
					return;
				};
				$("#"+tabId).dialog('close');
				$el.triggerHandler('afterClose');
			});
		}
	}

	});
	
});