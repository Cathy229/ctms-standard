define(['jquery','basemodule','dialog','service','formValues','zTree'],function($,basemodule,dialog,service,formValues) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/user/roleEdit.vc',
			title:'角色',
			isDailog:true
		},
		dialogopt:{
			modal:true,
			width:560,
			height:300
		},
		funcTree:null,
		events:{
			init:function(){
				var ctx = this.context;
				var module = this;
				$("#saveBtn",ctx).on("click",function(event){
					module._save();
				});
			},
			defaultAction:function(){
				this._save();
			},
			afterClose:function(){
				this.funcTree = null;
			}
		},
		_initFuncTree:function(){
			var md = $.Deferred();
			var module = this;
			var setting = {
				data : {
					simpleData : {
						enable : true,
						idKey : "eafcId",
						pIdKey : "eafcParentId",
						rootPId : "0"
					},
					key : {
						name : 'eafcUrlDesc'
					}
				},
				callback : {
//									onRightClick : OnRightClick,
//								beforeClick : zTreeOnClick,
//									onAsyncSuccess: zTreeOnAsyncSuccess,
//									onDrop:zTreeOnDrop,
//									onDrag: zTreeOnDrag
				},
				edit:{
//									drag:{
//										isCopy:false
//									},
//									enable:true,
//									showRemoveBtn: false,
//									showRenameBtn: false
				},
				check:{
					enable:true
				}
			};
			var dtd = service.service("GET_ALL_FUNCTIONS",{});
			dtd.done(function(data){
				var zNodes = data;
				module.funcTree = $.fn.zTree.init($("#selectFuncTree"), setting,zNodes);
				md.resolve();
			});
			return md;
		},
		_save:function(){
			var ctx = this.context;
			var module = this;
			var model = formValues.getFormValuesBySelector("#roleForm",ctx);
			var changedNodes = this.funcTree.getChangeCheckedNodes();
			var delFuncs = [];
			var addFuncs = [];
			for(var i in changedNodes){
				var node = changedNodes[i];
				if(node.checked == true){
					addFuncs.push({eafcId:node.eafcId,eafcUrl:node.eafcUrl});
				}else{
					delFuncs.push({eafcId:node.eafcId,eafcUrl:node.eafcUrl});
				}
			}
			var dtd = service.service("SAVE_ROLE",{model:model,delFuncs:delFuncs,addFuncs:addFuncs});
			dtd.done(function(newModel){
				alert("保存成功");
				dialog.close(module);
				require(["modules/user/roleList"],function(m){
					m.refreshGrid();
				});
//				formValues.setFormValuesBySelector("#senderForm",newModel,ctx);
			});
		},
		addInit:function(){
			this._initFuncTree();
		},
		editById:function(id){
			var ctx = this.context;
			var module = this;
			var dtd = service.service("GET_ROLE",{id:id});
			dtd.done(function(model){
				formValues.setFormValuesBySelector("#roleForm",model,ctx);
			});
			var md = this._initFuncTree();
			md.done(function(){
				var funcDtd = service.service("GET_ROLE_FUNCTIONS",{roleId:id});
				funcDtd.done(function(rows){
					for(var i in rows){
						var funcId = rows[i].eafcId;
						var node = module.funcTree.getNodeByParam("eafcId", funcId, null);
						module.funcTree.checkNode(node, true, false);
						node.checkedOld = true;
					}
				});
			});
		}
	});
});