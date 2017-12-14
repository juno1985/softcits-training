import java.util.*;
public class ListErr
{
	public static void main(String[] args)
	{
		// 创建一个只想保存字符串的List集合
		List strList = new ArrayList();
		strList.add("张三");
		strList.add("李四");
		// 把一个整形存进了集合
		strList.add(5);
		Iterator it = strList.iterator();
		while(it.hasNext())
			System.out.println(((String)it.next()).length());
		
	}
}
