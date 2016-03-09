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
		System.out.println(ConfigManager.getJdbcDriverClass());
		System.out.println(ConfigManager.getJdbcUrl());
		System.out.println(ConfigManager.getJdbcUserName());
		System.out.println(ConfigManager.getJdbcPassword());
	}
	
}
