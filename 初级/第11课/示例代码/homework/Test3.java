package homework;

import java.io.File;
import java.io.RandomAccessFile;

public class Test3 {
	/**
	 * 使用随机文件流类RandomAccessFile将一个文本文件倒置读出。
	 * 
	 * 程序分析： RandomAccessFile的seek方法能把读取文件的光标移动到具体的位置
	 * 但是还是有地点值得注意的是一个字母或数字是占用一个字节的， 一个汉字是占用两个字节的
	 */
	public static void main(String[] args) {
		// 要读取的文件的地址
		File file = new File("D:/out.txt");
		try {
			RandomAccessFile raf = new RandomAccessFile(file, "r");
			long length = raf.length();
			StringBuffer sb = new StringBuffer();
			while (length > 0) {
				length--;
				raf.seek(length);
				int c = (char) raf.readByte();
				// 如果asc码<=255,>=0,则判断是个英文字符,添加到字符串中.
				if (c >= 0 && c <= 255) {
					sb.append((char) c);
				} else {
					// 如果不在asc码范围内,则判断是个汉字字符
					// 汉字字符是占2个字节的,所以length再退一个字节
					length--;
					raf.seek(length);
					byte[] cc = new byte[2];
					// cc被复制为文件中连续的两个字节
					raf.readFully(cc);
					sb.append(new String(cc));
				}
			}
			System.out.println(sb);
			raf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
