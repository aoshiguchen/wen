package com.wen.framework.configure;

import java.util.HashMap;
import java.util.Map;

import com.wen.framework.commons.FileTypeEnum;
import com.wen.framework.commons.PathTypeEnum;
import com.wen.framework.configure.ex.ConfigReaderException;
import com.wen.framework.util.PathUtil;

public final class ConfigManager {
	
	private static DefaultValue defaultValue;
	private static IConfigReader configReader;
	private static Map<String,String> config;
	private static ConfigManager instance = null;

	private ConfigManager() {
		defaultValue = DefaultValue.getInstance();
		configReader = ConfigReader.getInstance();
	}

	public static synchronized ConfigManager getInstance() {
		if (null == instance) {
			instance = new ConfigManager();
		}

		return instance;
	}
	
	public Map<String,String> readAll(){
		
		if(null == config){
			try {
				config = configReader.readAll();
			} catch (ConfigReaderException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return config;
	}
	
	public String getConfigFileName(){
		return defaultValue.getConfigFileName();
	}
	
	public void setConfigFileName(String configFileName){
		defaultValue.setConfigFileName(configFileName);
	}
	
	public String getConfigFilePath() {
		return defaultValue.getConfigFilePath();
	}

	public void setConfigFilePath(String configFilePath) {
		defaultValue.setConfigFilePath(configFilePath);
	}

	public FileTypeEnum getConfigFileType() {
		return defaultValue.getConfigFileType();
	}

	public void setConfigFileType(FileTypeEnum configFileType) {
		defaultValue.setConfigFileType(configFileType);
	}
	
	public String getConfigFileFullName(){
		String root = "";
		
		switch (defaultValue.getConfigFilePathType()) {
		case CLASS_PATH_ROOT:
			root = PathUtil.getClassPathRoot();
			break;
		case PROJECT_ROOT:
			root = PathUtil.getProjectRoot();
			break;
		case WEB_ROOT:
			root = PathUtil.getWebRoot();
		case RESOURCE_ROOT:
			root = PathUtil.getResourceRoot();
			break;
		}
		
		return root + defaultValue.getConfigFilePath() + defaultValue.getConfigFileName();
	}
	
	public PathTypeEnum getConfigFilePathType() {
		return defaultValue.getConfigFilePathType();
	}

	public void setConfigFilePathType(PathTypeEnum configFilePathType) {
		defaultValue.setConfigFilePathType(configFilePathType);
	}
	
	public String get(String key){
		if(null == config){
			readAll();
		}
		
		return config.get(key);
	}
	
	public void set(String key,String value){
		if(null == config){
			readAll();
			
			if(null == config){
				config = new HashMap<String, String>();
			}
		}
		
		config.put(key, value);
	}
	
	public String getString(String key){
		
		return get(key);
	}
	
	public int getInt(String key){
		
		return Integer.valueOf(get(key));
	}
	
	public Long getLong(String key){
		
		return Long.valueOf(get(key));
	}
	
	public Float getFloat(String key){
		
		return Float.valueOf(get(key));
	}
	
	public Double getDouble(String key){
		
		return Double.valueOf(get(key));
	}

}
