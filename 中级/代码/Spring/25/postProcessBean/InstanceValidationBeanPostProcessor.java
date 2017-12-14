package postProcessBean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InstanceValidationBeanPostProcessor implements BeanPostProcessor {

	/**
	 * 目标Bean实例化前调用
	 * bean -- 目标Bean
	 * beanName -- 目标Bean的配置id
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization 被调用");
		return bean;
	}

	/**
	 * 目标Bean实例化后调用
	 * bean -- 目标Bean
	 * beanName -- 目标Bean的配置id
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		//判断如果目标Bean是InstanceValidator接口的实例
		if(bean instanceof InstanceValidator)
		{
			((InstanceValidator)bean).validateInstance();
		}
		return bean;
	}

}
