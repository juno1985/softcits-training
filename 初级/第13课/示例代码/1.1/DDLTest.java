import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DDLTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		try (
				// setup database connection
				Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "123456");
				Statement stmt = conn.createStatement();) {
			stmt.executeUpdate("create table staff(id int primary key, name varchar(255), address varchar(255));");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
