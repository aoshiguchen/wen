package com.wen.framework.jdbctemplate.model;

import java.util.Arrays;

public class SqlAndParamList {
	
	private String sql;
	private Object[] params;
	
	public SqlAndParamList(){
		
	}
	
	public SqlAndParamList(String sql,Object[] params){
		this.sql = sql;
		this.params = params;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public Object[] getParams() {
		return params;
	}

	public void setParams(Object[] params) {
		this.params = params;
	}

	@Override
	public String toString() {
		return "SqlAndParamList [sql=" + sql + ", params="
				+ Arrays.toString(params) + "]";
	}
	
}
