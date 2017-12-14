package service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import dao.IUserDao;
import model.User;

//@Component("userService")
@Service("userService")//业务层一般使用@Service
public class UserService implements IUserService {
	private IUserDao userDao;
	
	public IUserDao getUserDao() {
		return userDao;
	}
	
	@Resource(name="userDynamicDao")
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
	}

	@Override
	public void delete(int id) {
		userDao.delete(id);
	}

	@Override
	public User load(int id) {
		return userDao.load(id);
	}

}
