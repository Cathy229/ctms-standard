define(['jquery','basemodule','formValues','AjaxProxy','dialog','service','fmatter','datagrid'],function($,basemodule,FormUtil,AjaxProxy,dialog,service) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/user/userFunction.vc',
			title:'功能列表',
			tabpadding:0
		},
		events:{
			init:function(){
//				var c = $(this);
				var c = this.context;
				var module = this;
				var setting = {
					async : {
						enable : true,
						url : "service/GET_SUB_FUNCTION",
						autoParam : [ "eafcId=pid" ],
						dataFilter : filter
					},
					check: {
						enable: true
					},
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
						onRightClick : OnRightClick,
						beforeClick : zTreeOnClick,
						onAsyncSuccess: zTreeOnAsyncSuccess,
						onDrop:zTreeOnDrop,
						onDrag: zTreeOnDrag
					},
					edit:{
						drag:{
							isCopy:false
						},
						enable:true,
						showRemoveBtn: false,
						showRenameBtn: false
					}
				};
				var zTree = null;
				function zTreeOnDrag(event, treeId, treeNodes) {
					if(treeNodes.length == 1){
						var pn = treeNodes[0].getParentNode();
						if(pn.children != null && pn.children.length > 1){
							
						}else{
							pn.isParent = false;
							pn.nocheck = false;
							zTree.updateNode(pn);
						}
					}
				}
				function zTreeOnDrop(event, treeId, treeNodes, targetNode, moveType) {
					if(moveType == null){
						var pn = treeNodes[0].getParentNode();
						pn.isParent = true;
						pn.nocheck = true;
						zTree.updateNode(pn);
					}
					if(moveType == 'inner'){
						if(treeNodes.length == 1){
							var movedNode = treeNodes[0];
							var nid = movedNode.eafcId;
							var tid = targetNode.eafcId;
							var nrecVer = movedNode.recVer;
							var dtd = service.service("UPDATE_FUNCTION",{id:nid,pid:tid,recVer:nrecVer});
							dtd.done(function(){
								targetNode.isParent = true;
								targetNode.nocheck = true;
								zTree.updateNode(targetNode);
							});
						}
					}
				}
				
				function zTreeOnAsyncSuccess(event, treeId, treeNode, msg) {
					
					if(treeNode == undefined){
						var root =  zTree.getNodesByParam("eafcId", "1", null)[0];
//						zTree.expandNode(root, true, false, true);
					}else{
						if(treeNode.children!=undefined && treeNode.children !=null && treeNode.children.length > 0 ){
							
						}else{
							treeNode.isParent = false;
							treeNode.nocheck = false;
							zTree.updateNode(treeNode);
						}
					}
				}
				function filter(treeId, parentNode, childNodes) {
					var childNodes = childNodes.data;
					if (!childNodes)
						return null;
					for (var i = 0, l = childNodes.length; i < l; i++) {
						if (childNodes[i].isParent == 'true') {
							childNodes[i].isParent = true;
							childNodes[i].nocheck = true;
						} else {
							childNodes[i].isParent = false;
							childNodes[i].nocheck = false;
						}
					}
					return childNodes;
				}
				
				function zTreeOnClick(event, treeNode, clickFlag) {
					//判断是否第一次选中，如果是则调用后台刷新form
					if (!zTree.isSelectedNode(treeNode)) {
						selectOrgNode(treeNode.eafcId,treeNode);
					}
				}
				function OnRightClick(event, treeId, treeNode) {
					var rMenu = $('#menuCnt', c);
					var obj = rMenu.offsetParent();
					var curleft = event.clientX;
					var curtop = event.clientY;
					while (obj.prop('tagName').toLowerCase() != 'body' && obj.prop('tagName').toLowerCase() != 'html') {
						if (obj.prop('tagName').toLowerCase() == 'div') {
							curleft = curleft - obj.position().left
									+ obj.scrollLeft();
							curtop = curtop - obj.position().top
									+ obj.scrollTop();
						}
						obj = obj.offsetParent();
					}
					//对于临时节点和叶子节点不显示刷新子公司节点
					if(!(treeNode.children!=undefined && treeNode.children !=null && treeNode.children.length > 0 ) || treeNode.fjogId == '_tempid'){
						$('#menu > li[menuid=refresh]',c).css('display','none');
					}else{
						$('#menu > li[menuid=refresh]',c).css('display','');
					}
					//存在子节点不能删除
					if(treeNode.isParent==true){
						$('#menu > li[menuid=del]',c).css('display','none');
					}else{
						$('#menu > li[menuid=del]',c).css('display','');
					}
					rMenu.css({
						"top" : curtop + "px",
						"left" : curleft + "px",
						"visibility" : "visible"
					});
					//选中右键所指向的节点
					if (!zTree.isSelectedNode(treeNode)) {
						selectOrgNode(treeNode.eafcId,treeNode);
					}
				}
				function selectOrgNode(id,treeNode){
					zTree.selectNode(treeNode);
					if(treeNode.eafcId == '_tempid'){
						var tn = $.extend({},treeNode);
							
						tn.eafcId = null;
						FormUtil.setFormValuesBySelector('#userFuncForm',tn,c);
						$('#alertinfo').hide();
					}else{
						var dtd = service.service("GET_FUNCTION",{id:id});
						dtd.done(function(newModel){
							FormUtil.setFormValuesBySelector("#userFuncForm",newModel,c);
						});
					}
				}
				zTree = $.fn.zTree.init($("#functree"), setting);
				$('#menu', c).menu({
					select : function(event, ui) {
						var sn = zTree.getSelectedNodes()[0];
						if (ui.item.attr('menuid') == 'add') {
							if(sn.eafcId == "_tempid"){
								alert("请先保存选中节点机构，再增加子公司！");
								return;
							}
							var newNode = {eafcUrlDesc:"功能名称",eafcUrl:"",eafcParentId:sn.eafcId,eafcId:"_tempid"};
							var newNodes = zTree.addNodes(sn, newNode);
							selectOrgNode("_tempid",newNodes[0]);
							sn.isParent = true;
							sn.nocheck = true;
							zTree.updateNode(sn);
						}
						if (ui.item.attr('menuid') == 'refresh') {
							zTree.reAsyncChildNodes(sn, "refresh");
						}
						if (ui.item.attr('menuid') == 'del') {
							//删除节点公司
							var msg = "确认要删除选中功能？";
							if(confirm(msg)){
								var delId = sn.eafcId;
								if(delId == '_tempid'){
									removeNode(sn);
									//alert('删除成功！');
								}else{
									var dtd = service.service("DEL_FUNCTION",{id:delId});
									dtd.done(function(){
										removeNode(sn);
									});
								}
							}
						}
						var rMenu = $('#menuCnt', c);
						rMenu.css({
							"visibility" : "hidden"
						});
					}
				});
				function removeNode(sn){
					var pn = sn.getParentNode();
					zTree.removeNode(sn);
					if(pn.children!=null && pn.children.length > 0){
						
					}else{
						pn.isParent = false;
						pn.nocheck = false;
						zTree.updateNode(pn);
					}
				}
				$("body").bind("mousedown.rm", onBodyMouseDown);
				function onBodyMouseDown(event) {
					var rMenu = $('#menuCnt', c);
					if (!(event.target.id == "menuCnt" || $(event.target)
							.parents("#menuCnt").length > 0)) {
						rMenu.css({
							"visibility" : "hidden"
						});
					}
				}
				$('#saveBtn',c).on('click',function(event){
					$('#alertinfo').hide();
					module._save(zTree);
				});
				//
				$('#refreshBtn',c).on('click',function(event){
					//var root =  zTree.getNodesByParam("fjogId", "1", null)[0];
					zTree.reAsyncChildNodes(null, "refresh");
				});
				//
				$('#delBtn',c).on('click',function(event){
					var nodes = zTree.getCheckedNodes(true);
					if(nodes.length > 0){
						var delIds = [];
						for(var n in nodes){
							delIds.push(nodes[n].eafcId);
						}
						var dtd = service.service("DEL_MULTY_FUNCTION",{ids:delIds});
						dtd.done(function(newModel){
							for(var n in nodes){
								removeNode(nodes[n]);
							}
							alert('删除成功！');
						});
						
					}
				});
				$('.alert button.close').on('click',function(){
					$('#alertinfo').hide();
				});
				$('#alertinfo').hide();
			},
			
			onShow:function(){
//				alert("show app1");
			},
			resize:function(){
				var h = this.context.outerHeight() - $("#orgCnt > :first-child", this.context).outerHeight();
				$('#orgCnt > .widget-body', this.context).height(h-1);
				var w = this.context[0].clientWidth - 250;
				w = w - 20;//padding
				$('#editCnt', this.context).width(w-1);
			}
		},
		_save:function(zTree){
			var ctx = this.context;
			var model = FormUtil.getFormValuesBySelector("#userFuncForm",ctx);
			var dtd = service.service("SAVE_FUNCTION",{model:model});
			dtd.done(function(newModel){
				alert("保存成功" );
				FormUtil.setFormValuesBySelector("#userFuncForm",newModel,ctx);
				//refresh treenode
				var sn = zTree.getSelectedNodes()[0];
				sn.eafcUrlDesc = newModel.eafcUrlDesc;
				sn.eafcUrl = newModel.eafcUrl;
				sn.eafcId = newModel.eafcId;
				zTree.updateNode(sn);
			});
		},
		refreshGrid:function(){
			var gid = "user_grid";
			$('#'+gid).datagrid().trigger('reloadGrid');
		}
	});
});