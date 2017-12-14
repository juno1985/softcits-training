package serven.one.one;
import java.util.*;
public class UnmodifiableTest
{
	public static void main(String[] args)
	{
		Map scores = new HashMap();
		scores.put("语文" , 80);
		scores.put("Java" , 82);
		// 返回普通Map对象对应的不可变版本
		Map unmodifiableMap = Collections.unmodifiableMap(scores);
		// 下面代码将引发UnsupportedOperationException异常
		unmodifiableMap.put("数学" , 90);
	/*	Iterator it = scores.keySet().iterator();
		while(it.hasNext()){
			String ss = it.next().toString();
			System.out.println(ss + "\t" + scores.get(ss));
		}*/
	}
}

