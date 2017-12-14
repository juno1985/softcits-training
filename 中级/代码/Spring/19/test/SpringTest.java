package spring.test;

import org.springframework.context.*;
import org.springframework.context.support.*;

import app.service.*;

public class SpringTest
{
	public static void main(String[] args)
	{
		// 以类加载路径下的配置文件创建ClassPathResource实例
		ApplicationContext ctx = new
			ClassPathXmlApplicationContext("beans.xml");
		Being b1 = ctx.getBean("dog" , Being.class);
		b1.testBeing();
		Being b2 = ctx.getBean("cat" , Being.class);
		b2.testBeing();
	}
}