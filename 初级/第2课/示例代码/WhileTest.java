
public class WhileTest
{
	public static void main(String[] args)
	{
		// 1~10求和		
		// 循环的初始化条件
		int count = 1;
		int sum = 0;
		// 当count小于等于10时，执行循环体
		while (count <= 10)
		{
			System.out.println(count);
			sum += count;
			count++;
			
		}
		System.out.println("循环结束!");
		System.out.println("1-10的和为："+sum);


//		// 下面是一个死循环
//		int count = 0;
//		while (count < 10)
//		{
//			System.out.println("不停执行的死循环 " + count);
//			count--;
//		}
//		System.out.println("永远无法跳出的循环体");

		int count2 = 0;
		// while后紧跟一个分号，表明循环体是一个分号（空语句）
		while (count2 < 10);
		// 下面的代码块与while循环已经没有任何关系
		{
			System.out.println("------" + count2);
			count2++;
		}

	}
}
