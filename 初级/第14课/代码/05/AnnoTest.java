package one;

import java.lang.annotation.Annotation;

public class AnnoTest {

	@MyTag(age=60)
	public void info(){
	}
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
		Annotation[] aArray = Class.forName("one.AnnoTest").getMethod("info").getAnnotations();
		for(Annotation an : aArray){
			System.out.println(an);
			System.out.println(((MyTag)an).name());
			System.out.println(((MyTag)an).age());
		}
	}
}
