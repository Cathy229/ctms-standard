package com.sinotrans.oms.datainteraction.dto;
import java.util.Date;
import java.util.List;

import com.sinotrans.oms.businessrequest.model.EoRequestBookingModel;
import com.sinotrans.oms.businessrule.model.EbRegionModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingContinerModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingFeesModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingMaterialModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingPrecontainerModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingSealModel;

/**  
* <p>Title: EdiBookingDto</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月6日  
* @version 1.0  
*/
public class EdiBookingDto extends EdiBookingModel{

		//订舱请求接口
		private List<EdiBookingModel> ediBookingModel;
		//订舱请求物料接口表
		private List<EdiBookingMaterialModel> ediBookingMaterialModel;
		//订舱请求预配箱接口表
		private List<EdiBookingPrecontainerModel> ediBookingPrecontainerModel;
		//订舱请求费用接口表
		private List<EdiBookingFeesModel> ediBookingFeesModel;
		//订舱请求集装箱接口表
		private List<EdiBookingContinerModel> ediBookingContinerModel;
		//订舱请求集装箱封签接口表
		private List<EdiBookingSealModel> ediBookingSealModel;
		//接收接口表信息
		private EoRequestBookingModel eoRequestBookingModel;
		//接收接口表信息
		private EbRegionModel ebRegionModelShipper;
		//接收接口表信息
		private EbRegionModel ebRegionModelConsignee;
		
		
		//数据处理标识
		private String msgcode;
		//数据处理时间
		private Date lastmodifiedtime;
		//数据处理信息
		private String msgstr;
		
		public List<EdiBookingModel> getEdiBookingModel() {
			return ediBookingModel;
		}
		public void setEdiBookingModel(List<EdiBookingModel> ediBookingModel) {
			this.ediBookingModel = ediBookingModel;
		}
		public List<EdiBookingMaterialModel> getEdiBookingMaterialModel() {
			return ediBookingMaterialModel;
		}
		public void setEdiBookingMaterialModel(List<EdiBookingMaterialModel> ediBookingMaterialModel) {
			this.ediBookingMaterialModel = ediBookingMaterialModel;
		}
		public List<EdiBookingPrecontainerModel> getEdiBookingPrecontainerModel() {
			return ediBookingPrecontainerModel;
		}
		public void setEdiBookingPrecontainerModel(List<EdiBookingPrecontainerModel> ediBookingPrecontainerModel) {
			this.ediBookingPrecontainerModel = ediBookingPrecontainerModel;
		}
		public List<EdiBookingFeesModel> getEdiBookingFeesModel() {
			return ediBookingFeesModel;
		}
		public void setEdiBookingFeesModel(List<EdiBookingFeesModel> ediBookingFeesModel) {
			this.ediBookingFeesModel = ediBookingFeesModel;
		}
		public List<EdiBookingContinerModel> getEdiBookingContinerModel() {
			return ediBookingContinerModel;
		}
		public void setEdiBookingContinerModel(List<EdiBookingContinerModel> ediBookingContinerModel) {
			this.ediBookingContinerModel = ediBookingContinerModel;
		}
		public List<EdiBookingSealModel> getEdiBookingSealModel() {
			return ediBookingSealModel;
		}
		public void setEdiBookingSealModel(List<EdiBookingSealModel> ediBookingSealModel) {
			this.ediBookingSealModel = ediBookingSealModel;
		}
		public String getMsgcode() {
			return msgcode;
		}
		public void setMsgcode(String msgcode) {
			this.msgcode = msgcode;
		}
		public Date getLastmodifiedtime() {
			return lastmodifiedtime;
		}
		public void setLastmodifiedtime(Date lastmodifiedtime) {
			this.lastmodifiedtime = lastmodifiedtime;
		}
		public String getMsgstr() {
			return msgstr;
		}
		public void setMsgstr(String msgstr) {
			this.msgstr = msgstr;
		}
		public EoRequestBookingModel getEoRequestBookingModel() {
			return eoRequestBookingModel;
		}
		public void setEoRequestBookingModel(EoRequestBookingModel eoRequestBookingModel) {
			this.eoRequestBookingModel = eoRequestBookingModel;
		}
		public EbRegionModel getEbRegionModelShipper() {
			return ebRegionModelShipper;
		}
		public void setEbRegionModelShipper(EbRegionModel ebRegionModelShipper) {
			this.ebRegionModelShipper = ebRegionModelShipper;
		}
		public EbRegionModel getEbRegionModelConsignee() {
			return ebRegionModelConsignee;
		}
		public void setEbRegionModelConsignee(EbRegionModel ebRegionModelConsignee) {
			this.ebRegionModelConsignee = ebRegionModelConsignee;
		}
		
		
		
		
}

