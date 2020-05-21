package com.sinotrans.oms.common.base;

public class ResponseBodyData {

	private String code = "Y";
	
	private String msg = "操作成功";

	private Object data;
	

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "ResponseBodyData [code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}

}
