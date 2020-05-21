var require ={
		baseUrl: 'dist',
		//DEBUG开关
//		urlArgs: 'debug='+(new Date()).valueOf(),
		urlArgs:'ver=4',
		map: {
		  '*': {
		    'style': 'third-party/require/require-css/css.min'
		  }
		},
		shim:{
			'jqueryui_base':{
				deps:['jquery','style!third-party/jquery/jquery-ui/jquery-ui.min','style!third-party/jquery/jquery-ui/jquery-ui-custom']
			},
			'jqueryui_dp_zh_CN':{
				deps:['jqueryui_base']
			},
			'jqueryui_dtp_base':{
				deps:['jquery','jqueryui_base','style!third-party/jquery/jquery-ui/timepicker/jquery-ui-timepicker-addon']
			},
			'jqueryui_dtp':{
				deps:['jqueryui_dtp_base']
			},
			'zTree':{
				deps:['style!third-party/zTree/zTreeStyle/zTreeStyle.css']
			},
			'suggestBox/template-syntax':{
				deps:['fros/widgets/suggestBox/template']
			},
			'bootstrapValidator':{
				deps:['style!third-party/bootstrap/bootstrapValidator/style/bootstrapValidator.css']
			},
			'perfectScrollbar':{
				deps:['style!third-party/perfectScrollbar/perfect-scrollbar.css']
			},
			'dropdown':{
				deps:['jquery']
			},
			'jqueryform':{
				deps:['jquery']
			},
			'summernote':{
				deps:['style!fros/widgets/summernote/css/font-awesome.min.css','style!fros/widgets/summernote/css/summernote.css','tooltip']
			},
			'tooltip':{
				deps:['jquery']
			},
			'templateac':{                                                           
				deps:['style!fros/widgets/tplac/tplac.css']
			},
			'select2':{
				deps:['style!third-party/select2/css/select2.css']
			},
			'frosBootstrapValidator':{
				deps:['style!fros/widgets/frosBootstrapValidator/style/frosBootstrapValidator.css']
			},
			'prompt':{
				deps:['style!fros/widgets/prompt/css/prompt.css']
			}
		},
		paths: {
			text: 'third-party/require/text',
			jquery: 'third-party/jquery/jquery-1.10.2.min',
			_underscore: 'third-party/underscore/underscore-min',
			underscore: 'third-party/underscore/underscore-config',
			basemodule:'fros/widgets/require-base/basemodule',
			tab:'fros/widgets/bootstrap-tab/tab',
			jqueryui_base:'third-party/jquery/jquery-ui/jquery-ui',
			jqueryui_dp_zh_CN:'third-party/jquery/jquery-ui/i18n/jquery.ui.datepicker-zh-CN',
			jqueryui:'third-party/jquery/jquery-ui/i18n/jquery-ui-zh_CN',
			jqueryui_dtp_base:'third-party/jquery/jquery-ui/timepicker/jquery-ui-timepicker-addon',
			jqueryui_dtp:'third-party/jquery/jquery-ui/timepicker/i18n/jquery-ui-timepicker-zh-CN',
			dialog:'fros/widgets/dialog/dialog',
			jqGridLoader:'fros/widgets/jqGrid/jqgrid_loader',
			datagrid:'fros/widgets/jqGrid/datagrid',
			editgrid:'fros/widgets/jqGrid/editgrid',
			classutil:'fros/widgets/utils/classutil',
			json:'third-party/json2/json2',
			service:'fros/widgets/utils/service',
			LocalProxy:'fros/widgets/jqGrid/localproxy',
			AjaxProxy:'fros/widgets/jqGrid/ajaxproxy',
			jqueryform:'third-party/jquery/jquery-plugins/jquery.form',
			fmatter:'fros/widgets/jqGrid/fmatter',
			advanceselect:'fros/widgets/advance/advanceselect',
			advanceSuggest:'fros/widgets/advance/advanceSuggest',
			advanceSelectConfig:'fros/widgets/advance/advanceSelectConfig',
			formValues:'fros/widgets/utils/formUtils',
			dateUtils:'fros/widgets/utils/dateUtils',
			formUtils:'fros/widgets/form-validate/form-suggest-utils',
			sbox:'fros/widgets/suggestBox/suggestBox',
			datePicker:'fros/widgets/datePicker/datePicker',
			zTree:'third-party/zTree/zTree',
			isExpressionRules:'fros/widgets/form-validate/form-expression-rules',
			tooltip:'third-party/tooltip/tooltip',
			bootstrapValidator:'third-party/bootstrap/bootstrapValidator/bootstrapValidator',
			uploadControl:'fros/widgets/upload/uploadControl',
			perfectScrollbar:'third-party/perfectScrollbar/perfect-scrollbar',
			dropdown:'third-party/dropdown/dropdown',
			templategrid:'fros/widgets/tplgrid/templategrid',
			echarts:"third-party/echarts/echarts.min",
			bootstrap:'fros/widgets/summernote/js/bootstrap.min',
			summernote:'fros/widgets/summernote/js/summernote.min',
			basewidget:'fros/widgets/require-base/basewidget',
			templatepager:'fros/widgets/tplgrid/templatepager',
			templateac:'fros/widgets/tplac/tplac', 
            autoSelect:'fros/widgets/tplac/selectCodeTplac',
			domReady:'third-party/require/domReady',
			numberinput:"fros/widgets/numberinput/numberinput",
			inputmask:"third-party/inputmask/jquery.inputmask.bundle",
			select2:"third-party/select2/js/select2.full",
			frosSelect:'fros/widgets/frosSelect/select',
			frosBootstrapValidator:'fros/widgets/frosBootstrapValidator/frosBootstrapValidator',
			prompt:'fros/widgets/prompt/js/prompt'
		}
	};
