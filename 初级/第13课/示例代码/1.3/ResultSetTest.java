import java.sql.*;

public class ResultSetTest {
	public static void main(String[] args) throws ClassNotFoundException {
		// load mysql driver
		Class.forName("com.mysql.jdbc.Driver");
		try (
				//setup database connection
				Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "123456");
				Statement stmt = 
						conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet rs = stmt.executeQuery("select * from staff");) {
				//scroll to the last row
				rs.last();
				/*rs.absolute(row_num);*/
				
				/*System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));*/
				
				//commit update command
				rs.updateString(3, "brazil");
				rs.updateRow();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
