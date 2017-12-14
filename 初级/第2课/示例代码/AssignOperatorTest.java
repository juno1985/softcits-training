public class AssignOperatorTest
{
	public static void main(String[] args)
	{
		int a;
		int b;
		int c;
		// 通过为a, b , c赋值，三个变量的值都是7
		a = b = c = 7;
		// 输出三个变量的值。
		System.out.println(a + "\n" + b + "\n" + c);

		a*=b;
		System.out.println(a);
	}
}
