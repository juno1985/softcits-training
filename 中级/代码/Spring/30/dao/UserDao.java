package dao;

import org.springframework.stereotype.Repository;
import model.User;

//等于完成了<bean id="userDao" class="spring.UserDao"/>
//@Component("userDao")//公共的创建bean的Annotation
@Repository("userDao")//@Repository一般用于DAO的注入
public class UserDao implements IUserDao {

	@Override
	public void add(User user) {
		System.out.println("添加了"+user);
	}

	@Override
	public void delete(int id) {
		System.out.println("delete :"+id);
	}

	@Override
	public User load(int id) {
		System.out.println("load:"+id);
		return null;
	}

}
