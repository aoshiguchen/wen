package com.wen.framework.sorm.impl;

import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;

import com.wen.framework.commons.model.IPo;
import com.wen.framework.dao.proxy.DefaultUpdateDao;
import com.wen.framework.sorm.DefaultValue;
import com.wen.framework.sorm.IDbmFileReader;
import com.wen.framework.sorm.TableDaoMapping;
import com.wen.framework.util.StringUtil;
import com.wen.framework.util.XmlUtil;

public class XmlDbmFileReaderImpl implements IDbmFileReader{
	
	private static TableDaoMapping tableDaoMapping;
	
	@SuppressWarnings("unchecked")
	@Override
	public TableDaoMapping load() throws ClassNotFoundException {
		
		if(null == tableDaoMapping){
			tableDaoMapping = new TableDaoMapping();
			
			Document document = XmlUtil.load(DefaultValue.getInstance().getConfigFileFullName());
			
			Element root = document.getRootElement();
			
			List<Element> mapList = root.elements();
			
			for(Element e : mapList){
				String id = e.attributeValue("id").trim();
				String className = e.elementText("class").trim();
				String tbName = e.elementText("table").trim();
				
				Class<? extends IPo> clazz = (Class<? extends IPo>) Class.forName(className);
				
				if(StringUtil.isEmpty(tbName)){
					tableDaoMapping.put(id,new DefaultUpdateDao(clazz));
				}else{
					tableDaoMapping.put(id,new DefaultUpdateDao(clazz,tbName));
				}
			}
			
		}
		
		return tableDaoMapping;
	}

}
