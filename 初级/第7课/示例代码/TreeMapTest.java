package serven.one.one;
import java.util.*;

class R implements Comparable
{
	int count;
	public R(int count)
	{
		this.count = count;
	}
	public String toString()
	{
		return "R[count:" + count + "]";
	}
	// 根据count属性值来判断两个对象的大小。
	public int compareTo(Object obj)
	{
		R r = (R)obj;
		return count > r.count ? 1 :
			count < r.count ? -1 : 0;
	}
}
public class TreeMapTest
{
	public static void main(String[] args)
	{
		TreeMap tm = new TreeMap();
		tm.put(new R(30) , "java班级");
		tm.put(new R(10) , "linux班级");
		tm.put(new R(20) , "C++班级");
		tm.put(new R(0) , "R语言班级");
		tm.put(new R(50) , "大数据班级");
		tm.put(new R(8) , "web班级");
		System.out.println(tm);
		// 返回该TreeMap的第一个Entry对象
		System.out.println(tm.firstEntry());
		// 返回该TreeMap的最后一个key值
		System.out.println(tm.lastEntry());
		// 返回该TreeMap的比new R(2)大的最小key值。
	}
}
