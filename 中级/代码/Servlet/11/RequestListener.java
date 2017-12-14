package servletdemo;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
@WebListener
public class RequestListener implements ServletRequestListener, ServletRequestAttributeListener {

	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		ServletRequest req = srae.getServletRequest();
		String name = srae.getName();
		Object value = srae.getValue();
		System.out.println(req + " 范围内添加了 "+name + ' '+value +" 的属性");
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		ServletRequest req = srae.getServletRequest();
		String name = srae.getName();
		Object value = srae.getValue();
		System.out.println(req + " 范围内上删除了 "+name + ' '+value +" 的属性");
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		ServletRequest req = srae.getServletRequest();
		String name = srae.getName();
		Object value = srae.getValue();
		System.out.println(req + " 范围内替换了 "+name + ' '+value +" 的属性");
	}

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		HttpServletRequest req = (HttpServletRequest) sre.getServletRequest();
		System.out.println("===发向" + req.getRequestURI() + "的请求被销毁===");
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		HttpServletRequest req = (HttpServletRequest) sre.getServletRequest();
		System.out.println("===发向" + req.getRequestURI() + "的请求被初始化===");
	}

}
