package dao;

import model.User;

public interface IUserDao {
	public void add(User user);
	public void delete(int id);
	public User load(int id);
}
