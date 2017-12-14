package org.softcits.spring.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.softcits.spring.model.User;

public class BaseDao {
	//连接数据库的驱动
	private String driver;
	//连接数据库的url
	private String url;
	//连接数据库的用户
	private String user;
	//连接数据库的密码
	private String password;
	//用于数据库的连接
	Connection conn = null;
	
	
	//由于添加了下面的带参构造器,所以需要显示增加无参构造器
	public BaseDao() {
	}
	
	public BaseDao(String driver, String url, String user, String password) {
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.password = password;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Connection getConn() {
		return conn;
	}
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
	public void getConnection() throws ClassNotFoundException, SQLException{
		// 加载驱动
		Class.forName(this.driver);
		// 建立连接
		conn = DriverManager.getConnection(this.url,this.user,this.password);
	}
	//向数据库的表中添加数据
	//1 - 可变参数: Object... args
	//2 - 参数数组: Object[] args
	public boolean insert(String sql, Object... args) throws ClassNotFoundException, SQLException{
		if(conn == null) getConnection();
		PreparedStatement psmt = conn.prepareStatement(sql);
		for (int i = 0; i < args.length; i++){
			//对占位符进行赋值
			psmt.setObject(i + 1, args[i]);
		}
		//执行插入操作
		if (psmt.executeUpdate() != 1) return false;
		return true;
	}
	
	//从数据库中查询数据
	public User load(String sql, int id) throws ClassNotFoundException, SQLException{
		if(conn == null) getConnection();
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setObject(1, id);
		ResultSet rs = psmt.executeQuery();
		User u = new User();
		//这里需要注意,由于resultSet是集合,要想取出数据需要调用next()函数
		rs.next();
		//从数据库取出的行数据包装成User对象
		u.setUsername(rs.getString("username"));
		u.setPasswd(rs.getString("passwd"));
		return u;
		
	}
}