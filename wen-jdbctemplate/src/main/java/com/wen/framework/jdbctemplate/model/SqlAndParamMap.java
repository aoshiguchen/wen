package com.wen.framework.jdbctemplate.model;

import java.util.Map;

public class SqlAndParamMap {
	
	private String sql;
	private Map<String,Object> params;
	
	public SqlAndParamMap(){
		
	}
	
	public SqlAndParamMap(String sql,Map<String,Object> params){
		this.sql = sql;
		this.params = params;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public Map<String, Object> getParams() {
		return params;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}

	@Override
	public String toString() {
		return "SqlAndParamMap [sql=" + sql + ", params=" + params + "]";
	}
	
	
	
}
