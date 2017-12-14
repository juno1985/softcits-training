package org.softcits.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.softcits.dao.UserMapper;
import org.softcits.model.User;

public class MyBatisTest {
	/**
	 * 
	 * <B>方法名称：</B><BR>
	 * <B>概要说明：生成数据库连接的session工厂</B><BR>
	 * @return
	 * @throws IOException
	 */
	public SqlSessionFactory getSqlSessionFactory() throws IOException{
		//引入mybatis全局配置文件
		String resource = "mybatis-config.xml";
		//从全局配置生成输入流
		InputStream inputStream = Resources.getResourceAsStream(resource);
		return new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	@Test
	public void UserQueryTest(){
		SqlSessionFactory sqlSessionFactory = null;
		SqlSession openSession = null;
		try {
			sqlSessionFactory = getSqlSessionFactory();
			openSession = sqlSessionFactory.openSession();
			//获取接口的实现类对象
			//会为接口自动的创建一个代理对象，代理对象去执行增删改查方法
			UserMapper umapper = openSession.getMapper(UserMapper.class);
			//调用UserMapper接口中的方法,从而调用mapper.xml中的sql
			//返回的类型就是mapper.xml中的resultType="org.softcits.model.User"
			
			
			User user = umapper.getUserByUsername(new User(0, "Jimmy", null, null));
			
			System.out.println(user);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			openSession.close();
		}
	}
	
	@Test
	public void UserQueryByStringTest(){
		SqlSessionFactory sqlSessionFactory = null;
		SqlSession openSession = null;
		try {
			sqlSessionFactory = getSqlSessionFactory();
			openSession = sqlSessionFactory.openSession();
			//获取接口的实现类对象
			//会为接口自动的创建一个代理对象，代理对象去执行增删改查方法
			UserMapper umapper = openSession.getMapper(UserMapper.class);
			//调用UserMapper接口中的方法,从而调用mapper.xml中的sql
			//返回的类型就是mapper.xml中的resultType="org.softcits.model.User"
			
			User user = umapper.getUserByName("Jun");
			
			System.out.println(user);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			openSession.close();
		}
	}
	
	@Test
	public void AddUserTest(){
		SqlSessionFactory sqlSessionFactory = null;
		SqlSession openSession = null;
		try {
			sqlSessionFactory = getSqlSessionFactory();
			openSession = sqlSessionFactory.openSession();
			//获取接口的实现类对象
			//会为接口自动的创建一个代理对象，代理对象去执行增删改查方法
			UserMapper umapper = openSession.getMapper(UserMapper.class);
			//调用UserMapper接口中的方法,从而调用mapper.xml中的sql
			//返回的类型就是mapper.xml中的resultType="org.softcits.model.User"
		
			//創建一個要添加的user對象
			User u1 = new User(0, "111", "23121", "123213243", "312321312");
			//调用添加用户方法
			boolean flag = umapper.addUser(u1);
			
			System.out.println("添加操作是否成功: " + flag);
			
			//在对数据进行更改后需要提交
			openSession.commit();
			
			/**
			 * 或者开启自动提交
			 * openSession=sqlSessionFactory.openSession(true);
			 */
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			openSession.close();
		}
	}

	
	@Test
	public void DeleteUserTest(){
		SqlSessionFactory sqlSessionFactory = null;
		SqlSession openSession = null;
		try {
			sqlSessionFactory = getSqlSessionFactory();
			openSession = sqlSessionFactory.openSession();
			//获取接口的实现类对象
			//会为接口自动的创建一个代理对象，代理对象去执行增删改查方法
			UserMapper umapper = openSession.getMapper(UserMapper.class);
			//调用UserMapper接口中的方法,从而调用mapper.xml中的sql
			//返回的类型就是mapper.xml中的resultType="org.softcits.model.User"
		
			Long rows = umapper.deleteUser("J%");
			
			System.out.println("删除了多少行: " + rows);
			
			//在对数据进行更改后需要提交
			openSession.commit();
			
			/**
			 * 或者开启自动提交
			 * openSession=sqlSessionFactory.openSession(true);
			 */
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			openSession.close();
		}
	}
	
	@Test
	public void getAllUserTest(){
		SqlSessionFactory sqlSessionFactory = null;
		SqlSession openSession = null;
		try {
			sqlSessionFactory = getSqlSessionFactory();
			openSession = sqlSessionFactory.openSession();
			//获取接口的实现类对象
			//会为接口自动的创建一个代理对象，代理对象去执行增删改查方法
			UserMapper umapper = openSession.getMapper(UserMapper.class);
			//调用UserMapper接口中的方法,从而调用mapper.xml中的sql
			//返回的类型就是mapper.xml中的resultType="org.softcits.model.User"
		
			List<User> uList = umapper.getAllUsers();
			
			for(User u : uList){
				System.out.println(u);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			openSession.close();
		}
	}
	
	@Test
	public void updateUserTest(){
		SqlSessionFactory sqlSessionFactory = null;
		SqlSession openSession = null;
		try {
			sqlSessionFactory = getSqlSessionFactory();
			openSession = sqlSessionFactory.openSession(true);
			//获取接口的实现类对象
			//会为接口自动的创建一个代理对象，代理对象去执行增删改查方法
			UserMapper umapper = openSession.getMapper(UserMapper.class);
			//调用UserMapper接口中的方法,从而调用mapper.xml中的sql
			//返回的类型就是mapper.xml中的resultType="org.softcits.model.User"
			
			User u = new User(1, "Mark", "111111", null);
			
			umapper.updateUser(u);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			openSession.close();
		}
	}
	
	
	@Test
	public void getMutiUsersTest(){
		SqlSessionFactory sqlSessionFactory = null;
		SqlSession openSession = null;
		try {
			sqlSessionFactory = getSqlSessionFactory();
			openSession = sqlSessionFactory.openSession(true);
			//获取接口的实现类对象
			//会为接口自动的创建一个代理对象，代理对象去执行增删改查方法
			UserMapper umapper = openSession.getMapper(UserMapper.class);
			//调用UserMapper接口中的方法,从而调用mapper.xml中的sql
			//返回的类型就是mapper.xml中的resultType="org.softcits.model.User"
		
			List<User> uList = umapper.getMutiUsers(Arrays.asList(7,8,9));
			
			System.out.println(uList);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			openSession.close();
		}
	}
}
