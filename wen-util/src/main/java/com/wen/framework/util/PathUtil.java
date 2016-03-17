package com.wen.framework.util;

import java.net.URLDecoder;

/**
 * String
 * @author aoshiguchen
 * @time 2016-02-03
 */

public final class PathUtil {
	
	@SuppressWarnings("deprecation")
	public static String getClassPathRoot(){
		
		return URLDecoder.decode(PathUtil.class.getResource("/").getPath().substring(1));
	}
	
	public static String getProjectRoot(){
		
		return System.getProperty("user.dir") + "/";
	}
	
	public static String getWebRoot(){
		
		return "";
	}
	
	@SuppressWarnings("deprecation")
	public static String getResourceRoot(){
		
		return URLDecoder.decode(PathUtil.class.getResource("/resource").getPath().substring(1)) + "/";
	}
	
}
