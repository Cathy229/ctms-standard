package com.sinotrans.oms.fileupload.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.fileupload.model.EbFileModel;
import com.sinotrans.oms.fileupload.service.EbFileService;
/**
 * 
* @ClassName: EoBookingController
* @Description: 上传文件信息标准化服务
* @author Simon
* @date 2018年8月15日上午11:55:05
*
 */
@RestController
@RequestMapping(value="/ebFileController")
public class EbFileController {
	
	
	@Autowired
	private EbFileService ebFileService;
	
	/**
	 * @date 2018年8月22日 下午4:57:28  
	 * @author simon 
	 * Description:保存文件信息
	 * @param eoRequestBookingModel
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/saveFile",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EbFileModel> saveFile(@RequestBody EbFileModel ebFileModel, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return ebFileService.save(ebFileModel);
	}
	/**
	 * @date 2018年8月22日 下午5:10:57  
	 * @author simon 
	 * Description:根据id查询信息
	 * @param eoEorb2EosrModels
	 * @param accessToken
	 * @return
	 */
	/*@RequestMapping(value="/saveBookingEoet",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoEorb2EosrModel>> saveBookingEoet(@RequestBody List<EoEorb2EosrModel> eoEorb2EosrModels, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoEorb2EosrService.saveBookingEoet(eoEorb2EosrModels);
	}*/
	/**
	 * @date 2018年8月22日 下午5:11:08  
	 * @author simon 
	 * Description:删除文件信息
	 * @param eoEoom2EobrModels
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/deleteByIds",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public void deleteByIds(@RequestBody Long[] ids, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ebFileService.deleteByPks(Arrays.asList(ids));
	}
	
	/**
	 * @date 2018年8月22日 下午5:11:08  
	 * @author simon 
	 * Description:根据id删除文件信息
	 * @param eoEoom2EobrModels
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/deleteById",method=RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<EbFileModel> deleteById(@RequestParam(value="id")Long id, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return ebFileService.deleteByPk(id);
	}
	/**
	 * @date 2018年8月22日 下午5:11:08  
	 * @author simon 
	 * Description:根据id删除文件信息
	 * @param eoEoom2EobrModels
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/get",method=RequestMethod.GET)
	public ResponseData<EbFileModel> get(@RequestParam(value="id") Long id){
		return ebFileService.get(id);
	}
	/**
	 * @date 2018年8月22日 下午5:11:08  
	 * @author simon 
	 * @description:--根据条件查询文件列表信息
	 * @param conditionMap
	 * @return
	 */
	@RequestMapping(value="/getFileByCondition",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> getFileByCondition(@RequestBody QueryInfo queryInfo){
		return ebFileService.getFileByCondition(queryInfo);
	}
	/**
	 * @date 2018年8月22日 下午5:11:08  
	 * @author simon 
	 * @description:--根据条件查询文件列表信息
	 * @param conditionMap
	 * @return
	 */
	@RequestMapping(value="/getFileByElct",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> getFileByElct(@RequestBody QueryInfo queryInfo){
		return ebFileService.getFileByElct(queryInfo);
	}
	
	/**
	 * @deprecated；批量保存附件信息
	 * @author Colley.Bai  
	 * @date 2019年3月19日
	 * @param ebFileModelList
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/batchSaveFile",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EbFileModel>> batchSaveFile(@RequestBody List<EbFileModel> ebFileModelList, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return this.ebFileService.batchSaveFile(ebFileModelList);
	}
	
	/**
	 * @deprecated:查询附件（订单+报关+订舱+拖车）
	 * @author Colley.Bai  
	 * @date 2019年3月22日
	 * @param ebFileModel
	 * @return
	 */
	@RequestMapping(value="/getEbflFile",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EbFileModel>> getEbflFile(@RequestBody EbFileModel ebFileModel){
		return this.ebFileService.getEbflFile(ebFileModel);
	}
	
}
