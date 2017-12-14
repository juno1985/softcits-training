package org.softcits.service;

import java.util.List;

import org.softcits.dao.UserMapper;
import org.softcits.model.User;
import org.softcits.model.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;

	public List<User> getAllUsers(){
		return userMapper.getAllUsers();
	}
	
	public Boolean addUser(User user){
		return userMapper.addUser(user);
	}
	
	public Long deleteUser(String name){
		User u = userMapper.getUserByName(name);
		if(u == null)throw new UserException("用户不存在!");
		return userMapper.deleteUser(name);
	}
	
	public User getUserByName(String name){
		return userMapper.getUserByName(name);
	}
}
