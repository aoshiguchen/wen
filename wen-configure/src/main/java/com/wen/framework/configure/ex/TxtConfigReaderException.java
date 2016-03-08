package com.wen.framework.configure.ex;

/**
 * 读取txt配置文件异常
 * @author aoshiguchen
 * @time 2015-08-27
 */

public final class TxtConfigReaderException extends ConfigReaderException{
	
	private static final long serialVersionUID = 1L;
	
	public TxtConfigReaderException(String content) {
		super(content);
	}
	
	@Override
	public void printStackTrace() {
		System.out.println("TxtConfigReaderException:" + this.content);
	}
	
	@Override
	public String toString() {
		return "TxtConfigReaderException:" + this.content;
	}

}
