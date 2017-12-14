package test;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.softcits.spring.dao.BaseDao;
import org.softcits.spring.model.User;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//让Junit运行在Spring的测试环境中
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")//加载beans.xml文件
public class JDBCSpringJunitTest {
	@Resource
	BaseDao baseDao;
	
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
}
