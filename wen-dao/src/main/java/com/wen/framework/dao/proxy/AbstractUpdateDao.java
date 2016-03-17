package com.wen.framework.dao.proxy;

import java.util.List;
import java.util.Set;

import com.wen.framework.dao.IUpdatable;
import com.wen.framework.jdbctemplate.model.IPo;

public abstract class AbstractUpdateDao implements IUpdatable{
	
	protected IUpdatable impl;
	
	public AbstractUpdateDao(IUpdatable impl){
		this.impl = impl;
	}

	@Override
	public boolean update(IPo po, Set<String> filterField) {
		
		return this.impl.update(po, filterField);
	}

	@Override
	public boolean update(IPo po) {
		
		return this.impl.update(po);
	}

	@Override
	public IPo create(IPo po, Set<String> filterField) {
		
		return this.impl.create(po, filterField);
	}

	@Override
	public IPo create(IPo po) {
		
		return this.impl.create(po);
	}

	@Override
	public <T extends IPo> List<T> findAll() {
		
		return this.impl.findAll();
	}

	@Override
	public <T extends IPo> T findById(String id) {
		
		return this.impl.findById(id);
	}

	@Override
	public List<IPo> findMulti(IPo po, Set<String> filterField) {
		
		return this.impl.findMulti(po, filterField);
	}

	@Override
	public List<IPo> findMulti(IPo po) {
		
		return this.impl.findMulti(po);
	}

	@Override
	public IPo findSingle(IPo po, Set<String> filterField) {
		
		return this.impl.findSingle(po, filterField);
	}

	@Override
	public IPo findSingle(IPo po) {
		
		return this.impl.findSingle(po);
	}

	@Override
	public IPo findSingle(String id) {
		
		return this.impl.findSingle(id);
	}

	@Override
	public int delete(IPo po, Set<String> filterField) {
		
		return this.impl.delete(po, filterField);
	}

	@Override
	public int delete(IPo po) {
		
		return this.impl.delete(po);
	}

	@Override
	public int deleteById(String id) {
		
		return this.impl.deleteById(id);
	}
}
