define(['jquery','basemodule','dialog','AjaxProxy','service','json','templateac','autoSelect','advanceSuggest','editgrid'],function($,basemodule,dialog,AjaxProxy,service) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/controls/editgriddemo.vc',
			title:'EditGrid'
		},
		events:{
			init:function(){
				var ctx = this.context;
				//addBtn
				$("#addBtn",ctx).on("click",function(event){
					$('#'+gid).editgrid("addRow",{whifStatus:1});
				});
				
				$("#delBtn",ctx).on("click",function(event){
					//getSelRowids
					var selrid = $('#'+gid).editgrid("getSelRowids");
					$('#'+gid).editgrid("deleteRows",selrid);
				});
				
				$("#saveBtn",ctx).on("click",function(event){
					var datas = $('#'+gid).editgrid("getChangedData");
					if(datas.length > 0){
						var dtd = service.service("SAVE_GRIDDATAS",{models:datas});
						dtd.done(function(){
							alert("保存成功");
							$('#'+gid).editgrid("reload");
						});
					}
				});
				
				//changedBtn
				$("#changedBtn",ctx).on("click",function(event){
					var datas = $('#'+gid).editgrid("getChangedData");
					alert(JSON.stringify(datas));
				});
				
				//updateBtn
				$("#updateBtn",ctx).on("click",function(event){
					var rids = $('#'+gid).editgrid("getSelRowids");
					if(rids.length > 0){
						var fieldName = "whifAddress";//自行设定
						for(var i=0;i<rids.length;i++){
							$('#'+gid).editgrid("updateRowCell",rids[i],fieldName,"测试值");
						}
					}else{
						alert("请先选择数据");
					}
					
				});
				
				//update2Btn
				$("#update2Btn",ctx).on("click",function(event){
					var rids = $('#'+gid).editgrid("getSelRowids");
					if(rids.length > 0){
						var fieldName = "whifBswhId";//自行设定
						for(var i=0;i<rids.length;i++){
							$('#'+gid).editgrid("updateRowCell",rids[i],fieldName,"1");
						}
					}else{
						alert("请先选择数据");
					}
				});
				
				//test_grid
				var proxy = new AjaxProxy({
					serviceName:'CommonQuery-WhifWarehouseInfoModel',
					fieldCodeTypes:{
						whifBswhId:"WAREHOUSE"
					}
				});
				var gid = "test_grid";
				var $this = this;
				var ctx = this.context;
				$('#'+gid).editgrid({
					colNames:['ID','高级选择','数字','日期时间','选择框','文本','多行文本'],
					colModel:[
						{name:'whifId',index:'whifId', width:50},
						{name:'whifBswhId',index:'whifBswhId', width:200,selectCode:"WAREHOUSE",editable:true,edittype:'advance'},
						{name:'whifNum',index:'whifNum',width:100,editable:true,edittype:'number',cfg:{digits:3}},
						{name:'whifUpdateTime',index:'whifUpdateTime',width:150,formatter:'datetimeFmatter',editable:true,edittype:"datetime"},
						{name:'whifStatus',index:'whifStatus',width:50,formatter:checkFormatter,unformat:unCheckFormatter,editable:true,edittype:'checkbox',editoptions:{value:'1:0'}},
						{name:'whifAddress',index:'whifAddress',width:100,editable:true},
						{name:'whifMemo',index:'whifMemo',width:150,editable:true,edittype:"textarea"}
					],
					proxy:proxy,
					shrinkToFit:false,
					autowidth:true,
					multiselect: true,
   					caption: "列表",
   					regional:'cn',
   					pager:'#'+gid+'Pager',
					//查询条件
					beforeReload:function(){
					},
					autoLoad:true
				});
				function checkFormatter(cellvalue, options, rowObject){
					if(cellvalue =='1'){
						return "是";
					}
					if(cellvalue =='0'){
						return "否";
					}
					return "否";
				}
				function unCheckFormatter(cellvalue, options, cell){
					if(cellvalue =='是'){
						return "1";
					}
					if(cellvalue =='否'){
						return "0";
					}
					return "0";
				}
				
				//cascade_grid
				var cascadeProxy = new AjaxProxy({
					serviceName:'CommonQuery-WhdtWarehouseDetailModel',
					fieldCodeTypes:{
						whdtBswhId:"WAREHOUSE",
						whdtBswpId:"WAREHOUSEPOS"
					}
				});
				var cascadeGrid = "cascade_grid";
				$('#'+cascadeGrid).editgrid({
					colNames:['ID','仓库','库位','容量'],
					colModel:[
						{name:'whdtId',index:'whdtId', width:50},
						{name:'whdtBswhId',index:'whdtBswhId', width:200,selectCode:"WAREHOUSE",editable:true,edittype:'advance',cfg:{
							onClear:function(rid){
								var fieldName = "whdtBswpId";
								$(this).editgrid("updateRowCell",rid,fieldName,"");
							}
						}},
						{name:'whdtBswpId',index:'whdtBswpId',width:200,selectCode:"WAREHOUSEPOS",editable:true,edittype:'advance',cfg:{
							onCustomFilterCond:function(rid,queryFields){
								var row = $(this).editgrid("getRowData",rid);
								var bswhId = row.whdtBswhId;
								var queryField = {
									fieldName:"bswpBswhId",
									operator:"="
								}
								if(bswhId!=null && bswhId!=""){
									queryField.fieldStringValue = bswhId;
								}else{
									queryField.fieldStringValue = "-1";
								}
								queryFields.push(queryField);
							}
						}},
						{name:'whdtCapacity',index:'whdtCapacity',width:100,editable:true,edittype:'number',cfg:{digits:2}}
					],
					proxy:cascadeProxy,
					shrinkToFit:false,
					autowidth:true,
					multiselect: true,
   					caption: "级联列表",
   					regional:'cn',
   					pager:'#'+cascadeGrid+'Pager',
					//查询条件
					beforeReload:function(){
					},
					autoLoad:true
				});
				
				//addBtn
				$("#addCascadeBtn",ctx).on("click",function(event){
					$('#'+cascadeGrid).editgrid("addRow",{});
				});
				
				$("#delCascadeBtn",ctx).on("click",function(event){
					//getSelRowids
					var selrid = $('#'+cascadeGrid).editgrid("getSelRowids");
					$('#'+cascadeGrid).editgrid("deleteRows",selrid);
				});
				
				$("#saveCascadeBtn",ctx).on("click",function(event){
					var datas = $('#'+cascadeGrid).editgrid("getChangedData");
					if(datas.length > 0){
						var dtd = service.service("SAVE_CASCADEDATAS",{models:datas});
						dtd.done(function(){
							alert("保存成功");
							$('#'+cascadeGrid).editgrid("reload");
						});
					}
				});
				//changedCascasdeBtn
				$("#changedCascasdeBtn",ctx).on("click",function(event){
					var datas = $('#'+cascadeGrid).editgrid("getChangedData");
					alert(JSON.stringify(datas));
				});
			}
		}
	});
});
