package org.softcits.dao;

import org.softcits.model.User;

public interface UserMapperPlus {
	public User getUserByName(String name);
	
	public User getUserAndGroup(String username);
}
