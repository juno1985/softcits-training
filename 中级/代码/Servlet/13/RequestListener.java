package servletdemo;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebListener
public class RequestListener implements ServletRequestListener{

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		
	}

	//当一个request请求到来时会触发下面方法
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		//得到JSP的request对象
		HttpServletRequest request = (HttpServletRequest) sre.getServletRequest();
		//通过requet得到Session对象
		HttpSession session = request.getSession();
		//通过Session得到SessionID
		String sessionId = session.getId();
		//通过request得到IP地址
		String ip = request.getRemoteAddr();
		//通过requet得到访问的网页
		String page = request.getRequestURI();
		
		//？？？？？
		String user = (String) session.getAttribute("user");
		user = (user == null) ? "guest" : user;
		
		try {
			BaseDao dao = new BaseDao("com.mysql.jdbc.Driver", "jdbc:mysql://127.0.0.1:3306/test", "root", "123456");
			dao.insert("insert into online_inf values (?, ?, ?, ?, ?)", sessionId, user, ip, page, System.currentTimeMillis());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
