package com.wen.framework.configure;

import com.wen.framework.configure.impl.IniConfigReaderImpl;
import com.wen.framework.configure.impl.JsonConfigReaderImpl;
import com.wen.framework.configure.impl.PropConfigReaderImpl;
import com.wen.framework.configure.impl.TxtConfigReaderImpl;
import com.wen.framework.configure.impl.XmlConfigReaderImpl;

public final class ConfigReaderFactory {
	
	private static IConfigReader iniConfigReader = null;
	private static IConfigReader jsonConfigReader = null;
	private static IConfigReader propConfigReader = null;
	private static IConfigReader txtConfigReader = null;
	private static IConfigReader xmlConfigReader = null;
	
	public static IConfigReader getIniConfigReader(){
		if(null == iniConfigReader){
			iniConfigReader = new IniConfigReaderImpl();
		}
		
		return iniConfigReader;
	}
	
	public static IConfigReader getJsonConfigReader(){
		if(null == jsonConfigReader){
			jsonConfigReader = new JsonConfigReaderImpl();
		}
		
		return jsonConfigReader;
	}
	
	public static IConfigReader getPropConfigReader(){
		if(null == propConfigReader){
			propConfigReader = new PropConfigReaderImpl();
		}
		
		return propConfigReader;
	}
	
	public static IConfigReader getTxtConfigReader(){
		if(null == txtConfigReader){
			txtConfigReader = new TxtConfigReaderImpl();
		}
		
		return txtConfigReader;
	}
	
	public static IConfigReader getXmlConfigReader(){
		if(null == xmlConfigReader){
			xmlConfigReader = new XmlConfigReaderImpl();
		}
		
		return xmlConfigReader;
	}
	
	
}
