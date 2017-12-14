package org.softcits.dao;

import java.util.List;

import org.softcits.model.Group;

public interface GroupMapper {
	public List<Group> getAllGroups();
	
	public Group getGroupById(int id);
}
