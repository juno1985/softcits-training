import java.io.*;
public class AppendContent
{
	public static void main(String[] args)
	{
		try(
			//以读、写方式打开一个RandomAccessFile对象
			RandomAccessFile raf = new RandomAccessFile("test.txt" , "rw"))
		{
			//将记录指针移动到out.txt文件的最后
			raf.seek(raf.length());
			raf.write("added content here!\r\n".getBytes());
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
