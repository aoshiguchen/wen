package com.wen.framework.commons;

public enum PathTypeEnum {
	
	PROJECT_ROOT("project"),
	
	CLASS_PATH_ROOT("classpath"),
	
	WEB_ROOT("web"),
	
	RESOURCE_ROOT("resource");
	
	private String name;
	
	private PathTypeEnum(String name){
		this.name = name;
	}
	
	@Override
	public String toString(){
		return this.name;
	}
	
}
