package beans.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import beans.CircleDO;

@Component
public class JdbcDaoImpl 
{
	@Autowired
	private DataSource ds;
	
	public CircleDO getCircle(int id) 
	{
		return null;
	}

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}
}
