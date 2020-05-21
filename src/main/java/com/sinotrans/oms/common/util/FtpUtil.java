package com.sinotrans.oms.common.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.log4j.Logger;

import com.sinotrans.oms.common.tool.SendMailUtil;

import javax.activation.DataSource;
import javax.activation.FileDataSource;

/**  
* <p>Title: FtpUtil</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月9日  
* @version 1.0  
*/
public class FtpUtil {
	private static Logger log = Logger.getLogger(FtpUtil.class);
	
	private static String ftpHost= "172.30.254.118"; //ftp服务器地址
	private static int ftpPort = 21;//ftp服务员器端口号
	private static String ftpUserName = "bea";//anonymous匿名用户登录，不需要密码。administrator指定用户登录
	private static String ftpPassword = "bea@2018";//指定用户密码

	/**
     * 获取FTPClient对象
     * @param ftpHost  FTP主机服务器
     * @param ftpPassword  FTP 登录密码
     * @param ftpUserName  FTP登录用户名
     * @param ftpPort  FTP端口 默认为21
     * @return
     */
	
	public static FTPClient getFTPClient(String ftpHost, String ftpUserName,
            String ftpPassword, int ftpPort) {
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient = new FTPClient();
            ftpClient.connect(ftpHost, ftpPort);// 连接FTP服务器
            ftpClient.login(ftpUserName, ftpPassword);// 登陆FTP服务器
            if (!FTPReply.isPositiveCompletion(ftpClient.getReplyCode())) {
            	log.info("未连接到FTP，用户名或密码错误。");
                ftpClient.disconnect();
            } else {
            	log.info("FTP连接成功。");
            }
        } catch (SocketException e) {
            e.printStackTrace();
            log.info("FTP的IP地址可能错误，请正确配置。");
        } catch (IOException e) {
            e.printStackTrace();
            log.info("FTP的端口错误,请正确配置。");
        }
        return ftpClient;
    }
	
	/**
     * 下载文件
     * @param ftpPath  ftp文件存放物理路径
     * @param fileName 文件路径
     * @param input 文件输入流，即从本地服务器读取文件的IO输入流
     */
	
	public static void downloadFile(String ftpPath, String localPath,
            String fileName) {
        FTPClient ftpClient = null;

        try {
            ftpClient = getFTPClient(ftpHost, ftpUserName, ftpPassword, ftpPort);
            ftpClient.setControlEncoding("UTF-8"); // 中文支持
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
            ftpClient.enterLocalPassiveMode();
            ftpClient.changeWorkingDirectory(ftpPath);

            File localFile = new File(localPath + File.separatorChar + fileName);
            OutputStream os = new FileOutputStream("");
            ftpClient.retrieveFile(fileName, os);
            os.close();
            ftpClient.logout();

        } catch (FileNotFoundException e) {
            log.error("没有找到" + ftpPath + "文件");
            e.printStackTrace();
        } catch (SocketException e) {
        	log.error("连接FTP失败.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            log.error("文件读取错误。");
            e.printStackTrace();
        }
    }
	
	/**
     * 上传文件
     * @param ftpPath  ftp文件存放物理路径
     * @param fileName 文件路径
     * @param input 文件输入流，即从本地服务器读取文件的IO输入流
     */
    public static void uploadFile(String ftpPath, String fileName, InputStream input){
        FTPClient ftp = null;
        try {
            ftp = getFTPClient(ftpHost, ftpUserName, ftpPassword, ftpPort);
            ftp.changeWorkingDirectory(ftpPath);
            ftp.setFileType(FTP.BINARY_FILE_TYPE);
            fileName = new String(fileName.getBytes("GBK"),"iso-8859-1");
            ftp.storeFile(fileName, input);
            input.close();
            ftp.logout();
            System.out.println("upload succes!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    /**
     * 根据路径得到ftp远程服务器上的文件流    TXT格式的可以正常得到   其他格式不行
     * @param ftpPath  ftp文件存放物理路径
     * @param fileName 文件路径
     * @param input 文件输入流，即从本地服务器读取文件的IO输入流
     */
    public static InputStream readFile(String ftpPath, String fileName) {
        FTPClient ftpClient = null;
        InputStream inputStream = null;
        ByteArrayInputStream in = null;
		ByteArrayOutputStream fos = new ByteArrayOutputStream();
        try {
            ftpClient = getFTPClient(ftpHost, ftpUserName, ftpPassword, ftpPort);
            ftpClient.setControlEncoding("UTF-8"); // 中文支持
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
            ftpClient.enterLocalPassiveMode();
            //跳转到指定的目录
            ftpClient.changeWorkingDirectory(ftpPath);
            //根据文件名读取文件
            inputStream = ftpClient.retrieveFileStream(fileName);
            ftpClient.logout();
        } catch (FileNotFoundException e) {
            log.error("没有找到" + ftpPath + "文件");
            e.printStackTrace();
        } catch (SocketException e) {
        	log.error("连接FTP失败.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            log.error("文件读取错误。");
            e.printStackTrace();
        }
        return inputStream;
    }
}
