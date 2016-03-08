package com.wen.framework.configure;

import java.util.Map;

import com.wen.framework.configure.ex.ConfigReaderException;

public final class ConfigManager {
	
	private static DefaultValue defaultValue;
	private static IConfigReader configReader;
	private static Map<String,String> config;
	
	static{
		defaultValue = DefaultValue.getInstance();
		configReader = ConfigReader.getInstance();
	}
	
	public static Map<String,String> readAll(){
		
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
	
	public static String getConfigFileName(){
		return defaultValue.getConfigFileName();
	}
	
	public static void setConfigFileName(String configFileName){
		defaultValue.setConfigFileName(configFileName);
	}
	
	public static String getConfigFilePath() {
		return defaultValue.getConfigFilePath();
	}

	public static void setConfigFilePath(String configFilePath) {
		defaultValue.setConfigFilePath(configFilePath);
	}

	public static FileTypeEnum getConfigFileType() {
		return defaultValue.getConfigFileType();
	}

	public static void setConfigFileType(FileTypeEnum configFileType) {
		defaultValue.setConfigFileType(configFileType);
	}

	public static String getDbTypeKeyName() {
		return defaultValue.getDbTypeKeyName();
	}

	public static void setDbTypeKeyName(String dbTypeKeyName) {
		defaultValue.setDbTypeKeyName(dbTypeKeyName);
	}

	public static String getDbHostKeyName() {
		return defaultValue.getDbHostKeyName();
	}

	public static void setDbHostKeyName(String dbHostKeyName) {
		defaultValue.setDbHostKeyName(dbHostKeyName);
	}

	public static String getDbNameKeyName() {
		return defaultValue.getDbNameKeyName();
	}

	public static void setDbNameKeyName(String dbNameKeyName) {
		defaultValue.setDbNameKeyName(dbNameKeyName);
	}

	public static String getDbLoginNameKeyName() {
		return defaultValue.getDbLoginNameKeyName();
	}

	public static void setDbLoginNameKeyName(String dbLoginNameKeyName) {
		defaultValue.setDbLoginNameKeyName(dbLoginNameKeyName);
	}

	public static String getDbLoginPasswordKeyName() {
		return defaultValue.getDbLoginPasswordKeyName();
	}

	public static void setDbLoginPasswordKeyName(String dbLoginPasswordKeyName) {
		defaultValue.setDbLoginPasswordKeyName(dbLoginPasswordKeyName);
	}

	public static DbTypeEnum getDbType() {
		return defaultValue.getDbType();
	}

	public static void setDbType(DbTypeEnum dbType) {
		defaultValue.setDbType(dbType);
	}
	
	public static String getConfigFileFullName(){
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
	
	public static String get(String key){
		if(null == config){
			readAll();
		}
		
		return config.get(key);
	}
	
	public static String getDbHost(){
				
		return get(getDbHostKeyName());
	}
	
	public static String getDbName(){
		
		return get(getDbNameKeyName());
	}
	
	public static String getDbLoginName(){
		
		return get(getDbLoginNameKeyName());
	}
	
	public static String getDbLoginPassword(){
		
		return get(getDbLoginPasswordKeyName());
	}
	
}
