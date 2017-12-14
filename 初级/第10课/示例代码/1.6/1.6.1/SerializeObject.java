import java.io.*;
public class SerializeObject
{
	public static void main(String[] args)
	{
		try(
			// 创建一个ObjectOutputStream输出流
			ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("Staff.txt")))
		{
			Staff demo = new Staff("Serene", 26);
			// 将demo对象写入输出流
			oos.writeObject(demo);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}

