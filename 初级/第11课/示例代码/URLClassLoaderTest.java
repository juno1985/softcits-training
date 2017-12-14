import java.sql.*;
import java.util.*;
import java.net.*;

//在classpath未设置mysql驱动的情况下，使用classloader手动装载该驱动
public class URLClassLoaderTest {
	private static Connection conn;

	// 定义一个获取数据库连接方法
	public static Connection getConn(String url, String user, String pass) throws Exception {
		if (conn == null) {
			// 创建一个URL数组
			URL[] urls = {
					new URL("file:///C:\\Program Files\\MySQL\\Connector.J 5.1\\mysql-connector-java-5.1.38-bin.jar") };
			// 以默认的ClassLoader作为父ClassLoader，创建URLClassLoader
			URLClassLoader myClassLoader = new URLClassLoader(urls);
			// 加载MySQL的JDBC驱动，并创建默认实例
			Driver driver = (Driver) myClassLoader.loadClass("com.mysql.jdbc.Driver").newInstance();
			// 创建一个设置JDBC连接属性的Properties对象
			Properties props = new Properties();
			// 至少需要为该对象传入user和password两个属性
			props.setProperty("user", user);
			props.setProperty("password", pass);
			// 调用Driver对象的connect方法来取得数据库连接
			conn = driver.connect(url, props);

			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery("select * from manager");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}

		}
		return conn;
	}

	public static void main(String[] args) throws Exception {
		System.out.println(getConn("jdbc:mysql://localhost:3306/test", "root", "123456"));
	}
}
