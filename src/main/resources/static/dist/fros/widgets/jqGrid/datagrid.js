/*
 * 数据查询Grid
 */
define(['jquery','third-party/jqGrid/src/grid.base','style!third-party/jquery/jquery-ui/jquery-ui.min',
		'style!third-party/jqGrid/src/css/ui.jqgrid'],function($){
	require(['style!third-party/jqGrid/src/css/jqgrid','style!third-party/jquery/jquery-ui/jquery-ui-custom']);
	$.jgrid.extend({
		/*
		 * 非获取数据方法，返回本身
		 */
		reload:function(){
			return this.each(function (){
				var $t = this;
				var config = $t.p;
				var sort = "";
				if(config.defaultSortname){
					sort = config.defaultSortname;
				}
				var order = "";
				if(config.defaultSortorder){
					order = config.defaultSortorder;
				}
				var jqGrid = $(this);
				$("span.s-ico",jqGrid[0].grid.hDiv).hide();
				$("[aria-selected]",jqGrid[0].grid.hDiv).attr("aria-selected",false);
				config.beforeReload.call(this);
				jqGrid.datagrid('setGridParam',{sortname: sort,page:1,lastsort:0,sortorder:order}).trigger('reloadGrid');
			});
		},
		clearUserFilterCond:function(){
			return this.each(function (){
				var t = this;
				var config = t.p;
				config.userFilterCond = [];
			});
		},
		addUserFilterCond:function(filterCond){
			return this.each(function (){
				var t = this;
				var config = t.p;
				config.userFilterCond = filterCond;
			});
		},
		/*
		 * 获取数据的方法，返回数据
		 */
		getQueryData:function(){
			var $t = this[0];
			return $t.p.querydata;
		},
		getRowDataByRowId:function(rid){
			var $t = this[0];
			return $t.p.querydata[rid-1];
		},
		getSelRowids:function(){
			var rids = $(this[0]).jqGrid("getGridParam",'selarrrow');
			var newrids =rids.slice(0);
			return newrids;
		},
		/*
		 * 设置Grid高度，整个View的高度
		 */
		setViewHeight:function(height){
			return this.each(function (){
				var t = this;
				var config = t.p;
				var $t = $(this);
				var id = $t.attr('id');
				var barHeight = 0;
				if(config.caption){
					barHeight = $('.ui-jqgrid-titlebar',$('#gview_'+id)).outerHeight();
				}
				var hdivHeight = $('.ui-jqgrid-hdiv',$('#gview_'+id)).outerHeight();
				var pagerHeight = 0;
				if(config.pager){
					pagerHeight = $(config.pager).outerHeight();
				}else{
					pagerHeight = $("#t_"+id).outerHeight();
				}
				var result = height - barHeight - hdivHeight - pagerHeight;
				$t.jqGrid("setGridHeight",result-1);//ui-jqgrid-bdiv top-border=1px
			});
		},
		setFillWidth:function(){
			return this.each(function (){
				var t = this;
				var config = t.p;
				var $t = $(this);
				var gid=$t.attr('id');
				$("#gbox_"+gid).css("width","100%");
				$("#gview_"+gid).css("width","100%");
				$(".ui-jqgrid-hdiv",$("#gview_"+gid)).css("width","100%");
				$(".ui-jqgrid-bdiv",$("#gview_"+gid)).css("width","100%");
				if(config.pager!=undefined && config.pager!=""){
					$(config.pager).css("width","100%");
				}else{
					$("#t_"+gid).css("width","100%");
				}
			});
		},
		_afterBuildGrid:function(){
			var plugins = $.jgrid.plugins;
			for(var plugin in plugins){
				plugins[plugin]['afterBuildGrid'].call(this);
			}
		},
		_init:function(self,options){
			if(self.grid) {return;}
			var grid = self;
			var defaultOption = {
				jsonReader : {
					root:"dataList",
			      	page: "pagingInfo.currentPage",
			      	total: "pagingInfo.totalPages",
			      	records: "pagingInfo.totalRows",
			      	repeatitems: false,
			      	cell: "",
			      	id: ""
				},
				userFilterCond:[],//用户可以自定义的过滤动态条件
				filterCond:[],//用户自定义静态条件
				beforeReload:function(){},
				onRowEnter:function(){},
				onRowSpace:function(){},
				autoLoad:false,
				rowNum : 10,
				rowList : [ 10, 20, 30 ],
				viewrecords : true,
				fillWidth:true,
				regional:'cn',
				datatype: function(postdata) {
					var $this = this;
					if(this.p._loaded == false){
						this.p._loaded = true;
						return;
					}
					var i = 0;
					for(var key in this.p.changedData){
						i++;
					}
					var queryInfo = {};
					if(this.p.pager!=null){
						var pagingInfo = {};
						pagingInfo.pageSize = postdata.rows;
						pagingInfo.currentPage = postdata.page;
						queryInfo.pagingInfo = pagingInfo;
					}
					if(postdata!=null && postdata.sidx!=undefined && postdata.sidx!=null&& postdata.sidx!=""){
						if(postdata.sord!=null && postdata.sord=='desc'){
							sortway = "desc";
						}else{
							sortway = "asc";
						}
						queryInfo.orderBy = postdata.sidx+" "+sortway;
					}else{
						//如果不存在排序查看是否有默认排序
						var sort = "";
						if(this.p.defaultSortname){
							sort = this.p.defaultSortname;
						}
						var order = "";
						if(this.p.defaultSortorder){
							order = this.p.defaultSortorder;
						}
						queryInfo.orderBy = sort+" "+order;
					}
					var filterCond = this.p.filterCond;
					var queryFields = [];
					queryFields = queryFields.concat(filterCond);
					queryFields = queryFields.concat(this.p.userFilterCond);
					queryInfo.queryFields = queryFields;
					var post = this.p.proxy.loadData(queryInfo);
					post.done(function(data){
						if(data != null && data.dataList != null){
							
							if(data.dataList.length !=undefined){
								grid.p.currSeq = data.dataList.length;
							}else{
								grid.p.currSeq = 0;
							}
							grid.p.changedData = {};
							result = data.dataList;
							grid.addJSONData(data);
							grid.p.querydata = result;
							var id = $(grid).attr('id');
							
							if($("#t_"+id).length > 0){
								var tot = data.dataList.length;
								var rt = $.jgrid.getRegional(grid, "defaults.recordtext", grid.p.recordtext);
								$('.fros-pg-info',$("#t_"+id)).html($.jgrid.template( rt ,1,tot,tot));
							}
							
							// example: $('#gridId').on("afterLoad", function(event, data){ console.log(data); });
							$($this).triggerHandler("afterLoad", [result]);
						}
					});
				}
			};
			options = $.extend(true,defaultOption,options);
			var fixedOpt = {
				_loaded:false
			};
			options = $.extend(true,options,fixedOpt);
			if(options.pager == undefined){
				if(options.toolbar==undefined){
					options.toolbar= [true,"bottom"];
				}
				options.rowNum = -1;
			}
			var regionalDeps ='third-party/jqGrid/src/i18n/grid.locale-'+ options.regional;
			require([regionalDeps],function(){});
			
			$(self).jqGrid(options);
			//pagerconfig
			var tgtCtn = options.pager;
			var $pager = $('.ui-pager-control',$(tgtCtn));
			$('.ui-icon-seek-prev',$pager).removeClass('ui-icon-seek-prev').removeClass('ui-icon').addClass('fa-icon icon-angle-left');
			$('.ui-icon-seek-first',$pager).removeClass('ui-icon-seek-first').removeClass('ui-icon').addClass('fa-icon icon-double-angle-left');
			$('.ui-icon-seek-next',$pager).removeClass('ui-icon-seek-next').removeClass('ui-icon').addClass('fa-icon icon-angle-right');
			$('.ui-icon-seek-end',$pager).removeClass('ui-icon-seek-end').removeClass('ui-icon').addClass('fa-icon icon-double-angle-right');
			var gview = "#gview_"+$(self).attr('id');
			$('.ui-icon-circle-triangle-n',$('.ui-jqgrid-titlebar',$(gview))).removeClass('ui-icon').addClass('fa-icon');
			$('.ui-icon-triangle-1-n',$('.ui-jqgrid-hbox',$(gview))).removeClass('ui-icon-triangle-1-n').removeClass('ui-icon').addClass('fa-icon icon-caret-up');
			$('.ui-icon-triangle-1-s',$('.ui-jqgrid-hbox',$(gview))).removeClass('ui-icon-triangle-1-s').removeClass('ui-icon').addClass('fa-icon icon-caret-down');
			$(options.pager+'_center',$(tgtCtn)).width(300);
			$(self).on('jqGridAfterGridComplete',function(){
				$(options.pager+'_center',$(tgtCtn)).width(300);
			});
			
			//键盘操作
			var $t = $(self);
			$t.on('jqGridAfterGridComplete',function(){
				if(this.p.multiselect == true){
					$('.cbox',$(this)).attr("tabindex","-1");
				}
			});
			$t.jqGrid('bindKeys', {
					"onEnter":function( rowid,event ) { 
						this.p.onRowEnter.call(this,rowid);
						event.preventDefault();
					},
					"onSpace":function( rowid,event ) {
						if(this.p.multiselect == true){
							$(this).jqGrid("setSelection",rowid,true,event);
						}
						this.p.onRowSpace.call(this,rowid);
						event.preventDefault();
					}
				} 
			);
			$t.keydown(function(event){
				//editgrid时需要阻止此事件
				if(event.which == 9){
					if(this.p.multiselect == true){
						$('.ui-state-selected',$(this)).attr('tabindex','-1');
					}else{
						$('.jqgrow[tabindex=0]',$(this)).attr('tabindex','-1');
					}
				}
			});
			$t.focusout(function(event){
				if(this.p.multiselect == true){
					$('.ui-state-selected',$(this)).removeClass('ui-state-selected').attr('tabindex','-1');
				}
				$(this).attr('tabindex','0');
				$('.jqgrow[tabindex=0]',$(this)).attr('tabindex','-1');
				grid.p.mousedown = false;
			});
			var $twrapper = $('.ui-jqgrid-bdiv',$('#gbox_'+$t.attr('id')));
			$twrapper.attr('tabindex','-1');//兼容FF
			$t.attr('tabindex','0');
			grid.p.mousedown = false;
			$t.on('mousedown', function () {
				grid.p.mousedown = true;
			});
			$t.focusin(function(event){
				if(!grid.p.mousedown){
					//非鼠标点击
					if(this.p.multiselect == true){
						if(grid.p.editTab != false && grid.p.shiftKey!=true){
							$('.jqgrow:first',$t).addClass('ui-state-selected').attr('tabindex','0');
							var $container = $('.ui-jqgrid-bdiv',$('#gbox_'+$t.attr('id')));
							$container.scrollTop(0);
						}
					}else{
						//single select
						if(this.p.cellEdit!=true){
							if(this.p.selrow != null){
								var r = $t.jqGrid('getGridRowById', this.p.selrow);
								$(r).attr('tabindex','0');
							}else{
								$t.jqGrid('setSelection', 1, true, event);
							}
						}
					}
				}
			});
			if(options.multiselect == true){
				$('#cb_'+$t.attr('id')).attr("tabindex","-1");
			}
			
			require(['fros/widgets/jqGrid/plugins/export.excel', 'fros/widgets/jqGrid/plugins/setcolumns'],function(){
				var id=$t.attr('id');
				if(options.pager){
					$(self).jqGrid('navGrid',options.pager,{edit:false,add:false,del:false,search:false,refresh:false});
				}else{
					$("#t_"+id).append('<table cellspacing="0" cellpadding="0" border="0" class="ui-pg-table" style="float:right;table-layout:auto;"><tbody><tr><td class="fros-pg-info"></td></tr></tbody></table>');
					$("#t_"+id).append('<table cellspacing="0" cellpadding="0" border="0" class="ui-pg-table navtable" style="float:left;table-layout:auto;"><tbody><tr></tr></tbody></table>');
				}
				//
				if(options.autoLoad === true){
					$(self).datagrid('reload');
				}
				if(options.fillWidth === true){
					$(self).datagrid('setFillWidth');
				}
				$(self).datagrid('_afterBuildGrid');
			});
			
		}
	});
	$.jgrid = $.jgrid || {};
	$.extend($.jgrid,{
		plugins:{}
	});
	$.fn.datagrid = function(options){
		if (typeof options == 'string') {
			var fn = $.jgrid.getMethod(options);
			if (!fn) {
				throw ("jqGrid - No such method: " + options);
			}
			var args = $.makeArray(arguments).slice(1);
			return fn.apply(this,args);
		}
		return this.each( function() {
			$(this).datagrid('_init',this,options);
		});
	};
	
});
