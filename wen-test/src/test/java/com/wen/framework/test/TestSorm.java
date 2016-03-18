package com.wen.framework.test;

import java.util.List;

import org.junit.Test;

import com.wen.framework.dao.IRetrieve;
import com.wen.framework.dao.IUpdatable;
import com.wen.framework.sorm.MappingManager;
import com.wen.framework.sorm.TableDaoMapping;
import com.wen.framework.test.model.User;

public class TestSorm {

//	@Test
//	public void test1() throws ClassNotFoundException{
//		TableDaoMapping tableDaoMapping = MappingManager.loadDbm();
//		
//		System.out.println(tableDaoMapping);
//	}
//	
//	@Test
//	public void test2() throws ClassNotFoundException{
//		TableDaoMapping tableDaoMapping = MappingManager.loadDbm();
//		
//		IUpdatable userDao = tableDaoMapping.get("user");
//		IUpdatable deptDao = tableDaoMapping.get("dept");
//		
//		System.out.println(userDao);
//		System.out.println(deptDao);
//				
//		System.out.println(userDao.findAll());
//		
//		System.out.println(deptDao.findAll());
//
//	}
//	
//	@Test
//	public void test3() throws ClassNotFoundException{
//		TableDaoMapping tableDaoMapping = MappingManager.loadDbm();
//		
//		IUpdatable userDao = tableDaoMapping.get("user");
//		IUpdatable deptDao = tableDaoMapping.get("dept");
//		
//		System.out.println((User)userDao.find("e7b8d47e-b0b0-469a-b967-5549b067766b"));
//		
//		User user = new User();
//		user.setLoginname("admin");
//		System.out.println(userDao.findMulti(user,"loginname"));
//		System.out.println(userDao.findSingle(user,"loginname"));
//	}
	
}
