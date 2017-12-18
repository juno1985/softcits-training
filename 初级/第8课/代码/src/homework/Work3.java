package softcits_traning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*byte ：java.lang.Byte
short ：java.lang.Short
int： java.lang.Integer
long ：java.lang.Long
float ：java.lang.Float
double ：java.lang.Double
char ：java.lang.Character
boolean： java.lang.Boolean*/

public class Homework3 {

	public static void main(String[] args) {

		
		List<Character> alp = new ArrayList<>();
		alp.add('a');
		alp.add('b');
		alp.add('a');
		alp.add('b');
		alp.add('c');
		alp.add('a');
		alp.add('c');
		alp.add('b');
		alp.add('a');
		alp.add('a');
		alp.add('b');
		
		Map<Character, Integer> resultMap = new HashMap<>();
		Iterator<Character> it = alp.iterator();
		while(it.hasNext()){
			Character c = it.next();
			if(!resultMap.containsKey(c)){
				resultMap.put(c, 1);
			}else{
				int num = resultMap.get(c);
				num ++;
				resultMap.put(c, num);
			}
		}
		System.out.println(resultMap);
	}

}
