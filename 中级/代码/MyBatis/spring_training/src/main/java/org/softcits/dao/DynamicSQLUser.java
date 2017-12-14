package org.softcits.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.softcits.model.User;

public interface DynamicSQLUser {
	public List<User> getUsersByIf(User user);
	
	public Long updateUser(User user);
	//foreach遍历集合
	public List<User> getEmpsByForeach(Map ids);
	
	//batch insert
	public Long addBatchUsers(@Param("users")List<User> uList);
	
}