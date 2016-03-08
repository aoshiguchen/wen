package com.wen.framework.configure;

import java.util.Map;

import com.wen.framework.configure.ex.ConfigReaderException;

public class ConfigReader implements IConfigReader{

	private static ConfigReader instance = null;
	private Map<String,String> config = null;
	
	private ConfigReader(){
		
	}
	
	public static synchronized ConfigReader getInstance(){
		if(null == instance){
			instance = new ConfigReader();
		}
		
		return instance;
	}

	public Map<String, String> readAll() throws ConfigReaderException {
		IConfigReader configReader = null;
		
		if(null == config){
			switch (ConfigManager.getConfigFileType()) {
				case TXT:
					configReader = ConfigReaderFactory.getTxtConfigReader();
					break;
				case XML:
					configReader = ConfigReaderFactory.getXmlConfigReader();
					break;
				case JSON:
					configReader = ConfigReaderFactory.getJsonConfigReader();
					break;
				case PROP:
					configReader = ConfigReaderFactory.getPropConfigReader();
					break;
				case INI:
					configReader = ConfigReaderFactory.getIniConfigReader();
					break;
			}
			
			config = configReader.readAll();
		}
		
		return config;
	}

}
