public class ModTest
{
	public static void main(String[] args)
	{
		int c = 23, d = 7;
		System.out.println("c/d = "+ c/d);
		System.out.println("c%d = "+ c%d);
		
		double a = 5.2, b = 3.1;
		double mod = a % b;
		System.out.println(mod); // mod的值为2.1
		// 下面代码将出现异常：java.lang.ArithmeticException: / by zero
		System.out.println("-5对0求余的结果是:" + -5 % 0);
	}
}
