package serven.one.one;


import java.util.*;
public class MapTest
{
	public static void main(String[] args)
	{
		Map map = new HashMap();
		// 成对放入多个key-value对
		map.put(1 , "张三");
		map.put(2 , "李四");
		map.put(3 , "王五");
		System.out.println(map);
		// 多次放入的key-value对中value可以重复
		map.put(4 , "王五");
		System.out.println(map);
		// 放入重复的key时，新的value会覆盖原有的value
		// 如果新的value覆盖了原有的value，该方法返回被覆盖的value
		map.put(3 , "王老五");
		System.out.println(map); // 输出的Map集合包含4个key-value对
		// 判断是否包含指定key
		System.out.println("是否包含值为 3 key："
			+ map.containsKey(3)); // 输出true
		// 判断是否包含指定value
		System.out.println("是否包含值为 王老五 value："
			+ map.containsValue("王老五")); // 输出true
		// 获取Map集合的所有key组成的集合，通过遍历key来实现遍历所有key-value对
		for (Object key : map.keySet() )
		{
			// map.get(key)方法获取指定key对应的value
			System.out.println(key + "-->" + map.get(key));
		}
		map.remove(4); // 根据key来删除key-value对。
		System.out.println(map); 
		//删除所有元素
		map.clear();
		System.out.println(map);
	}
}
