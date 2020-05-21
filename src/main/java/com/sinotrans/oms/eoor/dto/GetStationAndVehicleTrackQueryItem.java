package com.sinotrans.oms.eoor.dto;

import java.io.Serializable;
import java.util.Date;

public class GetStationAndVehicleTrackQueryItem implements Serializable {
		//调度ID
		private Long scslEtspId;
		//站点在车次中的次序
		private Long scslSequenceNumber;
		//站点的地址明文
		private String scslLocationAddress;
		//站点经度
		private String scslLongitude;
		//站点纬度
		private String scslLatitude;
		//该站点距离前一个停靠点的行驶时间
		private String scslDrivingdurationstop;
		//该站点距离前一个停靠点的行驶距离
		private String scslDistancestop;
		//该站点的计划到达时间
		private Date scslPlannedtimeofarrival;
		//该站点的计划离开时间
		private Date scslPlannedtimeofdeparture;
		//车次在该站点的等待时间
		private String scslWaitingduration;
		//车次在该站点的处理时间
		private String scslHandlingduration;
		//站点Id(杉数)
		private String scslLocationId;
		public Long getScslEtspId() {
			return scslEtspId;
		}
		public void setScslEtspId(Long scslEtspId) {
			this.scslEtspId = scslEtspId;
		}
		public Long getScslSequenceNumber() {
			return scslSequenceNumber;
		}
		public void setScslSequenceNumber(Long scslSequenceNumber) {
			this.scslSequenceNumber = scslSequenceNumber;
		}
		public String getScslLocationAddress() {
			return scslLocationAddress;
		}
		public void setScslLocationAddress(String scslLocationAddress) {
			this.scslLocationAddress = scslLocationAddress;
		}
		public String getScslLongitude() {
			return scslLongitude;
		}
		public void setScslLongitude(String scslLongitude) {
			this.scslLongitude = scslLongitude;
		}
		public String getScslLatitude() {
			return scslLatitude;
		}
		public void setScslLatitude(String scslLatitude) {
			this.scslLatitude = scslLatitude;
		}
		public String getScslDrivingdurationstop() {
			return scslDrivingdurationstop;
		}
		public void setScslDrivingdurationstop(String scslDrivingdurationstop) {
			this.scslDrivingdurationstop = scslDrivingdurationstop;
		}
		public String getScslDistancestop() {
			return scslDistancestop;
		}
		public void setScslDistancestop(String scslDistancestop) {
			this.scslDistancestop = scslDistancestop;
		}
		public Date getScslPlannedtimeofarrival() {
			return scslPlannedtimeofarrival;
		}
		public void setScslPlannedtimeofarrival(Date scslPlannedtimeofarrival) {
			this.scslPlannedtimeofarrival = scslPlannedtimeofarrival;
		}
		public Date getScslPlannedtimeofdeparture() {
			return scslPlannedtimeofdeparture;
		}
		public void setScslPlannedtimeofdeparture(Date scslPlannedtimeofdeparture) {
			this.scslPlannedtimeofdeparture = scslPlannedtimeofdeparture;
		}
		public String getScslWaitingduration() {
			return scslWaitingduration;
		}
		public void setScslWaitingduration(String scslWaitingduration) {
			this.scslWaitingduration = scslWaitingduration;
		}
		public String getScslHandlingduration() {
			return scslHandlingduration;
		}
		public void setScslHandlingduration(String scslHandlingduration) {
			this.scslHandlingduration = scslHandlingduration;
		}
		public String getScslLocationId() {
			return scslLocationId;
		}
		public void setScslLocationId(String scslLocationId) {
			this.scslLocationId = scslLocationId;
		}
		
		
}
