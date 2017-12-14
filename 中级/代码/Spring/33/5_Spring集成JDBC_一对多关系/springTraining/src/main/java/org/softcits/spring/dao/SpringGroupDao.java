package org.softcits.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.softcits.spring.model.Group;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
@Repository("springGroupDao")
public class SpringGroupDao implements ISpringDao<Group>{

	private JdbcTemplate jdbcTemplate;

	@Inject
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void insert(Group g) {
		try{
			this.jdbcTemplate.update("insert into t_group(id, grpname) value(?,?)",
				g.getId(),g.getGrpname());}
		catch(DataAccessException dae){
			System.out.println("该组已经存在,不可以重复添加!");
		}
		
	}

	@Override
	public void delete(int id) {
		jdbcTemplate.update("delete from t_group where id = ?", id);
	}

	@Override
	public void modify(Group g) {
		jdbcTemplate.update("UPDATE t_group SET grpname=? WHERE id = ?", 
				g.getGrpname(),g.getId());
		
	}

	@Override
	public Group load(int id) {
		Group gg = null;
		try{ gg = jdbcTemplate.queryForObject("select * from t_group where id = ?",
				new Object[]{id}, new GroupRowMapper());}
		catch(DataAccessException dae)
		{
			//该组不存在于数据库中
			return null;
		}
		return gg;
		
	}
	
	private class GroupRowMapper implements RowMapper<Group>{

		@Override
		public Group mapRow(ResultSet rs, int rowNum) throws SQLException {
			if(!rs.next()) return null;
			Group g = new Group();
			g.setId(rs.getInt("id"));
			g.setGrpname(rs.getString("grpname"));
			
			return g;
		}
		
	}
}
