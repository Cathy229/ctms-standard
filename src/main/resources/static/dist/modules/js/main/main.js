require(['jquery','underscore','dialog','tab','style!fros/css/menu','jqueryui_base', 'perfectScrollbar','dropdown'], function($,_,dialog) {
	require(['domReady!static/dist/modules/js/main/main'], function (doc) {
	$("#logoutBtn").on('click',function(){
		dialog.confirm("确认注销吗?",{
			yes:function(){
				window.location.href="logout.action";
			},
			no:function(){
				
			}
		});
		e.preventDefault();
		e.stopPropagation();
	});
	
	$("#maintab").tab({});
	
	require(['modules/js/welcome/welcome'],function(m){
		$('#maintab').tab('open',m,{closable:false});
	});
	
	/**
	 * 菜单控制
	 */
	//demo menu
	var menuList = [
	    { id:1, parent:0, title:"控件样例", type:'root'},
	    { id:11, parent:1, title:"控件展示", module:"modules/js/common/controls" ,type:'menu',icon:'icon-heart purple'},
	    { id:12, parent:1, title:"新控件", module:"modules/js/controls/tplacdemo" ,type:'menu',icon:'icon-heart purple'},
	    { id:13, parent:1, title:"EditGrid", module:"modules/js/controls/editgriddemo" ,type:'menu',icon:'icon-heart purple'},
	    { id:14, parent:1, title:"数字控件", module:"modules/js/controls/numberinputdemo" ,type:'menu',icon:'icon-glass orange'},
	    { id:15, parent:1, title:"日期控件", module:"modules/js/controls/datedemo" ,type:'menu',icon:'icon-glass orange'},
	    { id:16, parent:1, title:"联想控件级联", module:"modules/js/controls/leveldemo" ,type:'menu',icon:'icon-heart purple'},
	    { id:17, parent:1, title:"select控件", module:"modules/js/controls/selectdemo" ,type:'menu',icon:'icon-heart purple'},
	    { id:18, parent:1, title:"集成案例",module:"modules/js/onetomany/workloglist",type:'menu',icon:'icon-heart purple'},
	    { id:19, parent:1, title:"提示框",module:"modules/js/controls/prompt",type:'menu',icon:'icon-heart purple'},
	    
		{ id:31, parent:0, title:"菜单样例",type:'root'},
		{ id:321, parent:31, title:"二级菜单1", type:'menu',icon:'icon-music orange'},
		{ id:322, parent:31, title:"二级菜单2", type:'menu',icon:'icon-glass blue'},
		{ id:331, parent:321, title:"三级菜单1", type:'menu',icon:'icon-search red'},
		{ id:332, parent:321, title:"三级菜单2",type:'menu',icon:'icon-envelope-alt green'},
		{ id:333, parent:322, title:"三级菜单3",type:'menu',icon:'icon-heart purple'},
		{ id:334, parent:322, title:"三级菜单4",type:'menu',icon:'icon-star purple'},
		{ id:341, parent:331, title:"四级菜单1",type:'menu',icon:'icon-star-empty brown'}
		
	];
	
	var result = handleMenuData(menuList,0);
	renderMenu(result,0,$("#accordionbar"));
	
	$( "#accordionbar" ).accordion({
		collapsible: true,
		heightStyle: 'content',
		activate:function(event,ui){
			$('.toolbar').perfectScrollbar('update');
		}
	});
	
	$( "#accordionbar" ).css('height','');
	var h = $('.main').height() - $('.indexheader').outerHeight()-$('.footer').outerHeight();
	var w = $('.main').width() - $('.toolbar').width();
	$('.toolbar').height(h);
	if(isIE89()){
		w -= 1;
	}
	$('.content').height(h);
	$('.content').width(w);
	$("div[class='col-xs-12 tabcontent']").height(h-27); // 设置右侧tab框高度 
	
	$('.toolbar').perfectScrollbar();
	
	//menu scripts
	$('.dropdown-toggle-a .arrow').on('click',function(e){
		var sub = $(e.target).parent().next().get(0);
		if($(sub).css('display')!='none'){
			$(sub).css('display','none');
		}else{
			$(sub).css('display','inline');//TODO:与bootstrap的下拉列表冲突
		}
		$('.toolbar').perfectScrollbar('update');
	});
	$('.dropdown-toggle-a').on('click',function(e){
		var sub = $(e.target).next().get(0);
		if($(sub).css('display')!='none'){
			$(sub).css('display','none');
		}else{
			$(sub).css('display','inline');
		}
		$('.toolbar').perfectScrollbar('update');
	});
	
	}); // domReady end
	
	function isIE89(){
		return navigator.userAgent.indexOf("MSIE 9.0")>0 || navigator.userAgent.indexOf("MSIE 8.0")>0;
	}
	
	function reRenderPage(){
		document.body.style.overflowY = "hidden";
		var h = $('.main').height() - $('.indexheader').outerHeight()-$('.footer').outerHeight();
		$('.toolbar').height(h);
		$('.content').height(h);
		$("div[class='col-xs-12 tabcontent']").height(h-27); // 设置右侧tab框高度 
		var w = $('.main').width() - $('.toolbar').width();
		if(isIE89()){
			w -= 1;
		}
		$('.content').width(w);
		$('.toolbar').perfectScrollbar('update');
	}
	function renderMenu(menuList,pid,$container){
		for(var i=0;i<menuList.length;i++){
			if(menuList[i].type == 'root' && menuList[i].parent == pid){
				//root menu
				$container.append($('<h3><a href="#">'+menuList[i].title+'</a></h3>'));
				var $subContainer = $('<ul class="submenu"></ul>');
				var $accCnt = $('<div></div>');
				$accCnt.append($subContainer);
				$container.append($accCnt);
				var newId = menuList[i].id;
				renderMenu(menuList[i].children,newId,$subContainer);
			}else{
				if(menuList[i].type == 'menu' && menuList[i].parent == pid){
					if(menuList[i].children.length > 0){
						var $sm = $('<li></li>');
						var $smt = $('<a href="#" class="menuicon dropdown-toggle-a"><i class="'+menuList[i].icon+'"></i>&nbsp;'+menuList[i].title+'<b class="arrow icon-angle-down"></b></a>');
						var $subContainer =$('<ul class="submenu"></ul>');
						$sm.append($smt).append($subContainer);
						$container.append($sm);
						renderMenu(menuList[i].children,menuList[i].id,$subContainer);
					}else{
						var $link = $('<li><a href="#" class="menuicon"><i class="'+menuList[i].icon+'"></i>&nbsp;'+menuList[i].title+'</a></li>');
						if(menuList[i].module!=undefined){
							$('a',$link).data('menudata',menuList[i]);
							$('a',$link).on('click',function(e){
								var md = $(e.target).data('menudata');
								require([md.module],function(m){
									$('#maintab').tab('open',m);
								});
								
							});
						}
						$container.append($link);
					}
				}else if(menuList[i].type == 'btn' && menuList[i].parent == pid){
					
				}
				
			}
		}
		//
		
		
	}
	function handleMenuData(menuList,parentId){
		var r = [];
		for(var i=0;i<menuList.length;i++){
			if(menuList[i].parent == parentId){
				var n = $.extend({},menuList[i]);
				if(n.icon == undefined){
					n.icon = 'noicon';
				}
				n.children = handleMenuData(menuList,n.id);
				r.push(n);
			}
		}
		return r;
	}
	$(document).ready(function(){
		$(window).bind('resize',function(){
			reRenderPage();
		});
	});
	$(document).ready(function(){
		reRenderPage();
		
		
		
	});
	
	
});
