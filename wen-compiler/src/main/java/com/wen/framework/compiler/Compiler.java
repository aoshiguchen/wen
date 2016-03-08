package com.wen.framework.compiler;

import javax.tools.*;

import com.wen.framework.configure.PathUtil;

@SuppressWarnings("restriction")
public final class Compiler {
	
	private static JavaCompiler compiler;
	private static String classPath;
	
	static{
		compiler = ToolProvider.getSystemJavaCompiler();
		classPath = PathUtil.getClassPathRoot();
	}
	
	
	public static void compile(String filePath){
		compiler.run(null, null,null,"-d",classPath,filePath);
	}
	
}
