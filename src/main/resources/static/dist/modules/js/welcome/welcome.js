define(['jquery','basemodule','service','echarts','jqueryui'],function($,basemodule,service,echarts) {
	return $.extend(true,{},basemodule,{
		opt:{
			url:'pages/welcome.vc',
			title:'欢迎页'
		},
		events:{
			init:function(){
				var option = {
					    title: {
					        text: '模块访问量'
					    },
					    tooltip: {
					        trigger: 'axis'
					    },
					    legend: {
					        data:['用户模块','快递业务','代理板块']
					    },
					    grid: {
					        left: '3%',
					        right: '4%',
					        bottom: '3%',
					        containLabel: true
					    },
					    toolbox: {
					        feature: {
					            saveAsImage: {}
					        }
					    },
					    xAxis: {
					        type: 'category',
					        boundaryGap: false,
					        data: ['周一','周二','周三','周四','周五','周六','周日']
					    },
					    yAxis: {
					        type: 'value'
					    },
					    series: [
					        {
					            name:'用户模块',
					            type:'line',
					            stack: '总量',
					            data:[120, 132, 101, 134, 90, 230, 210]
					        },
					        {
					            name:'快递业务',
					            type:'line',
					            stack: '总量',
					            data:[220, 182, 191, 234, 290, 330, 310]
					        },
					        {
					            name:'代理板块',
					            type:'line',
					            stack: '总量',
					            data:[150, 232, 201, 154, 190, 330, 410]
					        }
					    ]
					};
				var myChart = echarts.init($("#mainchart")[0]);
				myChart.setOption(option);
				
				var option2 = {
					    title : {
					        text: '用户访问来源',
					        subtext: '(最近一周)',
					        x:'center'
					    },
					    tooltip : {
					        trigger: 'item',
					        formatter: "{a} <br/>{b} : {c} ({d}%)"
					    },
					    legend: {
					        orient: 'vertical',
					        left: 'left',
					        data: ['总部内网','微信小应用','移动应用','微信企业号','搜索引擎']
					    },
					    series : [
					        {
					            name: '访问来源',
					            type: 'pie',
					            radius : '55%',
					            center: ['50%', '60%'],
					            data:[
					                {value:1350, name:'总部内网'},
					                {value:310, name:'微信小应用'},
					                {value:234, name:'移动应用'},
					                {value:135, name:'微信企业号'},
					                {value:154, name:'搜索引擎'}
					            ],
					            itemStyle: {
					                emphasis: {
					                    shadowBlur: 10,
					                    shadowOffsetX: 0,
					                    shadowColor: 'rgba(0, 0, 0, 0.5)'
					                }
					            }
					        }
					    ]
					};
				var myChart2 = echarts.init($("#mainchart2")[0]);
				myChart2.setOption(option2);
			},
			onShow:function(){
//				alert("show app1");
			}
		}
	});
});