package com.sinotrans.oms.common.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Flags.Flag;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;
import javax.mail.search.FlagTerm;

import org.junit.Test;
import org.springframework.stereotype.Service;

import com.sinotrans.oms.common.Constants;
import com.sun.mail.imap.IMAPFolder;
import com.sun.mail.imap.IMAPStore;

/**  
* Title: ReceiveEmail  
* Description:  接收邮件工具类
* @author Shoven.Jiang  
* @date 2019年1月16日  
* @version 1.0  
*/
@Service
public class ReceiveEmail {

	private String protocol = "pop3";//邮件服务器协议
	private String port = "110";//端口号
	private String host = "imap.163.com";//服务器地址
	private Boolean setDebug = false;//是否开启debug模式
	
	private String userName = "chem-shbooking";/*"shoven_jiang@163.com";*///邮箱名称
	private String passWord = "sinotrans@2019";/*"";*///邮箱密码
	public Store store = null;//创建mail连接 pop3协议
	public IMAPStore imapStore = null;//IMAP协议
	public IMAPFolder imapFolder = null;//打开邮箱
	
	/**
	 * 获取邮箱账号密码
	 * @author Shoven.Jiang  
	 * @date 2019年1月16日
	 * @param userName  邮箱账号
	 * @param passWord  邮箱密码
	 */
	public void setConnectionMsg(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
	}
	
	/**
	 * 获取邮件接收服务器协议相关信息，如果不传，或者传入值为空使用工具类中封装的pop3协议
	 * @author Shoven.Jiang  
	 * @date 2019年1月16日
	 * @param protocol  使用协议
	 * @param port  协议使用端口
	 * @param host  协议使用服务器
	 * @param setDebug  是否开启debug模式
	 */
	public void setPropertiesMsg(String protocol, String port, String host, Boolean setDebug) {
		//防止传入值为空，导致没有邮箱协议服务相关信息
		this.protocol = EmptyUtils.isNotEmpty(protocol) ? protocol : this.protocol;
		this.port = EmptyUtils.isNotEmpty(port) ? port : this.port;
		this.host = EmptyUtils.isNotEmpty(host) ? host : this.host;
		this.setDebug = setDebug;
	}

	/**
	 * 获取接收邮箱连接，由于pop3和IMAP对应的邮箱连接协议不用，所以返回两种不同的连接
	 * @author Shoven.Jiang  
	 * @date 2019年1月17日
	 * @return
	 * @throws Exception
	 */
	public Object getConnection() throws Exception {
		//如果是IMAP协议
		Properties props = System.getProperties();  
		if (EmptyUtils.isNotEmpty(protocol) && Constants.MAIL_PROTOCOL_POP3.equals(protocol)) {
			// 准备连接服务器的会话信息  
	        props.setProperty("mail.store.protocol", protocol);       // 使用pop3协议  
	        props.setProperty("mail.pop3.port", port);           // 端口  
	        props.setProperty("mail.pop3.host", host);       // 163 邮箱pop3服务器
	        // 创建Session实例对象  
	        Session session = Session.getInstance(props);  
	        store = session.getStore(protocol);  
	        store.connect(userName, passWord);
	        return store;
		} else if (EmptyUtils.isNotEmpty(protocol) && Constants.MAIL_PROTOCOL_IMAP.equals(protocol)) {
			props.put("mail.imap.host",host);
	        props.put("mail.imap.auth.plain.disable","true");
	        Session mailsession=Session.getInstance(props,null);
	        mailsession.setDebug(false); //是否启用debug模式
	        imapStore = (IMAPStore)mailsession.getStore("imap");  // 使用imap会话机制，连接服务器
	        imapStore.connect(host,userName,passWord);
	        return imapStore;
		}
		return null;
	}
	
	/**
	 * 使用pop3邮箱协议连接邮箱
	 * 由于POP3协议无法获知邮件的状态,所以getUnreadMessageCount得到的是收件箱的邮件总数
	 * @author Shoven.Jiang  
	 * @date 2019年1月17日
	 * @param store
	 * @return
	 * @throws Exception
	 */
	public Folder getFolderByPop3(Store store) throws Exception {
		Folder folder = store.getFolder("INBOX");
		folder.open(Folder.READ_WRITE); //打开收件箱
		return folder;
	}
	
	/**
	 * 使用IMAP协议连接邮箱
	 * @author Shoven.Jiang  
	 * @date 2019年1月17日
	 * @param IMAPStore  imap建立的连接
	 * @param folderType 读取邮件方式  Folder.READ_ONLY（1）：只读权限   Folder.READ_WRITE（2）：可读可写（可以修改邮件的状态） 
	 * @return
	 * @throws Exception
	 */
	public IMAPFolder getFolderByImap(IMAPStore store, int folderType) throws Exception {
		imapFolder = (IMAPFolder)store.getFolder("INBOX"); //收件箱 
		imapFolder.open(folderType);
		return imapFolder;
	}
	
	/**
	 * 解析邮件，获取邮件内容并返回map对象
	 * @author Shoven.Jiang  
	 * @date 2019年1月17日
	 * @param flag  是否只解析未读邮件，true：是   false：否
	 * @param subject : 用来校验主题中是否包含某些字段，如果传空则读取邮件中所有未读邮件，否则判断主题中是否包含 subject ，不包含则 不读邮件
	 * @return mailMap
	 */
	public Map parseMessage(Boolean flag, String subject) throws Exception {
		Map<String, Object> mailMap = new HashMap<>();
		this.getConnection();//创建连接
		this.getFolderByImap(imapStore, 2);//打开邮箱
		FlagTerm flagTerm = new FlagTerm(new Flags(Flags.Flag.SEEN), false); //false代表未读，true代表已读
		//得到收件箱文件夹信息，获取邮件列表
		Message[] msgs = null;
		if (flag) {
			msgs = imapFolder.search(flagTerm);
		} else {
			msgs = imapFolder.getMessages();
		}
		int i = 0;
		for (Message message : msgs) {
			StringBuffer content = new StringBuffer();
			i++;//为了给返回的map对象一个key
			System.out.println(i);
			if (flag) {
				//只解析未读邮件
				//message.getFlags().contains(Flags.Flag.SEEN)  判断当前邮件是否已读  true为已读，false为未读
				if (!message.getFlags().contains(Flags.Flag.SEEN)) {
					if (EmptyUtils.isNotEmpty(subject)) {
						String messageSubject = message.getSubject();
						if (messageSubject.indexOf(subject) == -1) {//返回的值不是-1说明 messageSubject 字符串中包含字符串 subject ,相反如果包含返回的值必定是-1"
							return mailMap;
						}
					}
					getMailTextContent(message, content);
					String [] contentArray = content.toString().split("\r\n");
					String [] newContent = new String [contentArray.length + 1];
					newContent[0] = "subject:" + message.getSubject();
					for (int j = 0; j < contentArray.length; j++) {
						newContent[j + 1] = contentArray[j].replace(" ", "");
						System.out.println("邮件正文:" + contentArray[j].replace(" ", ""));
					}
					message.setFlag(Flag.SEEN, true);	//未读邮件解析完之后设置成已读邮件 [ 第二个参数如果设置为true，则将修改反馈给服务器。false则不反馈给服务器]
					mailMap.put(String.valueOf(i), newContent);
				}
			} else {
				//解析收件箱中所有邮件
				getMailTextContent(message, content);
				String [] contentArray = content.toString().split("\r\n");
				String [] newContent = new String [contentArray.length];
				for (int j = 0; j < contentArray.length; j++) {
					newContent[j] = contentArray[j].replace(" ", "");
					System.out.println("邮件正文:" + contentArray[j].replace(" ", ""));
				}
				message.setFlag(Flag.SEEN, true);	//未读邮件解析完之后设置成已读邮件 [ 第二个参数如果设置为true，则将修改反馈给服务器。false则不反馈给服务器]
				mailMap.put(String.valueOf(i), newContent);
			}
		}
		this.releaseResources();
		System.out.println("邮件解析结束，结束时间：" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
		return mailMap;
	}
	
	/** 
     * 获得邮件文本内容 
     * @param part 邮件体 
     * @param content 存储邮件文本内容的字符串 
     * @throws MessagingException 
     * @throws IOException 
     */  
    public static void getMailTextContent(Part part, StringBuffer content) throws MessagingException, IOException {  
        //如果是文本类型的附件，通过getContent方法可以取到文本内容，但这不是我们需要的结果，所以在这里要做判断  
        boolean isContainTextAttach = part.getContentType().indexOf("name") > 0;   
        if (part.isMimeType("text/*") && !isContainTextAttach) {  
            content.append(part.getContent().toString());  
        } else if (part.isMimeType("message/rfc822")) {   
            getMailTextContent((Part)part.getContent(),content);  
        } else if (part.isMimeType("multipart/*")) {  
            Multipart multipart = (Multipart) part.getContent();  
            int partCount = multipart.getCount();  
            for (int i = 0; i < partCount; i++) {  
                BodyPart bodyPart = multipart.getBodyPart(i);  
//                System.out.println("测试" + content.toString());
                getMailTextContent(bodyPart,content); 
            }  
        }  
    }
    
    /**
     * 删除邮件
     * @author Shoven.Jiang  
     * @date 2019年1月17日
     * @param messages 要删除的邮件列表
     * @throws MessagingException
     * @throws IOException
     */
    public void deleteMessage(Message ...messages) throws MessagingException, IOException {
    	 for (int i = 0, count = messages.length; i < count; i++) {  
             Message message = messages[i];
             String subject = message.getSubject();
             // set the DELETE flag to true
             message.setFlag(Flags.Flag.DELETED, true);
             System.out.println("Marked DELETE for message: " + subject);    
         }
    }
    
    /** 
     * 判断邮件中是否包含附件 
     * @param msg 邮件内容 
     * @return 邮件中存在附件返回true，不存在返回false 
     * @throws MessagingException 
     * @throws IOException 
     */  
    public static boolean isContainAttachment(Part part) throws MessagingException, IOException {  
        boolean flag = false;  
        if (part.isMimeType("multipart/*")) {  
            MimeMultipart multipart = (MimeMultipart) part.getContent();  
            int partCount = multipart.getCount();  
            for (int i = 0; i < partCount; i++) {  
                BodyPart bodyPart = multipart.getBodyPart(i);  
                String disp = bodyPart.getDisposition();  
                if (disp != null && (disp.equalsIgnoreCase(Part.ATTACHMENT) || disp.equalsIgnoreCase(Part.INLINE))) {  
                    flag = true;  
                } else if (bodyPart.isMimeType("multipart/*")) {  
                    flag = isContainAttachment(bodyPart);  
                } else {  
                    String contentType = bodyPart.getContentType();  
                    if (contentType.indexOf("application") != -1) {  
                        flag = true;  
                    }    
                      
                    if (contentType.indexOf("name") != -1) {  
                        flag = true;  
                    }   
                }  
                  
                if (flag) break;  
            }  
        } else if (part.isMimeType("message/rfc822")) {  
            flag = isContainAttachment((Part)part.getContent());  
        }  
        return flag;  
    } 
    
    /** 
     * 判断邮件是否需要阅读回执 
     * @param msg 邮件内容 
     * @return 需要回执返回true,否则返回false 
     * @throws MessagingException 
     */  
    public static boolean isReplySign(MimeMessage msg) throws MessagingException {  
        boolean replySign = false;  
        String[] headers = msg.getHeader("Disposition-Notification-To");  
        if (headers != null)  
            replySign = true;  
        return replySign;  
    }
    
    /** 
     * 获得邮件的优先级 
     * @param msg 邮件内容 
     * @return 1(High):紧急  3:普通(Normal)  5:低(Low) 
     * @throws MessagingException  
     */  
    public static String getPriority(MimeMessage msg) throws MessagingException {  
        String priority = "普通";  
        String[] headers = msg.getHeader("X-Priority");  
        if (headers != null) {  
            String headerPriority = headers[0];  
            if (headerPriority.indexOf("1") != -1 || headerPriority.indexOf("High") != -1)  
                priority = "紧急";  
            else if (headerPriority.indexOf("5") != -1 || headerPriority.indexOf("Low") != -1)  
                priority = "低";  
            else  
                priority = "普通";  
        }  
        return priority;  
    } 
    
    /**  
     * 保存附件  
     * @param part 邮件中多个组合体中的其中一个组合体  
     * @param destDir  附件保存目录  
     * @throws UnsupportedEncodingException  
     * @throws MessagingException  
     * @throws FileNotFoundException  
     * @throws IOException  
     */  
    public static void saveAttachment(Part part, String destDir) throws UnsupportedEncodingException, MessagingException,  
            FileNotFoundException, IOException {  
        if (part.isMimeType("multipart/*")) {  
            Multipart multipart = (Multipart) part.getContent();    //复杂体邮件  
            //复杂体邮件包含多个邮件体  
            int partCount = multipart.getCount();  
            for (int i = 0; i < partCount; i++) {  
                //获得复杂体邮件中其中一个邮件体  
                BodyPart bodyPart = multipart.getBodyPart(i);  
                //某一个邮件体也有可能是由多个邮件体组成的复杂体  
                String disp = bodyPart.getDisposition();  
                if (disp != null && (disp.equalsIgnoreCase(Part.ATTACHMENT) || disp.equalsIgnoreCase(Part.INLINE))) {  
                    InputStream is = bodyPart.getInputStream();  
                    saveFile(is, destDir, decodeText(bodyPart.getFileName()));  
                } else if (bodyPart.isMimeType("multipart/*")) {  
                    saveAttachment(bodyPart,destDir);  
                } else {  
                    String contentType = bodyPart.getContentType();  
                    if (contentType.indexOf("name") != -1 || contentType.indexOf("application") != -1) {  
                        saveFile(bodyPart.getInputStream(), destDir, decodeText(bodyPart.getFileName()));  
                    }  
                }  
            }  
        } else if (part.isMimeType("message/rfc822")) {  
            saveAttachment((Part) part.getContent(),destDir);  
        }  
    }  
      
    /**  
     * 读取输入流中的数据保存至指定目录  
     * @param is 输入流  
     * @param fileName 文件名  
     * @param destDir 文件存储目录  
     * @throws FileNotFoundException  
     * @throws IOException  
     */  
    private static void saveFile(InputStream is, String destDir, String fileName)  
            throws FileNotFoundException, IOException {  
        BufferedInputStream bis = new BufferedInputStream(is);  
        BufferedOutputStream bos = new BufferedOutputStream(  
                new FileOutputStream(new File(destDir + fileName)));  
        int len = -1;  
        while ((len = bis.read()) != -1) {  
            bos.write(len);  
            bos.flush();  
        }  
        bos.close();  
        bis.close();  
    }  
      
    /** 
     * 文本解码 
     * @param encodeText 解码MimeUtility.encodeText(String text)方法编码后的文本 
     * @return 解码后的文本 
     * @throws UnsupportedEncodingException 
     */  
    public static String decodeText(String encodeText) throws UnsupportedEncodingException {  
        if (encodeText == null || "".equals(encodeText)) {  
            return "";  
        } else {  
            return MimeUtility.decodeText(encodeText);  
        }  
    }
    
    /**
     * 邮件解析完之后释放资源
     * @author Shoven.Jiang  
     * @date 2019年1月17日
     */
    public void releaseResources() {
    	if (null != store) {
    		try {
				store.close();
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	if (null != imapStore) {
    		try {
    			imapStore.close();
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
//    	if (null != imapFolder) {
//    		try {
//    			imapFolder.close(false);
//			} catch (MessagingException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//    	}
    }
    
    @Test
    public void test () throws Exception {//imap.163.com
    	this.setPropertiesMsg("imap", "110", "owa.sinotrans.com", false);
    	Map<String, Object> map = this.parseMessage(true, "");
    	for (Map.Entry<String, Object> m : map.entrySet()) {
            System.out.println(m);
        }
//    	System.out.println(map);
    }
    
    
}
