define(['jquery','modules/service/serviceList','service','dialog'],function($,serviceList,service,dialog){
	return $.extend(true,{},serviceList,{
		opt:{
			title:'选择服务'
		},
		dialogopt:{
			modal:true,
			width:890,
			height:500
		},
		events:{
			init:function(params){
				var ctx = this.context;
				var gid = "selectServiceGrid";
				$("#gridContainer",ctx).empty().append('<table id="'+gid+'" style="width:100%"></table>')
				.append('<div id="'+gid+'Pager"></div>');
				this.initById(gid);
				var module = this;
				$("#selectBtn",ctx).show();
				$("#newBtn",ctx).hide();
				$("#editBtn",ctx).hide();
				$("#delBtn",ctx).hide();
				var gid = "selectServiceGrid";
				var searchSenderId = params.searchSenderId;
				$("#selectBtn",ctx).on('click',function(event){
					var ids = $('#'+gid).datagrid("getSelRowids");
					if(ids!=null &&ids.length > 0){
						var models = [];
						for(var i in ids){
							var row = $('#'+gid).datagrid("getRowData",ids[i]);
							var addRow = {};
							addRow.eassEasdId = searchSenderId;
							addRow.eassEascId = row.eascId;
							models.push(addRow);
						}
						var dtd = service.service("SAVE_SENDER_SERVICE",{models:models});
						dtd.done(function(){
							alert("保存成功");
							dialog.close(module);
							require(["modules/sender/senderList"],function(m){
								m.refreshServiceGrid();
							});
//							formValues.setFormValuesBySelector("#senderForm",newModel,ctx);
						});
					}
				});
			}
		}
	});
});