package dao;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import model.User;
import proxy.Logger;

@Component("userProxyDao")
public class UserProxyDao implements IUserDao {
	private IUserDao userDao;
	

	public IUserDao getUserDao() {
		return userDao;
	}
	
	
	@Resource
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		Logger.info("添加了用户");
		userDao.add(user);
	}

	@Override
	public void delete(int id) {
		Logger.info("删除了用户");
		userDao.delete(id);
	}

	@Override
	public User load(int id) {
		return userDao.load(id);
	}

}
