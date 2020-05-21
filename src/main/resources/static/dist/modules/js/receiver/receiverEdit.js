define(['jquery','basemodule','dialog','service','formValues'],function($,basemodule,dialog,service,formValues) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/receiver/receiverEdit.vc',
			title:'Receiver',
			isDailog:true
		},
		dialogopt:{
			modal:true,
			width:560,
			height:300
		},
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
			}
		},
		_save:function(){
			var ctx = this.context;
			var module = this;
			var model = formValues.getFormValuesBySelector("#receiverForm",ctx);
			var dtd = service.service("SAVE_RECEIVER",{model:model});
			dtd.done(function(newModel){
				alert("保存成功");
				dialog.close(module);
				require(["modules/receiver/receiverList"],function(m){
					m.refreshGrid();
				});
//				formValues.setFormValuesBySelector("#senderForm",newModel,ctx);
			});
		},
		addInit:function(){
		},
		editById:function(id){
			var ctx = this.context;
			var dtd = service.service("GET_RECEIVER",{id:id});
			dtd.done(function(model){
				formValues.setFormValuesBySelector("#receiverForm",model,ctx);
			});
		}
	});
});