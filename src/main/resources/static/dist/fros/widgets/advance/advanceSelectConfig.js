/*联想控件配置js*/
define(['fmatter'],function(){
	var configs = {};
	configs['WAREHOUSE']={
		colNames:["ID","名称"],
		colModel:[
		    {name:'bswhId',index:'bswhId'},
			{name:'bswhName',index:'bswhName'}
		],
		queryFilterCond:[
 			{
 				//多个字段查询
 				fieldName : '[bswhName,bswhEnName]',
 				fieldLabel : '所有字段',
 				operator : 'ilikeAnywhere',
 				fieldType : 'String',
 				rowkey:'code'
 			}
 		]
	};
	
	configs['PROVINCE']={
		colNames:["ID","名称"],
		colModel:[
		    {name:'provId',index:'provId'},
			{name:'provName',index:'provName'}
		],
        queryFilterCond:[
 			{
 				//多个字段查询
 				fieldName : '[provName,provEnName]',
 				fieldLabel : '名称或拼音',
 				operator : 'ilikeAnywhere',
 				fieldType : 'String',
 				rowkey:'provId'
 			}
 		]
	};
	
	configs['CITY']={
		colNames:["ID","名称"],
		colModel:[
		    {name:'cityId',index:'cityId'},
			{name:'cityName',index:'cityName'}
		],
        queryFilterCond:[
 			{
 				//多个字段查询
 				fieldName : '[cityName,cityEnName]',
 				fieldLabel : '名称或拼音',
 				operator : 'ilikeAnywhere',
 				fieldType : 'String',
 				rowkey:'cityId'
 			}
 		]
	};

	configs['WAREHOUSEPOS']={
		colNames:["ID","名称"],
		colModel:[
		    {name:'bswpId',index:'bswpId'},
			{name:'bswpName',index:'bswpName'}
		],
        queryFilterCond:[
	 		{
	 			//多个字段查询
	 			fieldName : '[bswpName,bswpNameEn]',
	 			fieldLabel : '所有字段',
	 			operator : 'ilikeAnywhere',
	 			fieldType : 'String'
	 		}
	 	]
	};
	
	configs['PROVINCECITY']={
		colNames:["城市ID","城市名称",'省ID','省名称'],
		colModel:[
			{name:'cityId',index:'cityId'},
			{name:'cityName',index:'cityName'},
			{name:'provId',index:'provId'},
			{name:'provName',index:'provName'}
		],
        queryFilterCond:[
	 		{
	 			//多个字段查询
	 			fieldName : '[cityId,cityName]',
	 			fieldLabel : '所有字段',
	 			operator : 'ilikeAnywhere',
	 			fieldType : 'String'
	 		}
	 	]
	};
	
	configs['WORKTYPES']={
		colNames:['ID','工作类型'],
		colModel:[
		    {name:'id',index:'id', width:60},
			{name:'typename',index:'typename', width:150}
		],
        queryFilterCond:[
	 		{
	 			//多个字段查询
	 			dataIndex : '[id,typename]',
	 			fieldLabel : '所有字段',
	 			operator : 'ilikeAnywhere',
	 			fieldType : 'String',
	 			convertCol:'enable',
	 			rowkey:'id'
	 		}
	 	]
	};
		
	configs['SYSUSER']={
		colNames:['OID','用户全称','Email'],
		colModel:[
			    {name:'oid',index:'oid', hidden:true},
			    {name:'usrRealName',index:'usrRealName', width:60},
				{name:'usrEmail',index:'usrEmail', width:150}
			],
        queryFilterCond:[
	 		{
	 			//多个字段查询
	 			dataIndex : '[usrRealName,usrEmail]',
	 			fieldLabel : '所有字段',
	 			operator : 'ilikeAnywhere',
	 			fieldType : 'String',
	 			convertCol:'enable',
	 			rowkey:'usrRealName'
	 		}
	 	]
	};
	
	return configs;
});