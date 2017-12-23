package FileListFilterDemo;
/*1.2*/
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileFilter {
	public static void main(String[] args) throws IOException{
		
		//指定当前路径，即workspace项目路径
		File file = new File(".");

		//1，正常写法
		String[] fileList = file.list(new FileFilterImpl());
		//2，匿名类写法
	/*	String[] fileList = file.list(new FilenameFilter(){

			@Override
			public boolean accept(File dir, String name) {
				
				return name.endsWith(".txt");
			}
			
		});*/
		//3,JAVA8以后新增加的Lamba表达式
	/*	String[] fileList = file.list(
				(dir, name) ->  name.endsWith(".txt")
				);*/
		
		for(String fileName : fileList)
			System.out.println(fileName);
		
		
	}

}
