package com.wen.framework.configure.ex;

/**
 * 读取配置文件异常
 * @author aoshiguchen
 * @time 2015-08-21
 */

public class ConfigReaderException extends Exception{

	private static final long serialVersionUID = 1L;
	protected String content;
	
	public ConfigReaderException(String content) {
		this.content = content;
	}
	
	@Override
	public void printStackTrace() {
		System.out.println("ConfigReaderException:" + this.content);
	}
	
	@Override
	public String toString() {
		return "ConfigReaderException:" + this.content;
	}
}
