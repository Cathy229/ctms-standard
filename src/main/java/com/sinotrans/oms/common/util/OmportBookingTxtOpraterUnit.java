package com.sinotrans.oms.common.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sinotrans.oms.businessrequest.model.EoRequestBookingModel;
import com.sinotrans.oms.businessrule.model.EbRegionModel;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.datainteraction.dto.BookingFeedbackDto;
import com.sinotrans.oms.datainteraction.dto.EdiBookingDto;
import com.sinotrans.oms.datainteraction.model.EdiBookingContactFeedbackModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingContinerModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingCtnFeedbackModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingFeesFeedbackModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingFeesModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingMaterialFeedbackModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingMaterialModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingPreFeedbackModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingPrecontainerModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingSealFeedbackModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingSealModel;
import com.sinotrans.oms.security.util.SessionContext;
import com.sinotrans.oms.security.util.UserDetails;

/**  
* <p>Title: OmportBookingTxtOpraterUnit</p>  
* Description: OMS下达货代出口订舱 TXT报文 操作工具类 
* @author Shoven.Jiang  
* @date 2018年9月6日  
* @version 1.0  
*/
public class OmportBookingTxtOpraterUnit {

	/**
     * 拼接订舱请求报文:报文头记录
     * 
     * @param entity
     * @param sender
     * @param receiver
     * @return
     */
    public static String setHandTxtMsg(EdiBookingDto ediBookingDto, String sender, String receiver) {
    	UserDetails user = SessionContext.getUser();
        StringBuffer txt = new StringBuffer();
        String flag = Constants.WS_BOOKING_FLAG;// 分隔符
        String endFlag = Constants.WS_BOOKING_ENDFLAG;// 结束标记
        /*
         * 报文头记录
         */
        txt.append("00");
        txt.append(flag);
        txt.append("IFTMBF");// 01 报文类型
        txt.append(flag);
        // 根据请求类型来生成报文类型 
        if ("BK01".equals(ediBookingDto.getEdboFileType())) {// 订舱下达
            txt.append("BOOKING");// 02 文件说明
        }
        if ("MBL01".equals(ediBookingDto.getEdboFileType())) {// 提单下达
            txt.append("SI");// 02 文件说明
        }
        txt.append(flag);
        txt.append("9"); // 03 文件功能
        txt.append(flag);
//        if (null != user.getUserId()) {
//    		txt.append(Constants.BOOKING_SENDER + "-" + user.getUserId());// 04 发送方代码    发送方代码(上海化工为了适应每个订舱反馈对应不同的收件人，需要将SJFF拼接唯一性标识以便于订舱网修改映射关系)
//        } else {
//    		txt.append(Constants.BOOKING_SENDER);// 04 发送方代码   如果用户ID为空，则发送方代码直接为SJFF，对应订舱网账号：
//    	}
        txt.append(Constants.BOOKING_SENDER);
        
        txt.append(flag);
        txt.append(isNull("SINOTRANS"));// 05 接收方代码
        txt.append(flag);
        txt.append(DateUtil.formateDateCCYYMMDDHHMM(new Date()));// 06 文件建立时间
        txt.append(flag);
        txt.append("3.1");// 07 报文版本
        txt.append(endFlag);
        txt.append("\r\n");

        if (txt.length() > 0) {
            return txt.toString();
        } else {
            return null;
        }
    }

    /**
     * 拼接订舱请求报文:订舱信息 提单信息 船舶信息 地点信息 可选港信息 运费条款
     * 
     * @param ediBookingDto
     * @param sender
     * @param receiver
     * @return
     */
    public static String setBookingMessageTxtMsg(EdiBookingDto ediBookingDto, String sender, String receiver,String sendToEdiCarrierEbcuCode) {
        StringBuffer txt = new StringBuffer();
        String flag = Constants.WS_BOOKING_FLAG;// 分隔符
        String endFlag = Constants.WS_BOOKING_ENDFLAG;// 结束标记
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        EoRequestBookingModel eoRequestBookingModel = ediBookingDto.getEoRequestBookingModel();
        /*
         * 订舱信息
         */
        txt.append("02"); // 01 记录类型标识[必填]
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboBookingNo()));// 02 运编号[必填]
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboBulkBillNo()));// 03 提单号
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboFreightClauseCode()));// 04 交货条款[必填]
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboBookingPartyCode()));// 05 订舱人说明
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboIssuePartyCode()));// 06 签单人代码
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboIssueParty()));// 07 签单人说明
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboApplicantId()));// 08 询价单位
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboFobBkPartyId()));// 09 国外订舱单位
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboTranshipmentFlag()));// 10 转船标识
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboBatchFlag()));// 11 分批
        txt.append(flag);
        txt.append(isNull(DateUtil.formateDateCCYYMMDD(ediBookingDto.getEdboShipmentDate()) == "" ? "" : DateUtil.formateDateCCYYMMDD(ediBookingDto.getEdboShipmentDate())));// 12 装期
        txt.append(flag);
        txt.append(isNull(DateUtil.formateDateCCYYMMDD(ediBookingDto.getEdboExpiryDate())));// 13 效期
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboQuotationNo()));// 14 运费协议号
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboChargeType()));// 15 费率本代码
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboServiceContractNo()));// 16 服务合同号
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboBondNo()));// 17 BOND NO
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboSlotCharterFlag()));// 18 舱位互用标识
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboAmsCode()));// 19 AMS代码
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getCreator()));// 20 订舱人
        txt.append(flag);
        txt.append(""/*isNull(ediBookingDto.getEdboEoorSinoNo())*/);// 21 外运号    订舱网船公司不需要
        txt.append(flag);
        txt.append(isNull(null));// 22 SCAC_CODE
        txt.append(flag);
        txt.append(isNull(null));// 23 HOUSE B/L NO.
        txt.append(flag);
        txt.append(isNull(null));// 24 SO_NO
        txt.append(flag);
        txt.append(isNull(null));// 25 船公司销售人员
        txt.append(endFlag);
        txt.append("\r\n");

        /*
         * 提单信息
         */
        txt.append("03");// 01 记录类型标识[必填]
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboBlViseType()));// 02 提单类型[必填]
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboBlIssuePlaceCode()));// 03 提单签发地代码
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboBlIssuePlace()));// 04 提单签发地
        txt.append(flag);
        txt.append(isNull(DateUtil.formateDateCCYYMMDD((ediBookingDto.getEdboBlIssueDate()))));// 05 签发日期
        txt.append(flag);
        txt.append(isInteger(ediBookingDto.getEdboBlCopyNum()));// 06 正本提单份数[必填]
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboPrepaidPlaceCode()));// 07 预付地点
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboPayPlaceCode()));// 08 到付地点
        txt.append(flag);
        txt.append(isNull(null));// 09 付费地点代码
        txt.append(flag);
        txt.append(isNull(null));// 10 付费地点名称
        txt.append(flag);
        txt.append(isNull(null));// 11 副本提单份数
        txt.append(flag);
        txt.append(isNull(null));// 12 是否显示目的港代理
        txt.append(flag);
        txt.append(isNull(null));// 13 是否提单上显示运费
        txt.append(flag);
        txt.append(isNull(null));// 14 是否存在HBL（仅限日本港口使用）
        txt.append(flag);
        txt.append(isNull(null));// 15 拼合拆分类型
        txt.append(flag);
        txt.append(isNull(null));// 16 拼合拆分描述
        txt.append(endFlag);
        txt.append("\r\n");

        //判断是否是地中海船公司
        //判读控制参数和船公司Code是否为空
        if (EmptyUtils.isNotEmpty(sendToEdiCarrierEbcuCode) && EmptyUtils.isNotEmpty(eoRequestBookingModel.getEorbCarrierCode())) {
        	if (EmptyUtils.isEqual(sendToEdiCarrierEbcuCode, eoRequestBookingModel.getEorbCarrierCode())) {
        		/*
                 * 提单信息
                 */
                txt.append("06");// 01 提单其他信息[必填]
                txt.append(flag);
                txt.append(isNull(eoRequestBookingModel.getEorbAgreementTyep()));// 02 MSC价格协议类型
                txt.append(flag);
                txt.append(isNull(null));// 03 MSC目的地属性
                txt.append(flag);
                txt.append(isNull(null));// 04 MSC目的地运输方式
                txt.append(flag);
                txt.append(isNull(null));// 05 收货地运输方式
                txt.append(flag);
                txt.append(isNull(null));// 06 是否发送AMS
                txt.append(flag);
                txt.append(isNull(null));// 07 目的地ZIP CODE
                txt.append(endFlag);
                txt.append("\r\n");
        	}
        }
        
        
        /*
         * 船舶信息
         */
        txt.append("11");// 01 记录类型标识   --必填
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboVesselCall()));// 02 船舶呼号
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboVesselName()));// 03 船名
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboVoyage()));// 04 航次
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboCarrierCode()));// 05 船公司(承运人)代码
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboCarrierName()));// 06 船公司(承运人)名称
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboBlCarrierCode()));// 07 提单承运人代码      --必填
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboBlCarrierName()));// 08 提单承运人
        txt.append(flag);
        txt.append(isDate(ediBookingDto.getEdboRequestEtd()) == "" ? "" : dateFormat.format(ediBookingDto.getEdboRequestEtd()));// 09 要求装运日期      ‘船名/航次’为空时, 该项必选
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboTradeId()));// 10 航线代码
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboTrade()));// 11 航线
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboPreVesselCode()));// 12 前程运输船名代码
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboPreVesselName()));// 13 前程运输船名
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboPreVoyage()));// 14 前程运输航次
        txt.append(endFlag);
        txt.append("\r\n");

        /*
         * 地点信息
         */
        txt.append("12");// 01 记录类型标识    --必填
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboReceiptPlaceCode()));// 02 收货地代码
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboReceiptPlaceName()));// 03 收货地
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboLoadPortCode()));// 04 装货港代码
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboLoadPortName()));// 05 装货港
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboDischargePortCode()));// 06 卸货港代码
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboDischargePortName()));// 07 卸货港
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboTransferPortCode()));// 08 中转港代码
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboTransferPortName()));// 09 中转港
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboDeliveryPlaceCode()));// 10 交货地代码
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboDeliveryPlaceName()));// 11 交货地
        txt.append(flag);
        txt.append("");// 12 目的地代码    订舱网要求置空
        txt.append(flag);
        txt.append("");// 13 目的地	  订舱网要求置空
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboDepotCode()));// 14 堆场代码
        txt.append(flag);
        txt.append(isNull(null));// 15 提单收货地
        txt.append(flag);
        txt.append(isNull(null));// 16 提单装货港
        txt.append(flag);
        txt.append(isNull(null));// 17 提单卸货港
        txt.append(flag);
        txt.append(isNull(null));// 18 提单交货地/提单目的地
        txt.append(flag);
        txt.append(isNull(null));// 19 提单中转港
        txt.append(flag);
        txt.append(isNull(null));// 20 提单最终目的地
        txt.append(endFlag);
        txt.append("\r\n");
        /*
         * 运费条款
         */
        txt.append("14");// 01 记录类型标识
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboSurchargeCode()));// 02 运费条款代码
        txt.append(flag);
        //txt.append(isNull(ediBookingDto.getEdboSurchargeRemark()));// 03 运费条款
        txt.append(getEdboSurchargeRemarkByCode(ediBookingDto.getEdboSurchargeCode()));// 03 运费条款
        txt.append(flag);
        txt.append(isNull(null));// 03 运费条款说明
        txt.append(endFlag);
        txt.append("\r\n");

        if (txt.length() > 0) {
            return txt.toString();
        } else {
            return null;
        }
    }

    /**
     * 根据运输条款代码获取运输条款
     * @author Shoven.Jiang  
     * @date 2018年11月6日
     * @param edboSurchargeCode
     * @return
     */
    private static String getEdboSurchargeRemarkByCode(String edboSurchargeCode) {
    	String edboSurchargeRemark = "";//运输条款
    	if ("AA".equals(edboSurchargeCode)) {
    		edboSurchargeRemark = "FREIGHT AS ARRANGED";
    	}
    	if ("PP".equals(edboSurchargeCode)) {
    		edboSurchargeRemark = "FREIGHT PREPAID";
    	}
    	if ("CC".equals(edboSurchargeCode)) {
    		edboSurchargeRemark = "FREIGHT COLLECT";
    	}
    	if ("FF".equals(edboSurchargeCode)) {
    		edboSurchargeRemark = "FREIGHT FREE";
    	}
    	if ("OT".equals(edboSurchargeCode)) {
    		edboSurchargeRemark = "OTHER";
    	}
    	return edboSurchargeRemark;
    }
    /**
     * 订舱下达报文 订舱运费及费用细目报文拼接
     * 
     * @param ediBookingFeesModel
     * @return
     */
    public static String setBookingFeesTxtMsg(List<EdiBookingFeesModel> ediBookingFeesModel) {
        StringBuffer txt = new StringBuffer();
        String flag = Constants.WS_BOOKING_FLAG;// 分隔符
        String endFlag = Constants.WS_BOOKING_ENDFLAG;// 结束标记
        /*
         * 运费及费用细目
         */
        for (EdiBookingFeesModel model : ediBookingFeesModel) {
            txt.append("15");// 01 记录类型标识          必填
            txt.append(flag);
            txt.append(isNull(model.getEdbfFeeCode()));// 02 运费及费用代码
            txt.append(flag);
            txt.append(isNull(model.getEdbfFreightChargeDesp()));// 03
            // 运费及费用说明
            txt.append(flag);
            txt.append(isNull(model.getEdbfPayTypeCode()));// 04 付款方式     必填
            txt.append(flag);
            txt.append(isNull(model.getEdbfPayableAtCode()));// 05 第三地付款地点代码
            txt.append(flag);
            txt.append(isNull(model.getEdbfPayeeCode()));// 06 收款人代码
            txt.append(flag);
            txt.append(isDouble(model.getEdbfQuantity()));// 07 数量
            txt.append(flag);
            txt.append(isNull(model.getEdbfCurrency()));// 08 币种
            txt.append(flag);
            txt.append(isDouble(model.getEdbfRate()));// 09 费率
            txt.append(flag);
            txt.append(isNull(model.getEdbfQuantityUnit()));// 10 数量单位
            txt.append(flag);
            txt.append(isDouble(model.getEdbfAmount()));// 11 金额
            txt.append(endFlag);
            txt.append("\r\n");
        }

        if (txt.length() > 0) {
            return txt.toString();
        } else {
            return null;
        }
    }

    /**
     * 拼接订舱请求报文 其他信息 发货人信息 收货人信息 通知人信息 第二通知人信息 第三通知人信息 中间承运人信息 货物交付目的地信息
     * 
     * @param ediBookingFeesModel
     * @return
     */
    public static String setOtherTxtMsg(EdiBookingDto ediBookingDto ,String sendToEdiCarrierEbcuCode) {
        StringBuffer txt = new StringBuffer();
        String flag = Constants.WS_BOOKING_FLAG;// 分隔符
        String endFlag = Constants.WS_BOOKING_ENDFLAG;// 结束标记
        
        EoRequestBookingModel eoRequestBookingModel = ediBookingDto.getEoRequestBookingModel();
        EbRegionModel ebRegionModelConsignee = ediBookingDto.getEbRegionModelConsignee();
        EbRegionModel ebRegionModelShipper = ediBookingDto.getEbRegionModelShipper();
        String shipperPostCode = null;
        String shipperName = null;
        String shipperCityCode = null;
        String consigneePostCode = null;
        String consigneeName = null;
        String consigneeCityCode = null;
        if (null != ebRegionModelConsignee) {
        	//判断是否是地中海船公司
            //判读控制参数和船公司Code是否为空
            if (EmptyUtils.isNotEmpty(sendToEdiCarrierEbcuCode) && EmptyUtils.isNotEmpty(eoRequestBookingModel.getEorbCarrierCode())) {
            	if (EmptyUtils.isEqual(sendToEdiCarrierEbcuCode, eoRequestBookingModel.getEorbCarrierCode())) {
            		consigneePostCode = ebRegionModelConsignee.getEbrgPostCode();
            		consigneeName = ebRegionModelConsignee.getEbrgNameEn();
            		consigneeCityCode = ebRegionModelConsignee.getEbrgNo();
            	}
            }	
        }
        if (null != ebRegionModelShipper) {
        	//判断是否是地中海船公司
            //判读控制参数和船公司Code是否为空
            if (EmptyUtils.isNotEmpty(sendToEdiCarrierEbcuCode) && EmptyUtils.isNotEmpty(eoRequestBookingModel.getEorbCarrierCode())) {
            	if (EmptyUtils.isEqual(sendToEdiCarrierEbcuCode, eoRequestBookingModel.getEorbCarrierCode())) {
            		shipperPostCode = ebRegionModelConsignee.getEbrgPostCode();
            		shipperName = ebRegionModelConsignee.getEbrgNameEn();
            		shipperCityCode = ebRegionModelConsignee.getEbrgNo();
            	}
            }	
        }
        /*
         * 其他信息
         */
        txt.append("17");// 01 记录类型标识
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboRemark()));// 02 备注
        txt.append(flag);
        txt.append(isNull(null));// 03 备注
        txt.append(flag);
        txt.append(isNull(null));// 04 备注
        txt.append(flag);
        txt.append(isNull(null));// 05 备注
        txt.append(flag);
        txt.append(isNull(null));// 06 备注
        txt.append(endFlag);
        txt.append("\r\n");
        /*
         * 发货人信息
         */
        txt.append("18");// 01 记录类型标识
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboShipperCode()));// 02 发货人代码
        txt.append(flag);
        txt.append(isNull(eoRequestBookingModel.getEorbShipper()));// 03 发货人名称     必填
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboShipper()));// 04 发货人地址（街道）
        txt.append(flag);
        txt.append(isNull(shipperCityCode));// 05 城市代码
        txt.append(flag);
        txt.append(isNull(shipperName));// 06 城市名称
        txt.append(flag);
        txt.append(isNull(shipperPostCode));// 07 邮政编码
        txt.append(flag);
        txt.append(isNull(null));// 08 联系人电话
        txt.append(flag);
        txt.append(isNull(null));// 09 联系人传真
        txt.append(flag);
        txt.append(isNull(null));// 10 联系人邮件
        txt.append(flag);
        txt.append(isNull(null));// 11 船公司代码
        txt.append(flag);
        txt.append(isNull(null));// 12 AEO代码
        txt.append(endFlag);
        txt.append("\r\n");
        /*
         * 收货人信息
         */
        txt.append("19");// 01 记录类型标识
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboConsigneeCode()));// 02 收货人代码
        txt.append(flag);
        txt.append(isNull(eoRequestBookingModel.getEorbConsignee()));// 03 收货人名称     必填
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboConsignee()));// 04 收货人地址（街道）
        txt.append(flag);
        txt.append(isNull(consigneeCityCode));// 05 城市代码
        txt.append(flag);
        txt.append(isNull(consigneeName));// 06 城市名称
        txt.append(flag);
        txt.append(isNull(consigneePostCode));// 07 邮政编码
        txt.append(flag);
        txt.append(isNull(null));// 08 联系人电话
        txt.append(flag);
        txt.append(isNull(null));// 09 联系人传真
        txt.append(flag);
        txt.append(isNull(null));// 10 联系人邮件
        txt.append(flag);
        txt.append(isNull(null));// 11 船公司代码
        txt.append(flag);
        txt.append(isNull(null));// 12 AEO代码
        txt.append(endFlag);
        txt.append("\r\n");
        /*
         * 通知人信息
         */
        txt.append("20");// 01 记录类型标识
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboNotifyCode()));// 02 通知人代码
        txt.append(flag);
        txt.append(isNull(eoRequestBookingModel.getEorbNotify()));// 03 通知人    必填
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboNotify()));// 04 通知人地址（街道）
        txt.append(flag);
        txt.append(isNull(consigneeCityCode));// 05 城市代码
        txt.append(flag);
        txt.append(isNull(consigneeName));// 06 城市名称
        txt.append(flag);
        txt.append(isNull(consigneePostCode));// 07 邮政编码
        txt.append(flag);
        txt.append(isNull(null));// 08 联系人电话
        txt.append(flag);
        txt.append(isNull(null));// 09 联系人传真
        txt.append(flag);
        txt.append(isNull(null));// 10 联系人邮件
        txt.append(flag);
        txt.append(isNull(null));// 11 船公司代码
        txt.append(flag);
        txt.append(isNull(null));// 12 AEO代码
        txt.append(endFlag);
        txt.append("\r\n");
        /*
         * 第二通知人信息
         */
        txt.append("21");// 01 记录类型标识
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboSecondNotifyCode()));// 02 通知人代码
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboSecondNotify()));// 03 通知人    必填
        txt.append(flag);
        txt.append(isNull(null));// 04 通知人名称（第二行）
        txt.append(flag);
        txt.append(isNull(null));// 05 通知人名称（第三行）
        txt.append(flag);
        txt.append(isNull(null));// 06 通知人名称（第四行）
        txt.append(flag);
        txt.append(isNull(null));// 07 通知人名称（第五行）
        txt.append(flag);
        txt.append(isNull(null));// 08 通知人名称（第六行）
        txt.append(flag);
        txt.append(isNull(null));// 09 城市代码
        txt.append(flag);
        txt.append(isNull(null));// 10 城市名称
        txt.append(flag);
        txt.append(isNull(null));// 11 邮政编码
        txt.append(flag);
        txt.append(isNull(null));// 12 联系人电话
        txt.append(flag);
        txt.append(isNull(null));// 13 联系人传真
        txt.append(flag);
        txt.append(isNull(null));// 14 联系人邮件
        txt.append(flag);
        txt.append(isNull(null));// 15 船公司代码
        txt.append(flag);
        txt.append(isNull(null));// 16 AEO代码
        txt.append(endFlag);
        txt.append("\r\n");
        /*
         * 货物交付目的地信息
         */
        txt.append("25");// 01 记录类型标识
        txt.append(flag);
        txt.append(isNull("FCO"));// 02 其他联系人类型
        txt.append(flag);
        txt.append(isNull(null));// 03 其他联系人代码
        txt.append(flag);
        txt.append(isNull("FCO"));// 04 其他联系人名称
        txt.append(flag);
        txt.append(isNull(null));// 05 其他联系人地址
        txt.append(flag);
        txt.append(isNull(null));// 06 城市代码
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboCityNameDc()));// 07 城市名称
        txt.append(flag);
        txt.append(isNull(ediBookingDto.getEdboPostcodeDc()));// 08 邮政编码
        txt.append(flag);
        txt.append(isNull(null));// 09 联系人电话
        txt.append(flag);
        txt.append(isNull(null));// 10 联系人传真
        txt.append(flag);
        txt.append(isNull(null));// 11 联系人邮件
        txt.append(endFlag);
        txt.append("\r\n");

        if (txt.length() > 0) {
            return txt.toString();
        } else {
            return null;
        }
    }

    /**
     * 订舱下达报文 拼接订舱请求报文: 订舱预配箱
     */
    public static String setBookingPrecontainerTxtMsg(List<EdiBookingPrecontainerModel> ediBookingPrecontainerModel) {
        StringBuffer txt = new StringBuffer();
        String flag = Constants.WS_BOOKING_FLAG;// 分隔符
        String endFlag = Constants.WS_BOOKING_ENDFLAG;// 结束标记
        /*
         * 订舱预配箱
         */
        for (EdiBookingPrecontainerModel model : ediBookingPrecontainerModel) {
            txt.append("40");// 01 记录类型标识
            txt.append(flag);
            txt.append(isNull(model.getEdbpCntCustomized()) + isNull(model.getEdbpCntCustomizedSize()));// 02 集装箱尺寸类型
            txt.append(flag);
            txt.append(isInteger(model.getEdbpCtnNumber()));// 03 集装箱箱数
            txt.append(flag);
            txt.append(isNull(model.getEdbpFclLcl()));// 04 集装箱状态
            txt.append(flag);
            txt.append(isNull(model.getEdbpMasterLclNo()));// 05 主拼号
            txt.append(flag);
            txt.append(isNull(model.getEdbpStuffingMode()));// 06 装箱方式
            txt.append(flag);
            txt.append(isNull(model.getEdbpVanningDepotCode()));// 07 装箱地点代码
            txt.append(flag);
            txt.append(isNull(model.getEdbpVanningDepotDescription()));// 08 装箱地点说明
            txt.append(flag);
            txt.append(isNull(model.getEdbpIsSoc()));// 09 货主箱标志
            txt.append(flag);
            txt.append(isInteger(model.getEdbpCntSupplierType()));// 10 集装箱来源代码
            txt.append(flag);
            txt.append(isNull(model.getEdbpConsolidatorCode()));// 11 拼箱人代码
            txt.append(endFlag);
            txt.append("\r\n");
        }

        if (txt.length() > 0) {
            return txt.toString();
        } else {
            return null;
        }
    }

    /**
     * 订舱下达报文 拼接订舱请求报文: 订舱货物 唯一托运编号 危险品,冷藏和超标信息 唛头 货物描述
     * 
     * @param ediBookingFeesModel
     * @return
     */
    public static String setBookingMaterialTxtMsg(EdiBookingDto ediBookingDto,List<EdiBookingMaterialModel> ediBookingMaterialModel, EoRequestBookingModel eoRequestBookingModel, String sendToEdiCarrierEbcuCode) {
        StringBuffer txt = new StringBuffer();
        String flag = Constants.WS_BOOKING_FLAG;// 分隔符
        String endFlag = Constants.WS_BOOKING_ENDFLAG;// 结束标记
        String edbmNameCn = "";
       
        //循环物料信息
        if (EmptyUtils.isNotEmpty(ediBookingMaterialModel)) {
        	Integer cargoPackageNumber = 0;
        	Double cargoPackageGrossWt = 0.00;
     		Double cargoPackageMeasurement = 0.00;
     		Integer secCargoPackageNumber = 0;
     		Double secCargoPckGrossWt = 0.00;
     		Double secCargoPackageMeasu = 0.00;
     		Double cargoGrossWeight = 0.00;
     		Double cargoNetWeight = 0.00;
     		String edbmCargoDescription = "";
     		String edbmMark = "";
        	 for (EdiBookingMaterialModel model : ediBookingMaterialModel) {
        		 Integer edbmCargoPackageNumber = model.getEdbmCargoPackageNumber() == null ? 0 : model.getEdbmCargoPackageNumber();//件数
        		 Double edbmCargoPackageGrossWt = model.getEdbmCargoPackageGrossWt() == null ? 0.00 : model.getEdbmCargoPackageGrossWt();//皮重
        		 Double edbmCargoPackageMeasurement = model.getEdbmCargoPackageMeasurement() == null ? 0.00 : model.getEdbmCargoPackageMeasurement();//尺寸
        		 Integer edbmSecCargoPackageNumber = model.getEdbmSecCargoPackageNumber() == null ? 0 : model.getEdbmSecCargoPackageNumber();//尺寸
        		 Double edbmSecCargoPckGrossWt = model.getEdbmSecCargoPckGrossWt() == null ? 0.00 : model.getEdbmSecCargoPckGrossWt();//皮重
        		 Double edbmSecCargoPackageMeasu = model.getEdbmSecCargoPackageMeasu() == null ? 0.00 : model.getEdbmSecCargoPackageMeasu();//尺寸
        		 Double edbmCargoGrossWeight = model.getEdbmCargoGrossWeight() == null ? 0.00 : model.getEdbmCargoGrossWeight();//毛重
        		 Double edbmCargoNetWeight = model.getEdbmCargoNetWeight() == null ? 0.00 : model.getEdbmCargoNetWeight();//净重
        		 
        		 cargoPackageNumber += edbmCargoPackageNumber;
        		 cargoPackageGrossWt += edbmCargoPackageGrossWt;
        		 cargoPackageMeasurement += edbmCargoPackageMeasurement;
        		 secCargoPackageNumber += edbmSecCargoPackageNumber;
        		 secCargoPckGrossWt += edbmSecCargoPckGrossWt;
        		 secCargoPackageMeasu += edbmSecCargoPackageMeasu;
        		 cargoGrossWeight += edbmCargoGrossWeight;
        		 cargoNetWeight += edbmCargoNetWeight;
        		 if (EmptyUtils.isNotEmpty(model.getEdbmCargoDescription())) {
        			 edbmCargoDescription += model.getEdbmCargoDescription() + "\n";
        		 }
        		 if (EmptyUtils.isNotEmpty(model.getEdbmMark())) {
        			 edbmMark += model.getEdbmMark() + "\n";
        		 }
        	 }
        	 ediBookingMaterialModel.get(0).setEdbmCargoPackageNumber(cargoPackageNumber);
        	 ediBookingMaterialModel.get(0).setEdbmCargoPackageGrossWt(cargoPackageGrossWt);
        	 ediBookingMaterialModel.get(0).setEdbmCargoPackageMeasurement(cargoPackageMeasurement);
        	 ediBookingMaterialModel.get(0).setEdbmSecCargoPackageNumber(secCargoPackageNumber);
        	 ediBookingMaterialModel.get(0).setEdbmSecCargoPckGrossWt(secCargoPckGrossWt);
        	 ediBookingMaterialModel.get(0).setEdbmSecCargoPackageMeasu(secCargoPackageMeasu);
        	 ediBookingMaterialModel.get(0).setEdbmCargoGrossWeight(cargoGrossWeight);
        	 ediBookingMaterialModel.get(0).setEdbmCargoNetWeight(cargoNetWeight);
        	 ediBookingMaterialModel.get(0).setEdbmCargoDescription(edbmCargoDescription);
        	 ediBookingMaterialModel.get(0).setEdbmMark(edbmMark);
        }
        /*
         * 订舱货物 唯一托运编号 危险品,冷藏和超标信息 唛头 货物描述
         */
        for (EdiBookingMaterialModel model : ediBookingMaterialModel) {
        	
        	//判断是否是地中海船公司
            //判读控制参数和船公司Code是否为空
            if (EmptyUtils.isNotEmpty(sendToEdiCarrierEbcuCode) && EmptyUtils.isNotEmpty(eoRequestBookingModel.getEorbCarrierCode())) {
            	if (EmptyUtils.isEqual(sendToEdiCarrierEbcuCode, eoRequestBookingModel.getEorbCarrierCode())) {
            		if (EmptyUtils.isNotEmpty(model.getEdbmSubstr1())) {
            			edbmNameCn += model.getEdbmSubstr1() + "\n";
            		}
            		String edbmCargoDescription = model.getEdbmCargoDescription() == null ? "":model.getEdbmCargoDescription();
            		String edbmCargoCode = model.getEdbmCargoCode() == null ? "HS CODE:" : "HS CODE:" + model.getEdbmCargoCode();
            		String afterEdbmCargoDescription = edbmCargoDescription +"\n" 
            										+ edbmCargoCode  +" \n"
            										+ isNull(ediBookingDto.getEdboFreightClauseCode());
            		model.setEdbmCargoDescription(afterEdbmCargoDescription);
            	}
            }
        	
            txt.append("41");// 01 记录类型标识
            txt.append(flag);
            txt.append(isInteger(model.getEdbmCargoSequenceNo()));// 02 货物序号   必填
            txt.append(flag);
            txt.append(isNull(model.getEdbmCargoCode()));// 03 海关税则编号
            txt.append(flag);
            txt.append(isNull(model.getEdbmCargoFlag()));// 04 货物标识
            txt.append(flag);
            txt.append(isInteger(model.getEdbmCargoPackageNumber()));// 05 第一层包装件数
            txt.append(flag);
            txt.append(isNull(model.getEdbmCargoPackageType()));// 06 第一层包装类型
            txt.append(flag);
            txt.append(isNull(model.getEdbmCargoPackageDesc()));// 07 第一层包装说明
            txt.append(flag);
            txt.append(isDouble(NumberUtils.getFormatOfLength(model.getEdbmCargoPackageGrossWt(),3)));// 08  第一层包装皮重
            txt.append(flag);
            txt.append(isDouble(NumberUtils.getFormatOfLength(model.getEdbmCargoPackageMeasurement(),3)));// 09  第一层包装尺码
            txt.append(flag);
            txt.append(isInteger(model.getEdbmSecCargoPackageNumber()));// 10  第二层包装件数
            txt.append(flag);
            txt.append(isNull(model.getEdbmSecCargoPackageType()));// 11  第二层包装类型
            txt.append(flag);
            txt.append(isNull(model.getEdbmSecCargoPackageDesc()));// 12  第二层包装说明
            txt.append(flag);
            txt.append(isDouble(NumberUtils.getFormatOfLength(model.getEdbmSecCargoPckGrossWt(),3)));// 13  第二层包装皮重
            txt.append(flag);
            txt.append(isDouble(NumberUtils.getFormatOfLength(model.getEdbmSecCargoPackageMeasu(),3)));// 14  第二层包装尺码
            txt.append(flag);
            txt.append(isDouble(NumberUtils.getFormatOfLength(model.getEdbmCargoGrossWeight(),3)));// 15 货毛重
            txt.append(flag);
            txt.append(isDouble(NumberUtils.getFormatOfLength(model.getEdbmCargoNetWeight(),3)));// 16 货净重
            txt.append(flag);
            txt.append(isNull(edbmNameCn));// 17 主要品名
            txt.append(endFlag);
            txt.append("\r\n");

            txt.append("43");// 01 记录类型标识
            txt.append(flag);
            txt.append(isNull(model.getEdbmDangerousClass()));// 02 危险品分类
            txt.append(flag);
            txt.append(isNull(model.getEdbmDangerousPage()));// 03 危险品页号
            txt.append(flag);
            txt.append(isNull(model.getEdbmDangerousUndgNo()));// 04 联合国危险品编号
            txt.append(flag);
            txt.append(isNull(model.getEdbmDangerousLabel()));// 05 危险品标签
            txt.append(flag);
            txt.append(isNull(model.getEdbmDangerousFlashPoint()));// 06 危险货物闪点
            txt.append(flag);
            txt.append(isNull(model.getEdbmDangerousEmsNo()));// 07 船运危险品应急措施号
            txt.append(flag);
            txt.append(isNull(model.getEdbmMfagNo()));// 08 医疗急救指南号
            txt.append(flag);
            txt.append(isNull(model.getEdbmMarinePollutantFlag()));// 09 海运污染
            txt.append(flag);
            txt.append(isNull(model.getEdbmEmergencyContact()));// 10 应急联系
            txt.append(flag);
            txt.append(EmptyUtils.isNotEmpty(model.getEdbmReeferVentilationFlux()) ? model.getEdbmReeferVentilationFlux() : "0");// 11  冷藏通风量
            txt.append(flag);
            txt.append(isNull(model.getEdbmTemperatureUnit()));// 12 温度计量单位
            txt.append(flag);
            txt.append(isDouble(model.getEdbmTemperatureSetting()));// 13 设置温度
            txt.append(flag);
            txt.append(isDouble(model.getEdbmMinTemperature()));// 14 冷藏最低温度
            txt.append(flag);
            txt.append(isDouble(model.getEdbmMaxTemperature()));// 15 冷藏最高温度
            txt.append(flag);
            txt.append(isDouble(model.getEdbmOverLengthFront()));// 16 前超
            txt.append(flag);
            txt.append(isDouble(model.getEdbmOverLengthBack()));// 17 后超
            txt.append(flag);
            txt.append(isDouble(model.getEdbmOverWidthLeft()));// 18 左超
            txt.append(flag);
            txt.append(isDouble(model.getEdbmOverWidthRight()));// 19 右超
            txt.append(flag);
            txt.append(isDouble(model.getEdbmOverHeight()));// 20 超高
            txt.append(flag);
            txt.append(isNull(model.getEdbmDangeroseContactName()));// 21  危险品联系人姓名
            txt.append(flag);
            txt.append(isNull(model.getEdbmDangeroseContactTel()));// 22  危险品联系人电话
            txt.append(flag);
            txt.append(isNull(model.getEdbmDangeroseContactEm()));// 23  危险品联系人EMAIL
            txt.append(flag);
            txt.append(isNull(model.getEdbmDangeroseContactFax()));// 24  危险品联系人传真
            txt.append(endFlag);
            txt.append("\r\n");

            txt.append("44");// 01 记录类型标识
            txt.append(flag);
            txt.append(isNull(model.getEdbmMark()));// 02 唛头(第一行)
            txt.append(flag);
            txt.append(isNull(null));// 02 唛头（第二行）
            txt.append(flag);
            txt.append(isNull(null));// 02 唛头（第三行）
            txt.append(flag);
            txt.append(isNull(null));// 02 唛头（第四行）
            txt.append(flag);
            txt.append(isNull(null));// 02 唛头（第五行）
            txt.append(endFlag);
            txt.append("\r\n");

            txt.append("47");// 01 记录类型标识
            txt.append(flag);
            txt.append(isNull(model.getEdbmCargoDescription()));// 02 货物描述(第一行)
            txt.append(flag);
            txt.append(isNull(null));// 06 货物描述(第二行)
            txt.append(flag);
            txt.append(isNull(null));// 03 货物描述(第三行)
            txt.append(flag);
            txt.append(isNull(null));// 04 货物描述(第四行)
            txt.append(flag);
            txt.append(isNull(null));// 05 货物描述(第五行)
            txt.append(flag);
            txt.append(isNull(model.getEdbmSubstr5()));
            txt.append(endFlag);
            txt.append("\r\n");
            break;
        }

        if (txt.length() > 0) {
            return txt.toString();
        } else {
            return null;
        }
    }

    /**
     * 订舱下达报文 已知箱号的集装箱细目
     * 
     * @param ediBookingContinerModel
     * @return
     */
    public static String setBookingContinerTxtMsg(List<EdiBookingContinerModel> ediBookingContinerModel,
            List<EdiBookingSealModel> eEdiBookingSealModel) {
        StringBuffer txt = new StringBuffer();
        String flag = Constants.WS_BOOKING_FLAG;// 分隔符
        String endFlag = Constants.WS_BOOKING_ENDFLAG;// 结束标记
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

        /*
         * 集装箱细目
         */
        for (EdiBookingContinerModel model : ediBookingContinerModel) {
            txt.append("51");// 01 记录类型标识
            txt.append(flag);
            txt.append(isNull(model.getEdbcContainerNo()));// 02 箱号
            txt.append(flag);
            txt.append(isNull(model.getEdbcCntCustomized()) + isNull(model.getEdbcCntCustomizedSize()));// 03 箱型尺寸
            txt.append(flag);
            txt.append(isNull(model.getEdbcSealNo()));// 04 铅封号
            txt.append(flag);
            txt.append(isNull(model.getEdbcSealKind()));// 05 封志类型
            txt.append(flag);
            txt.append(isNull(model.getEdbcSealAgencyCode()));// 06 施加封志人
            txt.append(flag);
            txt.append(isNull(model.getEdbcCtnStatus()));// 07 箱状态
            txt.append(flag);
            txt.append(isInteger(model.getEdbcCtnPackageNumber()));// 08 箱内货物件数
            txt.append(flag);
            txt.append(isDouble(model.getEdbcCargoNetWeight()));// 09 箱内货重
            txt.append(flag);
            txt.append(isDouble(model.getEdbcTareWeight()));// 10 箱皮重
            txt.append(flag);
            txt.append(isDouble(model.getEdbcCargoMeasurement()));// 11 箱内货物尺码
            txt.append(flag);
            txt.append(isInteger(null));// 12 箱SOC标记
            txt.append(flag);
            txt.append(isLong(null));// 13 箱内英文品名
            txt.append(flag);
            txt.append(isDate(null));// 箱内货物包装类型
            txt.append(flag);
            txt.append(isNull(null));// 15 箱内货物包装说明
            txt.append(endFlag);
            txt.append("\r\n");

//            txt.append("58");// 01记录类型标示
//            txt.append(flag);
//            txt.append(isNull(model.getEdbcShipperName()));// 02责任人SHIPPER名
//            txt.append(flag);
//            txt.append(isNull(model.getEdbcShipperAddress()));// 03责任人SHIPPER联系地址
//            txt.append(flag);
//            txt.append(isNull(model.getEdbcShipperVgmName()));// 04责任人VGM联系人
//            txt.append(flag);
//            txt.append(isNull(model.getEdbcShipperVgmEmail()));// 05责任人VGM联系邮箱
//            txt.append(flag);
//            txt.append(isNull(model.getEdbcShipperVgmTelephone()));// 06责任人VGM联系方式
//            txt.append(flag);
//            txt.append(isNull(model.getEdbcShipperVgmPerson()));// 07责任人VGM负责人
//            txt.append(flag);
//            txt.append(isNull(model.getEdbcShipperVgmPersonSig()));// 08责任人VGM负责人签名
//            txt.append(endFlag);
//            txt.append("\r\n");
//
//            txt.append("59");// 01记录类型标示
//            txt.append(flag);
//            txt.append(isNull(model.getEdbcCompanyName()));// 02称重公司 名称
//            txt.append(flag);
//            txt.append(isNull(model.getEdbcCompanyAddress()));// 03称重公司 联系地址
//            txt.append(flag);
//            txt.append(isNull(model.getEdbcCompanyContactName()));// 04称重公司VGM联系人
//            txt.append(flag);
//            txt.append(isNull(model.getEdbcCompanyContactEmail()));// 05称重公司VGM联系邮箱
//            txt.append(flag);
//            txt.append(isNull(model.getEdbcCompanyContactTelephone()));// 06称重公司VGM联系方式
//            txt.append(flag);
//            txt.append(isNull(model.getEdbcCompanyContactPerson()));// 07称重公司VGM负责人
//            txt.append(flag);
//            txt.append(isNull(model.getEdbcCompanyContactSig()));// 08称重公司VGM负责人签名
//            txt.append(endFlag);
//            txt.append("\r\n");
        }

        if (txt.length() > 0) {
            return txt.toString();
        } else {
            return null;
        }
    }

    /**
     * 订舱下达报文 已知箱号的集装箱细目
     * 
     * @param ediBookingContinerModel
     * @return
     */
    public static String setBookingContinerEmptyTxtMsg(List<EdiBookingContinerModel> ediBookingContinerModel) {/*
        StringBuffer txt = new StringBuffer();
        String flag = Constants.WS_BOOKING_FLAG;// 分隔符
        String endFlag = Constants.WS_BOOKING_ENDFLAG;// 结束标记

        
         * 集装箱细目
         
        EdiBookingContinerModel model = new EdiBookingContinerModel();
        txt.append("51");// 01 记录类型标识
        txt.append(flag);
        txt.append(isNull(model.getEdbcContainerNo()));// 02 箱号
        txt.append(flag);
        txt.append(isNull(model.getEdbcCntCustomized()));// 03 箱型尺寸
        txt.append(flag);
        txt.append(isNull(model.getEdbcSealNo()));// 04 铅封号
        txt.append(flag);
        txt.append(isNull(model.getEdbcSealKind()));// 05 封志类型
        txt.append(flag);
        txt.append(isNull(model.getEdbcSealAgencyCode()));// 06 施加封志人
        txt.append(flag);
        txt.append(isNull(model.getEdbcCtnStatus()));// 07 箱状态
        txt.append(flag);
        txt.append(isInteger(model.getEdbcCtnPackageNumber()));// 08 箱内货物件数
        txt.append(flag);
        txt.append(isDouble(model.getEdbcCargoNetWeight()));// 09 箱内货重
        txt.append(flag);
        txt.append(isDouble(model.getEdbcTareWeight()));// 10 箱皮重
        txt.append(flag);
        txt.append(isDouble(model.getEdbcCargoMeasurement()));// 11 箱内货物尺码
        txt.append(flag);
        txt.append(isInteger(model.getEdbcCntSupplierType()));// 12 集装箱来源代
        txt.append(flag);
        txt.append(isLong(model.getEdbcVgmGrossWeight()));// 13 VGM箱总重
        txt.append(flag);
        txt.append(isDate(model.getEdbcVgmDate()));// 14VGM称重时间
        txt.append(flag);
        txt.append(isNull(model.getEdbcVgmMethod()));// 15VGM称重方法
        txt.append(flag);
        txt.append(isNull(model.getEdbcLocationCode()));// 16 VGM称重地点代码
        txt.append(flag);
        txt.append(isNull(model.getEdbcLocationName()));// 17 VGM称重地点名称
        txt.append(flag);
        txt.append(isNull(model.getEdbcVgmCertificateRef()));// 18VGM证书编号

        txt.append(endFlag);
        txt.append("\r\n");

        if (txt.length() > 0) {
            return txt.toString();
        } else {
            return null;
        }
    */
    	return null;
    	}

    /**
     * 订舱下达报文 集装箱铅封信息
     * 
     * @param ediBookingSealModel
     * @return
     */
    public static String setBookingSealTxtMsg(List<EdiBookingSealModel> ediBookingSealModel) {/*
        StringBuffer txt = new StringBuffer();
        String flag = Constants.WS_BOOKING_FLAG;// 分隔符
        String endFlag = Constants.WS_BOOKING_ENDFLAG;// 结束标记

        
         * 集装箱细目
         
        for (EdiBookingSealModel model : ediBookingSealModel) {
            txt.append("52");// 01 记录类型标识
            txt.append(flag);
            txt.append(isNull(model.getEdbsSealKind()));// 02 铅封类别
            txt.append(flag);
            txt.append(isNull(model.getEdbsSealAgencyCode()));// 03 施加封志人代码
            txt.append(flag);
            txt.append(isNull(model.getEdbsSealNo()));// 04 铅封号
            txt.append(endFlag);
            txt.append("\r\n");
        }

        if (txt.length() > 0) {
            return txt.toString();
        } else {
            return null;
        }
    */
    	return null;
	}

    /**
     * 订舱下达报文 集装箱VGM负责人信息
     * 
     * @param ediBookingContinerModel
     * @return
     */
    public static String setBookingContinerShipperVGMTxtMsg(List<EdiBookingContinerModel> ediBookingContinerModel) {/*
        StringBuffer txt = new StringBuffer();
        String flag = Constants.WS_BOOKING_FLAG;// 分隔符
        String endFlag = Constants.WS_BOOKING_ENDFLAG;// 结束标记

        for (EdiBookingContinerModel model : ediBookingContinerModel) {
            txt.append("58");// 01记录类型标示
            txt.append(flag);
            txt.append(isNull(model.getEdbcShipperName()));// 02责任人SHIPPER名
            txt.append(flag);
            txt.append(isNull(model.getEdbcShipperAddress()));// 03责任人SHIPPER联系地址
            txt.append(flag);
            txt.append(isNull(model.getEdbcShipperVgmName()));// 04责任人VGM联系人
            txt.append(flag);
            txt.append(isNull(model.getEdbcShipperVgmEmail()));// 05责任人VGM联系邮箱
            txt.append(flag);
            txt.append(isNull(model.getEdbcShipperVgmTelephone()));// 06责任人VGM联系方式
            txt.append(flag);
            txt.append(isNull(model.getEdbcShipperVgmPerson()));// 07责任人VGM负责人
            txt.append(flag);
            txt.append(isNull(model.getEdbcShipperVgmPersonSig()));// 08责任人VGM负责人签名
            txt.append(endFlag);
            txt.append("\r\n");
        }

        if (txt.length() > 0) {
            return txt.toString();
        } else {
            return null;
        }

    */
    	return null;
	}

    /**
     * 订舱下达空报文 集装箱VGM负责人信息
     * 
     * @param ediBookingContinerModel
     * @return
     */
    public static String setBookingContinerShipperVGMEmptyTxtMsg(List<EdiBookingContinerModel> ediBookingContinerModel) {/*
        StringBuffer txt = new StringBuffer();
        String flag = Constants.WS_BOOKING_FLAG;// 分隔符
        String endFlag = Constants.WS_BOOKING_ENDFLAG;// 结束标记
        EdiBookingContinerModel model = new EdiBookingContinerModel();

        txt.append("58");// 01记录类型标示
        txt.append(flag);
        txt.append(isNull(model.getEdbcShipperName()));// 02责任人SHIPPER名
        txt.append(flag);
        txt.append(isNull(model.getEdbcShipperAddress()));// 03责任人SHIPPER联系地址
        txt.append(flag);
        txt.append(isNull(model.getEdbcShipperVgmName()));// 04责任人VGM联系人
        txt.append(flag);
        txt.append(isNull(model.getEdbcShipperVgmEmail()));// 05责任人VGM联系邮箱
        txt.append(flag);
        txt.append(isNull(model.getEdbcShipperVgmTelephone()));// 06责任人VGM联系方式
        txt.append(flag);
        txt.append(isNull(model.getEdbcShipperVgmPerson()));// 07责任人VGM负责人
        txt.append(flag);
        txt.append(isNull(model.getEdbcShipperVgmPersonSig()));// 08责任人VGM负责人签名
        txt.append(endFlag);
        txt.append("\r\n");

        if (txt.length() > 0) {
            return txt.toString();
        } else {
            return null;
        }

    */
    	return null;
	}

    /**
     * 订舱下达报文 集装箱VGM称重公司
     * 
     * @param ediBookingContinerModel
     * @return
     */
    public static String setBookingContinerCompanyVGMTxtMsg(List<EdiBookingContinerModel> ediBookingContinerModel) {/*
        StringBuffer txt = new StringBuffer();
        String flag = Constants.WS_BOOKING_FLAG;// 分隔符
        String endFlag = Constants.WS_BOOKING_ENDFLAG;// 结束标记

        for (EdiBookingContinerModel model : ediBookingContinerModel) {
            txt.append("59");// 01记录类型标示
            txt.append(flag);
            txt.append(isNull(model.getEdbcCompanyName()));// 02称重公司 名称
            txt.append(flag);
            txt.append(isNull(model.getEdbcCompanyAddress()));// 03称重公司 联系地址
            txt.append(flag);
            txt.append(isNull(model.getEdbcCompanyContactName()));// 04称重公司VGM联系人
            txt.append(flag);
            txt.append(isNull(model.getEdbcCompanyContactEmail()));// 05称重公司VGM联系邮箱
            txt.append(flag);
            txt.append(isNull(model.getEdbcCompanyContactTelephone()));// 06称重公司VGM联系方式
            txt.append(flag);
            txt.append(isNull(model.getEdbcCompanyContactPerson()));// 07称重公司VGM负责人
            txt.append(flag);
            txt.append(isNull(model.getEdbcCompanyContactSig()));// 08称重公司VGM负责人签名
            txt.append(endFlag);
            txt.append("\r\n");
        }

        if (txt.length() > 0) {
            return txt.toString();
        } else {
            return null;
        }

    */
    	return null;
	}

    /**
     * 订舱下达空报文 集装箱VGM称重公司
     * 
     * @param ediBookingContinerModel
     * @return
     */
    public static String setBookingContinerCompanyVGMEmptyTxtMsg(List<EdiBookingContinerModel> ediBookingContinerModel) {/*
        StringBuffer txt = new StringBuffer();
        String flag = Constants.WS_BOOKING_FLAG;// 分隔符
        String endFlag = Constants.WS_BOOKING_ENDFLAG;// 结束标记
        EdiBookingContinerModel model = new EdiBookingContinerModel();
        txt.append("59");// 01记录类型标示
        txt.append(flag);
        txt.append(isNull(model.getEdbcCompanyName()));// 02称重公司 名称
        txt.append(flag);
        txt.append(isNull(model.getEdbcCompanyAddress()));// 03称重公司 联系地址
        txt.append(flag);
        txt.append(isNull(model.getEdbcCompanyContactName()));// 04称重公司VGM联系人
        txt.append(flag);
        txt.append(isNull(model.getEdbcCompanyContactEmail()));// 05称重公司VGM联系邮箱
        txt.append(flag);
        txt.append(isNull(model.getEdbcCompanyContactTelephone()));// 06称重公司VGM联系方式
        txt.append(flag);
        txt.append(isNull(model.getEdbcCompanyContactPerson()));// 07称重公司VGM负责人
        txt.append(flag);
        txt.append(isNull(model.getEdbcCompanyContactSig()));// 08称重公司VGM负责人签名
        txt.append(endFlag);
        txt.append("\r\n");

        if (txt.length() > 0) {
            return txt.toString();
        } else {
            return null;
        }

    */
    	return null;
	}

    /**
     * 订舱下达报文 更改标识 报文尾
     * 
     * @return
     */
    public static String setEndETxtMsg(int i) {
        StringBuffer txt = new StringBuffer();
        String flag = Constants.WS_BOOKING_FLAG;// 分隔符
        String endFlag = Constants.WS_BOOKING_ENDFLAG;// 结束标记

        txt.append("99");// 01 记录类型标识
        txt.append(flag);
        i ++ ;
        txt.append(i);// 02 记录总数
        txt.append(endFlag);
        txt.append("\r\n");

        if (txt.length() > 0) {
            return txt.toString();
        } else {
            return null;
        }
    
//    	return txt;
	}

    /**
     * 订舱请求下达反馈报文解析
     * 
     * @param txtString
     * @return
     * @throws ParseException
     */
    public static BookingFeedbackDto txtToFeedbackBookingEntity(String txtString) throws ParseException {
        String flag = Constants.WS_BOOKING_FLAG;// 分隔符
        String endFlag = Constants.WS_BOOKING_ENDFLAG;// 结束标记

        BookingFeedbackDto bookingFeedbackDto = new BookingFeedbackDto();
        // 联系人信息反馈表 集合
        List<EdiBookingContactFeedbackModel> contactFeedbackList = new ArrayList<EdiBookingContactFeedbackModel>();
        // 订舱运费反馈表
        List<EdiBookingFeesFeedbackModel> feesFeedbackList = new ArrayList<EdiBookingFeesFeedbackModel>();
        // 订舱预配箱反馈表
        List<EdiBookingPreFeedbackModel> preFeedbackList = new ArrayList<EdiBookingPreFeedbackModel>();
        // 订舱货物反馈表
        List<EdiBookingMaterialFeedbackModel> materialFeedbackList = new ArrayList<EdiBookingMaterialFeedbackModel>();
        // 订舱集装箱反馈表
        List<EdiBookingCtnFeedbackModel> ctnFeedbackList = new ArrayList<EdiBookingCtnFeedbackModel>();
        // 订舱集装箱铅封信息反馈表
        List<EdiBookingSealFeedbackModel> sealFeedbackList = new ArrayList<EdiBookingSealFeedbackModel>();

        Map<Integer, EdiBookingMaterialFeedbackModel> materialFeedbackMap = new HashMap<Integer, EdiBookingMaterialFeedbackModel>();
        int num = 0; // 物料数据存在map中的键值
        Long sealNumber = 0L; // 用于关联箱表和封签表的数据

        // 订舱联系人反馈表
        // EdiBookingContactFeedbackModel contactFeedback = new EdiBookingContactFeedbackModel();
        EdiBookingContactFeedbackModel contactFeedback = null;
        // 订舱运费反馈表
        // EdiBookingFeesFeedbackModel feesFeedback = new EdiBookingFeesFeedbackModel();
        EdiBookingFeesFeedbackModel feesFeedback = null;
        // 订舱预配箱反馈表
        // EdiBookingPreFeedbackModel preFeedback = new EdiBookingPreFeedbackModel();
        EdiBookingPreFeedbackModel preFeedback = null;
        // 订舱集装箱反馈表
        // EdiBookingCtnFeedbackModel ctnFeedback = new EdiBookingCtnFeedbackModel();
        EdiBookingCtnFeedbackModel ctnFeedback = null;
        // 订舱集装箱铅封信息反馈表
        // EdiBookingSealFeedbackModel sealFeedback = new EdiBookingSealFeedbackModel();
        EdiBookingSealFeedbackModel sealFeedback = null;
        // 根据 ' 分割
        String[] groupData = txtString.split(endFlag);
        for (int i = 0; i < groupData.length; i++) {
            // 根据 ：分割
            String[] singleData = groupData[i].split(flag, -1);// 截取后为空的部分也存放到数组中

            String headData = singleData[0].trim();

            if ("00".equals(headData)) { // 00.1 头记录
                singleData = addData(singleData, 9);
                bookingFeedbackDto.setEdbbFileType(singleData[1]); // 00.2
                // 报文类型
                // .3文件说明和.4文件功能不存
                bookingFeedbackDto.setEdbbScCode(singleData[4]); // 00.5
                // 发送方代码
                bookingFeedbackDto.setEdbbRcCode(singleData[5]); // 00.6
                // 接收方代码
                bookingFeedbackDto.setEdbbDisposeTime(strToDate(singleData[6])); // 00.7
                // 文件建立时间
                bookingFeedbackDto.setEdbbSubstr1(singleData[7]); // 00.8
                // 回执类型代码
                bookingFeedbackDto.setEdbbSubstr2(singleData[8]); // 00.9
                // 报文版本
            } else if ("01".equals(headData)) { // 01.1 联系人信息
                singleData = addData(singleData, 5);
                contactFeedback = new EdiBookingContactFeedbackModel();
                contactFeedback.setEdbaFunctionCode(singleData[1]); // 01.2 类型
                contactFeedback.setEdbaDepartementEmployee(singleData[2]); // 01.3
                // 部门或联系人
                contactFeedback.setEdbaCommunicationCode(singleData[3]); // 01.4
                // Communication
                // Code
                contactFeedback.setEdbaCommunicationNumber(singleData[4]); // 01.5
                // Communication
                // Number
            } else if ("02".equals(headData)) { // 02.1 订舱信息
                singleData = addData(singleData, 21);
                bookingFeedbackDto.setEdbbSubstr1(singleData[1]); // 02.2
                // 运编号
                bookingFeedbackDto.setEdbbBulkBillNo(singleData[2]);// 02.3
                // 提单号
                bookingFeedbackDto.setEdbbFreightClauseCode(singleData[3]); // 02.4
                // 运输条款代码
                bookingFeedbackDto.setEdbbBookingPartyName(singleData[4]);// 02.5
                // 订舱人说明
                bookingFeedbackDto.setEdbbIssuePartyCode(singleData[5]); // 02.6
                // 签单人代码
                bookingFeedbackDto.setEdbbIssueParty(singleData[6]);// 02.7
                // 签单人说明
                bookingFeedbackDto.setEdbbApplicantId(singleData[7]);// 02.8
                // 询价单位
                bookingFeedbackDto.setEdbbFobBkPartyId(singleData[8]);// 02.9
                // 国外订舱单位
                bookingFeedbackDto.setEdbbTranshipmentFlag(singleData[9]); // 02.10
                // 转船标识
                bookingFeedbackDto.setEdbbBatchFlag(singleData[10]);// 02.11
                // 分批
                bookingFeedbackDto.setEdbbShipmentDate(strToDate(singleData[11])); // 02.12
                // 装期
                bookingFeedbackDto.setEdbbExpiryDate(strToDate(singleData[12]));// 02.13
                // 效期
                bookingFeedbackDto.setEdbbQuotationNo(singleData[13]); // 02.14
                // 运费协议号
                bookingFeedbackDto.setEdbbChargeType(singleData[14]);// 02.15
                // 费率本代码
                bookingFeedbackDto.setEdbbServiceContractNo(singleData[15]); // 02.16
                // 服务合同号
                bookingFeedbackDto.setEdbbBondNo(singleData[16]);// 02.17
                // BOND NO.
                bookingFeedbackDto.setEdbbSlotCharterFlag(singleData[17]); // 02.18
                // 舱位互用标识
                bookingFeedbackDto.setEdbbAmsCode(singleData[18]);// 02.19
                // AMS代码
                bookingFeedbackDto.setEdbbMainBlNo(singleData[19]);// 02.20
                // 总提单号
                bookingFeedbackDto.setEdbbBookingNo(singleData[20]);// 02.21
                // 总提单号
            } else if ("03".equals(headData)) { // 03.1 提单信息
                singleData = addData(singleData, 9);
                bookingFeedbackDto.setEdbbBlViseType(singleData[1]); // 03.2
                // 提单类型
                bookingFeedbackDto.setEdbbBlIssuePlaceCode(singleData[2]); // 03.3
                // 提单签发地代码
                bookingFeedbackDto.setEdbbBlIssuePlace(singleData[3]); // 03.4
                // 提单签发地
                bookingFeedbackDto.setEdbbBlIssueDate(strToDate(singleData[4])); // 03.5
                // 签发日期
                bookingFeedbackDto.setEdbbBlCopyNum(stringToInteger(singleData[5])); // 03.6
                // 正本提单份数
                bookingFeedbackDto.setEdbbPrepaidPlaceName(singleData[6]); // 03.7
                // 预付地点
                bookingFeedbackDto.setEdbbPayPlaceName(singleData[7]); // 03.8
                // 到付地点
            } else if ("11".equals(headData)) { // 11.1 船舶信息
                singleData = addData(singleData, 27);
                bookingFeedbackDto.setEdbbVesselCall(singleData[1]);// 11.2
                // 船舶呼号
                bookingFeedbackDto.setEdbbVesselName(singleData[2]);// 11.3
                // 船名
                bookingFeedbackDto.setEdbbVoyage(singleData[3]);// 11.4 航次
                bookingFeedbackDto.setEdbbCarrierCode(singleData[4]);// 11.5
                // 船公司(承运人)代码
                bookingFeedbackDto.setEdbbCarrierName(singleData[5]);// 11.6
                // 船公司(承运人)名称
                bookingFeedbackDto.setEdbbBlCarrierCode(singleData[6]);// 11.7
                // 提单承运人代码
                bookingFeedbackDto.setEdbbBlCarrierName(singleData[7]);// 11.8
                // 提单承运人
                bookingFeedbackDto.setEdbbRequestEtd(strToDate(singleData[8]));// 11.9
                // 要求装运日期
                bookingFeedbackDto.setEdbbTradeId(singleData[9]);// 11.10
                // 航线代码
                bookingFeedbackDto.setEdbbTrade(singleData[10]);// 11.11 航线
                bookingFeedbackDto.setEdbbPreVesselCode(singleData[11]);// 11.12
                // 前程运输船名代码
                bookingFeedbackDto.setEdbbPreVesselName(singleData[12]);// 11.13
                // 前程运输船名
                bookingFeedbackDto.setEdbbPreVoyage(singleData[13]);// 11.14
                // 前程运输航次
                bookingFeedbackDto.setEdbbNextVesselCode(singleData[14]);// 11.15
                // 后程船名代码
                bookingFeedbackDto.setEdbbNextVessel(singleData[15]);// 11.16
                // 后程船名
                bookingFeedbackDto.setEdbbNextVoyage(singleData[16]);// 11.17
                // 后程航次
                bookingFeedbackDto.setEdbbNextEtd(strToDate(singleData[17]));// 11.18
                // 后程预计离港日期
                bookingFeedbackDto.setEdbbNextAtd(strToDate(singleData[18]));// 11.19
                // 后程实际离港日期
                bookingFeedbackDto.setEdbbNextTransCode(singleData[19]);// 11.20
                // 后程中转代码
                bookingFeedbackDto.setEdbbNextArea(singleData[20]);// 11.21
                // 后程海船作业区
                bookingFeedbackDto.setEdbbNextTransEtd(strToDate(singleData[21]));// 11.22
                // 后程预计到中转港日期
                bookingFeedbackDto.setEdbbNextTransAtd(strToDate(singleData[22]));// 11.23
                // 后程实际到中转港日期
                bookingFeedbackDto.setEdbbNextDestiEtd(strToDate(singleData[23]));// 11.24
                // 后程预计到目的港日期
                bookingFeedbackDto.setEdbbNextDestiAtd(strToDate(singleData[24]));// 11.25
                // 后程实际到目的港日期
                bookingFeedbackDto.setEdbbEsiDeadline(strToDate(singleData[25]));// 11.26
                // 接单时间
                bookingFeedbackDto.setEdbbGateCloseTime(strToDate(singleData[26]));// 11.27
                // 截港时间
            } else if ("12".equals(headData)) { // 12.1 地点信息
                singleData = addData(singleData, 16);
                bookingFeedbackDto.setEdbbReceiptPlaceCode(singleData[1]); // 12.2
                // 收货地代码
                bookingFeedbackDto.setEdbbReceiptPlaceName(singleData[2]); // 12.3
                // 收货地
                bookingFeedbackDto.setEdbbLoadPortCode(singleData[3]); // 12.4
                // 装货港代码
                bookingFeedbackDto.setEdbbLoadPortName(singleData[4]); // 12.5
                // 装货港
                bookingFeedbackDto.setEdbbDischargePortCode(singleData[5]); // 12.6
                // 卸货港代码
                bookingFeedbackDto.setEdbbDischargePortName(singleData[6]); // 12.7
                // 卸货港
                bookingFeedbackDto.setEdbbTransferPortCode(singleData[7]); // 12.8
                // 中转港代码
                bookingFeedbackDto.setEdbbTransferPortName(singleData[8]); // 12.9
                // 中转港
                bookingFeedbackDto.setEdbbDeliveryPlaceCode(singleData[9]); // 12.10
                // 交货地代码
                bookingFeedbackDto.setEdbbDeliveryPlaceName(singleData[10]); // 12.11
                // 交货地
                bookingFeedbackDto.setEdbbFinalDestinationCode(singleData[11]); // 12.12
                // 目的地代码
                bookingFeedbackDto.setEdbbFinalDestination(singleData[12]); // 12.13
                // 目的地
                bookingFeedbackDto.setEdbbDepotCode(singleData[13]); // 12.14
                // 堆场代码
                bookingFeedbackDto.setEdbbTransferPlaceCode(singleData[14]); // 12.15
                // 中转地点代码
                // 12.16 中转目的地代码 无字段
            } else if ("13".equals(headData)) { // 13.1 可选港信息
                singleData = addData(singleData, 5);
                bookingFeedbackDto.setEdbbOptDischargePortCode1(singleData[1]); // 13.2
                // 可选卸货港代码
                bookingFeedbackDto.setEdbbOptDischargePort1(singleData[2]); // 13.3
                // 可选卸货港
                bookingFeedbackDto.setEdbbOptDeliveryPlaceCode(singleData[3]); // 13.4
                // 可选交货地代码
                bookingFeedbackDto.setEdbbOptDeliveryPlace(singleData[4]); // 13.5
                // 可选交货地
            } else if ("14".equals(headData)) { // 14.1 运费条款
                singleData = addData(singleData, 3);
                bookingFeedbackDto.setEdbbSurchargeCode(singleData[1]);// 14.2
                // 运费条款代码
                bookingFeedbackDto.setEdbbSurchargeRemark(singleData[2]);// 14.3
                // 运费条款
            } else if ("15".equals(headData)) { // 15.1 运费及费用细目
                feesFeedback = new EdiBookingFeesFeedbackModel();
                singleData = addData(singleData, 11);
                feesFeedback.setEdbeFeeCode(singleData[1]);// 15.2 运费及费用代码
                feesFeedback.setEdbeFreightChargeDesp(singleData[2]);// 15.3
                // 运费及费用说明
                feesFeedback.setEdbePayTypeCode(singleData[3]);// 15.4 付款方式
                feesFeedback.setEdbePayableAtCode(singleData[4]);// 15.5
                // 付款地点代码
                feesFeedback.setEdbePayeeCode(singleData[5]);// 15.6 收款人代码
                feesFeedback.setEdbeQuantity(stringToDouble(singleData[6]));// 15.7
                // 数量
                feesFeedback.setEdbeCurrency(singleData[7]);// 15.8 币种
                feesFeedback.setEdbeRate(stringToDouble(singleData[8]));// 15.9
                // 费率
                feesFeedback.setEdbeQuantityUnit(singleData[9]);// 15.10 数量单位
                feesFeedback.setEdbeAmount(stringToDouble(singleData[10]));// 15.11
                // 金额
            } else if ("17".equals(headData)) { // 17.1 其他信息
                singleData = addData(singleData, 4);
                bookingFeedbackDto.setEdbbRemark(singleData[1]); // 17.2 备注
                bookingFeedbackDto.setEdbbCurrency(singleData[2]); // 17.3
                // 币种
                bookingFeedbackDto.setEdbbAmount(stringToDouble(singleData[3])); // 17.4
                // 货物金额
            } else if ("18".equals(headData)) { // 18.1 发货人
                singleData = addData(singleData, 3);
                bookingFeedbackDto.setEdbbShipperCode(singleData[1]);// 18.2
                // 发货人代码
                bookingFeedbackDto.setEdbbShipper(singleData[2]);// 18.3
                // 发货人名称
            } else if ("19".equals(headData)) { // 19.1 收货人
                singleData = addData(singleData, 3);
                bookingFeedbackDto.setEdbbConsigneeCode(singleData[1]);// 19.2
                // 收货人代码
                bookingFeedbackDto.setEdbbConsignee(singleData[2]);// 19.3
                // 收货人名称
            } else if ("20".equals(headData)) { // 20.1 通知人
                singleData = addData(singleData, 3);
                bookingFeedbackDto.setEdbbNotifyCode(singleData[1]);// 20.2
                // 通知人代码
                bookingFeedbackDto.setEdbbNotify(singleData[2]);// 20.3
                // 通知人名称
            } else if ("21".equals(headData)) { // 21.1 第二通知人
                singleData = addData(singleData, 3);
                bookingFeedbackDto.setEdbbSecondNotifyCode(singleData[1]);// 21.2
                // 第二通知人代码
                bookingFeedbackDto.setEdbbSecondNotify(singleData[2]);// 21.3
                // 第二通知人名称
            } else if ("22".equals(headData)) { // 22.1 第三通知人
                singleData = addData(singleData, 3);
                bookingFeedbackDto.setEdbbThirdNotifyCode(singleData[1]); // 22.2
                // 第三通知人代码
                bookingFeedbackDto.setEdbbThirdNotify(singleData[2]); // 22.3
                // 第三通知人名称
            } else if ("23".equals(headData)) { // 23.1 中间承运人信息
                singleData = addData(singleData, 5);
                bookingFeedbackDto.setEdbbIntermediateCarrgier(singleData[1]); // 23.2
                // 中间承运人标识
                bookingFeedbackDto.setEdbbTelInterCarrgier(singleData[2]); // 23.3
                // 中间承运人电话
                bookingFeedbackDto.setEdbbEmailInterCarrgier(singleData[3]); // 23.4
                // 中间承运人EMAIL
                bookingFeedbackDto.setEdbbFaxInterCarrgier(singleData[4]); // 23.5
                // 中间承运人传真
            } else if ("25".equals(headData)) { // 25.1 货物交付目的地信息
                singleData = addData(singleData, 7);
                bookingFeedbackDto.setEdbbStreetNumberPoboxDc(singleData[1]); // 25.2
                // 货物交付目的地地址（街道，邮箱）
                bookingFeedbackDto.setEdbbCityNameDc(singleData[2]); // 25.3
                // 城市名称
                bookingFeedbackDto.setEdbbCountrySubEntityDc(singleData[3]);// 25.4
                // 省份代码
                bookingFeedbackDto.setEdbbCountrySubEntityNmDc(singleData[4]); // 25.5
                // 省份名称
                bookingFeedbackDto.setEdbbPostcodeDc(singleData[5]); // 25.6
                // 邮政编码
                bookingFeedbackDto.setEdbbCountryCodeDc(singleData[6]); // 25.7
                // 国家代码
            } else if ("40".equals(headData)) { // 40.1 订舱预配箱
                preFeedback = new EdiBookingPreFeedbackModel();
                singleData = addData(singleData, 12);
                // 截取预配箱尺寸和类型
                String ctnType = singleData[1];// 40.2 集装箱尺寸类型
                String ctn = ctnType.substring(0, 2);
                String type = ctnType.substring(2);

                preFeedback.setEdbrCntCustomized(ctn);// 尺寸
                preFeedback.setEdbrCntCustomizedSize(type);// 箱型
                preFeedback.setEdbrSizeTypeName(singleData[2]); // 40.3
                // 集装箱尺寸类型名称
                preFeedback.setEdbrCtnNumber(stringToInteger(singleData[3])); // 40.4
                // 集装箱箱数
                preFeedback.setEdbrFclLcl(singleData[4]); // 40.5 集装箱状态 整拼标识
                preFeedback.setEdbrMasterLclNo(singleData[5]); // 40.6 主拼号
                preFeedback.setEdbrStuffingMode(singleData[6]); // 40.7 装箱方式
                preFeedback.setEdbrVanningDepotCode(singleData[7]); // 40.8
                // 装箱地点代码
                preFeedback.setEdbrVanningDepotDescription(singleData[8]); // 40.9
                // 装箱地点说明
                preFeedback.setEdbrIsSoc(singleData[9]); // 40.10 货主箱标志
                preFeedback.setEdbrCntSupplierType(stringToInteger(singleData[10])); // 40.11
                // 集装箱来源代码
                preFeedback.setEdbrConsolidatorCode(singleData[11]); // 40.12
                // 拼箱人代码
            } else if ("41".equals(headData)) {// 41.1 订舱货物
                singleData = addData(singleData, 22);
                // 订舱货物反馈表
                EdiBookingMaterialFeedbackModel materialFeedback = new EdiBookingMaterialFeedbackModel();
                materialFeedback.setEdbtCargoSequenceNo(stringToInteger(singleData[1])); // 41.2
                // 货物序号
                materialFeedback.setEdbtCargoCode(singleData[2]); // 41.3
                // 海关税则编号
                materialFeedback.setEdbtCargoFlag(singleData[3]); // 41.4 货物标识
                materialFeedback.setEdbtCargoPackageNumber(stringToInteger(singleData[4])); // 41.5
                // 第一层包装件数
                materialFeedback.setEdbtCargoPackageType(singleData[5]); // 41.6
                // 第一层包装类型
                materialFeedback.setEdbtCargoPackageDesc(singleData[6]); // 41.7
                // 第一层包装说明
                materialFeedback.setEdbtCargoPackageGrossWt(stringToDouble(singleData[7])); // 41.8
                // 第一层包装皮重
                materialFeedback.setEdbtCargoPackageMeasurement(stringToDouble(singleData[8])); // 41.9
                // 第一层包装尺码
                materialFeedback.setEdbtSecCargoPackageNumber(stringToInteger(singleData[9])); // 41.10
                // 第二层包装件数
                materialFeedback.setEdbtSecCargoPackageType(singleData[10]); // 41.11
                // 第二层包装类型
                materialFeedback.setEdbtSecCargoPackageDesc(singleData[11]); // 41.12
                // 第二层包装说明
                materialFeedback.setEdbtSecCargoPkgGrossWt(stringToDouble(singleData[12])); // 41.13
                // 第二层包装皮重
                materialFeedback.setEdbtSecCargoPackageMeasu(stringToDouble(singleData[13])); // 41.14
                // 第二层包装尺码
                materialFeedback.setEdbtCargoGrossWeight(stringToDouble(singleData[14])); // 41.15
                // 货毛重
                materialFeedback.setEdbtCargoNetWeight(stringToDouble(singleData[15])); // 41.16
                // 货净重
                materialFeedback.setEdbtCargoMeasurement(stringToDouble(singleData[16])); // 41.17
                // 货尺码
                materialFeedback.setEdbtQuarantineCode(singleData[17]); // 41.18
                // 检疫代码
                materialFeedback.setEdbtQuarantineName(singleData[18]); // 41.19
                // 检疫名称
                materialFeedback.setEdbtConsignCargoCost(stringToDouble(singleData[19])); // 41.20
                // 托运货物价值
                materialFeedback.setEdbtCustomsProcedureCode(singleData[20]); // 41.21
                // 海关手续代码
                materialFeedback.setEdbtCountryOfOriginCode(singleData[21]); // 41.22
                // 原产地代码
                num++;
                materialFeedbackMap.put(num, materialFeedback);
            } else if ("42".equals(headData)) {// 42.1 唯一托运编号
                singleData = addData(singleData, 2);
                EdiBookingMaterialFeedbackModel materialFeedback = materialFeedbackMap.get(num);
                materialFeedback.setEdbtUniConsignmentRefNo(singleData[1]); // 42.2
                // 唯一托运编号
                materialFeedbackMap.put(num, materialFeedback);
            } else if ("43".equals(headData)) {// 43.1 危险品,冷藏和超标信息
                singleData = addData(singleData, 25);
                EdiBookingMaterialFeedbackModel materialFeedback = materialFeedbackMap.get(num);
                materialFeedback.setEdbtDangerousClass(singleData[1]); // 43.2
                // 危险品分类
                materialFeedback.setEdbtDangerousPage(singleData[2]); // 43.3
                // 危险品页号
                materialFeedback.setEdbtDangerousUndgNo(singleData[3]); // 43.4
                // 联合国危险品编号
                materialFeedback.setEdbtDangerousLabel(singleData[4]); // 43.5
                // 危险品标签
                materialFeedback.setEdbtDangerousFlashPoint(singleData[5]); // 43.6
                // 危险货物闪点
                materialFeedback.setEdbtDangerousEmsNo(singleData[6]); // 43.7
                // 船运危险品应急措施号
                materialFeedback.setEdbtMfagNo(singleData[7]); // 43.8 医疗急救指南号
                materialFeedback.setEdbtMarinePollutantFlag(singleData[8]); // 43.9
                // 海运污染
                materialFeedback.setEdbtEmergencyContact(singleData[9]); // 43.10
                // 应急联系
                materialFeedback.setEdbtReeferVentilationFlux(singleData[10]); // 43.11
                // 冷藏通风量
                materialFeedback.setEdbtTemperatureUnitName(singleData[11]); // 43.12
                // 温度计量单位
                materialFeedback.setEdbtTemperatureSetting(stringToDouble(singleData[12])); // 43.13
                // 设置温度
                materialFeedback.setEdbtMinTemperature(stringToDouble(singleData[13])); // 43.14
                // 冷藏最低温度
                materialFeedback.setEdbtMaxTemperature(stringToDouble(singleData[14])); // 43.15
                // 冷藏最高温度
                materialFeedback.setEdbtOverLengthFront(stringToDouble(singleData[15])); // 43.16
                // 前超
                materialFeedback.setEdbtOverLengthBack(stringToDouble(singleData[16])); // 43.17
                // 后超
                materialFeedback.setEdbtOverWidthLeft(stringToDouble(singleData[17])); // 43.18
                // 左超
                materialFeedback.setEdbtOverWidthRight(stringToDouble(singleData[18])); // 43.19
                // 右超
                materialFeedback.setEdbtOverHeight(stringToDouble(singleData[19])); // 43.20
                // 超高
                materialFeedback.setEdbtDangeroseContactName(singleData[20]); // 43.21
                // 危险品联系人姓名
                materialFeedback.setEdbtDangeroseContactTel(singleData[21]); // 43.22
                // 危险品联系人电话
                materialFeedback.setEdbtDangeroseContactEm(singleData[22]); // 43.23
                // 危险品联系人EMAIL
                materialFeedback.setEdbtDangeroseContactFax(singleData[23]); // 43.24
                // 危险品联系人传真
                materialFeedback.setEdbtDangerosePackage(singleData[24]); // 43.25
                // 危险品包装
                materialFeedbackMap.put(num, materialFeedback);
            } else if ("44".equals(headData)) {// 44.1 唛头
                singleData = addData(singleData, 2);
                EdiBookingMaterialFeedbackModel materialFeedback = materialFeedbackMap.get(num);
                materialFeedback.setEdbtMark(singleData[1]); // 44.2 唛头
                materialFeedbackMap.put(num, materialFeedback);
            } else if ("47".equals(headData)) {// 47.1 货物描述
                singleData = addData(singleData, 2);
                EdiBookingMaterialFeedbackModel materialFeedback = materialFeedbackMap.get(num);
                materialFeedback.setEdbtCargoDescription(singleData[1]); // 47.2
                // 货物描述
                materialFeedbackMap.put(num, materialFeedback);
            } else if ("51".equals(headData)) {// 51.1 已知箱号的集装箱细目
                ctnFeedback = new EdiBookingCtnFeedbackModel();
                singleData = addData(singleData, 12);

                sealNumber++;

                ctnFeedback.setEdbnContainerNo(singleData[1]); // 51.2 箱号
                // 截取预配箱尺寸和类型
                String ctnType = singleData[2]; // 51.3 箱型尺寸
                String ctn = ctnType.substring(0, 2);
                String type = ctnType.substring(2);

                ctnFeedback.setEdbnCntCustomized(ctn);// 尺寸
                ctnFeedback.setEdbnCntCustomizedSize(type);// 箱型
                ctnFeedback.setEdbnSealNo(singleData[3]); // 51.4 铅封号
                ctnFeedback.setEdbnSealKind(singleData[4]); // 51.5 封志类型
                ctnFeedback.setEdbnSealAgencyName(singleData[5]); // 51.6
                // 施加封志人
                ctnFeedback.setEdbnCtnStatus(singleData[6]); // 51.7 箱状态
                ctnFeedback.setEdbnCtnPackageNumber(stringToInteger(singleData[7])); // 51.8
                // 箱内货物件数
                ctnFeedback.setEdbnCargoNetWeight(stringToDouble(singleData[8])); // 51.9
                // 箱内货重
                ctnFeedback.setEdbnTareWeight(stringToDouble(singleData[9])); // 51.10
                // 箱皮重
                ctnFeedback.setEdbnCargoMeasurement(stringToDouble(singleData[10])); // 51.11
                // 箱内货物尺码
                ctnFeedback.setEdbnCntSupplierType(stringToInteger(singleData[11])); // 51.12
                // 集装箱来源代码
                ctnFeedback.setEdbnSubnum1(sealNumber); // 数字为 1， 表示为第一条集装箱数据
            } else if ("52".equals(headData)) {// 52.1 集装箱铅封信息
                singleData = addData(singleData, 4);
                sealFeedback = new EdiBookingSealFeedbackModel();
                sealFeedback.setEdblSealKind(singleData[1]); // 52.2 铅封类别
                sealFeedback.setEdblSealAgencyCode(singleData[2]); // 52.3
                // 施加封志人代码
                sealFeedback.setEdblSealNo(singleData[3]); // 52.4 铅封号
                sealFeedback.setEdblSubnum1(sealNumber); // 数字为
                // 1，表示为第一条集装箱下面的封签信息
            }

            // model中数据添加到list中
            if ("01".equals(headData)) {
                contactFeedbackList.add(contactFeedback);// 联系人信息
            } else if ("15".equals(headData)) {
                feesFeedbackList.add(feesFeedback);// 运费信息
            } else if ("40".equals(headData)) {
                preFeedbackList.add(preFeedback);// 预配箱信息
            } else if ("51".equals(headData)) {
                ctnFeedbackList.add(ctnFeedback);// 集装箱信息
            } else if ("52".equals(headData)) {
                sealFeedbackList.add(sealFeedback);// 集装箱铅封信息
            }
        }

        for (Integer key : materialFeedbackMap.keySet()) {
            materialFeedbackList.add(materialFeedbackMap.get(key));
        }

        bookingFeedbackDto.setEdiBookingContactFeedbackModel(contactFeedbackList);
        bookingFeedbackDto.setEdiBookingFeesFeedbackModel(feesFeedbackList);
        bookingFeedbackDto.setEdiBookingPreFeedbackModel(preFeedbackList);
        bookingFeedbackDto.setEdiBookingMaterialFeedbackModel(materialFeedbackList);
        bookingFeedbackDto.setEdiBookingCtnFeedbackModel(ctnFeedbackList);
        bookingFeedbackDto.setEdiBookingSealFeedbackModel(sealFeedbackList);
        return bookingFeedbackDto;
    }

    /**
     * 数组长度不够时，增加数组，避免出现数组越界异常
     * 
     * @param singleData 数组
     * @param arg 数组应有的长度
     * @return
     */
    private static String[] addData(String[] singleData, int arg) {
        String[] data = singleData;
        if (data.length < arg) {
            for (int i = data.length; i < arg; i++) {
                data = Arrays.copyOf(data, data.length + 1);
                data[data.length - 1] = "";
            }
        }
        return data;
    }

    /**
     * 日期转型异常捕获
     */
    private static Date strToDate(String arg) {
        Date result = null;
        SimpleDateFormat format24H = new SimpleDateFormat(Constants.DATE_FORMAT_TYPE_24H);
        if ("".equals(arg)) {
            return result;
        } else {
            try {
                String args =
                        arg.substring(0, 4) + "-" + arg.substring(4, 6) + "-" + arg.substring(6, 8) + " " + arg.substring(8, 10) + ":"
                                + arg.substring(10, 12) + ":" + arg.substring(12, 14);
                result = format24H.parse(args);
                return result;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return result;
        }
    }

    /**
     * String转Integer 如果是""返回null 否则转Integer
     */
    private static Integer stringToInteger(String arg) {
        Integer result = null;
        if (EmptyUtils.isNotEmpty(arg)) {
            result = Integer.parseInt(arg);
            return result;
        }
        return result;
    }

    /**
     * String转Double 如果是""返回null 否则转Double
     */
    private static Double stringToDouble(String arg) {
        Double result = null;
        if (EmptyUtils.isNotEmpty(arg)) {
            result = Double.parseDouble(arg);
            return result;
        }
        return result;
    }

    /**
     * 入参是integer类型，返回字符串
     * 
     * @param arg
     * @return
     */
    private static String isInteger(Integer arg) {
        String result = "";
        if (arg != null) {
            result = arg.toString();
        }
        return result;
    }

    /**
     * 入参是Double类型，返回字符串
     * 
     * @param arg
     * @return
     */
    private static String isDouble(Double arg) {
        String result = "";
        if (arg != null) {
            result = arg.toString();
        }
        return result;
    }

    /**
     * 入参如果是Long类型，返回字符串
     * 
     * @param arg
     * @return
     */
    private static String isLong(Long arg) {
        if (arg != null) {
            return arg.toString();
        }
        return "";
    }

    /**
     * 入参如果是日期，返回 "yyyy-MM-dd HH:mm:ss" 字符串
     * 
     * @param date
     * @return
     */
    private static String isDate(Date date) {
        if (date != null) {
            DateFormat format24H = new SimpleDateFormat(Constants.DATE_FORMAT_TYPE_24H);
            return format24H.format(date);
        }
        return "";
    }

    /**
     * 入参如果是null,返回空字符""
     * 增加特殊字符转义
     * @param str
     * @return
     */
    private static String isNull(String str) {
        if (str == null) {
            return "";
        } else {
            StringBuffer result = new StringBuffer();
            Pattern pattern = Pattern.compile("[+':?]");
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                matcher.appendReplacement(result, "?" + matcher.group());
            }
            matcher.appendTail(result);
            return result.toString();
        }

    }
}
