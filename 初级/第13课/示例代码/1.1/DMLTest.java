import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DMLTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		try (
				// setup database connection
				Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "123456");
				Statement stmt = conn.createStatement();) {
			int row_impact = stmt.executeUpdate("insert into staff values(2,'moon','korea'),(3,'star','usa');");
			System.out.println("The num of row impact is: "+ row_impact);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
