import java.sql.*;

public class PreparedStatementTest {
	public static void main(String[] args) throws ClassNotFoundException {
		// load mysql driver
		Class.forName("com.mysql.jdbc.Driver");
		try (
				// setup database connection
				Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "123456");
				// create prepared statement leaving param entry
				PreparedStatement pstmt = conn.prepareStatement("insert into staff values(?,?,null)");) {
			for (int i = 10; i < 15; i++) {
				// set the first param with type int
				pstmt.setInt(1, i);
				// set the second parm with type string
				pstmt.setString(2, "name" + i);

				pstmt.executeUpdate();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
