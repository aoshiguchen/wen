package com.wen.framework.dao;

import java.util.Set;

import com.wen.framework.jdbctemplate.model.IPo;


public interface IDelete{
	public int deleteById(String id);
	public int delete(IPo po);
	public int delete(IPo po,Set<String> filterField);
}
