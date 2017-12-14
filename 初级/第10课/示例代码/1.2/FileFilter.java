import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileFilter {
	public static void main(String[] args) throws IOException{
		File file = new File(".");
		

		String[] fileList = file.list((dir, name) -> dir.canRead() || name.endsWith(".txt"));
		for(String fileName : fileList)
			System.out.println(fileName);
		
		
	}

}
