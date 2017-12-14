import java.util.*;

public class ListErrV2
{
	public static void main(String[] args)
	{
		// 使用泛型-尖括号内放类型
		List<String> strList = new ArrayList<String>();
		strList.add("张三");
		strList.add("李四");
		// 把一个整形存进了集合，有了泛型会进行校验
		strList.add(5);
		Iterator it = strList.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}
}
