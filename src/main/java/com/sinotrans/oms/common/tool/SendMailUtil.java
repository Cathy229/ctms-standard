package com.sinotrans.oms.common.tool;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;
import javax.mail.util.ByteArrayDataSource;

import org.apache.commons.lang.StringUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.Response;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.common.util.FtpUtil;


/**
 * Title: SendMailUtil  
 * Description:  
 * @author shenlan  
 * @date 2018年8月29日  
 * @version 1.0
 */
public class SendMailUtil {

//	private String host = "smtp.163.com"; // smtp服务器
//	private String user = "lizuocui99@163.com"; // 用户名
//	private String pwd = "201519940619"; // 密码
	private String host = "172.30.11.10"; // smtp服务器
	private String user = "lmsupport"; // 用户名
	private String pwd = "sinotrans@2019"; // 密码
	private String from = ""; // 发件人地址
	private String to = ""; // 收件人地址
	private String affix = ""; // 附件地址
	private String affixName = ""; // 附件名称
	private String fileName = "";//要读取的文件名称
	private String subject = ""; // 邮件标题
	private String X_Priority = "";//设置邮件的优先级
	private static final String localFilePath = "com/sinotrans/oms/file/";//项目中存放的文件路径
	//add by Colley.Bai
	private String[] tos = null;
	public static RecipientType TO =  Message.RecipientType.TO;
	public static final RecipientType CC =  Message.RecipientType.CC;//抄送
	public static final RecipientType BCC =  Message.RecipientType.BCC;//密送
	
	public void setX_Priority(String X_Priority) {
		this.X_Priority = X_Priority;
	}
	public void setAddress(String from, String to, String subject) {
		this.from = from;
		this.to = to;
		this.subject = subject;
	}
	
	public void setAffix(String affix, String affixName) {
		this.affix = affix;
		this.affixName = affixName;
	}
	
	public void addAddress(String from, String[] tos, String subject) {
		this.from = from;
		this.tos = tos;
		this.subject = subject;
	}
	/**
	 * get要读取的文件名称
	 * @author Shoven.Jiang  
	 * @date 2018年12月8日
	 * @return
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * 要读取的文件名称
	 * @author Shoven.Jiang  
	 * @date 2018年12月8日
	 * @param fileName
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * 发送邮件包含附件
	 * @author Shoven.Jiang  
	 * @date 2018年12月8日
	 * @param affix
	 * @param affixName
	 */
	public Response send(Map<String,String> contentMap) {
		Properties props = new Properties();
		Response response = new Response();
		// 设置发送邮件的邮件服务器的属性（这里使用网易的smtp服务器）
		props.put("mail.smtp.host", host);
		// 需要经过授权，也就是有户名和密码的校验，这样才能通过验证
		props.put("mail.smtp.auth", "true");
		// 用刚刚设置好的props对象构建一个session
		
		Session session = Session.getDefaultInstance(props);
		// 有了这句便可以在发送邮件的过程中在console处显示过程信息，供调试使
		// 用（你可以在控制台（console)上看到发送邮件的过程）
		session.setDebug(true);
		// 用session为参数定义消息对象
		MimeMessage message = new MimeMessage(session);
		try {
			// 加载发件人地址
			message.setFrom(new InternetAddress(from));
			// 加载收件人地址
//			message.addRecipient(Message.RecipientType.TO, new InternetAddress(
//					to));
			if(null != to && !to.isEmpty()){  
				InternetAddress[] internetAddressTo = new InternetAddress().parse(to);  
	            message.setRecipients(Message.RecipientType.TO, internetAddressTo);  
	        } 
			// 加载标题
			message.setSubject(subject);
			// 向multipart对象中添加邮件的各个部分内容，包括文本内容和附件
			Multipart multipart = new MimeMultipart();
			// 设置邮件的文本内容
			BodyPart contentPart = new MimeBodyPart();
			//contentPart.setText(contentMap.get("date")+"\n\r"+contentMap.get("customerName")+"\n\r"+contentMap.get("address")+"\n\r"+contentMap.get("contact"));
			contentPart.setText(contentMap.get("date"));
			multipart.addBodyPart(contentPart);
			// 添加附件
			if(StringUtils.isNotEmpty(affixName)){
				BodyPart messageBodyPart = new MimeBodyPart();
				DataSource source = new FileDataSource(affix);
				// 添加附件的内容
				messageBodyPart.setDataHandler(new DataHandler(source));
				// 添加附件的标题
				// 这里很重要，通过下面的Base64编码的转换可以保证你的中文附件标题名在发送时不会变成乱码
				sun.misc.BASE64Encoder enc = new sun.misc.BASE64Encoder();
				
//				messageBodyPart.setFileName("=?GBK?B?"
//						+ enc.encode(affixName.getBytes()) + "?=");
				messageBodyPart.setFileName(MimeUtility.encodeWord(affixName));
				multipart.addBodyPart(messageBodyPart);
			}
			// 将multipart对象放到message中
			message.setContent(multipart);
			// 保存邮件
			message.saveChanges();
			
			// 发送邮件
			Transport transport = session.getTransport("smtp");
			// 连接服务器的邮箱
			transport.connect(host,25, user, pwd);
			// 把邮件发送出去
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
		} catch (Exception e) {
			e.printStackTrace();
			response.setCode(Constants.NO);
			response.setMsg(e.getMessage());
			return response;
		}
		response.setCode(Constants.YES);
		response.setMsg("success");
		return response;
	}
	
	/**
	 * 邮件发送不包含附件
	 * @param contentMap
	 * @return
	 */
	public Response sendEmailNotFile(String contents) {
		Properties props = new Properties();
		Response response = new Response();
		// 设置发送邮件的邮件服务器的属性（这里使用网易的smtp服务器）
		props.put("mail.smtp.host", host);
		// 需要经过授权，也就是有户名和密码的校验，这样才能通过验证
		props.put("mail.smtp.auth", "true");
		// 用刚刚设置好的props对象构建一个session
		
		Session session = Session.getDefaultInstance(props);
		// 有了这句便可以在发送邮件的过程中在console处显示过程信息，供调试使
		// 用（你可以在控制台（console)上看到发送邮件的过程）
		session.setDebug(true);
		// 用session为参数定义消息对象
		MimeMessage message = new MimeMessage(session);
		try {
			// 加载发件人地址
			message.setFrom(new InternetAddress(from));
			// 加载收件人地址
//			message.addRecipient(Message.RecipientType.TO, new InternetAddress(
//					to));
			if(null != to && !to.isEmpty()){  
				InternetAddress[] internetAddressTo = new InternetAddress().parse(to);  
	            message.setRecipients(Message.RecipientType.TO, internetAddressTo);  
	        } 
			// 加载标题
			message.setSubject(subject);
			// 向multipart对象中添加邮件的各个部分内容，包括文本内容和附件
			Multipart multipart = new MimeMultipart();
			// 设置邮件的文本内容
			BodyPart contentPart = new MimeBodyPart();
			contentPart.setText(contents);
			multipart.addBodyPart(contentPart);
			// 将multipart对象放到message中
			message.setContent(multipart);
			// 保存邮件
			message.saveChanges();
			// 发送邮件
			Transport transport = session.getTransport("smtp");
			// 连接服务器的邮箱
			transport.connect(host,25, user, pwd);
			// 把邮件发送出去
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
		} catch (Exception e) {
			response.setCode(Constants.NO);
			response.setMsg(e.getMessage());
			return response;
		}
		response.setCode(Constants.YES);
		response.setMsg("success");
		return response;
	}
	
	/**
	 * 发送邮件包含附件,附件是读出来手动添加的
	 * @author Shoven.Jiang  
	 * @date 2018年12月8日
	 * @param contentMap  邮件内容
	 * @param source  附件内容
	 * @return
	 */
	public Response sendEmailByFileTypeStream(Map<String,String> contentMap, ByteArrayOutputStream byteArrayOutputStream) {
		Properties props = new Properties();
		Response response = new Response();
		// 设置发送邮件的邮件服务器的属性（这里使用网易的smtp服务器）
		props.put("mail.smtp.host", host);
		// 需要经过授权，也就是有户名和密码的校验，这样才能通过验证
		props.put("mail.smtp.auth", "true");
		// 用刚刚设置好的props对象构建一个session
		
		Session session = Session.getDefaultInstance(props);
		// 有了这句便可以在发送邮件的过程中在console处显示过程信息，供调试使
		// 用（你可以在控制台（console)上看到发送邮件的过程）
		session.setDebug(true);
		// 用session为参数定义消息对象
		MimeMessage message = new MimeMessage(session);
		ByteArrayInputStream byteArrayInputStream = null;
		ByteArrayInputStream byteArrayInputStreamZip = null;
		sun.misc.BASE64Encoder base64encoder = new sun.misc.BASE64Encoder();
		try {
			// 加载发件人地址
			message.setFrom(new InternetAddress(from));
			// 加载收件人地址
//			message.addRecipient(Message.RecipientType.TO, new InternetAddress(
//					to));
			if(null != to && !to.isEmpty()){  
				InternetAddress[] internetAddressTo = new InternetAddress().parse(to);  
	            message.setRecipients(Message.RecipientType.TO, internetAddressTo);  
	        } 
			// 加载标题
//			message.setSubject("=?GB18030?B?" + base64encoder.encode(subject.getBytes("GB18030")) + "?=");
			message.setSubject((new String(new String(subject).getBytes(),"UTF-8")));
			// 向multipart对象中添加邮件的各个部分内容，包括文本内容和附件
			Multipart multipart = new MimeMultipart();
			// 设置邮件的文本内容
			BodyPart contentPart = new MimeBodyPart();
			//contentPart.setText(contentMap.get("date")+"\n\r"+contentMap.get("customerName")+"\n\r"+contentMap.get("address")+"\n\r"+contentMap.get("contact"));
			contentPart.setText(contentMap.get("date"));
			multipart.addBodyPart(contentPart);
			// 添加附件
			if(StringUtils.isNotEmpty(affixName)){
				BodyPart messageBodyPart = new MimeBodyPart();
//				DataSource source = new FileDataSource(affix);
				// 添加附件的内容
				byteArrayInputStream = this.getByteArrayInputStream(byteArrayOutputStream);
				messageBodyPart.setDataHandler(new DataHandler(new ByteArrayDataSource(byteArrayInputStream, "application/excel")));
				
				// 添加附件的标题
				// 这里很重要，通过下面的Base64编码的转换可以保证你的中文附件标题名在发送时不会变成乱码
				sun.misc.BASE64Encoder enc = new sun.misc.BASE64Encoder();
				
//				messageBodyPart.setFileName("=?GBK?B?"
//						+ enc.encode(affixName.getBytes()) + "?=");
				messageBodyPart.setFileName(MimeUtility.encodeWord(affixName));
				multipart.addBodyPart(messageBodyPart);
			}
			
			String servicerIds = contentMap.get("servicerIds");
			if (EmptyUtils.isNotEmpty(servicerIds)) {
				BodyPart messageBodyPart = new MimeBodyPart();
				
//				DataSource source = new FileDataSource(affix);
				// 添加附件的内容
				byteArrayInputStreamZip = this.sendZIP(servicerIds);
				messageBodyPart.setDataHandler(new DataHandler(new ByteArrayDataSource(byteArrayInputStreamZip, "application/excel")));
				
				// 添加附件的标题
				// 这里很重要，通过下面的Base64编码的转换可以保证你的中文附件标题名在发送时不会变成乱码
				sun.misc.BASE64Encoder enc = new sun.misc.BASE64Encoder();
				
//				messageBodyPart.setFileName("=?GBK?B?"
//						+ enc.encode(affixName.getBytes()) + "?=");
				String servicerAffixName = contentMap.get("servicerAffixName");
				messageBodyPart.setFileName(MimeUtility.encodeWord(servicerAffixName));
				multipart.addBodyPart(messageBodyPart);
			}
			
			// 将multipart对象放到message中
			message.setContent(multipart);
			// 保存邮件
			message.saveChanges();
			// 发送邮件
			Transport transport = session.getTransport("smtp");
			// 连接服务器的邮箱
			transport.connect(host,25, user, pwd);
			// 把邮件发送出去
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
		} catch (Exception e) {
			e.printStackTrace();
			response.setCode(Constants.NO);
			response.setMsg(e.getMessage());
			return response;
		} 
		response.setCode(Constants.YES);
		response.setMsg("success");
		return response;
	}
	
	/**
	 * @deprecated:批量发送邮件给收件人
	 * @author Colley.Bai  
	 * @date 2018年12月27日
	 * @param contentMap
	 * @param byteArrayOutputStream
	 * @return
	 */
	public Response sendEmailByFileTypeStreamFroms(Map<String,String> contentMap, ByteArrayOutputStream byteArrayOutputStream) {
		Properties props = new Properties();
		Response response = new Response();
		// 设置发送邮件的邮件服务器的属性（这里使用网易的smtp服务器）
		props.put("mail.smtp.host", host);
		// 需要经过授权，也就是有户名和密码的校验，这样才能通过验证
		props.put("mail.smtp.auth", "true");
		// 用刚刚设置好的props对象构建一个session
		Session session = Session.getDefaultInstance(props);
		// 有了这句便可以在发送邮件的过程中在console处显示过程信息，供调试使
		// 用（你可以在控制台（console)上看到发送邮件的过程）
		session.setDebug(true);
		// 用session为参数定义消息对象
		MimeMessage message = new MimeMessage(session);
		ByteArrayInputStream byteArrayInputStream = null;
		ByteArrayInputStream byteArrayInputStreamZip = null;
		sun.misc.BASE64Encoder base64encoder = new sun.misc.BASE64Encoder();
		try {
			// 加载发件人地址
			message.setFrom(new InternetAddress(from));
			// 加载收件人地址
//			if(null != to && !to.isEmpty()){  
//				//注：当有主发送人的时候需要启用
//	            message.setRecipients(TO, new InternetAddress().parse(to,false)); 
//				for (int i = 0 ; i < tos.length ; i++ ) {
//	            	if (EmptyUtils.isNotEmpty(tos[i])) {
//	            		//注：当有抄送人的时候需要把TO为CC，如果把有秘密抄送人的时候需要把To改为BCC
//	            		message.addRecipients(TO, new InternetAddress().parse(tos[i]));
//	            	}
//	            }
//	        } 
			// 加载收件人地址
			if (tos.length > 0) {
				for (int i = 0 ; i < tos.length ; i++ ) {
	            	if (EmptyUtils.isNotEmpty(tos[i])) {
	            		//注：当有抄送人的时候需要把TO为CC，如果把有秘密抄送人的时候需要把To改为BCC
	            		message.addRecipients(TO, new InternetAddress().parse(tos[i]));
	            	}
	            }
			}
			if (EmptyUtils.isNotEmpty(X_Priority)) {//设置邮件的优先级
				message.addHeader("X-Priority",X_Priority);
			}
			// 加载标题
			message.setSubject((new String(new String(subject).getBytes(),"UTF-8")));
			// 向multipart对象中添加邮件的各个部分内容，包括文本内容和附件
			Multipart multipart = new MimeMultipart();
			// 设置邮件的文本内容
			BodyPart contentPart = new MimeBodyPart();
			//contentPart.setText(contentMap.get("date")+"\n\r"+contentMap.get("customerName")+"\n\r"+contentMap.get("address")+"\n\r"+contentMap.get("contact"));
			contentPart.setText(contentMap.get("date"));
			multipart.addBodyPart(contentPart);
			// 添加附件
			if(StringUtils.isNotEmpty(affixName)){
				BodyPart messageBodyPart = new MimeBodyPart();
//				DataSource source = new FileDataSource(affix);
				// 添加附件的内容
				byteArrayInputStream = this.getByteArrayInputStream(byteArrayOutputStream);
				messageBodyPart.setDataHandler(new DataHandler(new ByteArrayDataSource(byteArrayInputStream, "application/excel")));
				
				// 添加附件的标题
				// 这里很重要，通过下面的Base64编码的转换可以保证你的中文附件标题名在发送时不会变成乱码
				sun.misc.BASE64Encoder enc = new sun.misc.BASE64Encoder();
				
				messageBodyPart.setFileName(MimeUtility.encodeWord(affixName));
				multipart.addBodyPart(messageBodyPart);
			}
			
			String servicerIds = contentMap.get("servicerIds");
			if (EmptyUtils.isNotEmpty(servicerIds)) {
				BodyPart messageBodyPart = new MimeBodyPart();
				
//				DataSource source = new FileDataSource(affix);
				// 添加附件的内容
				byteArrayInputStreamZip = this.sendZIP(servicerIds);
				messageBodyPart.setDataHandler(new DataHandler(new ByteArrayDataSource(byteArrayInputStreamZip, "application/excel")));
				
				// 添加附件的标题
				// 这里很重要，通过下面的Base64编码的转换可以保证你的中文附件标题名在发送时不会变成乱码
				sun.misc.BASE64Encoder enc = new sun.misc.BASE64Encoder();
				
//				messageBodyPart.setFileName("=?GBK?B?"
//						+ enc.encode(affixName.getBytes()) + "?=");
				String servicerAffixName = contentMap.get("servicerAffixName");
				messageBodyPart.setFileName(MimeUtility.encodeWord(servicerAffixName));
				multipart.addBodyPart(messageBodyPart);
			}
			
			// 将multipart对象放到message中
			message.setContent(multipart);
			// 保存邮件
			message.saveChanges();
			// 发送邮件
			Transport transport = session.getTransport("smtp");
			// 连接服务器的邮箱
			transport.connect(host,25, user, pwd);
			// 把邮件发送出去
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
		} catch (Exception e) {
			e.printStackTrace();
			response.setCode(Constants.NO);
			response.setMsg(e.getMessage());
			return response;
		} 
		response.setCode(Constants.YES);
		response.setMsg("success");
		return response;
	}
	
	/**
	 * 根据地址和文件名，从服务器上读取文件，并返回邮件可识别的 ByteArrayInputStream 格式流
	 * @author Shoven.Jiang  
	 * @date 2018年12月8日
	 * @param ftpPath
	 * @param fileName
	 * @return ByteArrayInputStream
	 */
	public ByteArrayInputStream getByteArrayInputStream() {
		InputStream inputStream = null;
		ByteArrayOutputStream byteArrayOutputStream = null;
		ByteArrayInputStream byteArrayInputStream = null;
		try {
		inputStream = /*new FileInputStream(affix);*/new ClassPathResource(localFilePath + affix).getInputStream();/*ftpUtil.readFile(affix, fileName);*///得到FTP上文件流
		//由于InputStream 无法直接转成 ByteArrayInputStream 所以借助 ByteArrayOutputStream 来转换
		byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] buffer=new byte[1024*4];
        int n=0;
		while ( (n=inputStream.read(buffer)) !=-1) {
			byteArrayOutputStream.write(buffer,0,n);
		}
		byte[] buff = byteArrayOutputStream.toByteArray();
		byteArrayInputStream = new ByteArrayInputStream(buff);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
				byteArrayOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return byteArrayInputStream;
	}
	
	/**
	 * 对流进行转换
	 * @author Shoven.Jiang  
	 * @date 2018年12月9日
	 * @param byteArrayOutputStream
	 * @return ByteArrayInputStream
	 */
	public ByteArrayInputStream getByteArrayInputStream(ByteArrayOutputStream byteArrayOutputStream) {
		InputStream inputStream = null;
		ByteArrayInputStream byteArrayInputStream = null;
        byte[] buffer=new byte[1024*4];
		byte[] buff = byteArrayOutputStream.toByteArray();
		byteArrayInputStream = new ByteArrayInputStream(buff);
		return byteArrayInputStream;
	}
	
	/**
	 * @deprecated:多个附件
	 * @author Colley.Bai  
	 * @date 2018年12月13日
	 * @param url
	 * @return
	 */
	public ByteArrayInputStream sendZIP(String urls){
  		//调此方法文件不加密传输且使用原文件名
  		return this.downloadZIP(urls, Constants.NO, Constants.YES);
  	}
	
	/**
	 * @deprecated:组装zip
	 * @author Colley.Bai  
	 * @date 2018年12月13日
	 * @param ids
	 * @param isBase64
	 * @param isSourceName
	 * @return
	 */
  	public ByteArrayInputStream downloadZIP(String urls,String isBase64, String isSourceName) {
		
  		StringBuilder url = new StringBuilder(urls);
  		url.append("&isBase64=").append(isBase64);
  		url.append("&isSourceName=").append(isSourceName);
          InputStream bis = null;
          ByteArrayOutputStream bos = null;  
          try {
          	//1.根据网络文件地址创建URL //2.获取此路径的连接   
              URLConnection conn = new URL(url.toString()).openConnection();  
              bis = new BufferedInputStream(conn.getInputStream());//构造读取流  
              bos = new ByteArrayOutputStream();
              byte[] buff = new byte[1024];
              int bytesRead;  
              //3.每次读取缓存大小的流，写到输出流  
              while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {  
                  bos.write(buff, 0, bytesRead); 
              }
          } catch (IOException e) {  
          	return null;
          }finally{
          	try{
  	        	if(null != bis){
  	        		bis.close();
  	        	}
          	}catch(IOException e){
          		return null;
          	}
          }
          return new ByteArrayInputStream(bos.toByteArray());
  	}
  	
  	
}
