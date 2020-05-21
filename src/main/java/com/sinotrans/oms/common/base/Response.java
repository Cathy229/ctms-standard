package com.sinotrans.oms.common.base;

public class Response extends Model {

	private static final long serialVersionUID = 8775508366956939838L;

	private String code = "Y";

	private String msg = "操作成功";

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
		return "Response [code=" + code + ", msg=" + msg + "]";
	}
}

