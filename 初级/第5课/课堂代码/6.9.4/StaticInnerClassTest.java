package six.nine.four;

public class StaticInnerClassTest
{
	
	private int prop1 = 5;
	private static int prop2 = 9;
	static class StaticInnerClass
	{
		// 静态内部类里可以包含静态成员
		private static int age;
		public void accessOuterProp()
		{
			// 下面代码出现错误：
			// 静态内部类无法访问外部类的实例变量
//			System.out.println(prop1);
			// 下面代码正常
			System.out.println(prop2);
		}
	}
	
	public static void main(String[] args){
		//静态内部类的生成方法
		new StaticInnerClassTest.StaticInnerClass().accessOuterProp();
		//非静态内部类的生成方法
		//new StaticInnerClassTest().new StaticInnerClass().accessOuterProp();
	}
}

