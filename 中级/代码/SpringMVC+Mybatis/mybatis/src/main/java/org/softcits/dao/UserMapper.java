package org.softcits.dao;

import java.util.List;

import org.softcits.model.User;

public interface UserMapper {
	
	public User getUserByUsername(User user);
	
	public User getUserByName(String name);
	
	/**
	 * 
	 * <B>方法名称：</B><BR>
	 * <B>概要说明：</B><BR>
	 * @param user
	 * @return 布尔类型：表明成功还是失败
	 */
	public Boolean addUser(User user);
	
	/**
	 * 
	 * <B>方法名称：</B><BR>
	 * <B>概要说明：</B><BR>
	 * @param name Long/Integer:表明影响的行数
	 */
	public Long deleteUser(String name);
	
	/**
	 * 
	 * <B>方法名称：</B><BR>
	 * <B>概要说明：</B><BR>
	 * @return 返回多个User对象
	 */
	
	public List<User> getAllUsers();
	
	
	public void updateUser(User user);
	
	//查询多条记录
	public List<User> getMutiUsers(List<Integer> ids);
	
}
