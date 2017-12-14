import java.io.*;
import java.nio.*;
import java.nio.channels.FileChannel;

public class NioTest {
	public static void main(String[] args) {
		try {
			RandomAccessFile demoFile = new RandomAccessFile("test.txt", "rw");
			FileChannel inChannel = demoFile.getChannel();

			// create a buffer with capacity of 16 bytes
			ByteBuffer buf = ByteBuffer.allocate(16);
			
			// read into buffer
			int bytesRead = inChannel.read(buf);

			while (bytesRead != -1) {
				// make the buffer ready to read
				buf.flip();
				while (buf.hasRemaining())
					System.out.print((char)buf.get());
				
				//make the buffer ready for writing
				buf.clear();
				//read next into buffer
				bytesRead = inChannel.read(buf);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
