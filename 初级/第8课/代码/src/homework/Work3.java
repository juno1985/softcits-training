package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Work3 {

	public static void main(String[] args) {
		List<Character> listChar = new ArrayList<>();
		Map<Character, Integer> resultMap = new HashMap<>();
		char[] source = {'a','b','a','b','c','a','c','b','a','a','b'};
		//通过遍历数组存入到List集合中
		for(char c:source){
			listChar.add(c);
		}
		//遍历list集合
		for(char temp : listChar){
			//如果map的key中不含有该字符，则value设为1
			if(!resultMap.containsKey(temp))
				resultMap.put(temp, 1);
			//如果map的key中含有该字符，则value+1
			else if(resultMap.containsKey(temp))
				resultMap.put(temp, resultMap.get(temp) + 1);		
		}
		
		System.out.println(resultMap);
	}

}
