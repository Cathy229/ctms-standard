define(['jquery','basemodule','dialog','service','formValues'],function($,basemodule,dialog,service,formValues) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/user/userEdit.vc',
			title:'用户',
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
			var model = formValues.getFormValuesBySelector("#userForm",ctx);
			var dtd = service.service("SAVE_USER",{model:model});
			dtd.done(function(newModel){
				alert("保存成功");
				dialog.close(module);
				require(["modules/user/userList"],function(m){
					m.refreshGrid();
				});
//				formValues.setFormValuesBySelector("#senderForm",newModel,ctx);
			});
		},
		addInit:function(){
		},
		editById:function(id){
			var ctx = this.context;
			var dtd = service.service("GET_USER",{id:id});
			dtd.done(function(model){
				formValues.setFormValuesBySelector("#userForm",model,ctx);
			});
		}
	});
});