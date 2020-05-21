package com.sinotrans.oms.common.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.Map.Entry;

import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;

import org.apache.http.HttpResponse;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.protocol.HttpContext;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.common.service.InvokHttpClientService;
import com.sinotrans.oms.common.util.EmptyUtils;

/**
 * 调用EDI服务接口
 * @author Harley add by 20170731
 *
 */
@Service
public class InvokHttpClientServiceImpl extends MybatisManagerImpl implements InvokHttpClientService {

	private static HttpClient client = null;
	// 连接超时时间 可以配到配置文件  （单位毫秒） 
    private static int MAX_TIME_OUT=10000;
    //设置整个连接池最大连接数  
    private static int MAX_CONN=200;
    //设置单个路由默认连接数  
    private static int SINGLE_ROUTE_MAX_CONN=100;
    //连接丢失后,重试次数  
    private static int MAX_EXECUT_COUNT=0;
    // 创建连接管理器  
    private PoolingHttpClientConnectionManager connManager =null;  
	/**
	 * 实例化单利http客户端
	 */
	public InvokHttpClientServiceImpl(){
		if (client == null) {
			// 创建SSLSocketFactory   
            // 定义socket工厂类    指定协议（Http、Https）  
			Registry<ConnectionSocketFactory> registry = RegistryBuilder.<ConnectionSocketFactory> create()
					.register("http", PlainConnectionSocketFactory.getSocketFactory())
					.register("https", SSLConnectionSocketFactory.getSocketFactory()).build();
            // 创建连接管理器  兼容并发
            connManager = new PoolingHttpClientConnectionManager(registry);  
            connManager.setMaxTotal(MAX_CONN);//设置最大连接数  
            connManager.setDefaultMaxPerRoute(SINGLE_ROUTE_MAX_CONN);//设置每个路由默认连接数  
            //设置目标主机的连接数  
//          HttpHost host = new HttpHost("account.dafy.service");//针对的主机  
//          connManager.setMaxPerRoute(new HttpRoute(host), 50);//每个路由器对每个服务器允许最大50个并发访问  
            // 创建httpClient对象  
            client = HttpClients.custom()
                    .setConnectionManager(connManager)
                    .setRetryHandler(httpRequestRetry())
                    .setDefaultRequestConfig(config())
                    .build();
		}
	}
	
	/** 
     * 配置请求连接重试机制 
     */  
    private HttpRequestRetryHandler httpRequestRetry(){  
        HttpRequestRetryHandler httpRequestRetryHandler = new HttpRequestRetryHandler() {    
            public boolean retryRequest(IOException exception,int executionCount, HttpContext context) {    
                if (executionCount >= MAX_EXECUT_COUNT) {// 如果已经重试MAX_EXECUT_COUNT次，就放弃                       
                    return false;    
                }    
                if (exception instanceof NoHttpResponseException) {// 如果服务器丢掉了连接，那么就重试       
                    log.error("httpclient 服务器连接丢失");  
                    return true;    
                }    
                if (exception instanceof SSLHandshakeException) {// 不要重试SSL握手异常            
                    log.error("httpclient SSL握手异常");  
                    return false;    
                }                   
                if (exception instanceof InterruptedIOException) {// 超时                  
                	log.error("httpclient 连接超时");  
                    return false;    
                }    
                if (exception instanceof UnknownHostException) {// 目标服务器不可达          
                    log.error("httpclient 目标服务器不可达");  
                    return false;    
                }    
                if (exception instanceof ConnectTimeoutException) {// 连接被拒绝           
                    log.error("httpclient 连接被拒绝");  
                    return false;    
                }    
                if (exception instanceof SSLException) {// ssl握手异常               
                    log.error("httpclient SSLException");  
                    return false;    
                }    
                  
                HttpClientContext clientContext = HttpClientContext.adapt(context);    
//                HttpRequest request = 
                clientContext.getRequest(); 
                // 如果请求是幂等的，就再次尝试   暂时没理解先注释  
//              if (!(request instanceof HttpEntityEnclosingRequest)) {                     
//                  return true;    
//              }    
                return false;    
            }    
        };  
        return httpRequestRetryHandler;
    }
    
    /** 
     * 配置默认请求参数 
     */  
    private static RequestConfig config() {
        // 配置请求的超时设置  其他参数可以追加  
        RequestConfig requestConfig = RequestConfig.custom()  
                .setConnectionRequestTimeout(MAX_TIME_OUT)// 设置从连接池获取连接实例的超时  
                .setConnectTimeout(MAX_TIME_OUT)// 设置连接超时  
                .setSocketTimeout(MAX_TIME_OUT)// 设置读取超时  
                .build();
        return requestConfig;  
    }
	/**
	 * cell EDI 上传回传等服务
	 */
	public void callEDIBackServer(String flag, String message) {
//		String address = getUrl(flag);
		String address = "";
		if (EmptyUtils.isEmpty(address)) {
			log.error("call edi (" + flag + ") 没有查到url：" + message);
			return;
		}
		String url = address + "?batchNO=" + message;
		executeHttpGet(url, null, flag);
	}
	
	@Override
	public HttpResponse executeHttpGet(String url, Map<String,String> map, String flag) {
		// 使用 GET 方法 ，如果服务器需要通过 HTTPS 连接，那只需要将下面 URL 中的 http 换成 https
		HttpResponse httpResponse = null;
		//将参数拼接到路径后
		if (map != null && map.size() > 0) {
			StringBuffer sUrl = new StringBuffer();
	        sUrl.append(url).append("?");
	        for (Entry<String, String> entry : map.entrySet()) {
	        	sUrl.append(entry.getKey()).append("=").append(entry.getValue())
	        		.append("&");
			}
	        url = sUrl.toString().substring(0, sUrl.length()-1);
		}
		
		HttpGet method = new HttpGet(url);
		int requestStatus = 0;
		try {
			httpResponse = client.execute(method);
			// 打印服务器返回的状态
			requestStatus = httpResponse.getStatusLine().getStatusCode();
			log.info("call edi (" + flag + "): " + requestStatus + " url:" + url);
			if (requestStatus != 200) {// 如果不是200则记录返回信息
				log.info("call edi (" + flag + "): " + requestStatus + " msg:" + httpResponse.getEntity().toString());
			}
		} catch (ConnectException e) {
			log.error("异常信息：", e);
			log.error("call edi (" + flag + ") 连接超时或失败：" + e.getMessage() + " url:" + url);
		} catch (SocketTimeoutException e) {
			log.error("异常信息：", e);
			log.error("call edi (" + flag + ") 响应超时：" + e.getMessage() + " url:" + url);
		} catch (Exception e) {
			log.error("异常信息：", e);
			log.error("call edi (" + flag + "): " + e.getMessage() + " url:" + url);
		} finally {
			if(method != null) {
				method.releaseConnection();// 释放连接
			}
		}
		return httpResponse;
	}
	
	@Override
	public String executeHttpPost(String strURL, String params) {  
        try {  
            URL url = new URL(strURL);// 创建连接  
            HttpURLConnection connection = (HttpURLConnection) url  
                    .openConnection();  
            connection.setDoOutput(true);  
            connection.setDoInput(true);  
            connection.setUseCaches(false);  
            connection.setInstanceFollowRedirects(true);  
            connection.setRequestMethod("POST"); // 设置请求方式  
            connection.setRequestProperty("Accept", "application/json"); // 设置接收数据的格式  
            connection.setRequestProperty("Content-Type", "application/json"); // 设置发送数据的格式  
            connection.connect();  
            OutputStreamWriter out = new OutputStreamWriter(  
                    connection.getOutputStream(), "UTF-8"); // utf-8编码  
            out.append(params);  
            out.flush();  
            out.close();  
            // 读取响应  
            int length = (int) connection.getContentLength();// 获取长度  
            InputStream is = connection.getInputStream();  
            if (length != -1) {  
                byte[] data = new byte[length];  
                byte[] temp = new byte[512];  
                int readLen = 0;  
                int destPos = 0;  
                while ((readLen = is.read(temp)) > 0) {  
                    System.arraycopy(temp, 0, data, destPos, readLen);  
                    destPos += readLen;  
                }  
                String result = new String(data, "UTF-8"); // utf-8编码  
                return result;  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        return "error"; // 自定义错误信息  
    } 

}
