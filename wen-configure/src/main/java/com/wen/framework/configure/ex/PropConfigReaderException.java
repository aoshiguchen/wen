package com.wen.framework.configure.ex;

/**
 * 读取prop配置文件异常
 * @author aoshiguchen
 * @time 2015-08-27
 */

public final class PropConfigReaderException extends ConfigReaderException{
	
	private static final long serialVersionUID = 1L;
	
	public PropConfigReaderException(String content) {
		super(content);
	}
	
	@Override
	public void printStackTrace() {
		System.out.println("PropConfigReaderException:" + this.content);
	}
	
	@Override
	public String toString() {
		return "PropConfigReaderException:" + this.content;
	}

}
