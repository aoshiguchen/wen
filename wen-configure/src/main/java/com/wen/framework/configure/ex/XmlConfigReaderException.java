package com.wen.framework.configure.ex;

/**
 * 读取xml配置文件异常
 * @author aoshiguchen
 * @time 2015-08-27
 */

public final class XmlConfigReaderException extends ConfigReaderException{
	
	private static final long serialVersionUID = 1L;
	
	public XmlConfigReaderException(String content) {
		super(content);
	}
	
	@Override
	public void printStackTrace() {
		System.out.println("XmlConfigReaderException:" + this.content);
	}
	
	@Override
	public String toString() {
		return "XmlConfigReaderException:" + this.content;
	}

}
