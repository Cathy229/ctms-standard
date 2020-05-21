define(['jquery','basemodule','dialog','datagrid'],function($,basemodule,dialog) {
	return $.extend(true,{},basemodule,{
		opt:{
			isDailog:true,
			custom:true,
			title:'文件上传'
		},
		dialogopt:{
			width:480,
			height:300
		},
		createCustomHtml:function(viewparams){
			return '<div><div id="groupwrapper" style="position:absolute;height:32px;">' +
			'<button id="uploadBtn" class="btn btn-info">添加</button><div id="btnwrapper" style="position:absolute;height:32px;background-color: green;width:66px;overflow:hidden;filter:alpha(opacity=0); opacity:0;">' +
			'<div id="filewrapper" style="position:absolute;height:30px;background-color: red;width:60px;overflow:hidden;filter:alpha(opacity=0); opacity:0;">' +
			'<form method="post" target="file_upload_target" enctype="multipart/form-data" action="'+viewparams.uploadUrl+'" id="fileForm">' +
			'<input type="hidden" id="param" name="param">' +
			'<input id="_tgtFile" name ="1" type="file" style="position:absolute; right:0;top:0;z-index:499;filter:alpha(opacity=0); opacity:0;">' +
			'</form>' +
			'</div>' +
			'</div>' +
			'&nbsp;<button id="sendBtn" class="btn btn-yellow">上传</button>' +
			'&nbsp;<button id="deleteBtn" class="btn btn-danger">删除</button>' +
			'' +
			'</div><div class="progress" data-percent="等待上传" style="position:absolute;height:22px;right:40px;width:200px;margin-bottom: 0px;"><div class="progress-bar" style="width:0%;"></div></div>' +
			'<div style="position:absolute;top:50px"><table id="_FileGrid" width="100%"></table></div>' +
			'<iframe id="file_upload_target" name="file_upload_target" src="" style="width:0;height:0;border:0px solid #fff;"></iframe>' +
			'</div>';
		},
		events:{
			init:function(params){
				var $self = params.triggerCtl;
				var opts = $self.data("_config");
				var c = this.context;
				var $g = $('#_FileGrid',c);
				var $f = $('#_tgtFile',c);
				var $ubtn = $('#sendBtn',c);
				var $dbtn = $('#deleteBtn',c);
				this.renderFileGrid($g);
				$('#btnwrapper',c).on('mousemove',function(event){
					var pl = $(this).offset().left;
					var pt = $(this).offset().top;
					$('#filewrapper',c).css('left',event.originalEvent.clientX-pl-10);
					$('#filewrapper',c).css('top',event.originalEvent.clientY-pt-10);
				});
				$('#btnwrapper',c).css('left',0).css('top',0);
				$('#btnwrapper',c).width($('#uploadBtn',c).outerWidth());//此处需要将frosrender放在外面执行，原因未知
				this.renderFileInput($f,$g,c,$self);
				this.renderSendBtn($ubtn,$g,c,$self);
				this.renderFileForm($g,c,$self);
				this.renderDelBtn($dbtn,c,$self);
//				var opts = cpt.getConfig($self);
				if(opts.showStatus == true){
					$('.progress',c).show();
				}else{
					$('.progress',c).hide();
				}
//				if($.browser.msie){
//					if($.browser.version =='8.0'){
//						var head = document.getElementsByTagName('head')[0];
//						var style = document.createElement('style');
//						style.type = 'text/css';
//						style.styleSheet.cssText = '.ui-dialog :before,:after{content:none !important}';
//						head.appendChild(style);
//						setTimeout(function(){
//						    head.removeChild(style);
//						}, 0);
//					}
//					if($.browser.version =='7.0'){
//						var tgt = c.prev();
//						var $ni = $('<span class="fa-icon icon-remove"></span>');
//						$ni.css('top','0').css('position','absolute').css('right','8px').insertAfter($('.ui-dialog-titlebar-close',tgt).hide());
//						$ni.click(function(event){
//							event.preventDefault();
//							c.dialog("close");
//						});
//					}
//				}
			}
		},
		renderDelBtn:function($dbtn,c,$self){
			$dbtn.on('click',function(){
				var rid = $("#_FileGrid").jqGrid('getGridParam','selrow');
				if(rid!=null){
					$("#_FileGrid").jqGrid('delRowData',rid);
					$('#fileForm > input[name='+rid+']',c).remove();
				}
			});
		},
		isNotNull:function(value,checknullstr){
			if(checknullstr){
				if(value!=null && value!='null' && value!=""){
					return true;
				}
			}else{
				if(value!=null && value!=""){
					return true;
				}
			}
			return false;
		},
		renderFileForm:function($grid,c,$self){
//			var cpt = this;
			var module = this;
			var opts = $self.data("_config");
			if(window.attachEvent){
			  document.getElementById("file_upload_target").attachEvent('onload', uploadCallback);
			}else{
			  document.getElementById("file_upload_target").addEventListener('load', uploadCallback, false);
			} 
			//提交回调函数
			function uploadCallback(){
				 var io = document.getElementById("file_upload_target");
				 var s = "";
				 //针对不同浏览器，取后台返回的数据
				if(io.contentWindow){
					s = io.contentWindow.document.body?io.contentWindow.document.body.innerHTML:null;
				}else if(io.contentDocument) {
					s = io.contentDocument.document.body?io.contentDocument.document.body.innerHTML:null;
				}
				if(module.isNotNull(s)){
					//将后台返回数据(String)对象化(Object)
					var o = eval("("+s+")");
					if(module.isNotNull(o) && module.isNotNull(o.success)){
						if(o.success == true || o.success == 'true'){
							var rows = $grid.jqGrid('getRowData');
							var ret = [];
							for(var i = 0;i<rows.length;i++){
								var r = {};
								r.filename = rows[i].filename;
								r.isUpload = rows[i].isUpload;
		            			ret.push(r);
			            	}
							$self.triggerHandler("succussUpload",[ret,o.params]);
//							cpt.triggerEvent( cpt.events.succussUpload,ret,o.params,$self);
						}else{
							$self.triggerHandler("failUpload");
//							cpt.triggerEvent( cpt.events.failUpload,$self);
						}
//						var dlg = cpt.getCache('filedlg',$self);
//						dlg.dialog("close");
						dialog.close(module);
					}else{
						alert('上传返回结果不符合规范');
					}
				}
				if(opts.showStatus == true){
					var s = $self.data('_interval');
//					var s = cpt.getCache('_interval',$self);
					clearInterval(s);
				}
			}
		},
		renderFileGrid:function($grid){
			$grid.jqGrid( {
				datatype : "local",
				width:450,
				colNames : [ '文件','是否上传'],
				colModel : [ {
					name : 'filename',
					index : 'filename',
					width : 160
				}, {
					name : 'isUpload',
					index : 'isUpload',
					width : 90
				}]
			});
		},
		renderFileInput:function($f,$grid,c,$self){
			var cpt = this;
			$f.on('change',function(event){
				addFile(event);
			});
			var fileSeq = 1;
			$self.data('_seq',fileSeq);
//			cpt.setCache('_seq',fileSeq,$self);
			function addFile(event){
				var $this = $(event.target);
				var fn = $this.val();
				if(fn.lastIndexOf("\\") != -1){
					fn = fn.substr(fn.lastIndexOf("\\")+1,fn.length);
				}
				var checkFileEvent = $.Event( "checkFile" );
				$self.triggerHandler(checkFileEvent,[fn]);
				
				var nrid = fileSeq;
				
				var nname = fileSeq+1;
				var newFile = $('<input name ="'+nname+'" type="file" style="position:absolute; right:0;top:0;z-index:499;filter:alpha(opacity=0); opacity:0;">');
				newFile.on('change',function(event){
					addFile(event);
				});
				$this.after(newFile);
				$this.hide();
				fileSeq = fileSeq +1;
//				cpt.setCache('_seq',fileSeq,$self);
				$self.data('_seq',fileSeq);
				if(checkFileEvent.isDefaultPrevented()){
					$this.remove();
				}else{
					$grid.jqGrid('addRowData',nrid,{filename:fn,isUpload:'N'});
				}
			}
		},
		renderSendBtn:function($ubtn,$grid,c,$self){
			var cpt = this;
			$ubtn.on('click',function(){
				var fileNums = $('#fileForm > input[type=file]',c).length - 1;
				if(fileNums == 0){
					alert("未选择文件用于上传");
					return;
				}
				var opts = $self.data("_config");
				if(opts.limit != -1 && opts.limit > 0){
					//如果设置为0，认为没有意义，应该在外层规避
					if(fileNums > opts.limit){
						alert("超出上传文件总数，最多一次上传"+opts.limit+"个文件。");
						return;
					}
				}
				$('#fileForm > :last-child',c).remove();
				if($.isFunction(opts.getExtraParam)){
					var param = opts.getExtraParam();
					$('#fileForm > #param',c).val(param);
				}
				$('#fileForm',c).submit();
				if(opts.showStatus == true){
					var s = setInterval(function(){
						$.ajax({  
				            type:"get",  
				            cache:false,
				            url:opts.statusUrl,//响应文件上传进度的servlet
				            success:function(msg){
				            	if(msg.indexOf('NOTSTART') != -1){
				            		return;
				            	}
				            	if(msg.indexOf('DONE') != -1){
				            		clearInterval(s);
				            		var ids = $grid.jqGrid('getDataIDs');
				            		for(var i = 0;i<ids.length;i++){
				            			$grid.jqGrid('setCell',ids[i],'isUpload','Y');
				            		}
			            			$('.progress',c).attr('data-percent','上传完毕，正在处理...');
			            			$('.progress-bar',c).css('width','100%');
				            	}else{
				            		var ma = msg.split(';');
									for(var i = 0;i<(ma[1]-1);i++){
										$grid.jqGrid('setCell',i,'isUpload','Y');
									}
				            		$('.progress',c).attr('data-percent',ma[0]+'%');
				            		$('.progress-bar',c).css('width',ma[0]+'%');
				            	}
				            }
				        });
					},opts.interval);
					$self.data('_interval',s);
				}
			});
		}
	});
});