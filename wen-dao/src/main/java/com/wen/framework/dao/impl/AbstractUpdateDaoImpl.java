package com.wen.framework.dao.impl;

import java.util.List;
import java.util.Set;

import com.wen.framework.commons.model.IPo;
import com.wen.framework.dao.IUpdatable;

public abstract class AbstractUpdateDaoImpl implements IUpdatable{

	@Override
	public <T extends IPo> List<T> findAll() {
		
		return null;
	}

	@Override
	public <T extends IPo> T findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IPo> findMulti(IPo po) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IPo> findMulti(IPo po, Set<String> filterField) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPo findSingle(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPo findSingle(IPo po) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPo findSingle(IPo po, Set<String> filterField) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPo create(IPo po) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPo create(IPo po, Set<String> filterField) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(IPo po) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(IPo po, Set<String> filterField) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int delete(IPo po) {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public int delete(IPo po, Set<String> filterField) {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public int deleteById(String id) {
		// TODO Auto-generated method stub
		return -1;
	}
}
