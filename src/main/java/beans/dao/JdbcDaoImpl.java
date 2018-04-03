package beans.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import beans.CircleDO;

@Component
public class JdbcDaoImpl 
{
	
	private DataSource ds;
	

	private JdbcTemplate jdbcTemplate= new JdbcTemplate();
	
	public CircleDO getCircle(int id) 
	{
		return null;
	}
	
	public Integer getCircleCount() 
	{
		String query="Select count(*) from circle";
		return jdbcTemplate.queryForObject(query, Integer.class);
	}

	public DataSource getDs() {
		return ds;
	}

	@Autowired
	public void setDs(DataSource ds) {
		this.jdbcTemplate.setDataSource(ds);
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
