package org.softcits.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.softcits.model.User;

public interface UserMapper {
	public User getUserByUsername(String username);
	
	public Long addUser(User user);
	public Integer updateUser(User user);
	public Boolean deleteUser(String username);
	
	//多个参数传值
	public User getUserByUsernameAndId(@Param(value="username")String username, @Param(value="id")int id);
	
	//返回集合
	public List<User> getAllUsers();
	
	
	public Long getUserNum();
}
