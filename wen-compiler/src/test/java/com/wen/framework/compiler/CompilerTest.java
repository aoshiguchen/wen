package com.wen.framework.compiler;


import org.junit.Test;

import com.wen.framework.util.PathUtil;

public class CompilerTest {

	@Test
	public void compile() throws ClassNotFoundException {
		String path = PathUtil.getProjectRoot() + "code/Person.java";

		Compiler.compile(path);

	}
	
}
