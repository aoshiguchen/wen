package com.wen.framework.db;

public final class ConfigManager {
	
	private static com.wen.framework.configure.ConfigManager configManager;
	private static DefaultValue defaultValue;
	private static ConfigManager instance = null;

	private ConfigManager() {
		defaultValue = DefaultValue.getInstance();
		configManager = com.wen.framework.configure.ConfigManager.getInstance();
	}

	public static synchronized ConfigManager getInstance() {
		if (null == instance) {
			instance = new ConfigManager();
		}

		return instance;
	}
	
	public String getJdbcDriverClassKey() {
		return defaultValue.getJdbcDriverClassKey();
	}

	public void setJdbcDriverClassKey(String jdbcDriverClassKey) {
		defaultValue.setJdbcDriverClassKey(jdbcDriverClassKey);
	}

	public String getJdbcUrlKey() {
		return defaultValue.getJdbcUrlKey();
	}

	public void setJdbcUrlKey(String jdbcUrlKey) {
		defaultValue.setJdbcUrlKey(jdbcUrlKey);
	}

	public String getJdbcUserNameKey() {
		return defaultValue.getJdbcUserNameKey();
	}

	public void setJdbcUserNameKey(String jdbcUserNameKey) {
		defaultValue.setJdbcUserNameKey(jdbcUserNameKey);
	}

	public String getJdbcPasswordKey() {
		return defaultValue.getJdbcPasswordKey();
	}

	public void setJdbcPasswordKey(String jdbcPasswordKey) {
		defaultValue.setJdbcPasswordKey(jdbcPasswordKey);
	}

	public String getJdbcMaxPoolSizeKey() {
		return defaultValue.getJdbcMaxPoolSizeKey();
	}

	public void setJdbcMaxPoolSizeKey(String jdbcMaxPoolSizeKey) {
		defaultValue.setJdbcMaxPoolSizeKey(jdbcMaxPoolSizeKey);
	}

	public String getJdbcMinPoolSizeKey() {
		return defaultValue.getJdbcMinPoolSizeKey();
	}

	public void setJdbcMinPoolSizeKey(String jdbcMinPoolSizeKey) {
		defaultValue.setJdbcMinPoolSizeKey(jdbcMinPoolSizeKey);
	}

	public String getJdbcInitPoolSizeKey() {
		return defaultValue.getJdbcInitPoolSizeKey();
	}

	public void setJdbcInitPoolSizeKey(String jdbcInitPoolSizeKey) {
		defaultValue.setJdbcInitPoolSizeKey(jdbcInitPoolSizeKey);
	}

	public String getJdbcMaxIdleTimeKey() {
		return defaultValue.getJdbcMaxIdleTimeKey();
	}

	public void setJdbcMaxIdleTimeKey(String jdbcMaxIdleTimeKey) {
		defaultValue.setJdbcMaxIdleTimeKey(jdbcMaxIdleTimeKey);
	}

	public int getJdbcMaxPoolSize() {
		String jdbcMaxPoolSize = configManager.get(defaultValue.getJdbcMaxPoolSizeKey());
		
		if(null == jdbcMaxPoolSize){
			return defaultValue.getJdbcMaxPoolSize();
		}
		
		return Integer.valueOf(jdbcMaxPoolSize);
	}

	public void setJdbcMaxPoolSize(int jdbcMaxPoolSize) {
		configManager.set(defaultValue.getJdbcMaxPoolSizeKey(), jdbcMaxPoolSize + "");
	}

	public int getJdbcMinPoolSize() {
		String jdbcMinPoolSize = configManager.get(defaultValue.getJdbcMinPoolSizeKey());
		
		if(null == jdbcMinPoolSize){
			return defaultValue.getJdbcMinPoolSize();
		}
		
		return Integer.valueOf(jdbcMinPoolSize);
	}

	public void setJdbcMinPoolSize(int jdbcMinPoolSize) {
		configManager.set(defaultValue.getJdbcMinPoolSizeKey(), jdbcMinPoolSize + "");
	}

	public int getJdbcInitPoolSize() {
		String jdbcInitPoolSize = configManager.get(defaultValue.getJdbcInitPoolSizeKey());
		
		if(null == jdbcInitPoolSize){
			return defaultValue.getJdbcInitPoolSize();
		}
		
		return Integer.valueOf(jdbcInitPoolSize);
	}

	public void setJdbcInitPoolSize(int jdbcInitPoolSize) {
		configManager.set(defaultValue.getJdbcInitPoolSizeKey(), jdbcInitPoolSize + "");
	}

	public int getJdbcMaxIdleTime() {
		String jdbcMaxIdleTime = configManager.get(defaultValue.getJdbcMaxIdleTimeKey());
		
		if(null == jdbcMaxIdleTime){
			return defaultValue.getJdbcMaxIdleTime();
		}
		
		return Integer.valueOf(jdbcMaxIdleTime);
	}

	public void setJdbcMaxIdleTime(int jdbcMaxIdleTime) {
		configManager.set(defaultValue.getJdbcMaxIdleTimeKey(), jdbcMaxIdleTime + "");
	}
	
	public String getJdbcDriverClass() {
		return configManager.get(defaultValue.getJdbcDriverClassKey());
	}

	public void setJdbcDriverClass(String jdbcDriverClassKey) {
		configManager.set(defaultValue.getJdbcDriverClassKey(), jdbcDriverClassKey);
	}

	public String getJdbcUrl() {
		return configManager.get(defaultValue.getJdbcUrlKey());
	}

	public void setJdbcUrl(String jdbcUrlKey) {
		configManager.set(defaultValue.getJdbcUrlKey(), jdbcUrlKey);
	}

	public String getJdbcUserName() {
		return configManager.get(defaultValue.getJdbcUserNameKey());
	}

	public void setJdbcUserName(String jdbcUserNameKey) {
		configManager.set(defaultValue.getJdbcUserNameKey(), jdbcUserNameKey);
	}

	public String getJdbcPassword() {
		return configManager.get(defaultValue.getJdbcPasswordKey());
	}

	public void setJdbcPassword(String jdbcPasswordKey) {
		configManager.set(defaultValue.getJdbcPasswordKey(), jdbcPasswordKey);
	}

}
