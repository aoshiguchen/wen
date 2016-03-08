package com.wen.framework.configure;

import org.junit.Test;

public class PathUtilTest {

	@Test
	public void testClassPathRoot(){
		System.out.println(PathUtil.getClassPathRoot());
	}
	
	@Test
	public void testProjectRoot(){
		System.out.println(PathUtil.getProjectRoot());
	}
	
}
