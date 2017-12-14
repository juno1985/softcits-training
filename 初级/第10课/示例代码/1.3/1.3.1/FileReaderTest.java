
import java.io.*;
public class FileReaderTest
{
	public static void main(String[] args)
	{
		try(
			// 创建字符输入流
			FileReader fr = new FileReader("a.txt"))
		{
			// 创建一个长度为32的字符数组
			char[] cbuf = new char[32];
			// 用于保存实际读取的字符数
			int hasRead = 0;
			// 使用循环读取
			while ((hasRead = fr.read(cbuf)) > 0 )
			{
				System.out.println(new String(cbuf , 0 , hasRead));
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
