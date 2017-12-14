import java.util.*;
import java.io.*;

public class BufferedReaderTest {
	public static void main(String[] args) 
			throws IOException {
		
		BufferedReader bufReaderFile = null;
		BufferedWriter bufWriterFile = null;
		try{
			bufReaderFile = new BufferedReader
					(new FileReader
					("E:\\workspace\\IOTraining\\a.txt"));
			bufWriterFile = new BufferedWriter
					(new FileWriter
					("E:\\workspace\\IOTraining\\b.txt"));
			String input = null;
			while((input=bufReaderFile.readLine())!=null){
				bufWriterFile.write(input+"\r\n");
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			bufReaderFile.close();
			bufWriterFile.close();
		}
		
	}
}
