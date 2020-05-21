define(['jquery','basemodule','dialog','service','formValues'],function($,basemodule,dialog,service,formValues) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/service/serviceEdit.vc',
			title:'服务编辑',
			isDailog:true
		},
		dialogopt:{
			modal:true,
			width:690,
			height:300
		},
		events:{
			init:function(){
				var ctx = this.context;
				var module = this;
				$("#saveBtn",ctx).on("click",function(event){
					module._save();
				});
				$("#eascEarvIdAdv",this.context).advanceSuggest({
					selectCode:"RECEIVER",
					hidInput:$("#eascEarvId",ctx),
					suggestBox:true,
					afterSelectedRow:function(event,row){
						$("#earvName",ctx).val(row.earvName);
					}
				});
			},
			defaultAction:function(){
				this._save();
			}
		},
		_save:function(){
			var ctx = this.context;
			var module = this;
			var model = formValues.getFormValuesBySelector("#serviceForm",ctx);
			var dtd = service.service("SAVE_SERVICE",{model:model});
			dtd.done(function(newModel){
				alert("保存成功");
				dialog.close(module);
				require(["modules/service/serviceList"],function(m){
					m.refreshGrid();
				});
//				formValues.setFormValuesBySelector("#senderForm",newModel,ctx);
			});
		},
		addInit:function(){
		},
		editById:function(id){
			var ctx = this.context;
			var dtd = service.service("GET_SERVICE",{id:id});
			dtd.done(function(model){
				formValues.setFormValuesBySelector("#serviceForm",model,ctx);
			});
		}
	});
});