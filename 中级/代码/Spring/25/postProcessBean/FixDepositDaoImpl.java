package postProcessBean;

import java.sql.Connection;
import java.sql.DriverManager;

public class FixDepositDaoImpl implements InstanceValidator {

	//实例在进行依赖注入前,必须先设置db connection
	private Connection connection;
	
	public FixDepositDaoImpl() {
		System.out.println("FixDepositDaoImpl进行了实例化");
	}
	@Override
	public void validateInstance() {
		if(connection == null){
			System.out.println("DB连接未建立,不能将其注入到依赖类中!");
		}
	}
	//创建数据库连接,FixDepositDaoImpl进行依赖注入前必须调用该方法
	public void initializeConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "123456");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
