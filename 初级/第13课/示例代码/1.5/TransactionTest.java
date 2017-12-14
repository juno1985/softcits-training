import java.sql.*;

public class TransactionTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection conn = null;
		String[] sqls = new String[] { "insert into employee values(null,'mgr1',3)",
				"insert into employee values(null,'mgr2',3)" };
		// 加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		try {
			// 建立连接
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "123456");
			// 关闭自动提交，开始事物
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			//执行插入
			for(String sql : sqls){
				stmt.executeUpdate(sql);
			}
			//模拟出现位置错误
			throw new Exception("Unexpected Error!");
			
			//提交事物
			/*conn.commit();*/
			
/*			ResultSet rs = stmt.executeQuery("select * from employee");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}*/
			
		} catch (Exception e) {
			System.out.println("System encounter an error. Operation will be rolled back!");
			conn.rollback();
			e.printStackTrace();
		}
	}
}
