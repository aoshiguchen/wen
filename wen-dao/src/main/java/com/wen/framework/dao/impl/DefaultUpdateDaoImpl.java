package com.wen.framework.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.wen.framework.commons.model.IPo;
import com.wen.framework.dao.util.DbUtil;
import com.wen.framework.util.ClassUtil;
import com.wen.framework.util.ObjectUtil;
import com.wen.framework.util.StringUtil;

public class DefaultUpdateDaoImpl extends AbstractUpdateDaoImpl{
	private Class<? extends IPo> entityClass;
	protected  Map<String,Class<?>> fieldSet = null;
	protected  String tbName = "";
	
	public DefaultUpdateDaoImpl(Class<? extends IPo> entityClass,String tbName) {
		this.tbName = tbName;
		
		this.entityClass = entityClass;
	}
	
	public DefaultUpdateDaoImpl(Class<? extends IPo> entityClass) {
		String[] s = entityClass.getName().split("\\.");
		
		String pre = s[s.length - 1].substring(0,2);
		
		if(pre.equals("Po")){
			this.tbName = s[s.length - 1].substring(2);
		}else{
			this.tbName = s[s.length - 1];
		}

		this.entityClass = entityClass;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends IPo> List<T> findAll() {
				
		 return  DbUtil.queryForList((Class<T>)entityClass,"select * from [" + tbName + "]");
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends IPo> T findById(String id) {

		return DbUtil.query((Class<T>)entityClass,"select * from [" + tbName + "] where id = ?",id);
	}
	

	@Override
	public <T extends IPo> T find(String id) {

		return findById(id);
	}

	@Override
	public <T extends IPo> T findSingle(String id) {

		return findById(id);
	}

	@Override
	public <T extends IPo> T findSingle(T po) {
		
		return findSingle(po,ClassUtil.getFieldNameSet(po.getClass()));
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends IPo> T findSingle(T po, Set<String> filterField) {
		if(filterField.size() == 0){
			
			return findSingle(po);
		}
		
		String sqlPrefix = "select * from [" + tbName + "] where ";
		StringBuffer sbSuffix = new StringBuffer();
		String sqlSuffix = "";
		Map<String,Object> params = new HashMap<>();
		
		for(String item : filterField){
			sbSuffix.append(item + " = :" + item + " and ");
			params.put(item, ClassUtil.getFieldValue(po,item));
		}
		
		sqlSuffix = sbSuffix.toString();
		
		if(sqlSuffix.endsWith("and ")){
			sqlSuffix = sqlSuffix.substring(0,sqlSuffix.length() - 4);
		}
		
		List<T> res = DbUtil.queryForList((Class<T>)po.getClass(),sqlPrefix + sqlSuffix, params);
		
		if(null == res || res.size() == 0){
			return null;
		}
		
		return res.get(0);
	}

	@Override
	public <T extends IPo> T findSingle(T po, String... field) {
		
		return findSingle(po, ObjectUtil.arrayToSet(field));
	}

	@Override
	public <T extends IPo> List<T> findMulti(T po) {
		
		return findMulti(po,ClassUtil.getFieldNameSet(po.getClass()));
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends IPo> List<T> findMulti(T po, Set<String> filterField) {
		if(filterField.size() == 0){
			return findAll();
		}
		
		String sqlPrefix = "select * from [" + tbName + "] where ";
		StringBuffer sbSuffix = new StringBuffer();
		String sqlSuffix = "";
		Map<String,Object> params = new HashMap<>();
		
		for(String item : filterField){
			sbSuffix.append(item + " = :" + item + " and ");
			params.put(item, ClassUtil.getFieldValue(po,item));
		}
		
		sqlSuffix = sbSuffix.toString();
		
		if(sqlSuffix.endsWith("and ")){
			sqlSuffix = sqlSuffix.substring(0,sqlSuffix.length() - 4);
		}
		
		List<T> res = DbUtil.queryForList((Class<T>)po.getClass(),sqlPrefix + sqlSuffix, params);
		
		return res;
	}

	@Override
	public <T extends IPo> List<T> findMulti(T po, String... field) {
		
		return findMulti(po, ObjectUtil.arrayToSet(field));
	}

	@Override
	public int delete(IPo po) {

		return deleteById((String)ClassUtil.getFieldValue(po,"id"));
	}

	@Override
	public int deleteById(String id) {

		return DbUtil.update("delete [" + tbName + "] where id = ?",id);
	}

	@Override
	public int delete(IPo po, Set<String> filterField) {
		if(filterField.size() == 0){
			return delete(po);
		}
		
		String sqlPrefix = "delete [" + tbName + "] where ";
		StringBuffer sbSuffix = new StringBuffer();
		String sqlSuffix = "";
		Map<String,Object> params = new HashMap<>();
		
		for(String item : filterField){
			sbSuffix.append(item + " = :" + item + " and ");
			params.put(item, ClassUtil.getFieldValue(po,item));
		}
		
		sqlSuffix = sbSuffix.toString();
		
		if(sqlSuffix.endsWith("and ")){
			sqlSuffix = sqlSuffix.substring(0,sqlSuffix.length() - 4);
		}
		
		return DbUtil.update(sqlPrefix + sqlSuffix , params);
	}

	@Override
	public int delete(IPo po, String... field) {
		
		return delete(po, ObjectUtil.arrayToSet(field));
	}

	@Override
	public int deleteAll() {

		return  DbUtil.update("delete [" + tbName + "]");
	}

	@Override
	public int delete(String id) {

		return deleteById(id);
	}

	@Override
	public int update(IPo po) {

		return update(po,ClassUtil.getFieldNameSet(po.getClass()));
	}

	@Override
	public int update(IPo po, Set<String> filterField) {

		if(null == filterField || filterField.size() == 0){
			return update(po);
		}
		
		String sqlPrefix = "update [" + tbName + "] set ";
		StringBuffer sbSuffix = new StringBuffer();
		String sqlSuffix = "";
		Map<String,Object> params = new HashMap<>();
		
		for(String item : filterField){
			if(!item.equals("id")){
				sbSuffix.append(item + " = :" + item + " , ");
				params.put(item, ClassUtil.getFieldValue(po,item));
			}
		}
		
		sqlSuffix = sbSuffix.toString();
		
		if(sqlSuffix.endsWith(", ")){
			sqlSuffix = sqlSuffix.substring(0,sqlSuffix.length() - 2);
		}
		
		sqlSuffix += " where id = :id";
		params.put("id",ClassUtil.getFieldValue(po,"id"));
		
		return DbUtil.update(sqlPrefix + sqlSuffix, params);
	}

	@Override
	public int update(IPo po, String... field) {

		return update(po, ObjectUtil.arrayToSet(field));
	}

	@Override
	public <T extends IPo> T create(T po) {

		return create(po,ClassUtil.getFieldNameSet(po.getClass()));
	}

	@Override
	public <T extends IPo> T create(T po, Set<String> filterField) {
		if(null == filterField || filterField.size() == 0){
			return create(po);
		}
		
		String id = StringUtil.getRandomUuidString();
		String sqlPrefix = "insert into [" + tbName + "] values( id = :id , ";
		StringBuffer sbSuffix = new StringBuffer();
		String sqlSuffix = "";
		Map<String,Object> params = new HashMap<>();
		
		params.put("id",id);
		for(String item : filterField){
			if(!item.equals("id")){
				sbSuffix.append(item + " = :" + item + " , ");
				params.put(item, ClassUtil.getFieldValue(po,item));	
			}
		}
		
		sqlSuffix = sbSuffix.toString();
		
		if(sqlSuffix.endsWith(", ")){
			sqlSuffix = sqlSuffix.substring(0,sqlSuffix.length() - 2);
		}
		
		sqlSuffix += ")";
		
		int count = DbUtil.update(sqlPrefix + sqlSuffix, params);
		
		if(1 == count){
			return findById(id);
		}
		
		return null;
	}

	@Override
	public <T extends IPo> T create(T po, String... field) {

		return create(po, ObjectUtil.arrayToSet(field));
	}
	
}
