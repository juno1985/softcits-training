package homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Work2 {

	public static void main(String[] args) {
		//使用泛型，泛型内使用char的包装类型Character
		List<Character> l = new ArrayList<>();
		//使用循环26次得到26个大写字母
		for(int i = 0; i < 26; i++){
			l.add((char)('A' + i));
		}
		//使用迭代器遍历Set集合
		Iterator<Character> it = l.iterator();
		while(it.hasNext()){
			System.out.print(it.next().toString());
		}
	}
}