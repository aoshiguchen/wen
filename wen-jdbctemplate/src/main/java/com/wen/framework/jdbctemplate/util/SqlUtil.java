package com.wen.framework.jdbctemplate.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wen.framework.commons.model.IPo;
import com.wen.framework.jdbctemplate.SeqObject;
import com.wen.framework.jdbctemplate.model.SqlAndParamList;
import com.wen.framework.jdbctemplate.model.SqlAndParamMap;
import com.wen.framework.jdbctemplate.model.SqlAndParamModel;
import com.wen.framework.util.ClassUtil;

public class SqlUtil {

	public static SqlAndParamList sqlAndParamMapToSqlAndParamList(SqlAndParamMap sqlAndParamMap){
		List<Object> objs = new ArrayList<Object>();
		List<SeqObject> seqObjects = new ArrayList<SeqObject>();
		
		String sql = sqlAndParamMap.getSql();
		Map<String,Object> params = sqlAndParamMap.getParams();
		
		for(String key : params.keySet()){
			int index = sql.indexOf(":" + key);
			
			
			if(-1 != index){
				seqObjects.add(new SeqObject(index,params.get(key)));
				
				sql = sql.replaceFirst(":" + key, "?");
				
			}
		}
		Collections.sort(seqObjects);
		
		for(SeqObject item : seqObjects){
			objs.add(item.getObj());
		}
		
		return new SqlAndParamList(sql, objs.toArray());
	}
	
	public static SqlAndParamList sqlAndParamMapToSqlAndParamList(String sql,Map<String,Object> params){
	
		
		return sqlAndParamMapToSqlAndParamList(new SqlAndParamMap(sql, params));
	}
	
	public static SqlAndParamList sqlAndParamModelToSqlAndParamList(SqlAndParamModel sqlAndParamModel){
		String sql = sqlAndParamModel.getSql();
		Map<String,Object> params = new HashMap<>();
		
		for(String key : ClassUtil.getFields(sqlAndParamModel.getModel().getClass())){
			params.put(key,ClassUtil.getFieldValue(sqlAndParamModel.getModel(), key));
		}
		
		return sqlAndParamMapToSqlAndParamList(sql, params);
	}
	
	public static SqlAndParamList sqlAndParamModelToSqlAndParamList(String sql,IPo model){
	
		
		return sqlAndParamModelToSqlAndParamList(new SqlAndParamModel(sql, model));
	}
}
