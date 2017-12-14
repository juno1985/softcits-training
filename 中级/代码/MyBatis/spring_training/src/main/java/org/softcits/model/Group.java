package org.softcits.model;

import java.util.List;

public class Group {
	
	private int id;
	private String groupName;
	private List<User> users;
	
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Group() {
		super();
	}
	public Group(int id, String groupName) {
		super();
		this.id = id;
		this.groupName = groupName;
	}
	@Override
	public String toString() {
		return "Group [id=" + id + ", groupName=" + groupName + ", users=" + users + "]";
	}
	
	
}
