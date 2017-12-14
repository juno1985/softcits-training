package servletdemo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextAttrListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		sce.getServletContext().setAttribute("website", "www.softcits.cn");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		sce.getServletContext().removeAttribute("website");
	}

}
