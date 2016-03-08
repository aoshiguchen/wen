package com.wen.framework.configure;

import org.junit.Test;

public class ConfigReaderFactoryTest {
	
	@Test
	public void test1(){
		IConfigReader configReader1 = ConfigReaderFactory.getPropConfigReader();
		IConfigReader configReader2 = ConfigReaderFactory.getPropConfigReader();

		System.out.println(configReader1 == configReader2);
	}
	
}
