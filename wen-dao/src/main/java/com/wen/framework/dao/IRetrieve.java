package com.wen.framework.dao;

import java.util.List;
import java.util.Set;

import com.wen.framework.commons.model.IPo;

public interface IRetrieve{
	public <T extends IPo> List<T> findAll();
	public <T extends IPo> T findById(String id);
	public IPo findSingle(String id);
	public IPo findSingle(IPo po);
	public IPo findSingle(IPo po,Set<String> filterField);
	public List<IPo> findMulti(IPo po);
	public List<IPo> findMulti(IPo po,Set<String> filterField);
}
