package com.wen.framework.test;

import org.junit.Test;

import com.wen.framework.configure.ConfigManager;

import junit.framework.TestCase;

public class Test1 extends TestCase {
	
	@Test
	public void test1(){
		int aa = ConfigManager.getInt("aa");
		
		System.out.println(aa);
	}
	
}
