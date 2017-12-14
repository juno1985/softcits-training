package serven.one.one;
import java.util.*;
public class SynchronizedTest
{
	public static void main(String[] args)
	{
		// 下面程序创建了四个线程安全的集合对象
		Collection c = Collections
			.synchronizedCollection(new ArrayList());
		List list = Collections.synchronizedList(new ArrayList());
		Set s = Collections.synchronizedSet(new HashSet());
		Map m = Collections.synchronizedMap(new HashMap());
	}
}
