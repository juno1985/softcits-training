import java.sql.*;

public class MysqlTest {
	public static void main(String[] args) throws ClassNotFoundException {
		// load mysql driver
		Class.forName("com.mysql.jdbc.Driver");
		try (
				//setup database connection
				Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "123456");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select * from manager");) {
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
