package test;

import java.sql.SQLException;

import org.softcits.spring.dao.BaseDao;
import org.softcits.spring.model.User;

public class JDBCTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		BaseDao baseDao = new BaseDao("com.mysql.jdbc.Driver", 
				"jdbc:mysql://localhost:3306/test", 
				"root", 
				"123456");
		
		//使用Object数据即可达到可变参数的目的
		baseDao.insert("INSERT INTO t_user(id, username, passwd) VALUES(?,?,?)", 
				new Object[]{"2","lisi","123456"});
		
		
		User u1 = baseDao.load("select * from t_user where id = ?", 1);
		System.out.println(u1.getUsername()+"  "+u1.getPasswd());
		
	}

}
