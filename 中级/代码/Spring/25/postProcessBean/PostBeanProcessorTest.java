package postProcessBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostBeanProcessorTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		InstanceValidator iv = (InstanceValidator) ctx.getBean("fixDao");
		
	}

}
