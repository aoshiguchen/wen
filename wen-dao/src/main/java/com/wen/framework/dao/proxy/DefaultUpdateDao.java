package com.wen.framework.dao.proxy;

import com.wen.framework.dao.IUpdatable;
import com.wen.framework.dao.impl.DefaultUpdateDaoImpl;
import com.wen.framework.jdbctemplate.model.IPo;

public class DefaultUpdateDao extends AbstractUpdateDao{

	public DefaultUpdateDao(IUpdatable impl) {
		super(impl);
	}
	
	public DefaultUpdateDao(Class<? extends IPo> entityClass) {
		super(new DefaultUpdateDaoImpl(entityClass));
	}
	
	public DefaultUpdateDao(Class<? extends IPo> entityClass,String tbName) {
		super(new DefaultUpdateDaoImpl(entityClass, tbName));
	}
}
