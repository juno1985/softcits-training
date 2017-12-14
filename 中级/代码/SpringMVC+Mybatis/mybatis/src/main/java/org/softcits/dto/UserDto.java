package org.softcits.dto;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class UserDto {
	private int id;
	private String username;
	private String password;
	private String phone;
	private String piclink;
	private int gid;
	public UserDto() {
		super();
	}
	public UserDto(int id, String username, String password, String phone, String piclink, int gid) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.piclink = piclink;
		this.gid = gid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@NotEmpty(message="用户名不能为空")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@NotEmpty(message="电话不能为空")
	@Length(min=4, max=11, message="长度必须为4~11位")
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPiclink() {
		return piclink;
	}
	public void setPiclink(String piclink) {
		this.piclink = piclink;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	
	
}
