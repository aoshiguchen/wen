package com.wen.framework.jdbctemplate;

import static com.wen.framework.jdbctemplate.util.SqlUtil.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import com.wen.framework.jdbctemplate.model.IPo;
import com.wen.framework.jdbctemplate.model.SqlAndParamList;

public class JdbcTemplate{
	private DataSource ds;
	private IJdbcOperations jdbcOperations;
	
	public JdbcTemplate(){
		jdbcOperations = JdbcOperations.getInstance();
	}
	
	public JdbcTemplate(DataSource dataSource){
		this();
		this.ds = dataSource;
	}
	
	
	public int update(String sql,Object ...params){
		int res = -1;
		Connection conn = null;
		
		try {
			conn = ds.getConnection();
			res = jdbcOperations.executeUpdate(conn,sql, params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}
	
	public int update(String sql,Map<String,Object> params){
		SqlAndParamList sqlAndParamList = sqlAndParamMapToSqlAndParamList(sql,params);
		
		return update(sqlAndParamList.getSql(),sqlAndParamList.getParams());
	}
	
	public int update(String sql,IPo model){
		SqlAndParamList sqlAndParamList = sqlAndParamModelToSqlAndParamList(sql,model);
		
		return update(sqlAndParamList.getSql(),sqlAndParamList.getParams());
	}
	
	public <T extends IPo> T query(Class<T> clazz,String sql,Object ...params){
		T res = null;
		Connection conn = null;
		
		try {
			conn = ds.getConnection();
			res = jdbcOperations.executeQeury(conn,clazz,sql, params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}
	
	public <T extends IPo> T query(Class<T> clazz,String sql,Map<String,Object> params){
		SqlAndParamList sqlAndParamList = sqlAndParamMapToSqlAndParamList(sql,params);
		
		return query(clazz,sqlAndParamList.getSql(),sqlAndParamList.getParams());
	}
	
	public <T extends IPo> T query(Class<T> clazz,String sql,IPo model){
		SqlAndParamList sqlAndParamList = sqlAndParamModelToSqlAndParamList(sql, model);
		
		return query(clazz,sqlAndParamList.getSql(),sqlAndParamList.getParams());
	}
	
	public <T extends IPo> List<T> queryForList(Class<T> clazz,String sql,Object ...params){
		List<T> res = null;
		Connection conn = null;
		
		try {
			conn = ds.getConnection();
			res = jdbcOperations.executeQeuryForList(conn,clazz,sql, params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}
	
	public <T extends IPo> List<T> queryForList(Class<T> clazz,String sql,Map<String,Object> params){
		SqlAndParamList sqlAndParamList = sqlAndParamMapToSqlAndParamList(sql,params);
		
		return queryForList(clazz,sqlAndParamList.getSql(),sqlAndParamList.getParams());
	}
	
	public <T extends IPo> List<T> queryForList(Class<T> clazz,String sql,IPo model){
		SqlAndParamList sqlAndParamList = sqlAndParamModelToSqlAndParamList(sql, model);
		
		return queryForList(clazz,sqlAndParamList.getSql(),sqlAndParamList.getParams());
	}


	public void setDataSource(DataSource dataSource) {
		this.ds = dataSource;
	}
	
}
