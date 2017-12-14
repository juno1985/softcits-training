package test;

import java.sql.SQLException;
import org.softcits.spring.dao.BaseDao;
import org.softcits.spring.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBCSpringTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("beans.xml");
		//从Spring容器中取出baseDao的bean
		BaseDao baseDao = ctx.getBean("baseDao", BaseDao.class);
		//进行查询
		User u1 = baseDao.load("select * from t_user where id = ?", 1);
		System.out.println(u1.getUsername()+"  "+u1.getPasswd());
		
		//进行插入
		baseDao.insert("INSERT INTO t_user(id, username, passwd) VALUES(?,?,?)", 
				new Object[]{"3","wangwu","123456"});
		
	}

}
