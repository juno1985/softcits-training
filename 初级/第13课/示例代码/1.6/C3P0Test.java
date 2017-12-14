import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Test {
	public static void main(String[] args){
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			cpds.setDriverClass("com.mysql.jdbc.Driver");
			cpds.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/test");
			cpds.setUser("root");
			cpds.setPassword("123456");
			
			//可选参数
			//连接池最大连接数
			cpds.setMaxPoolSize(5);
			//连接池最小连接数
			cpds.setMinPoolSize(1);
			//连接池初始连接数
			cpds.setInitialPoolSize(2);
			
			conn = cpds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from employee");
			
			while(rs.next()){
				System.out.println(rs.getString("id")+' '+rs.getString("name")+' '+rs.getString("mgr_id"));
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(stmt !=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(conn !=null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}

}
