package com.wen.framework.jdbctemplate.model;

public class SqlAndParamModel {
	
	private String sql;
	private IPo model;
	
	public SqlAndParamModel(){
		
	}
	
	public SqlAndParamModel(String sql,IPo model){
		this.sql = sql;
		this.model = model;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public IPo getModel() {
		return model;
	}

	public void setModel(IPo model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "SqlAndParamModel [sql=" + sql + ", model=" + model + "]";
	}
	
}
