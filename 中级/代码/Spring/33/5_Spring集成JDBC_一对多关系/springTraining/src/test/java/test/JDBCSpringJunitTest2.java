package test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.softcits.spring.dao.ISpringDao;
import org.softcits.spring.dao.SpringGroupDao;
import org.softcits.spring.dao.SpringUserDao;
import org.softcits.spring.model.Group;
import org.softcits.spring.model.User;
import org.softcits.spring.service.GroupService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//让Junit运行在Spring的测试环境中
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")//加载beans.xml文件
public class JDBCSpringJunitTest2 {
	
	@Inject
	private ISpringDao springGroupDao;
	@Inject
	private ISpringDao springUserDao;
	@Inject
	private GroupService groupService;
	@Test
	public void testAddGroup(){
		Group g1 = new Group();
		g1.setId(2);
		g1.setGrpname("授课部");
		springGroupDao.insert(g1);
		
	}
	
	@Test
	public void testUpdateUser(){
		User u1 = new User();
		u1.setId(2);
		u1.setUsername("Mark");
		u1.setPasswd("123456");
	
		Group g1 = new Group();
		g1.setId(1);
		g1.setGrpname("市场部");
		
		u1.setGroup(g1);
		
		springUserDao.modify(u1);
		}
	
	@Test
	public void testLoadUser(){
		User u = (User) springUserDao.load(2);
		System.out.println("员工名: " + u.getUsername() + ",员工密码: " + u.getPasswd() + " 用工部门: " + u.getGroup().getGrpname());
	}
	@Test
	public void testDeleteGroup(){
		springGroupDao.delete(2);
	}
	@Test
	public void testUpdateGroup(){
		Group g = new Group();
		g.setId(1);
		g.setGrpname("授课部");
		springGroupDao.modify(g);
	}
	@Test
	public void testLoadGroup(){
		Group g = (Group) springGroupDao.load(2);
		if(g == null)System.out.println("部门不存在");
		//System.out.println("主键: " + g.getId() + " 部门名称: " + g.getGrpname());
	}
	
	@Test
	public void testGroupAdd(){
		Group g = new Group();
		g.setId(3);
		g.setGrpname("卫生部");
		groupService.addGroup(g);
	}
}
