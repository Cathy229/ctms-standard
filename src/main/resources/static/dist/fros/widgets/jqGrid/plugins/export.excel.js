/*!
 * FrosJQuery Framework 
 * Version:		1.2.5-SNAPSHOT
 * Build:		20141008
 */
define(['jquery','service','AjaxProxy','LocalProxy'],function($,service,AjaxProxy,LocalProxy){
	var f = window.FrosJquery || {};
	$.projectConfig = $.projectConfig||{};
	$.projectConfig.excel = $.projectConfig.excel ||{};
	$.projectConfig.excel.dataUrl = "dist/fros/widgets/jqGrid/exportexcel.jsp";
	//FROS-220
	var excelUtil = {
		getExcelFileByGridRecords:function(includeHidden,records,gridConfig,filename){
			var vExportContent = this.getExcelXmlByGridRecords(includeHidden,records,gridConfig);
			var dataURL = $.projectConfig.excel.dataUrl;
	        params =[{
	           	name: 'ex',
	           	value: vExportContent 
	        },{
	           	name: 'FileName',
	          	value: filename
	        }];
	        this.post_to_url(dataURL, params, 'post');
		},
		getExcelXmlByGridRecords:function(includeHidden,records,gridConfig){
			var worksheet = this.createWorksheetByGridRecords(includeHidden,records,gridConfig);
			return this.getExcelXml(includeHidden,worksheet,gridConfig);
		},
		createWorksheetByGridRecords:function(includeHidden,records,gridConfig){
			var cellType = [];
	        var cellTypeClass = [];
	        var cm = gridConfig.colModel;
	        var totalWidthInPixels = 0;
	        var colXml = '';
	        var headerXml = '';
	        var visibleColumnCountReduction = 0;
	        var colCount = gridConfig.colModel.length;
	        for (var i = 0; i < colCount; i++) {
	            if ((cm[i] != ''&& cm[i].name !='cb')
	                && (includeHidden || !cm[i].hidden)) {
	                var w = cm[i].width;
	                totalWidthInPixels += w;
	                if (gridConfig.colNames[i] === ""){
	                	cellType.push("None");
	                	cellTypeClass.push("");
	                	++visibleColumnCountReduction;
	                }
	                else
	                {
	                    colXml += '<ss:Column ss:AutoFitWidth="1" ss:Width="' + w + '" />';
	                    headerXml += '<ss:Cell ss:StyleID="headercell">' +
	                        '<ss:Data ss:Type="String">' + gridConfig.colNames[i] + '</ss:Data>' +
	                        '<ss:NamedCell ss:Name="Print_Titles" /></ss:Cell>';
	                    var fld = cm[i];
	                    switch(fld.type) {
	                        case "int":
	                            cellType.push("Number");
	                            cellTypeClass.push("int");
	                            break;
	                        case "float":
	                            cellType.push("Number");
	                            cellTypeClass.push("float");
	                            break;
	                        case "bool":
	                        case "boolean":
	                            cellType.push("String");
	                            cellTypeClass.push("");
	                            break;
	                        case "date":
	                            cellType.push("DateTime");
	                            cellTypeClass.push("date");
	                            break;
	                        default:
	                            cellType.push("String");
	                            cellTypeClass.push("");
	                            break;
	                    }
	                }
	            }
	        }
	        var visibleColumnCount = cellType.length - visibleColumnCountReduction;
	
	        var result = {
	            height: 9000,
	            width: Math.floor(totalWidthInPixels * 30) + 50
	        };
	        // Generate worksheet header details.
	        var title = gridConfig.caption ||"data";
	        var t = '<ss:Worksheet ss:Name="' + title + '">' +
	            '<ss:Names>' +
	            '<ss:NamedRange ss:Name="Print_Titles" ss:RefersTo="=\'' + title + '\'!R1:R2" />' +
	            '</ss:Names>' +
	            '<ss:Table x:FullRows="1" x:FullColumns="1"' +
	            ' ss:ExpandedColumnCount="' + (visibleColumnCount + 2) +
	            '">' +
	            colXml +
	            '<ss:Row ss:AutoFitHeight="1">' +
	            headerXml +
	            '</ss:Row>';
	        var codeValues = gridConfig.proxy._fieldCodeValues;
	        // Generate the data rows from the data in the Store
	        for (var i = 0, it = records, l = it.length; i < l; i++) {
	            var tmp = '<ss:Row>';
	            var cellClass = (i & 1) ? 'odd' : 'even';
	            r = it[i];
	            var k = 0;
	            for (var j = 0; j < colCount; j++) {
	                if ((cm[j] != ''&& cm[j].name !='cb')
	                    && (includeHidden || !cm[j].hidden)) {
	                    var v = r[cm[j].name];
	                    
	                    if (cellType[k] !== "None") {
	                        tmp += '<ss:Cell ss:StyleID="' + cellClass + cellTypeClass[k] + '"><ss:Data ss:Type="' + cellType[k] + '">';
	                        
	                        if(cm[j].formatter == 'dateFmatter'){
	                        	tmp += this.formatDate('yy-MM-dd',v,null);
	                        }
	                        else if (cm[j].formatter == 'datetimeFmatter'){
	                        	tmp += this.formatDate('yy-MM-dd hh:mm:ss',v,null);
	                        }
	                        else if (cm[j].formatter == 'selectCode'){
	                        	if(gridConfig.proxy.fieldCodeTypes[cm[j].name]){
	                        		if(v){
	                        			var selectCode = gridConfig.proxy.fieldCodeTypes[cm[j].name];
	                        			tmp += (codeValues[selectCode][v]==null||codeValues[selectCode][v]==undefined)?"":codeValues[selectCode][v];
	                        		}else{
	                        			tmp += "";
	                        		}
	                        	}
	                        }
	                        // 调用自定义format函数 
	                        else if($.isFunction(cm[j].formatter)){
	                        	// jqgrid formatter demo: function customFmatter(cellvalue, options, rowObject)
	                        	//jqgrid formatter config parameter
	                        	var formatterConfig={};
	                        	formatterConfig.colModel = cm[j];
	                        	formatterConfig.gid = gridConfig.id;
	                        	formatterConfig.pos = j;
	                        	formatterConfig.rowId = v;
	                        	
	                        	tmp += cm[j].formatter(v,formatterConfig,r,null,gridConfig);
	                        }else{
	                        	tmp += v==null?"":v;
	                        }
	                        tmp +='</ss:Data></ss:Cell>';
	                    }
	                    k++;
	                }
	            }
	            t += tmp;
	            t += '</ss:Row>';
	            
	        }
	        result.xml = t + '</ss:Table>' +
	            '<x:WorksheetOptions>' +
	            '<x:PageSetup>' +
	            '<x:Layout x:CenterHorizontal="1" x:Orientation="Landscape" />' +
	            '<x:Footer x:Data="Page &amp;P of &amp;N" x:Margin="0.5" />' +
	            '<x:PageMargins x:Top="0.5" x:Right="0.5" x:Left="0.5" x:Bottom="0.8" />' +
	            '</x:PageSetup>' +
	            '<x:FitToPage />' +
	            '<x:Print>' +
	            '<x:PrintErrors>Blank</x:PrintErrors>' +
	            '<x:FitWidth>1</x:FitWidth>' +
	            '<x:FitHeight>32767</x:FitHeight>' +
	            '<x:ValidPrinterInfo />' +
	            '<x:VerticalResolution>600</x:VerticalResolution>' +
	            '</x:Print>' +
	            '<x:Selected />' +
	            '<x:DoNotDisplayGridlines />' +
	            '<x:ProtectObjects>False</x:ProtectObjects>' +
	            '<x:ProtectScenarios>False</x:ProtectScenarios>' +
	            '</x:WorksheetOptions>' +
	            '</ss:Worksheet>';
	        return result;
		},
		getExcelXml: function(includeHidden,worksheet,gridConfig) {
	        var totalWidth = worksheet.width;
	        var title = gridConfig.caption ||"data";
	        return '<?xml version="1.0" encoding="utf-8"?>' +
	            '<ss:Workbook xmlns:ss="urn:schemas-microsoft-com:office:spreadsheet" xmlns:x="urn:schemas-microsoft-com:office:excel" xmlns:o="urn:schemas-microsoft-com:office:office">' +
	            '<o:DocumentProperties><o:Title>' + title + '</o:Title></o:DocumentProperties>' +
	            '<ss:ExcelWorkbook>' +
	            '<ss:WindowHeight>' + worksheet.height + '</ss:WindowHeight>' +
	            '<ss:WindowWidth>' + worksheet.width + '</ss:WindowWidth>' +
	            '<ss:ProtectStructure>False</ss:ProtectStructure>' +
	            '<ss:ProtectWindows>False</ss:ProtectWindows>' +
	            '</ss:ExcelWorkbook>' +
	            '<ss:Styles>' +
	                '<ss:Style ss:ID="Default">' +
	                    '<ss:Alignment ss:Vertical="Top" ss:WrapText="1" />' +
	                    '<ss:Font ss:FontName="arial" ss:Size="10" />' +
	                    '<ss:Borders>' +
	                        '<ss:Border ss:Color="#e4e4e4" ss:Weight="1" ss:LineStyle="Continuous" ss:Position="Top" />' +
	                        '<ss:Border ss:Color="#e4e4e4" ss:Weight="1" ss:LineStyle="Continuous" ss:Position="Bottom" />' +
	                        '<ss:Border ss:Color="#e4e4e4" ss:Weight="1" ss:LineStyle="Continuous" ss:Position="Left" />' +
	                        '<ss:Border ss:Color="#e4e4e4" ss:Weight="1" ss:LineStyle="Continuous" ss:Position="Right" />' +
	                    '</ss:Borders>' +
	                    '<ss:Interior />' +
	                    '<ss:NumberFormat />' +
	                    '<ss:Protection />' +
	                '</ss:Style>' +
	                '<ss:Style ss:ID="title">' +
	                    '<ss:Borders />' +
	                    '<ss:Font />' +
	                    '<ss:Alignment ss:WrapText="1" ss:Vertical="Center" ss:Horizontal="Center" />' +
	                    '<ss:NumberFormat ss:Format="@" />' +
	                '</ss:Style>' +
	                '<ss:Style ss:ID="headercell">' +
	                    '<ss:Font ss:Bold="1" ss:Size="10" />' +
	                    '<ss:Alignment ss:WrapText="1" ss:Horizontal="Center" />' +
	                    '<ss:Interior ss:Pattern="Solid" ss:Color="#A3C9F1" />' +
	                '</ss:Style>' +
	                '<ss:Style ss:ID="even">' +
	                    '<ss:Interior ss:Pattern="Solid" ss:Color="#CCFFFF" />' +
	                '</ss:Style>' +
	                '<ss:Style ss:Parent="even" ss:ID="evendate">' +
	                    '<ss:NumberFormat ss:Format="[ENG][$-409]dd\-mmm\-yyyy;@" />' +
	                '</ss:Style>' +
	                '<ss:Style ss:Parent="even" ss:ID="evenint">' +
	                    '<ss:NumberFormat ss:Format="0" />' +
	                '</ss:Style>' +
	                '<ss:Style ss:Parent="even" ss:ID="evenfloat">' +
	                    '<ss:NumberFormat ss:Format="0.00" />' +
	                '</ss:Style>' +
	                '<ss:Style ss:ID="odd">' +
	                    '<ss:Interior ss:Pattern="Solid" ss:Color="#CCCCFF" />' +
	                '</ss:Style>' +
	                '<ss:Style ss:Parent="odd" ss:ID="odddate">' +
	                    '<ss:NumberFormat ss:Format="[ENG][$-409]dd\-mmm\-yyyy;@" />' +
	                '</ss:Style>' +
	                '<ss:Style ss:Parent="odd" ss:ID="oddint">' +
	                    '<ss:NumberFormat ss:Format="0" />' +
	                '</ss:Style>' +
	                '<ss:Style ss:Parent="odd" ss:ID="oddfloat">' +
	                    '<ss:NumberFormat ss:Format="0.00" />' +
	                '</ss:Style>' +
	            '</ss:Styles>' +
	            worksheet.xml +
	            '</ss:Workbook>';
	    },
	    post_to_url:function (path, params, method) {
		     method = method || "post"; 
		     var form = document.createElement("form");
		     form.setAttribute("method", method);
		     form.setAttribute("action", path);
		     for(var i=0; i<params.length; i++) {
		         var hiddenField = document.createElement("input");
		         hiddenField.setAttribute("type", "hidden");
		         hiddenField.setAttribute("name", params[i].name);
		         hiddenField.setAttribute("value", params[i].value);   
		         form.appendChild(hiddenField);
		     }   
		     document.body.appendChild(form);   
		     form.submit();
		},
		formatDate:function(format, date, settings) {
			var monthNames= ['January','February','March','April','May','June','July','August','September','October','November','December']; // Names of months for drop-down and formatting
			var monthNamesShort = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']; // For formatting
			var dayNames= ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']; // For formatting
			var dayNamesShort=['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat']; // For formatting
			if (!date)
				return '';
			// Check whether a format character is doubled
			var lookAhead = function(match) {
				var matches = (iFormat + 1 < format.length && format.charAt(iFormat + 1) == match);
				if (matches)
					iFormat++;
				return matches;
			};
			// Format a number, with leading zero if necessary
			var formatNumber = function(match, value, len) {
				var num = '' + value;
				if (lookAhead(match))
					while (num.length < len)
						num = '0' + num;
				return num;
			};
			// Format a name, short or long as requested
			var formatName = function(match, value, shortNames, longNames) {
				return (lookAhead(match) ? longNames[value] : shortNames[value]);
			};
			var output = '';
			var literal = false;
			date = new Date(date);
			if (date)
				for (var iFormat = 0; iFormat < format.length; iFormat++) {
					if (literal)
						if (format.charAt(iFormat) == "'" && !lookAhead("'"))
							literal = false;
						else
							output += format.charAt(iFormat);
					else
						switch (format.charAt(iFormat)) {
							case 'd':
								output += formatNumber('d', date.getDate(), 2);
								break;
							case 'D':
								output += formatName('D', date.getDay(), dayNamesShort, dayNames);
								break;
							case 'o':
								output += formatNumber('o',
									(date.getTime() - new Date(date.getFullYear(), 0, 0).getTime()) / 86400000, 3);
								break;
							case 'M':
								output += formatNumber('M', date.getMonth() + 1, 2);
								break;
	//						case 'M':
	//							output += formatName('M', date.getMonth(), monthNamesShort, monthNames);
	//							break;
							case 'y':
								output += (lookAhead('y') ? date.getFullYear() :
									(date.getYear() % 100 < 10 ? '0' : '') + date.getYear() % 100);
								break;
							case 'h':
								output += formatNumber('h',date.getHours(),2);
								break;
							case 'm':
								output += formatNumber('m',date.getMinutes(),2);
								break;
							case 's':
								output += formatNumber('s',date.getSeconds(),2);
								break;
							case '@':
								output += date.getTime();
								break;
							case '!':
								//output += date.getTime() * 10000 + this._ticksTo1970;
								break;
							case "'":
								if (lookAhead("'"))
									output += "'";
								else
									literal = true;
								break;
							default:
								output += format.charAt(iFormat);
						}
				}
			return output;
		}
	};
	$.extend($.jgrid.plugins , {
		excelExport:{
			name:"excelExport",
			afterBuildGrid:function(){
				var config = this[0].p;
				//增加单独配置
				if(config.disableExcel == true){
					return;
				}
				var id = $(this[0]).attr('id');
				if(config.pager){
					//$(this[0]).jqGrid('navGrid',config.pager,{edit:false,add:false,del:false,search:false,refresh:false})
					$(this[0]).jqGrid('navButtonAdd',config.pager,{
						caption:"", 
						buttonicon:"fros-toolbar-excel",
						onClickButton:function(event){
							var data = [];
							if($(this)[0].p.querydata!=undefined){
								data = $(this)[0].p.querydata;
							}
							
							if(data.length > 0){
								excelUtil.getExcelFileByGridRecords(false,data,config,'excel.xls');
							}
						}, 
						position: "last", 
						title:"导出本页数据", 
						cursor: "pointer"
					}).jqGrid('navButtonAdd',config.pager,{
						caption:"", 
						buttonicon:"fros-toolbar-allexcel",
						onClickButton:function(event){
							if(config.proxy instanceof AjaxProxy){
								var serviceName = config.proxy.serviceName;
								var param = {};
								var queryInfo = {};
								// {"queryInfo":{"orderBy":"easdAccessCode asc","queryFields":[],"fieldCodeTypes":{"creator":"USER"}}};
								queryInfo.orderBy = config.sortname + " " + config.sortorder;
								
								queryInfo.queryFields = config.userFilterCond;
								var fieldCodeTypes = config.proxy.fieldCodeTypes;
								queryInfo.fieldCodeTypes = fieldCodeTypes;
								param.queryInfo = queryInfo;
								
								var dtd = service.service(serviceName, param);
								dtd.done(function(queryData){
									excelUtil.getExcelFileByGridRecords(false,queryData.dataList,config,'alldata.xls');
								});
							}else{
								excelUtil.getExcelFileByGridRecords(false,config.proxy.data,config,'alldata.xls');
							}
							
						}, 
						position: "last", 
						title:"导出全部数据", 
						cursor: "pointer"
					});
				}else{
					//no pager hander code
					if($("#t_"+id).length > 0){
						//$("#t_"+id).append('<table cellspacing="0" cellpadding="0" border="0" class="ui-pg-table navtable" style="float:left;table-layout:auto;"><tbody><tr></tr></tbody></table>');
						$(this[0]).jqGrid('navButtonAdd',"#t_"+id,{
							caption:"", 
							buttonicon:"fros-toolbar-excel",
							onClickButton:function(event){
								var data = [];
								if($(this)[0].p.querydata!=undefined){
									data = $(this)[0].p.querydata;
								}
								if(data.length > 0){
									excelUtil.getExcelFileByGridRecords(false,data,config,'excel.xls');
								}
							}, 
							position: "last", 
							title:"导出本页数据", 
							cursor: "pointer"
						});
					}
				}
			}
		}
	});
	$.extend(f.util,excelUtil);
});
