package com.wen.framework.dao.util;

import java.util.List;
import java.util.Map;

import com.wen.framework.commons.model.IPo;
import com.wen.framework.db.DataSource;
import com.wen.framework.jdbctemplate.JdbcTemplate;

public class DbUtil {
	
	private static JdbcTemplate jdbcTemplate;
	
	static{
		jdbcTemplate = new JdbcTemplate(DataSource.getInstance());
	}
	
	public static int update(String sql,Object ...params){
		
		return jdbcTemplate.update(sql, params);
	}
	
	public static int update(String sql,Map<String,Object> params){
		
		return jdbcTemplate.update(sql, params);
	}
	
	public static int update(String sql,IPo model){
		
		return jdbcTemplate.update(sql, model);
	}
	
	public static <T extends IPo> T query(Class<T> clazz,String sql,Object ...params){
		
		return jdbcTemplate.query(clazz, sql, params);
	}
	
	public static <T extends IPo> T query(Class<T> clazz,String sql,Map<String,Object> params){
		
		return jdbcTemplate.query(clazz, sql, params);
	}
	
	public static <T extends IPo> T query(Class<T> clazz,String sql,IPo model){
		
		return jdbcTemplate.query(clazz, sql, model);
	}
	
	public static <T extends IPo> List<T> queryForList(Class<T> clazz,String sql,Object ...params){
		
		return jdbcTemplate.queryForList(clazz, sql, params);
	}
	
	public static <T extends IPo> List<T> queryForList(Class<T> clazz,String sql,Map<String,Object> params){
		
		return jdbcTemplate.queryForList(clazz, sql, params);
	}
	
	public static <T extends IPo> List<T> queryForList(Class<T> clazz,String sql,IPo model){
		
		return jdbcTemplate.queryForList(clazz, sql, model);
	}
}
