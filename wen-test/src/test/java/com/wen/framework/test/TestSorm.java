package com.wen.framework.test;

import org.junit.Test;

import com.wen.framework.dao.IRetrieve;
import com.wen.framework.dao.IUpdatable;
import com.wen.framework.sorm.MappingManager;
import com.wen.framework.sorm.TableDaoMapping;

public class TestSorm {

	@Test
	public void test1() throws ClassNotFoundException{
		TableDaoMapping tableDaoMapping = MappingManager.loadDbm();
		
		System.out.println(tableDaoMapping);
	}
	
	@Test
	public void test2() throws ClassNotFoundException{
		TableDaoMapping tableDaoMapping = MappingManager.loadDbm();
		
		IUpdatable userDao = tableDaoMapping.get("user");
		IUpdatable deptDao = tableDaoMapping.get("dept");
		
		System.out.println(userDao);
		System.out.println(deptDao);
		
		System.out.println(userDao.findAll());
		
		System.out.println(deptDao.findAll());

	}
	
}
