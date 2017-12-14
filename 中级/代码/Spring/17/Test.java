package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		System.out.println(ctx.getBean("inst1")==ctx.getBean("inst1"));
		System.out.println(ctx.getBean("inst2")==ctx.getBean("inst2"));
		System.out.println(ctx.getBean("date"));
		Thread.sleep(1000);
		System.out.println(ctx.getBean("date"));
	}

}
