package homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test5 {

	private static List<File> filesList = new ArrayList<File>();

	public static void getAllFiles(File f) {
		File[] fileArray = f.listFiles();
		for (File tempFile : fileArray) {
			if (tempFile.isDirectory()) {
				filesList.add(tempFile);
				getAllFiles(tempFile);
			} else {
				filesList.add(tempFile);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("要复制的文件夹：");
		String fromDir = scanner.next();// 接收输入
		System.out.println("要复制到哪里去：");
		String toDir = scanner.next();// 接收输入

		// 把输入的地址转化为File类型
		File fromFile = new File(fromDir);
		File toFile = new File(toDir);

		// 新建线程
		new Thread() {
			// 里面做实际操作
			public void run() {
				// 判断如果要复制的是文件，直接复制就可以了
				if (fromFile.isFile()) {
					System.out.println("复制单个文件");
					copy(fromFile, toFile);
				} else {
					// 要复制文件夹
					// 要防止一种无法进行的复制：比如说，要把复制的文件复制到自己的子文件夹里面
					// 举个例子：把D:/java/jsp文件夹复制到D:/java/jsp/js文件夹里面，
					// 这会导致子文件不断增加的同时，而父文件也要不断增加，的一个死循环
					// 如果反过来，就没事，相当于只是简单的覆盖而已
					// 具体实现就是看：目的地地址包含复制的文件夹地址，就不允许操作
					if (toDir.replace("/", "\\").toLowerCase().startsWith(fromDir.replace("/", "\\").toLowerCase())) {
						return;
					}

					// 复制文件（包括文件和文件夹）操作

					// 先获取所有的文件（包括文件和文件夹）
					getAllFiles(fromFile);
					List<File> list = filesList;

					// 创建一个线程池，加快复制的速度
					ExecutorService threadPool = Executors.newFixedThreadPool(20);

					// 需要对每一个文件的路径进行处理
					for (File file : list) {
						// 复制文件名
						String name = file.getAbsolutePath();
						// 把原来的文件路径换成新的文件路径
						String toName = name.replace(fromFile.getParent(), toDir + "/");
						System.out.println(name + "变成了" + toName);
						// 如果是文件夹，直接创建
						if (file.isDirectory()) {
							new File(toName).mkdirs();
						} else {
							// 如果是文件,在线程里面复制
							threadPool.execute(new Runnable() {
								@Override
								public void run() {
									File copyFile = new File(toName);
									// 先要有父文件夹
									copyFile.getParentFile().mkdirs();

									// 开始复制文件
									copy(file, copyFile);
								}
							});
						}
					}

				}
				scanner.close();
			};

		}.start();// 开始线程
	}

	// 复制文件的操作
	public static void copy(File fromFile, File toFile) {
		// 定义一个输入流
		FileInputStream fis = null;
		// 定义一个输出流
		FileOutputStream fos = null;

		try {
			// 把复制地址的File，封装后赋值给输入流对象
			fis = new FileInputStream(fromFile);
			// 把目的地的File，封装后复制给输出流的对象
			fos = new FileOutputStream(toFile);
			// 创建一个容量，
			byte[] buf = new byte[1024];
			// 每次读取/写入的字节长度
			int len = 0;
			// 边读边写
			while ((len = fis.read(buf)) != -1) {// 判断是否还能读到数据
				// 把输入放到输出流里面
				fos.write(buf, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 关闭输入流和输出流
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
