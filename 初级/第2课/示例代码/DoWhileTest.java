public class DoWhileTest
{
	public static void main(String[] args)
	{
		// 1~10求和	
		// 初始化
		int count = 1;
		int sum = 0;
		// 执行do while循环
		do
		{
			System.out.println(count);
			// 循环迭代语句
			sum += count;
			count++;
			// 循环条件紧跟while关键字
		}while (count <= 10);
		System.out.println("循环结束!");
		System.out.println("1-10的和为："+sum);
	}
}
