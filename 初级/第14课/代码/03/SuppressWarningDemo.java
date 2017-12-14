package one;

import java.util.ArrayList;
import java.util.List;
public class SuppressWarningDemo {
	
	
	public static void main(String[] args){
		@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
		List<String> myList = new ArrayList();
	}
}
