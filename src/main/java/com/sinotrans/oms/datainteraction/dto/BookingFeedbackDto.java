package com.sinotrans.oms.datainteraction.dto;

import java.util.Date;
import java.util.List;

import com.sinotrans.oms.datainteraction.model.EdiBookingContactFeedbackModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingCtnFeedbackModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingFeedbackModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingFeesFeedbackModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingMaterialFeedbackModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingPreFeedbackModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingSealFeedbackModel;

/**  
* <p>Title: BookingFeedbackDto</p>  
* Description: 订舱反馈正常单entity对象
* @author Shoven.Jiang  
* @date 2018年9月6日  
* @version 1.0  
*/
public class BookingFeedbackDto  extends EdiBookingFeedbackModel{

		//订舱请求反馈   联系人接口表
		private List<EdiBookingContactFeedbackModel> ediBookingContactFeedbackModel;
		//订舱请求反馈   费用接口表
		private List<EdiBookingFeesFeedbackModel> ediBookingFeesFeedbackModel;
		//订舱请求反馈   预配箱接口表
		private List<EdiBookingPreFeedbackModel> ediBookingPreFeedbackModel;
		//订舱请求反馈   物料接口表
		private List<EdiBookingMaterialFeedbackModel> ediBookingMaterialFeedbackModel;
		//订舱请求反馈   集装箱接口表	
		private List<EdiBookingCtnFeedbackModel> ediBookingCtnFeedbackModel;
		//订舱请求反馈   集装箱封签接口表
		private List<EdiBookingSealFeedbackModel> ediBookingSealFeedbackModel;
		
		
		
		//数据处理标识
		private String msgcode;
		//数据处理时间
		private Date lastmodifiedtime;
		//数据处理信息
		private String msgstr;
		public List<EdiBookingContactFeedbackModel> getEdiBookingContactFeedbackModel() {
			return ediBookingContactFeedbackModel;
		}
		public void setEdiBookingContactFeedbackModel(List<EdiBookingContactFeedbackModel> ediBookingContactFeedbackModel) {
			this.ediBookingContactFeedbackModel = ediBookingContactFeedbackModel;
		}
		public List<EdiBookingFeesFeedbackModel> getEdiBookingFeesFeedbackModel() {
			return ediBookingFeesFeedbackModel;
		}
		public void setEdiBookingFeesFeedbackModel(List<EdiBookingFeesFeedbackModel> ediBookingFeesFeedbackModel) {
			this.ediBookingFeesFeedbackModel = ediBookingFeesFeedbackModel;
		}
		public List<EdiBookingPreFeedbackModel> getEdiBookingPreFeedbackModel() {
			return ediBookingPreFeedbackModel;
		}
		public void setEdiBookingPreFeedbackModel(List<EdiBookingPreFeedbackModel> ediBookingPreFeedbackModel) {
			this.ediBookingPreFeedbackModel = ediBookingPreFeedbackModel;
		}
		public List<EdiBookingMaterialFeedbackModel> getEdiBookingMaterialFeedbackModel() {
			return ediBookingMaterialFeedbackModel;
		}
		public void setEdiBookingMaterialFeedbackModel(List<EdiBookingMaterialFeedbackModel> ediBookingMaterialFeedbackModel) {
			this.ediBookingMaterialFeedbackModel = ediBookingMaterialFeedbackModel;
		}
		public List<EdiBookingCtnFeedbackModel> getEdiBookingCtnFeedbackModel() {
			return ediBookingCtnFeedbackModel;
		}
		public void setEdiBookingCtnFeedbackModel(List<EdiBookingCtnFeedbackModel> ediBookingCtnFeedbackModel) {
			this.ediBookingCtnFeedbackModel = ediBookingCtnFeedbackModel;
		}
		public List<EdiBookingSealFeedbackModel> getEdiBookingSealFeedbackModel() {
			return ediBookingSealFeedbackModel;
		}
		public void setEdiBookingSealFeedbackModel(List<EdiBookingSealFeedbackModel> ediBookingSealFeedbackModel) {
			this.ediBookingSealFeedbackModel = ediBookingSealFeedbackModel;
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
		
}
