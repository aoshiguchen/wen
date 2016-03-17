package com.wen.framework.util;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class XmlUtil {
	private static SAXReader reader = new SAXReader();

	public static Document load(String filePath){
		Document doc = null;
		
		try {
			doc = reader.read(new File(filePath));
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return doc;
	}
	
}
