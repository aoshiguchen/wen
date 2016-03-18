package com.wen.framework.test;

import static com.wen.framework.jdbctemplate.util.SqlUtil.*;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.wen.framework.db.DataSource;
import com.wen.framework.jdbctemplate.JdbcTemplate;
import com.wen.framework.test.model.User;

public class TestJdbcTemplate {
	private javax.sql.DataSource ds;
	private JdbcTemplate jdbcTemplate;
	
	{
		ds = DataSource.getInstance();
		jdbcTemplate = new JdbcTemplate(ds);
	}

//	@Test
//	public void test1() throws SQLException{
//		
//		System.out.println(ds);
//				
//		System.out.println(jdbcTemplate);
//		
//		User user = jdbcTemplate.query(User.class,"select * from [user] where id = ?","D3D17C13-B2D0-4607-B587-BBC70277653B");
//		
//		System.out.println(user);
//		
//		List<User> users = jdbcTemplate.queryForList(User.class,"select * from [user]");
//		System.out.println(users);
//	}
//	
//	@Test
//	public void test2(){
//		Map<String,Object> params = new HashMap<>();
//		params.put("id", "D3D17C13-B2D0-4607-B587-BBC70277653B");
//		
//		User user = jdbcTemplate.query(User.class,"select * from [user] where id = :id",params);
//		
//		System.out.println(user);
//	}
//	
//	@Test
//	public void test3(){
//		String sql = "insert into [dept] values(:id,:name,:code)";
//		Map<String,Object> params = new HashMap<>();
//		params.put("id","111");
//		params.put("name","2222");
//		params.put("code","3333");
//		
//		System.out.println(jdbcTemplate.update(sql, params));
//	}
//	
//	@Test
//	public void test4(){
//		String sql = "update [dept] set name = :name where id = :id";
//		Map<String,Object> params = new HashMap<>();
//		params.put("id","111");
//		params.put("name","aaaaa");
//		
//		System.out.println(jdbcTemplate.update(sql, params));
//	}
//	
//	@Test
//	public void Test5(){
//		String sql = "select * from user where id = :id";
//		User user = new User();
//		user.setId("ac0fb6d0-e515-4463-b678-b585aaac8a36");
//		
//		System.out.println(sqlAndParamModelToSqlAndParamList(sql, user));
//		
//	}
//	
//	@Test
//	public void test6(){
//		String sql = "select * from [user] where id = :id";
//		User user = new User();
//		user.setId("2390eddd-7417-40d5-b334-1fd3da385a47");
//		
//		user = jdbcTemplate.query(User.class,sql,user);
//		
//		System.out.println(user);
//	}
//	
//	@Test
//	public void test7(){
//		String sql = "delete [dept] where id = :id";
//		Map<String,Object> params = new HashMap<>();
//		params.put("id","111");
//		
//		System.out.println(jdbcTemplate.update(sql,params));
//	}
}
