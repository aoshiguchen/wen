package com.wen.framework.configure;

import java.util.Map;

import org.junit.Test;

public class ConfigReaderManagerTest {

	@Test
	public void testReadAll(){
		ConfigManager configManager = ConfigManager.getInstance();
		Map<String,String> config = configManager.readAll();

		System.out.println(config);
	}
	
	@Test
	public void testConfigFilePath(){
		System.out.println(ConfigManager.getInstance().getConfigFileFullName());
	}
	
}
