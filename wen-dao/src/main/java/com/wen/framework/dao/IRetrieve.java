package com.wen.framework.dao;

import java.util.List;
import java.util.Set;

import com.wen.framework.commons.model.IPo;

public interface IRetrieve{
	public <T extends IPo> List<T> findAll();
	public <T extends IPo> T find(String id);
	public <T extends IPo> T findById(String id);
	public <T extends IPo> T findSingle(String id);
	public <T extends IPo> T findSingle(T po);
	public <T extends IPo> T findSingle(T po,Set<String> filterField);
	public <T extends IPo> T findSingle(T po,String ...field);
	public <T extends IPo> List<T> findMulti(T po);
	public <T extends IPo> List<T> findMulti(T po,Set<String> filterField);
	public <T extends IPo> List<T> findMulti(T po,String ...field);
}
