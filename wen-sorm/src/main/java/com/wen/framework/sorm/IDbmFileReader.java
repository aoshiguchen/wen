package com.wen.framework.sorm;

public interface IDbmFileReader {
	
	public TableDaoMapping load() throws ClassNotFoundException;
	
}
