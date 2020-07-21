package com.neusoft.util;

/**
 * 字符串工具类
 * @author An
 *
 */
public class StringUtil {
	/**
	 * 判断是否为空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		if(str == null || "".equals(str.trim()))
			return true;
		return false;
	}
	/**
	 * 判断是否不为空
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str){
		if(str == null || "".equals(str.trim()))
			return false;
		return true;
	}
}
