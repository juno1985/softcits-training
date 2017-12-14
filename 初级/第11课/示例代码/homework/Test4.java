package homework;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test4 {
	private static List<File> files = new ArrayList<File>();
	private static List<File> directories = new ArrayList<File>();
	public static void getAllFiles(File f){
		File[] fileArray = f.listFiles();
		 for(File tempFile : fileArray){
			 if(tempFile.isDirectory()) {
				 directories.add(tempFile);
				 getAllFiles(tempFile);
			 }
			 else 
				 {
				 	files.add(tempFile);
				 }
		 }
	}
	public static void main(String[] args) {
		File f = new File("D:\\workspace\\Training");
		 getAllFiles(f);
		 System.out.println("目录有：");
		 Collections.sort(directories, new Comparator<File>(){

			@Override
			public int compare(File o1, File o2) {
				return o1.getAbsolutePath().compareTo(o2.getAbsolutePath());
			}
			 
		 });
		 for(File tempf : directories){
			 System.out.println(tempf.getAbsolutePath());
		 }
		 
		 System.out.println("文件有:");
		 Collections.sort(files, new Comparator<File>(){

			@Override
			public int compare(File o1, File o2) {
				return o1.getAbsolutePath().compareTo(o2.getAbsolutePath());
			}
		 });
		 for(File tempf : files){
			 System.out.println(tempf.getAbsolutePath());
		 }
	}
}
