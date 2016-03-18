package com.wen.framework.dao;

import java.util.Set;

import com.wen.framework.commons.model.IPo;

public interface ICreate{
	public <T extends IPo> T create(T po);
	public <T extends IPo> T create(T po,Set<String> filterField);
	public <T extends IPo> T create(T po,String ...field);
}
