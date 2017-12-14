
import java.io.*;

public class DeserializeOject
{
	public static void main(String[] args)
	{
		try(
			// 创建一个ObjectInputStream输入流
			ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("Staff.txt")))
		{
			// 从输入流中读取一个Java对象，并将其强制类型转换为Staff类
			Staff p = (Staff)ois.readObject();
			System.out.println("Name is: " + p.getName()
				+ "\nAge is：" + p.getAge());
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
