public class FloatTest
{
	public static void main(String[] args)
	{
		double a = 0.0;
		double c = Double.NEGATIVE_INFINITY;
		float d = Float.NEGATIVE_INFINITY;
		float e = Float.POSITIVE_INFINITY;
		// 看到float和double的负无穷大是相等的。
		System.out.println(c == d);
		// 0.0除以0.0将出现非数
		System.out.println(a / a);
		// 两个非数之间是不相等的
		System.out.println(a / a == Float.NaN);
		// 所有正无穷大都是相等的
		System.out.println(6.0 / 0 == 555.0/0);
		// 负数除以0.0得到负无穷大
		System.out.println(-8 / a);
		// 下面代码将抛出除以0的异常
//		 System.out.println(0 / 0);
	}
}
