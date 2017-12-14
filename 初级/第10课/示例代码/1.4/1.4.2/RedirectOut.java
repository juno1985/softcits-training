
import java.io.*;
public class RedirectOut
{
	public static void main(String[] args)
	{
		try(
			// 一次性创建PrintStream输出流
			PrintStream ps = new PrintStream(new FileOutputStream("out.txt")))
		{
			// 将标准输出重定向到ps输出流
			System.setOut(ps);
			// 向标准输出输出一个字符串
			System.out.println("normal string");
			// 向标准输出输出一个对象
			System.out.println(new RedirectOut());
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}

