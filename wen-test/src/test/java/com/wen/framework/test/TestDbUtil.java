package com.wen.framework.test;

import static com.wen.framework.jdbctemplate.util.SqlUtil.sqlAndParamModelToSqlAndParamList;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.wen.framework.dao.util.DbUtil;
import com.wen.framework.test.model.User;

public class TestDbUtil {
	
//	@Test
//	public void test1() throws SQLException{
//		
//		User user = DbUtil.query(User.class,"select * from [user] where id = ?","D3D17C13-B2D0-4607-B587-BBC70277653B");
//		
//		System.out.println(user);
//		
//		List<User> users = DbUtil.queryForList(User.class,"select * from [user]");
//		System.out.println(users);
//	}
//	
//	@Test
//	public void test2(){
//		Map<String,Object> params = new HashMap<>();
//		params.put("id", "D3D17C13-B2D0-4607-B587-BBC70277653B");
//		
//		User user = DbUtil.query(User.class,"select * from [user] where id = :id",params);
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
//		System.out.println(DbUtil.update(sql, params));
//	}
//	
//	@Test
//	public void test4(){
//		String sql = "update [dept] set name = :name where id = :id";
//		Map<String,Object> params = new HashMap<>();
//		params.put("id","111");
//		params.put("name","aaaaa");
//		
//		System.out.println(DbUtil.update(sql, params));
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
//		user = DbUtil.query(User.class,sql,user);
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
//		System.out.println(DbUtil.update(sql,params));
//	}
	
}
