package com.wen.framework.configure;

import java.util.HashMap;
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
	
	public static void set(String key,String value){
		if(null == config){
			readAll();
			
			if(null == config){
				config = new HashMap<String, String>();
			}
		}
		
		config.put(key, value);
	}
	
	public static String getString(String key){
		
		return get(key);
	}
	
	public static int getInt(String key){
		
		return Integer.valueOf(get(key));
	}
	
	public static Long getLong(String key){
		
		return Long.valueOf(get(key));
	}
	
	public static Float getFloat(String key){
		
		return Float.valueOf(get(key));
	}
	
	public static Double getDouble(String key){
		
		return Double.valueOf(get(key));
	}
	
	public static String getJdbcDriverClassKey() {
		return defaultValue.getJdbcDriverClassKey();
	}

	public static void setJdbcDriverClassKey(String jdbcDriverClassKey) {
		defaultValue.setJdbcDriverClassKey(jdbcDriverClassKey);
	}

	public static String getJdbcUrlKey() {
		return defaultValue.getJdbcUrlKey();
	}

	public static void setJdbcUrlKey(String jdbcUrlKey) {
		defaultValue.setJdbcUrlKey(jdbcUrlKey);
	}

	public static String getJdbcUserNameKey() {
		return defaultValue.getJdbcUserNameKey();
	}

	public static void setJdbcUserNameKey(String jdbcUserNameKey) {
		defaultValue.setJdbcUserNameKey(jdbcUserNameKey);
	}

	public static String getJdbcPasswordKey() {
		return defaultValue.getJdbcPasswordKey();
	}

	public static void setJdbcPasswordKey(String jdbcPasswordKey) {
		defaultValue.setJdbcPasswordKey(jdbcPasswordKey);
	}

	public static String getJdbcMaxPoolSizeKey() {
		return defaultValue.getJdbcMaxPoolSizeKey();
	}

	public static void setJdbcMaxPoolSizeKey(String jdbcMaxPoolSizeKey) {
		defaultValue.setJdbcMaxPoolSizeKey(jdbcMaxPoolSizeKey);
	}

	public static String getJdbcMinPoolSizeKey() {
		return defaultValue.getJdbcMinPoolSizeKey();
	}

	public static void setJdbcMinPoolSizeKey(String jdbcMinPoolSizeKey) {
		defaultValue.setJdbcMinPoolSizeKey(jdbcMinPoolSizeKey);
	}

	public static String getJdbcInitPoolSizeKey() {
		return defaultValue.getJdbcInitPoolSizeKey();
	}

	public static void setJdbcInitPoolSizeKey(String jdbcInitPoolSizeKey) {
		defaultValue.setJdbcInitPoolSizeKey(jdbcInitPoolSizeKey);
	}

	public static String getJdbcMaxIdleTimeKey() {
		return defaultValue.getJdbcMaxIdleTimeKey();
	}

	public static void setJdbcMaxIdleTimeKey(String jdbcMaxIdleTimeKey) {
		defaultValue.setJdbcMaxIdleTimeKey(jdbcMaxIdleTimeKey);
	}

	public static int getJdbcMaxPoolSize() {
		String jdbcMaxPoolSize = get(defaultValue.getJdbcMaxPoolSizeKey());
		
		if(null == jdbcMaxPoolSize){
			return defaultValue.getJdbcMaxPoolSize();
		}
		
		return Integer.valueOf(jdbcMaxPoolSize);
	}

	public static void setJdbcMaxPoolSize(int jdbcMaxPoolSize) {
		set(defaultValue.getJdbcMaxPoolSizeKey(), jdbcMaxPoolSize + "");
	}

	public static int getJdbcMinPoolSize() {
		String jdbcMinPoolSize = get(defaultValue.getJdbcMinPoolSizeKey());
		
		if(null == jdbcMinPoolSize){
			return defaultValue.getJdbcMinPoolSize();
		}
		
		return Integer.valueOf(jdbcMinPoolSize);
	}

	public static void setJdbcMinPoolSize(int jdbcMinPoolSize) {
		set(defaultValue.getJdbcMinPoolSizeKey(), jdbcMinPoolSize + "");
	}

	public static int getJdbcInitPoolSize() {
		String jdbcInitPoolSize = get(defaultValue.getJdbcInitPoolSizeKey());
		
		if(null == jdbcInitPoolSize){
			return defaultValue.getJdbcInitPoolSize();
		}
		
		return Integer.valueOf(jdbcInitPoolSize);
	}

	public static void setJdbcInitPoolSize(int jdbcInitPoolSize) {
		set(defaultValue.getJdbcInitPoolSizeKey(), jdbcInitPoolSize + "");
	}

	public static int getJdbcMaxIdleTime() {
		String jdbcMaxIdleTime = get(defaultValue.getJdbcMaxIdleTimeKey());
		
		if(null == jdbcMaxIdleTime){
			return defaultValue.getJdbcMaxIdleTime();
		}
		
		return Integer.valueOf(jdbcMaxIdleTime);
	}

	public static void setJdbcMaxIdleTime(int jdbcMaxIdleTime) {
		set(defaultValue.getJdbcMaxIdleTimeKey(), jdbcMaxIdleTime + "");
	}
	
	public static String getJdbcDriverClass() {
		return get(defaultValue.getJdbcDriverClassKey());
	}

	public static void setJdbcDriverClass(String jdbcDriverClassKey) {
		set(defaultValue.getJdbcDriverClassKey(), jdbcDriverClassKey);
	}

	public static String getJdbcUrl() {
		return get(defaultValue.getJdbcUrlKey());
	}

	public static void setJdbcUrl(String jdbcUrlKey) {
		set(defaultValue.getJdbcUrlKey(), jdbcUrlKey);
	}

	public static String getJdbcUserName() {
		return get(defaultValue.getJdbcUserNameKey());
	}

	public static void setJdbcUserName(String jdbcUserNameKey) {
		set(defaultValue.getJdbcUserNameKey(), jdbcUserNameKey);
	}

	public static String getJdbcPassword() {
		return get(defaultValue.getJdbcPasswordKey());
	}

	public static void setJdbcPassword(String jdbcPasswordKey) {
		set(defaultValue.getJdbcPasswordKey(), jdbcPasswordKey);
	}

}
