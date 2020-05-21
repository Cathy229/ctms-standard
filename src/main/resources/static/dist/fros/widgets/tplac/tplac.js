define(['jquery','basewidget'],function($,basewidget){
	$.tplac = $.tplac || {};
	$.extend($.tplac,basewidget,{
		_init:function(options,$self){
			var defaultOptions={
				isClosed:true,
				isPage:true,
				dataAttr:'root',
				hoverClass:"warning",
				serviceName:null,
				colNames:[],
				colModel:[],
				keyFieldName:"",
				labelFieldName:"",
				hidInput:null
			};
			var op = $.extend(defaultOptions,options);
			//预处理每行模版
			var colModel = op.colModel;
			var rowdatas = [];
			rowdatas.push("<tr rownum=##gridRowNum##>");
			for(var model in colModel){
				rowdatas.push("<td>##"+colModel[model].index+"##</td>");
			}
			rowdatas.push("</tr>");
			op.rowtpl = rowdatas.join('');
			//预处理结束
			this.setConfig(op,$self);
			var cmp = this;
			$self.attr("autocomplete","off");
			$self.addClass("suggestBox");
			$self.attr('oldvalue',$self.val());//设置初始值
			$self.on("keydown",function(event){
				if(event.which == 9){
					cmp.closeContainer($self);
				}
			});
			$self.on("keyup",function(event){
				if(event.which == 27){
					//ESC
					cmp.closeContainer($self);
				}
				var cfg = cmp.getConfig($self);
				if(event.which == 40){
					//down key
					if(cfg.isClosed ===  false){
						var $selEl = $("."+cfg.hoverClass,cfg.datacontainer);
						if($selEl.length>0){
							if($selEl.next().length >0){
								$selEl.removeClass(cfg.hoverClass).next().addClass(cfg.hoverClass);
							}
						}else{
							//
							$("[_userdata=added]:first",cfg.datacontainer).addClass(cfg.hoverClass);
						}
					}
					return;
				}
				if(event.which == 38){
					//up key
					if(cfg.isClosed ===  false){
						var $selEl = $("."+cfg.hoverClass,cfg.datacontainer);
						if($selEl.length>0){
							if($selEl.prev().length >0){
								$selEl.removeClass(cfg.hoverClass).prev().addClass(cfg.hoverClass);
							}
						}else{
							//
							$("[_userdata=added]:last",cfg.datacontainer).addClass(cfg.hoverClass);
						}
					}
					return;
				}
				if(event.which == 13){
					//enter
					if(cfg.isClosed ===  false){
						if($("."+cfg.hoverClass,cfg.datacontainer).length>0){
							cmp.selectRow($("."+cfg.hoverClass,cfg.datacontainer),$self);
							return;
						}
					}
				}
				var searchVal = $self.val();
				if($self.attr('oldvalue')!=searchVal){
					$self.attr('oldvalue',searchVal);
					if(searchVal == ""){
						$self.attr('oldlabel',"");//合法的数据
						$self.attr('oldvalue',"");
						if(cfg.hidInput !=null){
							cfg.hidInput.val("");
						}
						$self.triggerHandler("onClear");
					}
				}else{
					return;
				}
				clearTimeout( this.searching );
				this.searching =setTimeout(function() {
					cmp.queryData(searchVal,1,$self);
				}, 700);
			});
			$self.on("focusout.close",{cmp:cmp},cmp._focusout);
		},
		_focusout:function(event){
			var cmp = event.data.cmp;
			cmp.closeContainer($(this));
			var $self = $(this);
			if($self.attr('oldvalue') != $self.attr('oldlabel')){
				$self.val("");
				$self.attr('oldlabel',"");//合法的数据
				$self.attr('oldvalue',"");
				var cfg = cmp.getConfig($(this));
				if(cfg!=null && cfg.hidInput !=null){
					cfg.hidInput.val("");
				}
				$self.triggerHandler("onClear");
			}
		},
		queryData:function(searchVal,currentPage,$self){
			var cfg = this.getConfig($self);
			var cmp = this;
			var serviceParam = $self.triggerHandler("handleServiceParam",[searchVal,currentPage]);
			//datalist,totalRows,currentPage
			//与初始值不同
			require(["service"],function(service){
				var dtd = service.service(cfg.serviceName,serviceParam);
				dtd.done(function(data){
					var dataList = [];
					if(cfg.dataAttr == "root"){
						dataList = data;
					}else{
						dataList = data[cfg.dataAttr];
					}
					$self.data("_lastdata",dataList);
					var pagingInfo = $self.triggerHandler("getPagingInfo",[data]);
					cmp.showContainer(dataList,pagingInfo,$self);
				});
			});
		},
		parseData:function(dataList,options){
			var models = options.colModel;
			var rowdatas = [];
			for(var i=0;i<dataList.length;i++){
				var row = options.rowtpl;
				var rowdata = dataList[i];
				for(var j=0;j<models.length;j++){
					var fieldName = models[j].index;
					var fielddata = rowdata[fieldName];
					var reg = new RegExp('##'+fieldName+'##','g');
					if($.isFunction(models[j].fommatter)){
						fielddata = models[j].fommatter(fielddata);
					}
					row = row.replace(reg,fielddata);
				}
				//行号渲染
				var reg = new RegExp('##gridRowNum##','g');
				row = row.replace(reg,i+1);
				rowdatas.push(row);
			}
			return rowdatas;
		},
		selectRow:function($row,$self){
			var cfg = this.getConfig($self);
			var rownum = $row.attr("rownum");
			var row = $self.data("_lastdata")[rownum-1];
			$self.val(row[cfg.labelFieldName]);
			if(cfg.hidInput !=null){
				cfg.hidInput.val(row[cfg.keyFieldName]);
			}
			$self.attr('oldvalue',$self.val());//合法的数据
			$self.attr('oldlabel',$self.val());//合法的数据
			$self.trigger('input');
			$self.triggerHandler("onSelectedRow",[row]);
			this.closeContainer($self);
		},
		showContainer:function(datalist,pagingInfo,$self){
			var cfg = this.getConfig($self);
			var cmp = this;
			var isClosed = cfg.isClosed;
			var firstPos = (pagingInfo.currentPage-1) * pagingInfo.pageSize+1;
			var lastPos = pagingInfo.currentPage * pagingInfo.pageSize;
			if(lastPos > pagingInfo.totalRows){
				lastPos = pagingInfo.totalRows;
			}
			var totalPages = Math.ceil(pagingInfo.totalRows / pagingInfo.pageSize);
			var prePage = pagingInfo.currentPage - 1;
			if(prePage < 1){
				prePage = -1;
			}
			var nextPage = pagingInfo.currentPage + 1;
			if(nextPage > totalPages){
				nextPage = -1;
			}
			if(isClosed === true){
				var container = $('<div class="tplac_Container" ></div>');
				var pager = $('<table width="100%" class="table-bordered table-condensed" style="border-bottom:0px;"><tbody>'+
						'</tbody></table>');
				
				var datacontainer = $('<table class="table table-striped table-bordered table-hover">'+
						'<thead><tr class="datact"></tr></thead>'+
						'<tbody></tbody>'+
						'</table>');
				var colNames = cfg.colNames;
				var colModel = cfg.colModel;
				for(var col in colNames){
					$(".datact",datacontainer).append("<th>"+colNames[col]+"</th>");
				}
				
				container.append(pager);
				container.append(datacontainer);
				container.on("mouseenter",function(event){
					container.attr("OffFocusOut","true");
					$self.off("focusout.close");
				});
				container.on('mouseleave',function(event){
					container.attr("OffFocusOut","false");
					$self.on("focusout.close",{cmp:cmp},cmp._focusout);
				});
				container.attr("OffFocusOut","false");
				$(document.body).append(container);
				cfg.container = container;
				cfg.datacontainer = datacontainer;
				cfg.pager = pager;
			}
			//分页区
			$("[_userdata=added]",cfg.pager).remove();
			var pagingHtml = '<td width="80%" style="border-right-width: 0px;"><label>找到</label>'+pagingInfo.totalRows+'<label> 条记录</label><label> ，显示</label>'+firstPos+'<label> 到 </label>'+lastPos+'</td>'+
			'<td style="border-left-width: 0px;"><ul class="pagination" style="margin:2px 0px;display: block;" id="pager">'+
			'<li page="'+prePage+'"><a href="javascript:void(0)"><i class="icon-double-angle-left"></i></a></li>'+
			'<li page="'+nextPage+'"><a href="javascript:void(0)"><i class="icon-double-angle-right"></i></a></li></ul></td>';
			$("tbody",cfg.pager).append($(pagingHtml).attr('_userdata','added'));
			$("li",cfg.pager).on("click",function(event){
				var topage =parseInt($(this).attr("page"));
				if(topage == -1){
					return;
				}
				var searchVal = $self.val();
				cmp.queryData(searchVal,topage,$self);
			});
			//数据区
			$("[_userdata=added]",cfg.datacontainer).remove();
			var rowdatas = this.parseData(datalist,cfg);
			$("tbody",cfg.datacontainer).append($(rowdatas.join('')).attr('_userdata','added'));
			$("[_userdata=added]",cfg.datacontainer).on("click",function(event){
				cmp.selectRow($(this),$self);
				$self.focus();
			});
			
			cfg.container.data("parent",$self);
			cfg.container.on("click.default",function(event){
				$self.focus();
			});
			var pt = this.getShowPosition($self);
			cfg.container.css({ left: pt.left + 'px', top: pt.top + 'px' });
			cfg.isClosed = false;
			$self.triggerHandler("afterShow",[cfg]);
		},
		closeContainer:function($self){
			var cfg = this.getConfig($self);
			var cmp = this;
			if(cfg){
				if(cfg.container){
					if(cfg.container.attr("OffFocusOut") == "true"){
						//如果鼠标移进面板，focusout取消，此时关闭需要重新绑定focusout事件
						$self.on("focusout.close",{cmp:cmp},cmp._focusout);
					}
					cfg.container.remove();
				}
				cfg.isClosed = true;
				delete cfg.container;
				delete cfg.datacontainer;
				delete cfg.pager;
			}else{
				if(this.isContainerOpen($self)){
					$(".tplac_Container").remove();
				}
			}
		},
		getShowPosition : function($self){
            var $w = $(window), $ts = $self, p = this.getConfig($self), left, top;
            var point = $ts.offset(), width = $ts.outerWidth(), height = $ts.outerHeight(), scrollTop = $(window).scrollTop(), scrollLeft = $(window).scrollLeft();
            var wWidth = $w.width(), wHeight = $w.height();
            var rLeft = point.left - scrollLeft, rTop = point.top - scrollTop;
            var dHeight = p.container.outerHeight(), dWidth = p.container.outerWidth();

            if((rTop + height + dHeight) > wHeight){
                top = point.top - dHeight;
            }
            else{
                top =  point.top + height;
            }

            if((rLeft + dWidth) > wWidth){
                left = point.left - (dWidth - width);
            }
            else{
                left = point.left;
            }

            return { left: left, top: top };
        },
        isContainerOpen:function($self){
        	return ($(".tplac_Container").length > 0);
        },
        hasSelected:function($self){
        	var cfg = this.getConfig($self);
        	if(this.isContainerOpen($self)){
        		var $selEl = $("."+cfg.hoverClass,cfg.datacontainer);
        		return ($selEl.length > 0);
        	}
        	return false;
        }
	});
	
	$.fn.templateac = function(options) {
		if (typeof options == 'string') {
			var fn = $.tplac[options];
			if (!fn) {
				throw ("tplac - No such method: " + options);
			}
			var args = $.makeArray(arguments).slice(1);
			args.push($(this));	
			return fn.apply($.tplac, args);
		}else{
			return this.each( function() {
				$(this).templateac('_init',options);
			});
		}
	};
});
