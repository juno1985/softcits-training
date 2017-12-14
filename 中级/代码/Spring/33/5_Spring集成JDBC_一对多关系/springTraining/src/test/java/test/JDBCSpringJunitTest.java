package test;

import java.sql.SQLException;
import javax.annotation.Resource;
import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.softcits.spring.dao.BaseDao;
import org.softcits.spring.dao.SpringDao;
import org.softcits.spring.model.User;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//让Junit运行在Spring的测试环境中
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")//加载beans.xml文件
public class JDBCSpringJunitTest {
//	@Resource
	@Inject
	private BaseDao baseDao;
	@Inject
	private SpringDao springDao;
	
	//进行插入单元的测试
	@Test
	public void testInsert() throws ClassNotFoundException, SQLException{
		baseDao.insert("INSERT INTO t_user(id, username, passwd) VALUES(?,?,?)", 
				new Object[]{"4","赵六","123456"});
	}
	
	//进行查询单元的测试
	@Test
	public void testLoad() throws ClassNotFoundException, SQLException{
		User u1 = baseDao.load("select * from t_user where id = ?", 1);
		System.out.println(u1.getUsername()+"  "+u1.getPasswd());
	}
	
	@Test
	public void testJdbcTemplateAdd(){
		//创建一个user对象
		User u2 = new User();
		u2.setId(6);
		u2.setUsername("赵八");
		u2.setPasswd("123456");
		//把user对象存进数据库表中的一行
		springDao.insert(u2);
	}
	
	@Test
	public void testJdbcTemplateDelete(){
		springDao.delete(1);
	}
	
	@Test
	public void testJdbcTemplateModify(){
		User u3 = new User();
		u3.setId(3);
		u3.setUsername("王五");
		u3.setPasswd("abcdef");
		springDao.modify(u3);
	}
	
	@Test
	public void testJdbcTemplateLoad(){
		User u = springDao.load(6);
		System.out.println("用户名: " + u.getUsername() +"  密码是:" + u.getPasswd());
	}
}
