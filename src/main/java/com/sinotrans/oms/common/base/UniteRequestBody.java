package com.sinotrans.oms.common.base;
/**  
* Title: UniteRequestBody  
* Description:  
* @author Shoven.Jiang  
* @date 2019年3月2日  
* @version 1.0  
*/
public class UniteRequestBody<T> {

	private static final long serialVersionUID = 8775508366956939838L;

	private String url = "rest";
	
	private T data;
	

	@Override
	public String toString() {
		return "UniteRequestBody [url=" + url + ", data=" + data + "]";
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public T getData() {
		return data;
	}



	public void setData(T data) {
		this.data = data;
	}
	
	
}
