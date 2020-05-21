define(['jquery','basemodule','formValues','AjaxProxy','dialog','service','fmatter','datagrid','datePicker','advanceSuggest','tooltip','frosBootstrapValidator','uploadControl'],function($,basemodule,FormUtil,AjaxProxy,dialog,service) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/onetomany/worklogtabedit.vc',
			title:'集成案例编辑页'
		},
		events:{
			init:function(){
				var proxy = new AjaxProxy({
					serviceName:'CommonQuery-FjWorklogitemModel'
				});
				var gid = "worklogitemGrid";
				var ctx = this.context;
				// var module = this;
				
				$('#'+gid).datagrid({
					colNames : [ 'ID', '工作内容', 'ATTRIBUTE1', 'ATTRIBUTE4', 'ATTRIBUTE7' ],
					colModel : [
			            {name : 'id',index : 'id',width : 60,hidden : true}, 
			     		{name : 'content',index : 'content',width : 280,align : "right"}, 
			     		{name:'attribute1',index:'attribute1', width:200, align:"right"}, 
			     		{name:'attribute4',index:'attribute4', width:200, align:"right",formatter : 'dateFmatter'}, 
			     		{name : 'attribute7',index : 'attribute7',width : 200}
					],
					proxy:proxy,
					shrinkToFit:false,
					autowidth:true,
					height:300,
					width:700,
					multiselect: true,
					caption : "详细日志列表",
   					regional:'cn',
   					pager:'#'+gid+'Pager',
   					sortname : 'id',
   					viewrecords : true,
   					sortorder : "desc",
   					shrinkToFit : false,
   					multiselect : true,
   					autoLoad:true,
					//查询条件
					beforeReload:function(){
						$(this).datagrid("clearUserFilterCond");
						var filterCond = FormUtil.buildGridSearchFilterCondByForm("searchForm",ctx);
						$(this).datagrid("addUserFilterCond",filterCond);
					}
				});
				
				$("#worktypeName", ctx).advanceSuggest({
					selectCode:"WORKTYPES",
					hidInput:$("#worktypeId",ctx),
					suggestBox:true
				});
				
				$("#userName", ctx).advanceSuggest({
					selectCode:"SYSUSER",
					hidInput:$("#userId",ctx),
					suggestBox:true
				});
				
				$('#editForm #workDate', ctx).datePicker({});
				$('#editForm #attribute4', ctx).datePicker({});
				
				// Note:尽量将bootstrapValidator方法写在其他控件代码的后面 
				$('#editForm', this.context).bootstrapValidator({
			        message: 'This value is not valid',
			        feedbackIcons: {
			            valid: 'glyphicon glyphicon-ok',
			            invalid: 'glyphicon glyphicon-remove',
			            validating: 'glyphicon glyphicon-refresh'
			        },
			        fields: {
				        	worktypeName: {
				        		validators: {
				        			notEmpty: {
				        				message: '该字段不能为空'
				        			}
				        		}
				        	},
			            workDate: {
			                validators: {
			                    notEmpty: {
			                        message: '该字段不能为空'
			                    },
			                    date: {
			                    	message:'该字段必须为日期格式'
			                    }
			                }
			            },
			            workLevel: {
				        		validators: {
				        			notEmpty: {
				        				message: '该字段不能为空'
				        			}
				        		}
				        	},
			            content: {
			                validators: {
			                    notEmpty: {
			                        message: '该字段不能为空'
			                    }
			                }
			            },
			            testNum1: {
			            	validators: {
			            		numeric: {
			            			message: '该字段必须是数字'
			            		}
			            	}
			            },
			            attribute4: {
			                validators: {
			                    date: {
			                    	message:'该字段必须为日期格式'
			                    }
			                }
			            },
			            attribute7: {
			                validators: {
			                	emailAddress: {
			                    	message:'该字段必须为邮箱格式'
			                    }
			                }
			            },
			            attribute8: {
			            	validators: {
			            		notEmpty: {
			                        message: '该字段不能为空'
			                    },
			            		emailAddress: {
			            			message:'该字段必须为邮箱格式'
			            		}
			            	}
			            },
			            attribute12: {
			            	validators: {
				            	choice: {
					            	min: 2,
					            	max: 4,
					            	message: '请选择 2-4 个选项'
				            	}
			            	}
			            }
			        }
			    });
				
				
				// 保存 
				$('#saveBtn',ctx).bind('click',function(){
					
					var bootstrapValidator = $('#editForm', this.context).data('bootstrapValidator');
					bootstrapValidator.validate();
					if(bootstrapValidator.isValid()){
						var model = FormUtil.getFormValuesBySelector($('#editForm'), ctx);
						var attribute12Val = '';
						$.each($("input[name='attribute12']:checked",ctx), function(i,e){
							attribute12Val += ',' + $(e).val(); 
						});
						attribute12Val = attribute12Val.substring(1);
						model.attribute12 = attribute12Val;
						
						var dtd = service.service("FJWORKLOGMANAGER_SAVE",{model:model});
						dtd.done(function(data){
							alert("保存成功");
							// $("#editForm",ctx)[0].reset();
							$("#id",ctx).val(data.id);
							$("#worklogId",ctx).val(data.id); // search form condition
							$("#recVer",ctx).val(data.recVer);
						});
						
					} else {
						return false;
					}
					
				});
				
				
				// 关闭 
				$('#closeBtn',ctx).bind('click',function(){
					require(["modules/js/onetomany/workloglist"],function(m){
						m.refreshGrid();
					});
					require(["modules/js/onetomany/worklogtabedit"],function(editModule){
						$('#maintab').tab('closeTab', editModule);
					});
				});
				
				$('#itemNewBtn',ctx).bind('click',function(){
					if($("#id",ctx).val() == ''){
						alert('请先增加主表数据！');
						return;
					}
					var worklogId = $("#id",ctx).val();
					require(["modules/js/onetomany/worklogitemedit"],function(itemEditModule){
						dialog.open(itemEditModule,{
							callback:function(){
								itemEditModule.addInit(worklogId);
							}
						});
					});
				});
				
				$("#itemEditBtn",ctx).on("click",function(){
					var ids = $('#'+gid).datagrid("getGridParam",'selarrrow');
					if(ids!=null && ids.length == 1){
						var rid = ids[0];
						var row = $('#'+gid).datagrid("getRowData",rid);
						require(["modules/js/onetomany/worklogitemedit"],function(itemEditModule){
							dialog.open(itemEditModule,{
								callback:function(){
									itemEditModule.edit(row.id);
								}
							});
						});
					}else{
						alert("请选择一条数据进行编辑!");
					}
				});
				
				$("#itemDelBtn",this.context).on("click",function(){
					var rowids = $('#'+gid).datagrid("getSelRowids");
					if(rowids!=null && rowids.length > 0){
						if(confirm("确认删除选中的数据吗？")){
							var ids = [];
							for(var i in rowids){
								var row = $('#'+gid).datagrid("getRowData", rowids[i]);
								ids.push(row.id);
							}
							var dtd = service.service("FJWORKLOGITEMMANAGER_REMOVEALLBYPKS",{ids:ids});
							dtd.done(function(){
								alert('删除数据成功！');
								$('#'+gid).datagrid().trigger('reloadGrid');
							});
						}
					}else{
						alert("请选择数据进行删除!");
					}
				});
				
				/**
				 * 文件上传
				 */
				/**
				var $ctl = $("#uploadBtn",this.context);
				var type = 'blob';
				$ctl.uploadControl({
					uploadUrl:"file/upload.vc?type=" + type,
					statusUrl:"file/uploadStatus.vc",
					showStatus:true
				});
				
				$ctl.on("checkFile",function(event,fileName,c){
					if((fileName.indexOf('png')==-1) && (fileName.indexOf('jpg')==-1)){
						alert('只能选择PNG/JPG文件');
						event.preventDefault();
					}
				});
				
				$ctl.on("succussUpload", function(event,ret,params){
					if (typeof(params) == 'undefined') return; 
					var requestParams = 'imgPath';
					if (type == 'blob') requestParams = 'imgId';
					
					var imgContainerHtml = '';
					var imgPaths = '';
					for(var i=0; i<params.length; i++){
						var imgPath = params[i];
						// 1.request img
						var imgUrl = 'file/showImage.vc?'+requestParams+'='+imgPath;
						imgUrl = encodeURI(encodeURI(imgUrl)); // 页面上进行两次编码操作，这样后台自动的那次就可以抵消掉一次  
						imgContainerHtml += '<img class="col-sm-2" src="'+imgUrl+'">';
						// Note:若需要在数据库中保存图片信息，可通过ajax请求将imgPath发送给相关manager
						imgPaths += (',' + encodeURI(encodeURI(imgPath)));
					}
					$("#imgContainer", this.context).html(imgContainerHtml);
					imgPaths = imgPaths.substring(1);
					$("#attribute11", this.context).val(imgPaths);
				});
				
				$ctl.on('failUpload',function(event,ret,params){
					alert('上传失败！');
				});
				*/
				
			},
			onShow:function(){}
		},
		edit:function(worklogId){
			$('#worklogId',this.context).val(worklogId);
			// 为表单赋值
			var dtd = service.service("FJWORKLOGMANAGER_GETEXTENDMODEL",{id:worklogId});
			dtd.done(function(extendModel){
				FormUtil.setFormValuesBySelector($('#editForm'), extendModel, this.context);
				// 为checkbox赋值
				var attribute12 = extendModel.attribute12;
				if (typeof(attribute12) !='undefined' && attribute12.length>0) {
					var arr = attribute12.split(',');
					$("input[name='attribute12']",this.context).val(arr);
				}
				// 为图片赋值
				var attribute11 = extendModel.attribute11;
				if (typeof(attribute11) == 'undefined' || attribute11 == null || attribute11.length < 1) {return false;}
				var imgPathArray = attribute11.split(",");
				var imgContainerHtml = '';
				
				var requestParams = 'imgId';
				if ((imgPathArray[0]).indexOf('/') > -1) requestParams = 'imgPath';
				for(var i=0; i<imgPathArray.length; i++){
					var imgPath = imgPathArray[i];
					// 1.request img
					var imgUrl = 'file/showImage.vc?'+requestParams+'='+imgPath;
					imgContainerHtml += '<img class="col-sm-2" src="'+imgUrl+'">';
				}
				$("#imgContainer", this.context).html(imgContainerHtml);
			});
		},
		refreshGrid:function(){
			var gid = "worklogitemGrid";
			$('#'+gid, this.context).datagrid().trigger('reloadGrid');
		}
	});
});