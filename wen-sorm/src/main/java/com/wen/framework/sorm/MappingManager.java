package com.wen.framework.sorm;

public class MappingManager {
	
	private static TableDaoMapping tableDaoMapping;
	
	@SuppressWarnings("incomplete-switch")
	public static TableDaoMapping loadDbm() throws ClassNotFoundException{
		
		if(null == tableDaoMapping){
	
			switch (DefaultValue.getInstance().getConfigFileType()) {
			case XML:
				tableDaoMapping = DbmFileReaderFactory.getXmlDbmFileReader().load();
				break;
			}
			
		}
		
		return tableDaoMapping;
	}
	
}
