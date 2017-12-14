package servletdemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class OnlineListener implements ServletContextListener {

	//treated as offline if over 30 sec no request
	public final int MAX_MILLIS = 30 * 1000;
	//load when web startup
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// check the out-of-time request per 5 secs
		new javax.swing.Timer(1000 * 5, new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						try{
							BaseDao dao = new BaseDao("com.mysql.jdbc.Driver", "jdbc:mysql://127.0.0.1:3306/test", "root", "123456");
							ResultSet rs = dao.query("select * from online_inf");
							
							while(rs.next()){
								if((System.currentTimeMillis() - rs.getLong(5)) > MAX_MILLIS){
									String sessionID= (String)rs.getString(1);
									dao.remove("delete from online_inf where sessionId = ?", sessionID);
								}
							}
							
						}catch(Exception ex){
							ex.printStackTrace();
						}
					}
					
				}).start();

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub

	}

}
