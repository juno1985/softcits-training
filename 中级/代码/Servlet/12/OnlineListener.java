package servletdemo;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
@WebListener
public class OnlineListener implements HttpSessionListener {

	@SuppressWarnings("unchecked")
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		ServletContext application = session.getServletContext();
		//get session Id
		String sessionId = session.getId();
		//if newly created
		if(session.isNew()){
			String user = (String) session.getAttribute("user");
			//nologin user treated as guest
			user = (user == null) ? "guest" : user;
			Map<String, String> online = (Map<String, String>)application.getAttribute("online");
			if (online == null){
				online = new HashMap<String, String>();
			}
			online.put(sessionId, user);
			//put user map back into application scoped attr
			application.setAttribute("online", online);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		ServletContext application = session.getServletContext();
		String sessionId = session.getId();
		Map<String, String> online = (Map<String, String>) application.getAttribute("online");
		if(online != null){
			online.remove(sessionId);
		}
		application.setAttribute("online", online);
	}

}
