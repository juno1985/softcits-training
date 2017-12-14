import java.io.*;
public class RandomAccessFileTest
{
	public static void main(String[] args)
	{
		try(
			RandomAccessFile raf =  new RandomAccessFile(
				"test.txt" , "r"))
		{
			// 获取RandomAccessFile对象文件指针的位置，初始位置是0
			System.out.println("The initial pointer position is:"
				+ raf.getFilePointer());
			// 移动raf的文件记录指针的位置
			raf.seek(3);
			byte[] bbuf = new byte[1024];
			// 用于保存实际读取的字节数
			int hasRead = 0;

			while ((hasRead = raf.read(bbuf)) > 0 )
			{
				// 将字节数组转换成字符串输入！
				System.out.print(new String(bbuf , 0 , hasRead ));
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
