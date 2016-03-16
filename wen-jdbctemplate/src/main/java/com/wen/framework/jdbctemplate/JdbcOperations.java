package com.wen.framework.jdbctemplate;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wen.framework.jdbctemplate.model.IPo;

public class JdbcOperations implements IJdbcOperations{
	
	private static JdbcOperations instance;
	
	private JdbcOperations(){
		
	}
	
	public static synchronized JdbcOperations getInstance() {
		if (null == instance) {
			instance = new JdbcOperations();
		}

		return instance;
	}
	
	@Override
	public <T> T execute(IJdbcCallback<T> callback) {
		T res = null;
		try {
			res = callback.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}
	


	@Override
	public int executeUpdate(final Connection conn,final String sql,final Object[] params) {
		return this.execute(new PreparedStatementCallback<Integer>(){
			
			@Override
			public Integer execute(PreparedStatement ps) {
				int res = -1;
				
				try{
					res =  ps.executeUpdate();
				}catch(SQLException e){
					e.printStackTrace();
				}
				
				return res;
			}

			@Override
			public Object[] getParams() {
				
				return params;
			}

			@Override
			public String getSql() {
				
				return sql;
			}

			@Override
			public Connection getConnection(){

				return conn;
			}
			
		});
	}

	@Override
	public <T extends IPo> T executeQeury(final Connection conn, final Class<T> clazz,final String sql, final Object[] params) {
		return this.execute(new PreparedStatementCallback<T>() {

			@Override
			public T execute(PreparedStatement ps) {
				T res = null;
				
				try{
					ResultSet resultSet = ps.executeQuery();
					
					if(resultSet.next()){
						res = clazz.newInstance();
						
						ResultSetMetaData rsmd = resultSet.getMetaData();
						int columnCount = rsmd.getColumnCount();
						
						for(int i = 1;i <= columnCount;i++){
							String name = rsmd.getColumnName(i);
							Object value = resultSet.getObject(i);
														
							Method m = clazz.getDeclaredMethod(StringUtil.getSetMethodName(name),clazz.getDeclaredField(name).getType());
							m.invoke(res,value);
							
						}
					}
					
				}catch(Exception e){
					e.printStackTrace();
				}
				
				return res;
			}

			@Override
			public Connection getConnection() {

				return conn;
			}

			@Override
			public Object[] getParams() {

				return params;
			}

			@Override
			public String getSql() {

				return sql;
			}
			
		});
	}

	@Override
	public <T extends IPo> List<T> executeQeuryForList(final Connection conn,final Class<T> clazz, final String sql, final Object[] params) {
		return this.execute(new PreparedStatementCallback<List<T>>() {

			@Override
			public List<T> execute(PreparedStatement ps) {
				List<T> res = new ArrayList<T>();
				
				try{
					ResultSet resultSet = ps.executeQuery();
					ResultSetMetaData rsmd = resultSet.getMetaData();
					int columnCount = rsmd.getColumnCount();
					
					while(resultSet.next()){
						T obj = clazz.newInstance();
						
						for(int i = 1;i <= columnCount;i++){
							String name = rsmd.getColumnName(i);
							Object value = resultSet.getObject(i);
														
							Method m = clazz.getDeclaredMethod(StringUtil.getSetMethodName(name),clazz.getDeclaredField(name).getType());
							m.invoke(obj,value);
							
						}
						
						res.add(obj);
					}
					
				}catch(Exception e){
					e.printStackTrace();
				}
				
				return res;
			}

			@Override
			public Connection getConnection() {

				return conn;
			}

			@Override
			public Object[] getParams() {

				return params;
			}

			@Override
			public String getSql() {

				return sql;
			}
			
		});
	}
	
}
