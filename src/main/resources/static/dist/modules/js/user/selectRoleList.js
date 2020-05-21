define(['jquery','modules/user/roleList','service','dialog'],function($,roleList,service,dialog){
	return $.extend(true,{},roleList,{
		opt:{
			title:'选择角色'
		},
		dialogopt:{
			modal:true,
			width:890,
			height:500
		},
		events:{
			init:function(params){
				var ctx = this.context;
				var gid = "selectRoleGrid";
				$("#gridContainer",ctx).empty().append('<table id="'+gid+'" style="width:100%"></table>')
				.append('<div id="'+gid+'Pager"></div>');
				this.initById(gid);
				var module = this;
				$("#selectBtn",ctx).show();
				$("#newBtn",ctx).hide();
				$("#editBtn",ctx).hide();
				$("#delBtn",ctx).hide();
				var searchUserId = params.searchUserId;
				$("#selectBtn",ctx).on('click',function(event){
					var ids = $('#'+gid).datagrid("getSelRowids");
					if(ids!=null &&ids.length > 0){
						var models = [];
						for(var i in ids){
							var row = $('#'+gid).datagrid("getRowData",ids[i]);
							var addRow = {};
							addRow.eaulUserId = searchUserId;
							addRow.eaulRoleId = row.earlId;
							models.push(addRow);
						}
						var dtd = service.service("SAVE_USER_ROLE",{models:models});
						dtd.done(function(){
							alert("保存成功");
							dialog.close(module);
							require(["modules/user/userList"],function(m){
								m.refreshRoleGrid();
							});
//							formValues.setFormValuesBySelector("#senderForm",newModel,ctx);
						});
					}
				});
			}
		}
	});
});