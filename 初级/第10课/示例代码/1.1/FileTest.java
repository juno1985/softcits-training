import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException{
		File file = new File(".");
		
		/*System.out.println(file.getName());*/
		System.out.println(file.getAbsoluteFile());
		System.out.println(file.getPath());
		
	/*	java.util.Date fileDate = new java.util.Date(file.lastModified());
		java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		System.out.println(df.format(fileDate));*/
		/*file.createNewFile();*/
		
		String[] fileList = file.list();
		for(String fileName : fileList)
			System.out.println(fileName);
		
	/*	System.out.println(System.getProperty("user.dir"));*/
		
	}

}
