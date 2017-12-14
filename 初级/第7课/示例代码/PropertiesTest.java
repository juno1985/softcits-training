package serven.one.one;
import java.util.*;
import java.io.*;
public class PropertiesTest
{
	public static void main(String[] args)
		throws Exception
	{
		Properties props = new Properties();
		// 向Properties中增加属性
		props.setProperty("user1" , "张三");
		props.setProperty("user2" , "李四");
		// 将Properties中的key-value对保存到a.ini文件中
		props.store(new FileOutputStream("D:\\a.properties")
			, "user information");   //①
		// 新建一个Properties对象
		Properties props2 = new Properties();
		// 向Properties中增加属性
		props2.setProperty("user3" , "王五");	
		// 将a.ini文件中的key-value对追加到props2中
		props2.load(new FileInputStream("D:\\a.properties") );   //②
		// 将props2的内容回写到文件中
		props2.store(new FileOutputStream("D:\\a.properties"), "new Strings added");
		// 将Properties类型转化成Map类型
		Map map = new HashMap(props2);
		System.out.println(map);
	}
}
