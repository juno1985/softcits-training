package homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Work1 {

	public static void main(String[] args) {
		//使用泛型，泛型内使用char的包装类型Character
		Set<Character> s = new HashSet<>();
		//使用循环26次得到26个小写字母
		for(int i = 0; i < 26; i++){
			s.add((char)('a' + i));
		}
		//使用迭代器遍历Set集合
		Iterator<Character> it = s.iterator();
		while(it.hasNext()){
			System.out.print(it.next().toString());
		}
	}

}
