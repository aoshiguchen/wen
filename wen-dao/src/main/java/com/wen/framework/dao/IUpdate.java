package com.wen.framework.dao;

import java.util.Set;

import com.wen.framework.commons.model.IPo;

public interface IUpdate{
	public int update(IPo po);
	public int update(IPo po,Set<String> filterField);
	public int update(IPo po,String ...field);
}
