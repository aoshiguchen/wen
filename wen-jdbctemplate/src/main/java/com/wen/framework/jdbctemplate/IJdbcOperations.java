package com.wen.framework.jdbctemplate;

import java.sql.Connection;
import java.util.List;
import com.wen.framework.commons.model.IPo;

public interface IJdbcOperations {

	public <T> T execute(IJdbcCallback<T> callback);
	public int executeUpdate(final Connection conn ,final String sql,final Object[] params);
	public <T extends IPo> T executeQeury(final Connection conn,final Class<T> clazz,final String sql,final Object[] params);
	public <T extends IPo> List<T> executeQeuryForList(final Connection conn,final Class<T> clazz,final String sql,final Object[] params);

}
