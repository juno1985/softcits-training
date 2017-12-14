package org.softcits.model;


import javax.validation.constraints.Max;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class User {
	
	private Integer id;
	private String username;
	private String password;
	private String phone;
	
	private Group group;
	
	public User() {
		super();
	}

	public User(Integer id, String username, String password, String phone, Group group) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.group = group;
	}

	@Max(value = 100, message="员工号必须小于100")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", phone=" + phone + ", group="
				+ group + "]";
	}

	
	

}
