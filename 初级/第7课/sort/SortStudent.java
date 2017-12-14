package student.sort;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SortStudent {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Á÷´¨·ã", "1588888888");
		Student s2 = new Student(2, "Ó£Ä¾»¨µÀ", "15911111111");
		Student s3 = new Student(3, "³àÄ¾", "12311111111");
		Student s4 = new Student(4, "Èı¾®ÊÙ", "15555555555");
		
		Set studentSet = new TreeSet();
		studentSet.add(s3);
		studentSet.add(s2);
		studentSet.add(s4);
		studentSet.add(s1);
//		System.out.println(studentSet);
		Iterator it = studentSet.iterator();
		/*while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		System.out.println(it.next());
		System.out.println(it.next());
	}
}
