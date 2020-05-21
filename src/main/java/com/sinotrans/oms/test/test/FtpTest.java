package com.sinotrans.oms.test.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.sinotrans.oms.common.util.FtpUtil;

/**  
* <p>Title: FtpTest</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月9日  
* @version 1.0  
*/
public class FtpTest {
	public static void main(String[] args) throws Exception {
	String ftpHost= "172.30.254.118"; //ftp服务器地址
    int ftpPort = 21;//ftp服务员器端口号
    String ftpUserName = "bea";//anonymous匿名用户登录，不需要密码。administrator指定用户登录
    String ftpPassword = "weblogic_@2018";//指定用户密码
    String ftpPath = "/app/b"; //ftp文件存放物理路径
    String filePath=""; //文件路径
    String fileName="";//文件名称
    
		filePath="D:/b";
        fileName="a.txt";
        FtpUtil.downloadFile(ftpPath, filePath, fileName);
        
        filePath="D:/b";
        fileName="EAIOMS_EAIWFSHZSDZB_BK01_20180909105524498.txt";
        FileInputStream input = new FileInputStream(new File(filePath+File.separatorChar+fileName));
        FtpUtil.uploadFile(ftpPath, fileName, input);
    }
	
}

