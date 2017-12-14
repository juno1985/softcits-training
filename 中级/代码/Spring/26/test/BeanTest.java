package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.Person;

public class BeanTest
{
	public static void main(String[] args)
	{
		// 以ApplicationContex作为Spring容器
		// 它会自动注册容器后处理器、Bean后处理器
		ApplicationContext ctx = new
			ClassPathXmlApplicationContext("beans.xml");
		Person p = (Person)ctx.getBean("chinese");
		p.useAxe();
	}
}