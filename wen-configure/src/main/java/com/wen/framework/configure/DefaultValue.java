package com.wen.framework.configure;

public final class DefaultValue {

	private PathTypeEnum configFilePathType = PathTypeEnum.PROJECT_ROOT;
	private String configFileName = "app.properties";
	private String configFilePath = "";
	private FileTypeEnum configFileType = FileTypeEnum.PROP;
	
	private String jdbcDriverClassKey = "jdbc.driverClass";
	private String jdbcUrlKey = "jdbc.url";
	private String jdbcUserNameKey = "jdbc.username";
	private String jdbcPasswordKey = "jdbc.password";
	
	private String jdbcMaxPoolSizeKey = "jdbc.maxPoolSize";
	private String jdbcMinPoolSizeKey = "jdbc.minPoolSize";
	private String jdbcInitPoolSizeKey = "jdbc.initPoolSize";
	private String jdbcMaxIdleTimeKey = "jdbc.MaxIdleTime";
	
	private int jdbcMaxPoolSize = 100;
	private int jdbcMinPoolSize = 5;
	private int jdbcInitPoolSize = 10;
	private int jdbcMaxIdleTime = 60;


	private static DefaultValue instance = null;

	private DefaultValue() {

	}

	public static synchronized DefaultValue getInstance() {
		if (null == instance) {
			instance = new DefaultValue();
		}

		return instance;
	}

	public String getConfigFileName() {
		return configFileName;
	}

	public void setConfigFileName(String configFileName) {
		this.configFileName = configFileName;
	}

	public String getConfigFilePath() {
		return configFilePath;
	}

	public void setConfigFilePath(String configFilePath) {
		this.configFilePath = configFilePath;
	}

	public FileTypeEnum getConfigFileType() {
		return configFileType;
	}

	public void setConfigFileType(FileTypeEnum configFileType) {
		this.configFileType = configFileType;
	}


	public static void setInstance(DefaultValue instance) {
		DefaultValue.instance = instance;
	}

	public PathTypeEnum getConfigFilePathType() {
		return configFilePathType;
	}

	public void setConfigFilePathType(PathTypeEnum configFilePathType) {
		this.configFilePathType = configFilePathType;
	}

	public String getJdbcDriverClassKey() {
		return jdbcDriverClassKey;
	}

	public void setJdbcDriverClassKey(String jdbcDriverClassKey) {
		this.jdbcDriverClassKey = jdbcDriverClassKey;
	}

	public String getJdbcUrlKey() {
		return jdbcUrlKey;
	}

	public void setJdbcUrlKey(String jdbcUrlKey) {
		this.jdbcUrlKey = jdbcUrlKey;
	}

	public String getJdbcUserNameKey() {
		return jdbcUserNameKey;
	}

	public void setJdbcUserNameKey(String jdbcUserNameKey) {
		this.jdbcUserNameKey = jdbcUserNameKey;
	}

	public String getJdbcPasswordKey() {
		return jdbcPasswordKey;
	}

	public void setJdbcPasswordKey(String jdbcPasswordKey) {
		this.jdbcPasswordKey = jdbcPasswordKey;
	}

	public String getJdbcMaxPoolSizeKey() {
		return jdbcMaxPoolSizeKey;
	}

	public void setJdbcMaxPoolSizeKey(String jdbcMaxPoolSizeKey) {
		this.jdbcMaxPoolSizeKey = jdbcMaxPoolSizeKey;
	}

	public String getJdbcMinPoolSizeKey() {
		return jdbcMinPoolSizeKey;
	}

	public void setJdbcMinPoolSizeKey(String jdbcMinPoolSizeKey) {
		this.jdbcMinPoolSizeKey = jdbcMinPoolSizeKey;
	}

	public String getJdbcInitPoolSizeKey() {
		return jdbcInitPoolSizeKey;
	}

	public void setJdbcInitPoolSizeKey(String jdbcInitPoolSizeKey) {
		this.jdbcInitPoolSizeKey = jdbcInitPoolSizeKey;
	}

	public String getJdbcMaxIdleTimeKey() {
		return jdbcMaxIdleTimeKey;
	}

	public void setJdbcMaxIdleTimeKey(String jdbcMaxIdleTimeKey) {
		this.jdbcMaxIdleTimeKey = jdbcMaxIdleTimeKey;
	}

	public int getJdbcMaxPoolSize() {
		return jdbcMaxPoolSize;
	}

	public void setJdbcMaxPoolSize(int jdbcMaxPoolSize) {
		this.jdbcMaxPoolSize = jdbcMaxPoolSize;
	}

	public int getJdbcMinPoolSize() {
		return jdbcMinPoolSize;
	}

	public void setJdbcMinPoolSize(int jdbcMinPoolSize) {
		this.jdbcMinPoolSize = jdbcMinPoolSize;
	}

	public int getJdbcInitPoolSize() {
		return jdbcInitPoolSize;
	}

	public void setJdbcInitPoolSize(int jdbcInitPoolSize) {
		this.jdbcInitPoolSize = jdbcInitPoolSize;
	}

	public int getJdbcMaxIdleTime() {
		return jdbcMaxIdleTime;
	}

	public void setJdbcMaxIdleTime(int jdbcMaxIdleTime) {
		this.jdbcMaxIdleTime = jdbcMaxIdleTime;
	}

	@Override
	public String toString() {
		return "DefaultValue [configFilePathType=" + configFilePathType
				+ ", configFileName=" + configFileName + ", configFilePath="
				+ configFilePath + ", configFileType=" + configFileType
				+ ", jdbcDriverClassKey=" + jdbcDriverClassKey
				+ ", jdbcUrlKey=" + jdbcUrlKey + ", jdbcUserNameKey="
				+ jdbcUserNameKey + ", jdbcPasswordKey=" + jdbcPasswordKey
				+ ", jdbcMaxPoolSizeKey=" + jdbcMaxPoolSizeKey
				+ ", jdbcMinPoolSizeKey=" + jdbcMinPoolSizeKey
				+ ", jdbcInitPoolSizeKey=" + jdbcInitPoolSizeKey
				+ ", jdbcMaxIdleTimeKey=" + jdbcMaxIdleTimeKey
				+ ", jdbcMaxPoolSize=" + jdbcMaxPoolSize + ", jdbcMinPoolSize="
				+ jdbcMinPoolSize + ", jdbcInitPoolSize=" + jdbcInitPoolSize
				+ ", jdbcMaxIdleTime=" + jdbcMaxIdleTime + "]";
	}

	
	
}
