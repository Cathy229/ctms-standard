/**
 * <p>Description: 
 *    
 * </p>
 *
 * @author James
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本     修改人   	修改日期   	修改内容
 * 2018年8月7日   创建人    20091201 	创建
 * 
 * 
 * </pre>
 */
package com.sinotrans.oms.businessrequest.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sinotrans.framework.orm.model.OperationLog;
import com.sinotrans.oms.MyAppStandard;
import com.sinotrans.oms.businessrequest.dto.EoTrailerDto;
import com.sinotrans.oms.businessrequest.manager.EoRequestTrailerManager;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoetModel;
import com.sinotrans.oms.businessrequest.model.EoEoom2EoetModel;
import com.sinotrans.oms.businessrequest.model.EoRequestTrailerModel;
import com.sinotrans.oms.businessrequest.service.EoRequestTrailerService;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.DateUtil;
import com.sinotrans.oms.common.util.JsonUtils;

/**
 * <p>Description: 拖车请求服务测试类
 *    
 * </p>
 *
 * @author James
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本     修改人   	修改日期   	修改内容
 * 1.0         James    2018-08-07	创建
 * 
 * 
 * </pre>
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyAppStandard.class)
public class EoRequestTrailerTest {
	
	
	@Autowired
	private EoRequestTrailerService eoRequestTrailerService;
	@Autowired
	private EoRequestTrailerManager eoRequestTrailerManager;
	
	
	@Test
	public void getTrailerByConditionTest(){
//		Map<String,Object> conditionMap=new HashMap<>();
//		conditionMap.put("eoetNo", "BRIT18080900652");
//		ResponseData<List<EoRequestTrailerListQueryItem>> data=eoRequestTrailerService.getTrailerByCondition(conditionMap);
//		List<EoRequestTrailerListQueryItem> items=(List<EoRequestTrailerListQueryItem>) data.getData();
//		for (EoRequestTrailerListQueryItem eoRequestTrailerListQueryItem : items) {
//			System.out.println("getTrailerAndMaterialByIdTest.getTrailerByConditionTest======================"+JsonUtils.bean2Json(eoRequestTrailerListQueryItem)+"\n");
//		}
	}
	
	@Test
	public void issuedTrailer(){
		Long[] eoetIds=new Long[2];
		eoetIds[0]=134921L;
		eoetIds[0]=134920L;
		ResponseData data=eoRequestTrailerService.issuedTrailer(eoetIds);
		System.out.println(data.toString());
	}
	
	@Test
	public void saveTrailerAndMaterialTest(){
		EoTrailerDto eoTrailerDto=new EoTrailerDto();
		eoTrailerDto.setEoRequestTrailerModel(this.getEoRequestTrailerModel());
		eoTrailerDto.setEoEoom2EoetModelList(this.getEoEoom2EoetModels());
		eoTrailerDto.setEoEooc2EoetModelList(this.getEoEooc2EoetModels());
		ResponseData<EoTrailerDto> responseData=eoRequestTrailerService.saveTrailerAndMaterial(eoTrailerDto);
		EoTrailerDto resultEoTrailerDto =(EoTrailerDto) responseData.getData();
		this.printEoRequestTrailer(resultEoTrailerDto);
	}
	
	
	@Test
	public void getTrailerAndMaterialByIdTest(){
		ResponseData<EoTrailerDto> dto=eoRequestTrailerService.getTrailerAndMaterialById(134858L);
		EoTrailerDto eoTrailerDto=(EoTrailerDto) dto.getData();
		this.printEoRequestTrailer(eoTrailerDto);
	}
	
	@Test
	public void saveTrailerTest(){
		EoRequestTrailerModel eoRequestTrailerModel=new EoRequestTrailerModel();
		eoRequestTrailerModel.setEoetEscoId(5008000L);
		eoRequestTrailerModel.setEoetEbpjId(5011050L);
		eoRequestTrailerModel.setEoetLoEbppId(5015100L);
		eoRequestTrailerModel.setEoetEbtkId(5014100L);
		eoRequestTrailerModel.setEoetNo("EOET201808070001");

		setSystemValue(eoRequestTrailerModel);
		ResponseData<EoRequestTrailerModel> responseData=eoRequestTrailerService.saveTrailer(eoRequestTrailerModel);
//		System.out.println("EoRequestTrailerTest.saveTrailerTest========="+((EoRequestTrailerListQueryItem) responseData.getData()).getEoetNo());
	}
	
	private void printEoRequestTrailer(EoTrailerDto eoTrailerDto){
		EoRequestTrailerModel eoRequestTrailerModel=eoTrailerDto.getEoRequestTrailerModel();
		
		System.out.println("getTrailerAndMaterialByIdTest.eoRequestTrailerModel======================"+JsonUtils.bean2Json(eoRequestTrailerModel)+"\n");
		List<EoEoom2EoetModel> eoEoom2EoetModelList=eoTrailerDto.getEoEoom2EoetModelList();
		for (EoEoom2EoetModel eoEoom2EoetModel : eoEoom2EoetModelList) {
			System.out.println("getTrailerAndMaterialByIdTest.eoEoom2EoetModel======================"+JsonUtils.bean2Json(eoEoom2EoetModel)+"\n");
		}
		List<EoEooc2EoetModel> eoEooc2EoetModelList=eoTrailerDto.getEoEooc2EoetModelList();
		for (EoEooc2EoetModel eoEooc2EoetModel : eoEooc2EoetModelList) {
			System.out.println("getTrailerAndMaterialByIdTest.eoEooc2EoetModel======================"+JsonUtils.bean2Json(eoEooc2EoetModel)+"\n");
		}
	}
	
	private void setSystemValue(OperationLog  model){
		model.setCreator("150");
		model.setModifier("150");
		model.setModifyTime(new Date());
		model.setCreateTime(new Date());
	}
	
	/**
	 * 设置拖车主表MODEL信息
	 */
	private EoRequestTrailerModel getEoRequestTrailerModel(){
	
		String pattern=DateUtil.ORA_DATE_TIME_MILLI_FORMAT;
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		Date date=new Date();
		String currDate=sdf.format(date);
		EoRequestTrailerModel eoRequestTrailerModel=new EoRequestTrailerModel();
		eoRequestTrailerModel.setEoetEscoId(5008000L);
		eoRequestTrailerModel.setEoetEbpjId(5011050L);
		eoRequestTrailerModel.setEoetLoEbppId(5015100L);
		eoRequestTrailerModel.setEoetEbtkId(5014100L);
		eoRequestTrailerModel.setEoetStatus(Constants.SYS_TMS_STATUS_UNISSUED);//未下达
		eoRequestTrailerModel.setEoetTaskStatus(Constants.SYS_TMS_TASK_STATUS_UNDO);//不执行
		long millis=System.currentTimeMillis();
		eoRequestTrailerModel.setEoetNo("EOET"+currDate);
		setSystemValue(eoRequestTrailerModel);
		return eoRequestTrailerModel;
	}
	/**
	 * 设置拖车物料信息
	 */
	private List<EoEoom2EoetModel> getEoEoom2EoetModels(){
		List<EoEoom2EoetModel> eoEoom2EoetModelList=new ArrayList<EoEoom2EoetModel>();
		long millis=System.currentTimeMillis();
		for(int i=0;i<3;i++){
			EoEoom2EoetModel eoEoom2EoetModel=new EoEoom2EoetModel();
			eoEoom2EoetModel.setEomtBatchNo("BATCH"+millis);
			eoEoom2EoetModel.setEomtEbmaNameCn("棉花"+i);
			eoEoom2EoetModel.setEomtMaterialNo("EB"+i);
			setSystemValue(eoEoom2EoetModel);
			eoEoom2EoetModelList.add(eoEoom2EoetModel);
		}
		return eoEoom2EoetModelList;
	}
	/**
	 * 设置拖车箱信息
	 */
	private List<EoEooc2EoetModel> getEoEooc2EoetModels(){
		List<EoEooc2EoetModel> eoEooc2EoetModelList=new ArrayList<EoEooc2EoetModel>();
		for(int i=0;i<3;i++){
			EoEooc2EoetModel eooc2EoetModel=new EoEooc2EoetModel();
			eooc2EoetModel.setEootContainerNo("AAAA000000"+i);
			eooc2EoetModel.setEootStandard("GP");
			eooc2EoetModel.setEootSize("20");
			setSystemValue(eooc2EoetModel);
			eoEooc2EoetModelList.add(eooc2EoetModel);
		}
		return eoEooc2EoetModelList;
	}
	
	
}
