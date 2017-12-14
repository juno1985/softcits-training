package org.softcits.model;

public class Group {
	
	private int id;
	private String groupname;
	public Group() {
		super();
	}
	public Group(int id, String groupname) {
		super();
		this.id = id;
		this.groupname = groupname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	
	

}
