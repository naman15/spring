package beans.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;
import org.springframework.jdbc.core.RowMapper;

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
		String query="Select * from circle where id=?";
		return jdbcTemplate.queryForObject(query,new Object[] {1},new CircleMapper());
		
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
	
	private static final class CircleMapper implements RowMapper<CircleDO>
	{

		public CircleDO mapRow(ResultSet rs, int rowNum) throws SQLException 
		{
			return new CircleDO(rs.getInt("ID"), rs.getString("Name"));
		}
		
	}
}
