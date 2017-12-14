package six.eight.one;

public interface Output
{
	// 接口里定义的成员变量只能是常量
	int MAX_CACHE_LINE = 5;
	
	// 接口里定义的普通方法只能是public的抽象方法，不能有实现（Java8以前）
	void out();
	void getData(String msg);
	
	// Java8开始，允许在接口中定义默认方法，需要使用default修饰，可以有方法实现
	//可以被实现类对象直接调用
	default void print(String... msgs)
	{
		for (String msg : msgs)
		{
			System.out.println(msg);
		}
	}
	default void test()
	{
		System.out.println("默认的test()方法");
	}
	
	// 在接口中定义类方法，需要使用static修饰
	static String staticTest()
	{
		return "接口里的类方法";
	}
}