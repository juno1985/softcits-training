import java.util.*;
import java.io.*;
import java.sql.*;
import javax.sql.*;
import javax.sql.rowset.*;

public class CachedRowSetTest {

	public static void main(String[] args) throws Exception {
		int pageSize = 3;
		int page = 2;
		// load mysql driver
		Class.forName("com.mysql.jdbc.Driver");
		try {
				// setup database connection
				Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "123456");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select * from manager");
			// 使用RowSetProvider创建RowSetFactory
			RowSetFactory factory = RowSetProvider.newFactory();
			// 创建默认的CachedRowSet实例
			CachedRowSet cachedRs = factory.createCachedRowSet();
			//装载resultset
			cachedRs.populate(rs);
			//关闭所有数据连接
			rs.close();
			stmt.close();
			conn.close();
			
			while (cachedRs.next()) {
				System.out.println(cachedRs.getInt(1) + " " + cachedRs.getString(2) + " " + cachedRs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}