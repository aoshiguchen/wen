package com.wen.framework.dao.impl;

import java.util.List;
import java.util.Map;

import com.wen.framework.commons.model.IPo;
import com.wen.framework.dao.util.DbUtil;
import com.wen.framework.util.ClassUtil;

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
	public int delete(IPo po) {

		return deleteById((String)ClassUtil.getFieldValue(po,"id"));
	}

	@Override
	public int deleteById(String id) {

		return DbUtil.update("delete [" + tbName + "] where id = ?",id);
	}

	
	

}
