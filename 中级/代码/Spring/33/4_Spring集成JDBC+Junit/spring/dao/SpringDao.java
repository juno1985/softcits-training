package org.softcits.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.softcits.spring.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
//在DAO层,Spring不推荐使用Component
//@Component("springDao")
//而是使用Repository
@Repository("springDao")
public class SpringDao {
	private JdbcTemplate jdbcTemplate;

	@Inject
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	//增加用户
	public void insert(User u){
		jdbcTemplate.update("INSERT INTO t_user (id, username, passwd) VALUES(?,?,?)", 
				u.getId(),u.getUsername(),u.getPasswd());
	}
	//删除用户
	public void delete(int id){
		jdbcTemplate.update("delete from t_user where id = ?", id);
	}
	//更改用户
	public void modify(User u){
		jdbcTemplate.update("UPDATE t_user SET username=?, passwd =? WHERE id = ?", 
				u.getUsername(), u.getPasswd(), u.getId());
		
	}
	//查找用户
	public User load(int id){
		/**
		 * 第一个参数: SQL语句
		 * 第二个参数: 占位符传参
		 * 第三个参数: RowMapper<T>接口的实现类,本例中使用匿名类的方式
		 * 
		 */
		return jdbcTemplate.queryForObject("select * from t_user where id = ?", 
				new Object[]{id}, new RowMapper<User>(){

					@Override
					public User mapRow(ResultSet rs, int rowNum) throws SQLException {
						User u = new User();
						u.setId(rs.getInt("id"));
						u.setUsername(rs.getString("username"));
						u.setPasswd(rs.getString("passwd"));
						
						return u;
					}
			
		});
	}

	/*private class UserRowMapper implements RowMapper<User>{

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User u = new User();
			u.setId(rs.getInt("id"));
			u.setUsername(rs.getString("username"));
			u.setPasswd(rs.getString("passwd"));
			
			return u;
		}
		
	}*/
}
