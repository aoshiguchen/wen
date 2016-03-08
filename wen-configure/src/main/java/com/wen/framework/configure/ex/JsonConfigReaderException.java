package com.wen.framework.configure.ex;

/**
 * 读取json配置文件异常
 * @author aoshiguchen
 * @time 2015-08-27
 */

public final class JsonConfigReaderException extends ConfigReaderException{
	
	private static final long serialVersionUID = 1L;
	
	public JsonConfigReaderException(String content) {
		super(content);
	}
	
	@Override
	public void printStackTrace() {
		System.out.println("JsonConfigReaderException:" + this.content);
	}
	
	@Override
	public String toString() {
		return "JsonConfigReaderException:" + this.content;
	}

}
