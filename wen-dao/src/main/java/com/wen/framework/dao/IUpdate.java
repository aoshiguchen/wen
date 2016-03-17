package com.wen.framework.dao;

import java.util.Set;

import com.wen.framework.commons.model.IPo;

public interface IUpdate{
	public boolean update(IPo po);
	public boolean update(IPo po,Set<String> filterField);
}
