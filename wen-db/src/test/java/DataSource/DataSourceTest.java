package DataSource;

import java.sql.SQLException;

import org.junit.Test;

import com.wen.framework.db.DataSource;

public class DataSourceTest {

	@Test
	public void testConnection() throws SQLException{
		System.out.println(DataSource.getInstance().getConnection());
	}

}
