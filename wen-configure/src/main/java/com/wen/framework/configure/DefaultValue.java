package com.wen.framework.configure;

public final class DefaultValue {

	private PathTypeEnum configFilePathType = PathTypeEnum.PROJECT_ROOT;
	private String configFileName = "app.properties";
	private String configFilePath = "";
	private FileTypeEnum configFileType = FileTypeEnum.PROP;
	private String dbTypeKeyName = "dbtype";
	private String dbHostKeyName = "dbhost";
	private String dbNameKeyName = "dbname";
	private String dbLoginNameKeyName = "dbloginname";
	private String dbLoginPasswordKeyName = "dbpassword";
	private DbTypeEnum dbType = DbTypeEnum.SQLSERVER;

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

	public String getDbTypeKeyName() {
		return dbTypeKeyName;
	}

	public void setDbTypeKeyName(String dbTypeKeyName) {
		this.dbTypeKeyName = dbTypeKeyName;
	}

	public String getDbHostKeyName() {
		return dbHostKeyName;
	}

	public void setDbHostKeyName(String dbHostKeyName) {
		this.dbHostKeyName = dbHostKeyName;
	}

	public String getDbNameKeyName() {
		return dbNameKeyName;
	}

	public void setDbNameKeyName(String dbNameKeyName) {
		this.dbNameKeyName = dbNameKeyName;
	}

	public String getDbLoginNameKeyName() {
		return dbLoginNameKeyName;
	}

	public void setDbLoginNameKeyName(String dbLoginNameKeyName) {
		this.dbLoginNameKeyName = dbLoginNameKeyName;
	}

	public String getDbLoginPasswordKeyName() {
		return dbLoginPasswordKeyName;
	}

	public void setDbLoginPasswordKeyName(String dbLoginPasswordKeyName) {
		this.dbLoginPasswordKeyName = dbLoginPasswordKeyName;
	}

	public DbTypeEnum getDbType() {
		return dbType;
	}

	public void setDbType(DbTypeEnum dbType) {
		this.dbType = dbType;
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

	@Override
	public String toString() {
		return "DefaultValue [configFilePathType=" + configFilePathType
				+ ", configFileName=" + configFileName + ", configFilePath="
				+ configFilePath + ", configFileType=" + configFileType
				+ ", dbTypeKeyName=" + dbTypeKeyName + ", dbHostKeyName="
				+ dbHostKeyName + ", dbNameKeyName=" + dbNameKeyName
				+ ", dbLoginNameKeyName=" + dbLoginNameKeyName
				+ ", dbLoginPasswordKeyName=" + dbLoginPasswordKeyName
				+ ", dbType=" + dbType + "]";
	}

}
