package com.sinotrans.oms.common.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sinotrans.oms.common.util.EmptyUtils;

import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.VerticalAlignment;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WriteException;

public class ExcelJxlUtil{
	
	protected static final Log log = LogFactory.getLog(ExcelJxlUtil.class);
	
	/**
	 * 边框左
	 */
	public static final String BORDER_LEFT = "LEFT";
	/**
	 * 边框右
	 */
	public static final String BORDER_RIGHT = "RIGHT";
	/**
	 * 边框上
	 */
	public static final String BORDER_TOP = "TOP";
	/**
	 * 边框下
	 */
	public static final String BORDER_BOTTOM = "BOTTOM";
	/**
	 * 边框全
	 */
	public static final String BORDER_ALL = "ALL";
	/**
	 * 边框无
	 */
	public static final String BORDER_NONE = "NONE";
	/**
	 * 左边框+右边框
	 */
	public static final String BORDER_LEFT_RIGHT = "LEFT_RIGHT";
	/**
	 * 上边框+下边框
	 */
	public static final String BORDER_TOP_BOTTOM = "TOP_BOTTOM";
	/**
	 * 左边框+下边框
	 */
	public static final String BORDER_LEFT_BOTTOM = "LEFT_BOTTOM";
	/**
	 * 左边框+上边框
	 */
	public static final String BORDER_LEFT_TOP = "LEFT_TOP";
	/**
	 * 右边框+下边框
	 */
	public static final String BORDER_RIGHT_BOTTOM = "RIGHT_BOTTOM";
	/**
	 * 右边框+上边框
	 */
	public static final String BORDER_RIGHT_TOP = "RIGHT_TOP";
	/**
	 * 上边框+左边框+右边框
	 */
	public static final String BORDER_TOP_BOTTOM_LEFT = "TOP_BOTTOM_LEFT";
	/**
	 * 下边框+左边框+右边框
	 */
	public static final String BORDER_TOP_BOTTOM_RIGHT = "TOP_BOTTOM_RIGHT";
	/**
	 * 左边框+右边框+上边框
	 */
	public static final String BORDER_LEFT_RIGHT_TOP = "LEFT_RIGHT_TOP";
	/**
	 * 左边框+右边框+下边框
	 */
	public static final String BORDER_LEFT_RIGHT_BUTTOM = "LEFT_RIGHT_BUTTOM";
	
	
	/**
	 * @deprecated:execl导出字体加粗
	 * @author Colley.Bai  
	 * @date 2019年1月16日
	 * @param fontName 字体
	 * @param size 字体大小
	 * @param flag 是否斜体
	 */
	public static WritableFont updateExeclBold(String fontName ,int size ,Boolean flag){
		WritableFont writableFont = new  WritableFont(WritableFont.createFont(fontName), size, WritableFont.BOLD, flag);
		return writableFont;
	}
	
	
	/**
	 * @deprecated:execl导出字体不加粗
	 * @author Colley.Bai  
	 * @date 2019年1月17日
	 * @param fontName 字体
	 * @param size 字体大小
	 * @param flag 是否斜体
	 * @return
	 */
	public static WritableFont updateExeclNoBold(String fontName ,int size ,Boolean flag){
		WritableFont writableFont = new  WritableFont(WritableFont.createFont(fontName), size, WritableFont.NO_BOLD , flag);
		return writableFont;
	}
	
	/**
	 * @deprecated:execl样式（全）
	 * @author Colley.Bai  
	 * @date 2019年1月17日
	 * @param fontName 字体
	 * @param size 字体大小
	 * @param bold 字体是否加粗
	 * @param flag 是否斜体
	 * @param wrap 是否自动换行
	 * @param verticalAlignment 垂直对齐方式 TOP（上），BOTTOM（下），CENTRE（中），JUSTIFY（两端对齐）
	 * @param alignment 水平对齐方式  CENTRE（水平居中），LEFT（左对齐），RIGHT（右对齐），JUSTIFY（两端对齐），FILL（充满），GENERAL
	 * @param ls 边框样式
	 * @param borderPosition 边框位置
	 * @return
	 */
	public static WritableCellFormat updateEcecl(String fontName ,int size , boolean bold, boolean flag, boolean wrap, VerticalAlignment verticalAlignment, Alignment alignment, BorderLineStyle ls, String borderPosition){
		WritableFont writableFont = new WritableFont(WritableFont.createFont(fontName), size);
		if (bold) {
				writableFont = updateExeclBold(fontName, size, flag);
		} else {
				writableFont = updateExeclNoBold(fontName, size, flag);
		}
		WritableCellFormat writableCellFormat = new WritableCellFormat(writableFont);
		try {
			writableCellFormat.setWrap(wrap);
			if (verticalAlignment != null) {
				writableCellFormat.setVerticalAlignment(verticalAlignment);
			}
			if (alignment != null) {
				writableCellFormat.setAlignment(alignment);
			}
		} catch (WriteException e) {
			e.printStackTrace();
			log.error("excel修改失败：" + e.getMessage());
		}
		addBorder(borderPosition, writableCellFormat, ls);
		
		return writableCellFormat;
	}
	
	/**
	 * @deprecated:execl样式：字体 + 字体大小 + 字体是否加粗 + 是否多边框
	 * @author Colley.Bai  
	 * @date 2019年1月17日
	 * @param fontName 字体
	 * @param size 字体大小
	 * @param bold 字体是否加粗
	 * @param flag 是否斜体
	 * @return
	 */
	public static WritableCellFormat updateEcecl(String fontName , int size , boolean bold, boolean flag){
		WritableFont writableFont = new WritableFont(WritableFont.createFont(fontName), size);
		if (bold) {
				writableFont = updateExeclBold(fontName, size, flag);
		} else {
				writableFont = updateExeclNoBold(fontName, size, flag);
		}
		WritableCellFormat writableCellFormat = new WritableCellFormat(writableFont);
		return writableCellFormat;
	}
	
	/**
	 * @deprecated:execl样式：字体 + 字体大小 + 字体是否加粗 + 是否多边框 + 是否自动换行 
	 * @author Colley.Bai  
	 * @date 2019年1月17日
	 * @param fontName 字体
	 * @param size 字体大小
	 * @param bold 字体是否加粗
	 * @param flag 是否斜体
	 * @param wrap 是否自动换行
	 * @return
	 */
	public static WritableCellFormat updateEcecl(String fontName , int size , boolean bold, boolean flag, boolean wrap){
		WritableFont writableFont = new WritableFont(WritableFont.createFont(fontName), size);
		if (bold) {
				writableFont = updateExeclBold(fontName, size, flag);
		} else {
				writableFont = updateExeclNoBold(fontName, size, flag);
		}
		WritableCellFormat writableCellFormat = new WritableCellFormat(writableFont);
		try {
			writableCellFormat.setWrap(wrap);
		} catch (WriteException e) {
			e.printStackTrace();
			log.error("excel修改失败：" + e.getMessage());
		}
		return writableCellFormat;
	}
	
	/**
	 * @deprecated:execl样式：字体 + 字体大小 + 字体是否加粗 + 是否多边框 + 是否自动换行 + 垂直对齐方式
	 * @author Colley.Bai  
	 * @date 2019年1月17日
	 * @param fontName 字体
	 * @param size 字体大小
	 * @param bold 字体是否加粗
	 * @param flag 是否斜体
	 * @param wrap 是否自动换行
	 * @param verticalAlignment 垂直对齐方式 TOP（上），BOTTOM（下），CENTRE（中），JUSTIFY（两端对齐）
	 * @return
	 */
	public static WritableCellFormat updateEcecl(String fontName , int size , boolean bold, boolean flag, boolean wrap, VerticalAlignment verticalAlignment){
		WritableFont writableFont = new WritableFont(WritableFont.createFont(fontName), size);
		if (bold) {
				writableFont = updateExeclBold(fontName, size, flag);
		} else {
				writableFont = updateExeclNoBold(fontName, size, flag);
		}
		WritableCellFormat writableCellFormat = new WritableCellFormat(writableFont);
		try {
			writableCellFormat.setWrap(wrap);
			if (verticalAlignment != null) {
				writableCellFormat.setVerticalAlignment(verticalAlignment);
			}
		} catch (WriteException e) {
			e.printStackTrace();
			log.error("excel修改失败：" + e.getMessage());
		}
		return writableCellFormat;
	}
	
	/**
	 * @deprecated:execl样式：字体 + 字体大小 + 字体是否加粗 + 是否多边框 + 是否自动换行 + 水平对齐方式
	 * @author Colley.Bai  
	 * @date 2019年1月17日
	 * @param fontName 字体
	 * @param size 字体大小
	 * @param bold 字体是否加粗
	 * @param flag 是否斜体
	 * @param wrap 是否自动换行
	 * @param alignment 水平对齐方式 CENTRE（水平居中），LEFT（左对齐），RIGHT（右对齐），JUSTIFY（两端对齐），FILL（充满），GENERAL
	 * @return
	 */
	public static WritableCellFormat updateEcecl(String fontName , int size , boolean bold, boolean flag, boolean wrap, Alignment alignment){
		WritableFont writableFont = new WritableFont(WritableFont.createFont(fontName), size);
		if (bold) {
			writableFont = updateExeclBold(fontName, size, flag);
		} else {
			writableFont = updateExeclNoBold(fontName, size, flag);
		}
		WritableCellFormat writableCellFormat = new WritableCellFormat(writableFont);
		try {
			writableCellFormat.setWrap(wrap);
			if (alignment != null) {
				writableCellFormat.setAlignment(alignment);
			}
		} catch (WriteException e) {
			e.printStackTrace();
			log.error("excel修改失败：" + e.getMessage());
		}
		return writableCellFormat;
	}
	
	/**
	 * @deprecated:execl样式：字体 + 字体大小 + 字体是否加粗 + 是否多边框 + 是否自动换行 + 垂直对齐方式 + 水平对齐方式
	 * @author Colley.Bai  
	 * @date 2019年1月17日
	 * @param fontName 字体
	 * @param size 字体大小
	 * @param bold 字体是否加粗
	 * @param flag 是否斜体
	 * @param wrap 是否自动换行
	 * @param verticalAlignment 垂直对齐方式 TOP（上），BOTTOM（下），CENTRE（中），JUSTIFY（两端对齐）
	 * @param alignment 水平对齐方式 CENTRE（水平居中），LEFT（左对齐），RIGHT（右对齐），JUSTIFY（两端对齐），FILL（充满），GENERAL
	 * @return
	 */
	public static WritableCellFormat updateEcecl(String fontName , int size , boolean bold, boolean flag, boolean wrap, VerticalAlignment verticalAlignment, Alignment alignment){
		WritableFont writableFont = new WritableFont(WritableFont.createFont(fontName), size);
		if (bold) {
			writableFont = updateExeclBold(fontName, size, flag);
		} else {
			writableFont = updateExeclNoBold(fontName, size, flag);
		}
		WritableCellFormat writableCellFormat = new WritableCellFormat(writableFont);
		try {
			writableCellFormat.setWrap(wrap);
			if (verticalAlignment != null) {
				writableCellFormat.setVerticalAlignment(verticalAlignment);
			}
			if (alignment != null) {
				writableCellFormat.setAlignment(alignment);
			}
		} catch (WriteException e) {
			e.printStackTrace();
			log.error("excel修改失败：" + e.getMessage());
		}
		return writableCellFormat;
	}
	
	/**
	 * @deprecated:多边框组装
	 * @author Colley.Bai  
	 * @date 2019年1月17日
	 * @param borderPosition 边框位置
	 * @param writableCellFormat
	 * @param ls 边框样式
	 */
	public static void addBorder(String borderPosition, WritableCellFormat writableCellFormat, BorderLineStyle ls){
		if (EmptyUtils.isNotEmpty(borderPosition)) {
			switch (borderPosition) {
			case BORDER_LEFT:
				addLeftFrame(writableCellFormat, ls);
				break;
			case BORDER_RIGHT:
				addRightFrame(writableCellFormat, ls);
				break;
			case BORDER_TOP:
				addTopFrame(writableCellFormat, ls);
				break;
			case BORDER_BOTTOM:
				addBottomFrame(writableCellFormat, ls);
				break;
			case BORDER_ALL:
				addAllFrame(writableCellFormat, ls);
				break;
			case BORDER_LEFT_RIGHT:
				addLeftFrame(writableCellFormat, ls);
				addRightFrame(writableCellFormat, ls);
				break;
			case BORDER_TOP_BOTTOM:
				addTopFrame(writableCellFormat, ls);
				addBottomFrame(writableCellFormat, ls);
				break;
			case BORDER_LEFT_TOP:
				addLeftFrame(writableCellFormat, ls);
				addTopFrame(writableCellFormat, ls);
				break;
			case BORDER_LEFT_BOTTOM:
				addLeftFrame(writableCellFormat, ls);
				addBottomFrame(writableCellFormat, ls);
				break;
			case BORDER_RIGHT_TOP:
				addRightFrame(writableCellFormat, ls);
				addTopFrame(writableCellFormat, ls);
				break;
			case BORDER_RIGHT_BOTTOM:
				addRightFrame(writableCellFormat, ls);
				addBottomFrame(writableCellFormat, ls);
				break;
			case BORDER_TOP_BOTTOM_LEFT:
				addTopFrame(writableCellFormat, ls);
				addLeftFrame(writableCellFormat, ls);
				addBottomFrame(writableCellFormat, ls);
				break;
			case BORDER_TOP_BOTTOM_RIGHT:
				addTopFrame(writableCellFormat, ls);
				addRightFrame(writableCellFormat, ls);
				addBottomFrame(writableCellFormat, ls);
				break;
			case BORDER_LEFT_RIGHT_TOP:
				addLeftFrame(writableCellFormat, ls);
				addRightFrame(writableCellFormat, ls);
				addTopFrame(writableCellFormat, ls);
				break;
			case BORDER_LEFT_RIGHT_BUTTOM:
				addLeftFrame(writableCellFormat, ls);
				addRightFrame(writableCellFormat, ls);
				addBottomFrame(writableCellFormat, ls);
				break;
			default:
				addNoneFrame(writableCellFormat, ls);
				break;
			}
		} else {
			addNoneFrame(writableCellFormat, ls);
		}
	}
	
	
	/**
	 * @deprecated:设置右边框
	 * @author Colley.Bai  
	 * @date 2019年1月17日
	 * @param writableCellFormat
	 */
	public static void addRightFrame(WritableCellFormat writableCellFormat, BorderLineStyle ls){
		try {
			writableCellFormat.setBorder(Border.RIGHT, ls);
		} catch (WriteException e) {
			e.printStackTrace();
			log.error("设置右边框失败：" + e.getMessage());
		}
	}
	
	/**
	 * @deprecated:设置左边框
	 * @author Colley.Bai  
	 * @date 2019年1月17日
	 * @param writableCellFormat
	 */
	public static void addLeftFrame(WritableCellFormat writableCellFormat, BorderLineStyle ls){
		try {
			writableCellFormat.setBorder(Border.LEFT, ls);
		} catch (WriteException e) {
			e.printStackTrace();
			log.error("设置左边框失败：" + e.getMessage());
		}
	}
	
	/**
	 * @deprecated:设置上边框
	 * @author Colley.Bai  
	 * @date 2019年1月17日
	 * @param writableCellFormat
	 */
	public static void addTopFrame(WritableCellFormat writableCellFormat, BorderLineStyle ls){
		try {
			writableCellFormat.setBorder(Border.TOP, ls);
		} catch (WriteException e) {
			e.printStackTrace();
			log.error("设置上边框失败：" + e.getMessage());
		}
	}
	
	/**
	 * @deprecated:设置下边框
	 * @author Colley.Bai  
	 * @date 2019年1月17日
	 * @param writableCellFormat
	 */
	public static void addBottomFrame(WritableCellFormat writableCellFormat, BorderLineStyle ls){
		try {
			writableCellFormat.setBorder(Border.BOTTOM, ls);
		} catch (WriteException e) {
			e.printStackTrace();
			log.error("设置上边框失败：" + e.getMessage());
		}
	}
	
	/**
	 * @deprecated:设置全边框
	 * @author Colley.Bai  
	 * @date 2019年1月17日
	 * @param writableCellFormat
	 */
	public static void addAllFrame(WritableCellFormat writableCellFormat, BorderLineStyle ls){
		try {
			writableCellFormat.setBorder(Border.ALL, ls);
		} catch (WriteException e) {
			e.printStackTrace();
			log.error("设置全边框失败：" + e.getMessage());
		}
	}
	
	/**
	 * @deprecated:设置无边框
	 * @author Colley.Bai  
	 * @date 2019年1月17日
	 * @param writableCellFormat
	 */
	public static void addNoneFrame(WritableCellFormat writableCellFormat, BorderLineStyle ls){
		try {
			writableCellFormat.setBorder(Border.NONE, ls ,null);
		} catch (WriteException e) {
			e.printStackTrace();
			log.error("设置无边框失败：" + e.getMessage());
		}
	}

}
