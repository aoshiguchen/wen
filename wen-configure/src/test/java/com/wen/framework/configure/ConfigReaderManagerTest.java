package com.wen.framework.configure;

import org.junit.Test;

public class ConfigReaderManagerTest {

	@Test
	public void testReadAll(){
		System.out.println(ConfigManager.readAll());
	}
	
	@Test
	public void testConfigFilePath(){
		System.out.println(ConfigManager.getConfigFileFullName());
	}
	
	@Test
	public void testDbConfig(){
		System.out.println(ConfigManager.getDbHost());
		System.out.println(ConfigManager.getDbName());
		System.out.println(ConfigManager.getDbLoginName());
		System.out.println(ConfigManager.getDbLoginPassword());
	}
	
}
