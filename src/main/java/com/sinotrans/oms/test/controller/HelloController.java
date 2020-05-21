package com.sinotrans.oms.test.controller;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sinotrans.oms.businessrequest.service.EoRequestBookingSendEmailService;
import com.sinotrans.oms.businessrequest.service.EoRequestDeclarationDeputeSendEmailService;
import com.sinotrans.oms.businessrequest.service.EoRequestSendEmailService;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.Response;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.nogenerator.NOGeneratorUtil;
import com.sinotrans.oms.common.tool.SendMailUtil;
import com.sinotrans.oms.eoorder.dto.EoOrderDto;
import com.sinotrans.oms.system.manager.EsCounterManager;
import com.sinotrans.oms.test.service.CommonQueryDemoManager;
import com.sinotrans.oms.test.service.EoOrderManage;
import com.sinotrans.oms.test.service.HelloService;

import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.WriteException;

@RestController
@RequestMapping("/order")//固定的拦截，通过不同的拦截地址来区分不同的业务
public class HelloController {
	@Autowired
	private DiscoveryClient discoveryClient;
	@Autowired
	private EoOrderManage eoOrderManage;
	@Autowired
	private CommonQueryDemoManager commonQueryDemoManager;
	@Autowired
	private EsCounterManager esCounterManager;
	@Autowired
	private EoRequestSendEmailService eoRequestSendEmailService;
	@Autowired
	private EoRequestBookingSendEmailService eoRequestBookingSendEmailService;
	@Autowired
	private EoRequestDeclarationDeputeSendEmailService eoRequestDeclarationDeputeSendEmailService;
	@RequestMapping("/testNO")
    public String testNO(){
    	NOGeneratorUtil NOGeneratorUtil = new NOGeneratorUtil();
		String eoorOrderNo = NOGeneratorUtil.currentValue("EoOrder");
		System.out.println(eoorOrderNo);
//		Object[] obj = esCounterManager.getSinotransNo(1).toArray();
//        	String eoorOrderNo = obj[0].toString();
		return eoorOrderNo;
    }
//	@RequestMapping("/hello")
//	public String hello(Map<String, Object> map) {
//		System.out.println("-----------1");
//		map.put("name", "[Angel -- 守护天使]");
//		QueryData q = this.commonQueryDemoManager.testQueryModel();
//		System.out.println("-----------2");
//		FjUserModel fjUserModel = (FjUserModel) q.getDataList().get(0);
//		return "hello";
//	}
//
//	@RequestMapping("/abc")
//	public String abc(Map<String, Object> map) {
//		return "abc";
//	}
//
//	@RequestMapping("/bcd")
//	public String bcd(Map<String, Object> map) {
//		return "bcd";
//	}
//	@RequestMapping("/eoOrderList")
//	public String getEoorList(Map<String, Object> map) {
//		this.eoOrderManage.getEoorderList(123L);
//		map.put("name", "[Angel -- 守护天使]");
//		return null;
//	}
	
	
//	@RequestMapping("/hello1")
//	public String hello1() {
//		return "abc";
//	}
//	
    @RequestMapping(value = "/hello1" ,method = RequestMethod.GET)
    public String hello1() {
    	return "成功访问到hello1方法";
    }
    
    /**
     * 标准服务所有的controller，只做数据流转，不做业务处理，
     * controller只调用自己对应的service
     */
    @Autowired
    private HelloService helloService;
    
    @RequestMapping(value = "/saveOrder/{param}" ,method = RequestMethod.GET)
    public Response saveOrder(@PathVariable(value = "param") String param, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String token) {
    	return helloService.doSomeing(param);
    }

    @RequestMapping(value = "/saveOrders", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoOrderDto>> saveOrder (@RequestBody List<EoOrderDto> eoOrderDto) {
		//调用service层处理业务逻辑
		ResponseData<List<EoOrderDto>> responseData = new ResponseData<>();
		responseData.setCode(Constants.YES);
		responseData.setMsg("调用成功");
		responseData.setData(eoOrderDto);
		return responseData;
	}
    
    @RequestMapping(value = "/testThread", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
    public ResponseData testThread() {
    	ResponseData responseData = new ResponseData<>();
    	String testNo = "test";
    	this.helloService.testThread(testNo);
    	Long [] eorbIds = new Long [1];
    	eorbIds[0] = 24280L;
    	try {
			this.eoRequestDeclarationDeputeSendEmailService.assembleIssuedDeclarationDeputeEntrust(eorbIds, 5027001L);
		} catch (WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	responseData.setCode(Constants.YES);
    	responseData.setMsg("测试成功");
    	System.out.println(responseData);
    	return responseData;
    }
    
    @RequestMapping(value = "/testConnectFtp", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
    public void testConnectFtp() {
    	ByteArrayOutputStream byteArrayOutputStream = null;
    	SendMailUtil sendMailUtil = new SendMailUtil();
		sendMailUtil.setAddress("lmsupport@sinotrans.com", "Colley.Bai@sinoservices.com", "shovenTest");
		sendMailUtil.setAffix("trailer.xls", "附件.xls");
//		sendMailUtil.setFileName("shoven.txt");
		Map<String,String> contentMap = new HashMap<String, String>();
		contentMap.put("date", "fghjkl");
		contentMap.put("customerName", "1111");
		contentMap.put("address", "详细内容请见附件！");
		contentMap.put("contact", "22222");
		contentMap.put("eoddIdServicerIds", "bda230d5-0eac-474e-b3bf-b2627835a76a");
//		sendMailUtil.sendEmailByFileTypeStream(contentMap,byteArrayOutputStream);
    	
//    	FtpUtil.downloadFile("/app/omsfile", "d:/b", "工作日志模板.xls");
		
//		Resource resource = new ClassPathResource("com/sinotrans/oms/file/trailer.xls");
//    	try {
//			//System.out.println(resource.getInputStream());
//			System.out.println(resource.getURI());
//			System.out.println(resource.getURL());
//			System.out.println(resource.getFilename());
//			resource.getInputStream();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		} 
	} 
}
