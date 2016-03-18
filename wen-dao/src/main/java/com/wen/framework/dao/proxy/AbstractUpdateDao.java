package com.wen.framework.dao.proxy;

import java.util.List;
import java.util.Set;

import com.wen.framework.commons.model.IPo;
import com.wen.framework.dao.IUpdatable;

public abstract class AbstractUpdateDao implements IUpdatable{
	
	protected IUpdatable impl;
	
	public AbstractUpdateDao(IUpdatable impl){
		this.impl = impl;
	}

	@Override
	public int deleteById(String id) {
		// TODO Auto-generated method stub
		return impl.deleteById(id);
	}

	@Override
	public int delete(IPo po) {
		// TODO Auto-generated method stub
		return impl.delete(po);
	}

	@Override
	public int delete(IPo po, Set<String> filterField) {
		// TODO Auto-generated method stub
		return impl.delete(po, filterField);
	}

	@Override
	public int delete(IPo po, String... field) {
		// TODO Auto-generated method stub
		return impl.delete(po, field);
	}

	@Override
	public <T extends IPo> List<T> findAll() {
		// TODO Auto-generated method stub
		return impl.findAll();
	}

	@Override
	public <T extends IPo> T find(String id) {
		// TODO Auto-generated method stub
		return impl.find(id);
	}

	@Override
	public <T extends IPo> T findById(String id) {
		// TODO Auto-generated method stub
		return impl.findById(id);
	}

	@Override
	public <T extends IPo> T findSingle(String id) {
		// TODO Auto-generated method stub
		return impl.findSingle(id);
	}

	@Override
	public <T extends IPo> T findSingle(T po) {
		// TODO Auto-generated method stub
		return impl.findSingle(po);
	}

	@Override
	public <T extends IPo> T findSingle(T po, Set<String> filterField) {
		// TODO Auto-generated method stub
		return impl.findSingle(po, filterField);
	}

	@Override
	public <T extends IPo> T findSingle(T po, String... field) {
		// TODO Auto-generated method stub
		return impl.findSingle(po, field);
	}

	@Override
	public <T extends IPo> List<T> findMulti(T po) {
		// TODO Auto-generated method stub
		return impl.findMulti(po);
	}

	@Override
	public <T extends IPo> List<T> findMulti(T po, Set<String> filterField) {
		// TODO Auto-generated method stub
		return impl.findMulti(po, filterField);
	}

	@Override
	public <T extends IPo> List<T> findMulti(T po, String... field) {
		// TODO Auto-generated method stub
		return impl.findMulti(po, field);
	}

	@Override
	public <T extends IPo> T create(T po) {
		// TODO Auto-generated method stub
		return impl.create(po);
	}

	@Override
	public <T extends IPo> T create(T po, Set<String> filterField) {
		// TODO Auto-generated method stub
		return impl.create(po, filterField);
	}

	@Override
	public <T extends IPo> T create(T po, String... field) {
		// TODO Auto-generated method stub
		return impl.create(po, field);
	}

	@Override
	public int update(IPo po) {
		// TODO Auto-generated method stub
		return impl.update(po);
	}

	@Override
	public int update(IPo po, Set<String> filterField) {
		// TODO Auto-generated method stub
		return impl.update(po, filterField);
	}

	@Override
	public int update(IPo po, String... field) {
		// TODO Auto-generated method stub
		return impl.update(po, field);
	}

	@Override
	public int deleteAll() {
		// TODO Auto-generated method stub
		return impl.deleteAll();
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return impl.delete(id);
	}

	
}
