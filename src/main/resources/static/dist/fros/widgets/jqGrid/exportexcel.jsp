<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.net.URLDecoder"%>
<% response.setHeader("Pragma","public");
 response.setHeader("Expires","0");
 response.setHeader("Cache-Control","must-revalidate, post-check=0, pre-check=0");
 response.setHeader("Content-Type","application/force-download");
 response.setHeader("Content-Type","application/vnd.ms-excel; charset=utf-8");
 InputStream is = request.getInputStream();
	int i = 0;
	StringBuilder values = new StringBuilder();
	StringBuilder sbFileName = new StringBuilder();
	boolean nameFlag = false;
	int j = 0;
	//PrintWriter out = response.getWriter();
	while((i=is.read())!=-1){
		//values.append((char)i);
		if("&".equals(String.valueOf((char)i))){
			nameFlag = true;
		}
		if(nameFlag == true){
			sbFileName.append((char)i);
		}else{
			if(j>2){
				values.append((char)i);
			}
			j++;
		}
	}
	String fileName = URLDecoder.decode(sbFileName.toString().split("=")[1],"UTF-8");
	response.setHeader("Content-Disposition", "attachment;filename="
			+ new String( fileName.getBytes("gb2312"), "ISO8859-1" ));
	out.print(URLDecoder.decode(values.toString(),"UTF-8"));
	out.flush();
 %>