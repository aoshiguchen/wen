package com.wen.framework.dao;

import java.util.Set;

import com.wen.framework.commons.model.IPo;

public interface IDelete{
	public int deleteById(String id);
	public int delete(IPo po);
	public int delete(String id);
	public int delete(IPo po,Set<String> filterField);
	public int delete(IPo po,String ...field);
	public int deleteAll();
}
