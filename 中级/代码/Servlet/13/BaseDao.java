package servletdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	private Connection conn;
	//数据库驱动
	private String driver;
	private String url;
	private String username;
	private String pass;
	public BaseDao() {
	}
	public BaseDao(String driver, String url, String username, String pass) {
		this.driver = driver;
		this.url = url;
		this.username = username;
		this.pass = pass;
	}
	//get DB connection
	public Connection getConnection() throws Exception{
		if (conn == null){
			Class.forName(this.driver);
			conn = DriverManager.getConnection(url,username,pass);
		}
		return conn;
	}
	//insert
	public boolean insert(String sql, Object... args) throws SQLException, Exception{
		PreparedStatement pstmt = getConnection().prepareStatement(sql);
		for (int i = 0; i < args.length; i++){
			//convert Java type to MySQL type
			pstmt.setObject(i + 1, args[i]);
		}
		if (pstmt.executeUpdate() != 1) return false;
		return true;
	}
	//query
	public ResultSet query(String sql, Object... args) throws SQLException, Exception{
		PreparedStatement pstmt = getConnection().prepareStatement(sql);
		for (int i = 0; i < args.length; i++){
			pstmt.setObject(i+1, args[i]);
		}
		return pstmt.executeQuery();
	}
	//remove
	public boolean remove(String sql, Object... args) throws SQLException, Exception{
		PreparedStatement pstmt = getConnection().prepareStatement(sql);
		for (int i = 0; i < args.length; i++){
			//convert Java type to MySQL type
			pstmt.setObject(i + 1, args[i]);
		}
		if (pstmt.executeUpdate() != 1) return false;
		return true;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
