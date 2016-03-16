package com.wen.framework.util;


public final class StringUtil {
	
	public static String first2Upper(String content){
		String res = "";
		
		if(null == content || content.length() == 0){
			return content;
		}else{
			res = content.substring(0,1).toUpperCase() + content.substring(1);
		}
		
		return res;
	}
	
	public static String getGetMethodName(String content){
		
		return "get" + first2Upper(content);
	}
	
	public static String getSetMethodName(String content){
		
		return "set" + first2Upper(content);
	}
	
	public static boolean isEmpty(String str){
		
		return null == str || str.trim().length() == 0;
	}
	
}
