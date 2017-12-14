package PropOverride;

import javax.sql.DataSource;
import java.sql.*;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class BeanTest
{
	public static void main(String[] args)throws Exception
	{
		ApplicationContext ctx = new
			ClassPathXmlApplicationContext("beans.xml");
		DataSource ds = (DataSource)ctx.getBean("dataSource");
		Connection conn = ds.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(
			"insert into account value(null , ? , ?)");
		pstmt.setString(1 , "Serene");
		pstmt.setString(2 , "111111");
		pstmt.executeUpdate();
		pstmt.close();
		conn.close();
	}
}