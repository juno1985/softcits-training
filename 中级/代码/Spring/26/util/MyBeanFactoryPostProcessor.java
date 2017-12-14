package util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor
	implements BeanFactoryPostProcessor
{
	/**
	 * 重写该方法，对Spring进行后处理。
	 * @param beanFactory Spring容器本身
	 */
	public void postProcessBeanFactory(
		ConfigurableListableBeanFactory beanFactory)
		throws BeansException
	{
		System.out.println("程序对Spring所做的BeanFactory的初始化没有改变...");
		System.out.println("Spring容器是：" + beanFactory);
	}
}
