/*!
 * FrosJQuery Framework 
 * Version:		1.2.5-SNAPSHOT
 * Build:		20140909
 */
define(['jquery','jqueryui','dialog','third-party/jqGrid/src/grid.base','third-party/jqGrid/src/grid.jqueryui','third-party/jqGrid/src/grid.formedit'],function($){
	//FROS-246
	$.extend($.jgrid.plugins , {
		setcolumns:{
			name:'setcolumns',
			afterBuildGrid:function(){
				var config = this[0].p;
				if(config.disableColsSetter == true){
					return;
				}
				var $self = $(this[0]);
				var id = $(this[0]).attr('id');
				var tgtCtn = "";
				if(config.pager){
					tgtCtn = config.pager;
				}else{
					tgtCtn = "#t_"+id;
				}
				$self.jqGrid('navButtonAdd',tgtCtn,{
					caption:"", 
					buttonicon:"icon-cut",
					onClickButton:function(event){
						var opts = {
							savePerm:function(colNamesArr){
								var result = "";
								for(var i=0;i<colNamesArr.length;i++){
									result = result + ',' + colNamesArr[i];
								}
								//mock code
								if($.systemMockData != undefined && result.length > 0){
									$.systemMockData.gridCols[id] = result.substr(1);
								}
							},
							done:function(perm){
								if(config.fillWidth === true){
									$self.datagrid('setFillWidth');
								}
								 if (perm) {
								 	$self.jqGrid("remapColumns", perm, true);
								 }
							}
						};
						$self.jqGrid('columnChooser',opts);//FROS-253
					}, 
					position: "last", 
					title:"设置列", 
					cursor: "pointer"
				});
				//如果想使用其他icon在此消除ui-icon
				$('.icon-cut',$(tgtCtn)).removeClass('ui-icon').removeClass('icon-cut').addClass('fa-icon icon-cut');
				//reset cols
				/*
				* Example:field1,field2...
				* 
				*/
				//mock code remove it!!!
				var mockCols = "";
				var mockColsArray = [];
				if($.systemMockData != undefined){
					mockCols = $.systemMockData.gridCols[id];
					if(mockCols!=undefined){
						mockColsArray = mockCols.split(',');
					}
				}
				//end of mock code
				//FROS-253
				if(mockColsArray.length > 0){
					var cfg = mockColsArray;
					var old = $self.jqGrid("getGridParam", "colModel");
					var perm = [];
					for(var j=0;j<old.length;j++){
						perm.push(-1);
					}
					for(var j=0;j<old.length;j++){
						var cn = old[j].name;
						var found = false;
						for(var i=0;i<cfg.length;i++){
							if(cfg[i] == cn){
								found = true;
								break;
							}
						}
						if(found == false){
							perm[j]=j;
							if(old[j].hidedlg != true){
								$self.jqGrid("hideCol",cn);
							}
						}
					}
					var cols=[];
					for(var j=0;j<cfg.length;j++){
						var cn = cfg[j];
						for(var i=0;i<old.length;i++){
							if(old[i].name == cn){
								cols.push(i);
								$self.jqGrid("showCol",cn);
							}
						}
					}
					var i=0;
					for(var j=0;j<perm.length;j++){
						if(perm[j] == -1){
							perm[j] = cols[i];
							i++;
						}
					}
					$self.jqGrid("remapColumns", perm, true);//FROS-253
				}
			}
		}
	});
});