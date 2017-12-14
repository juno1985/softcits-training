package servletdemo;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class SerContextAttrListener implements ServletContextAttributeListener {

	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		ServletContext app = event.getServletContext();
		//get application scope attribute name
		String name = event.getName();
		//get attribute value
		Object value = event.getValue();
		System.out.println(app + "范围内添加了" + name + ' ' + value + " 的属性");
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {
		ServletContext app = event.getServletContext();
		//get application scope attribute name
		String name = event.getName();
		//get attribute value
		Object value = event.getValue();
		System.out.println(app + "范围内删除了" + name + ' ' + value + " 的属性");

	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent event) {
		ServletContext app = event.getServletContext();
		//get application scope attribute name
		String name = event.getName();
		//get attribute value
		Object value = event.getValue();
		System.out.println(app + "范围内替换了" + name + ' ' + value + " 的属性");
	}

}
