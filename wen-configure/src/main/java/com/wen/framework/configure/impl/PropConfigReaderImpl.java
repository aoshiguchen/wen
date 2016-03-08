package com.wen.framework.configure.impl;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.wen.framework.configure.ConfigManager;
import com.wen.framework.configure.IConfigReader;
import com.wen.framework.configure.ex.PropConfigReaderException;

/**
 * 读取properties配置实现
 * @author aoshiguchen
 * @time 2015-08-20	
 */

public final class PropConfigReaderImpl implements IConfigReader{
	
	@Override
	public Map<String, String> readAll() throws PropConfigReaderException {
		Map<String,String> config = new HashMap<String, String>();
		
		Properties prop = new Properties();

		try {
			prop.load(new FileInputStream(ConfigManager.getConfigFileFullName()));
			
			for(Object key : prop.keySet()){
				config.put((String)key,(String)prop.getProperty((String)key));
			}
			
		} catch (Exception e) {
			throw new PropConfigReaderException("config file not found or format error !");
		} 
		
		return config;
	}

}
