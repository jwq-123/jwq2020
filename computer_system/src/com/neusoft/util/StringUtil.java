package com.neusoft.util;

/**
 * �ַ���������
 * @author An
 *
 */
public class StringUtil {
	/**
	 * �ж��Ƿ�Ϊ��
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		if(str == null || "".equals(str.trim()))
			return true;
		return false;
	}
	/**
	 * �ж��Ƿ�Ϊ��
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str){
		if(str == null || "".equals(str.trim()))
			return false;
		return true;
	}
}
