package one.one;

import java.net.*;
import java.io.*;

public class Client
{
	public static void main(String[] args)
		throws IOException
	{
		Socket socket = new Socket("127.0.0.1" , 30000);
		// 将Socket对应的输入流包装成BufferedReader
		BufferedReader br = new BufferedReader(
		new InputStreamReader(socket.getInputStream()));
		// 进行普通IO操作
		String line = br.readLine();
		System.out.println("来自服务器的数据：" + line);
		// 关闭输入流、socket
		br.close();
		socket.close();
	}
}
