package test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import action.UserAction;
import model.User;

public class TestSpring {
	//创建Spring的工厂
	private BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
	
	@Test
	public void testUser01() {
		UserAction ua1 = factory.getBean("userAction", UserAction.class);
		User u = new User(1,"悟空");
		ua1.setUser(u);
		ua1.add();
		ua1.delete();
		ua1.load();

	}
}
