package com.wen.framework.db;

import java.beans.PropertyVetoException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import com.mchange.v2.c3p0.ComboPooledDataSource;



public class DataSource implements javax.sql.DataSource{

	private static DataSource dataSource = null;
	private static ComboPooledDataSource cpds = new ComboPooledDataSource(true);
	
	public static synchronized DataSource getInstance(){
		if(null == dataSource){
			dataSource = new DataSource();
		}
		
		return dataSource;
	}
	
	private DataSource(){
		ConfigManager configManager = ConfigManager.getInstance();
		
		cpds.setDataSourceName("mydatasource");
	    cpds.setJdbcUrl(configManager.getJdbcUrl());
	    	    
	    try {
	      cpds.setDriverClass(configManager.getJdbcDriverClass());
	    } catch (PropertyVetoException e) {
	      e.printStackTrace();
	    }
	    
	    cpds.setUser(configManager.getJdbcUserName());
	    cpds.setPassword(configManager.getJdbcPassword());
	    cpds.setMaxPoolSize(configManager.getJdbcMaxPoolSize());
	    cpds.setMinPoolSize(configManager.getJdbcMinPoolSize());
	    cpds.setInitialPoolSize(configManager.getJdbcInitPoolSize());
	    cpds.setMaxIdleTime(configManager.getJdbcMaxIdleTime());
	}
	
	@Override
	public PrintWriter getLogWriter() throws SQLException {

		return null;
	}

	@Override
	public int getLoginTimeout() throws SQLException {

		return 0;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {

		return null;
	}

	@Override
	public void setLogWriter(PrintWriter arg0) throws SQLException {
		
	}

	@Override
	public void setLoginTimeout(int arg0) throws SQLException {
		
	}

	@Override
	public boolean isWrapperFor(Class<?> arg0) throws SQLException {
		return false;
	}

	@Override
	public <T> T unwrap(Class<T> arg0) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connection getConnection() throws SQLException {
		try {
			return cpds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Connection getConnection(String username, String password)throws SQLException {
		return null;
	}

}
