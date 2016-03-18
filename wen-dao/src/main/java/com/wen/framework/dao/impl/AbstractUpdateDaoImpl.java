package com.wen.framework.dao.impl;

import java.util.List;
import java.util.Set;

import com.wen.framework.commons.model.IPo;
import com.wen.framework.dao.IUpdatable;

public abstract class AbstractUpdateDaoImpl implements IUpdatable{

	@Override
	public <T extends IPo> List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends IPo> T find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends IPo> T findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends IPo> T findSingle(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends IPo> T findSingle(T po) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends IPo> T findSingle(T po, Set<String> filterField) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends IPo> T findSingle(T po, String... field) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends IPo> List<T> findMulti(T po) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends IPo> List<T> findMulti(T po, Set<String> filterField) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends IPo> List<T> findMulti(T po, String... field) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteById(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(IPo po) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(IPo po, Set<String> filterField) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(IPo po, String... field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(IPo po) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(IPo po, Set<String> filterField) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(IPo po, String... field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <T extends IPo> T create(T po) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends IPo> T create(T po, Set<String> filterField) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends IPo> T create(T po, String... field) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
