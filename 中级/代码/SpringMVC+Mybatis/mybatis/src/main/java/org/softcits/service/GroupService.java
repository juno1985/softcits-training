package org.softcits.service;

import java.util.List;

import org.softcits.dao.GroupMapper;
import org.softcits.model.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService {
	@Autowired
	private GroupMapper groupMapper;
	
	public GroupMapper getGroupMapper() {
		return groupMapper;
	}

	public void setGroupMapper(GroupMapper groupMapper) {
		this.groupMapper = groupMapper;
	}

	public List<Group> getAllGroups(){
		return groupMapper.getAllGroups();
	}
	
	public Group getGroupById(int id){
		return groupMapper.getGroupById(id);
	}
	
}
