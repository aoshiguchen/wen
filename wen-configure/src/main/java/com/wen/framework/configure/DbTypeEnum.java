package com.wen.framework.configure;

/**
 * 数据库类型
 * @author aoshiguchen
 * @time 2015-09-09
 */

public enum DbTypeEnum {
	
	MYSQL("MySql"),
	
	SQLSERVER("SqlServer");
	
	private String name;
	
	private DbTypeEnum(String name){
		this.name = name;
	}
	
	@Override
	public String toString(){
		return this.name;
	}
	
}
