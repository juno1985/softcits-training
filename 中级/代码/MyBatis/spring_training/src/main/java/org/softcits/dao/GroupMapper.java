package org.softcits.dao;

import org.softcits.model.Group;

public interface GroupMapper {
	public Group getUsersByGroup(Integer id);
	
	public Group getGroup(Integer id);
}
