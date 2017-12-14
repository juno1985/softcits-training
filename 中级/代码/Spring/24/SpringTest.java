package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		//创建Spring容器,从类加载路径下搜索beans.xml
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		Person p = ctx.getBean("person", Person.class);
		p.eatBread();
		
	}

}
