package com.wen.framework.jdbctemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class PreparedStatementCallback<T> implements IJdbcCallback<T>{

	public abstract Object[] getParams();
	public abstract String getSql();
	public abstract T execute(PreparedStatement ps);
	public abstract Connection getConnection();
	
	@Override
	public T execute() {
		PreparedStatement pstm = null;
		Object[] params = this.getParams();
		Connection conn = getConnection();
		
		T res = null;
		try {
			pstm = conn.prepareStatement(this.getSql());
			
			for(int i = 0;i < params.length;i++){
				pstm.setObject(i + 1, params[i]);
			}
			
			res = this.execute(pstm);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return res;
	}
}
