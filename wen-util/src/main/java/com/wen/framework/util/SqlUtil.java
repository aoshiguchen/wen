package com.wen.framework.util;

public class SqlUtil {

	public static String getFindAllSql(String tbName){
		
		return "select * from [" + tbName +"] ";
	}
	
	public static String getFindByIdSql(String tbName){
		
		return "select * from [" + tbName +"] where id = ? ";
	}
	
	public static String getFindByIdNamedSql(String tbName){
		
		return "select * from [" + tbName +"] where id = :id ";
	}
	
}
