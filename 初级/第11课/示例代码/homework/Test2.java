package homework;
import java.io.File;
public class Test2 {
	public static void getAllDirectories(File f){
		File[] fileArray = f.listFiles();
		 for(File tempFile : fileArray){
			 if(tempFile.isDirectory()) getAllDirectories(tempFile);
			 else 
				 {
				 	if(tempFile.getName().endsWith(".java"))System.out.println(tempFile.getAbsolutePath());
				 }
		 }
	}
	public static void main(String[] args) {
		 File f = new File(".");
		 getAllDirectories(f);
	}
}
