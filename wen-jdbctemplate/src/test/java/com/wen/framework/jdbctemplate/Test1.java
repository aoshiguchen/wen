package com.wen.framework.jdbctemplate;

import java.util.HashMap;
import java.util.Map;

import static com.wen.framework.jdbctemplate.util.SqlUtil.*;
import org.junit.Test;
import com.wen.framework.jdbctemplate.model.SqlAndParamMap;

public class Test1 {

	@Test
	public void Test1(){
		String sql = "select * from user where id = :id";
		Map<String,Object> map = new HashMap<>();
		map.put("id",1);
		
		System.out.println(sqlAndParamMapToSqlAndParamList(new SqlAndParamMap(sql, map)));
		
	}
	
	
	
}
