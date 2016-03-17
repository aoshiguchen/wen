package com.wen.framework.dao;

import java.util.Set;

import com.wen.framework.jdbctemplate.model.IPo;

public interface ICreate{
	public IPo create(IPo po);
	public IPo create(IPo po,Set<String> filterField);
}
