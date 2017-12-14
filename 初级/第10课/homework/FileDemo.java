package homework;
import java.io.File;
public class FileDemo {

	public static void main(String[] args) {
		File file = new File("D:\\workspace\\Training\\src\\a.txt");
		// to get the object file path
		System.out.println(file.getAbsoluteFile());
		// to get the path
		System.out.println(file.getPath());
		 //to get the current user working path
	 	System.out.println(System.getProperty("user.dir"));
	}

}
