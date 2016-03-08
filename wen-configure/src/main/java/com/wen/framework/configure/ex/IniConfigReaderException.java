package com.wen.framework.configure.ex;

/**
 * 读取ini配置文件异常
 * @author aoshiguchen
 * @time 2015-08-27
 */

public final class IniConfigReaderException extends ConfigReaderException{
	
	private static final long serialVersionUID = 1L;
	
	public IniConfigReaderException(String content) {
		super(content);
	}
	
	@Override
	public void printStackTrace() {
		System.out.println("IniConfigReaderException:" + this.content);
	}
	
	@Override
	public String toString() {
		return "IniConfigReaderException:" + this.content;
	}

}
