package com.wen.framework.commons;

/**
 * 文件类型
 * @author aoshiguchen
 * @time 2015-08-20	
 */

public enum FileTypeEnum {
	
	//文本文件
	TXT("txt"),
	
	//xml文件
	XML("xml"),
	
	//json文件
	JSON("json"),
	
	//properties文件
	PROP("properties"),
	
	//ini文件
	INI("ini");
	
	private String name;
	
	private FileTypeEnum(String name){
		this.name = name;
	}
	
	@Override
	public String toString(){
		return this.name;
	}
}
