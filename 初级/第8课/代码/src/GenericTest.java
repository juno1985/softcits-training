import java.util.HashSet;
import java.util.Set;

public class GenericTest<T> {
	//不能在泛型的类型形参前加static
	//static T info;
	//同理泛型的类型形参不能再静态方法中使用
	//public static void bar(T t){}
	
	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		System.out.println(s instanceof HashSet);
		//并不存在额外的泛型类 下面将出现错误
		//System.out.println(s instanceof HashSet<String>);
		
		
	}
}
