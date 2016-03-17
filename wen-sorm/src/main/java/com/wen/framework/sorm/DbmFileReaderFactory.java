package com.wen.framework.sorm;

import com.wen.framework.sorm.impl.XmlDbmFileReaderImpl;

public class DbmFileReaderFactory {
	
	private static IDbmFileReader xmlDbmFileReader = null;
	
	public static IDbmFileReader getXmlDbmFileReader(){
		if(null == xmlDbmFileReader){
			xmlDbmFileReader = new XmlDbmFileReaderImpl();
		}
		
		return xmlDbmFileReader;
	}
	
}
