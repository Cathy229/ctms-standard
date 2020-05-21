package com.sinotrans.oms.common.util;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sinotrans.framework.core.aop.BaseAspect;

/**  
* <p>Title: BASE64</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年10月14日  
* @version 1.0  
*/
public class BASE64  extends BaseAspect{
	
	protected final Log log = LogFactory.getLog(getClass());
	
	/**
	 * base64加密
	 * @author Shoven.Jiang  
	 * @date 2018年12月11日
	 * @param param
	 * @return
	 */
	public final static byte[] encode(String param) {
		byte[] encodeBase64 = null;
		try {
			encodeBase64 = Base64.encodeBase64(param.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return encodeBase64;
	}
	
	/**
	 * base64解密
	 * @author Shoven.Jiang  
	 * @date 2018年12月11日
	 * @param result2
	 * @return
	 */
	public String decode(String result2) {
        byte[] b = null;
        String result = null;
        if (result2 != null) {
            try {
                b = Base64.decodeBase64(result2);
                result = new String(b, "utf-8");
            } catch (Exception e) {
            	log.error(e.getMessage(), e);
            }
        }
        return result;
    }
}
