package dao;

import model.LogInfo;
import model.User;

public interface IUserDao {
	@LogInfo("添加用户信息")
	public void add(User user);
	@LogInfo("删除用户信息")
	public void delete(int id);
	public User load(int id);
}
