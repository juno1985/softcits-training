import java.util.ArrayList;
import java.util.List;
class Fruit{
	public String category;
}
class Banana extends Fruit{
	public String name;
}
public class GenericFunction {
	//泛型形参放在方法修饰符和返回值中间
	public <T, S extends T> List<S> 
			copyArrayToList(T[] source, List<S> target){
		for(T object : source)
			target.add((S)object);
		return target;
	}
	public static void main(String[] args) {
		//由于String继承Object,Object看成T，String看成S
		Object[] source = new Object[3];
		source[0] = "富贵平安";
		source[1] = "吉祥如意";
		source[2] = "年年有余";
		List<String> target = new ArrayList<String>();
		
		GenericFunction gf = new GenericFunction();
		System.out.println(gf.copyArrayToList(source, target));
		//父类, Fruit相当于T类型
		Fruit[] fruit = new Fruit[3];
		Fruit f1 = new Fruit();
		Fruit f2 = new Fruit();
		Fruit f3 = new Fruit();
		//子类, Banana相当于S类型
		List<Banana> list = new ArrayList<>();
		
		new GenericFunction().copyArrayToList(fruit, list);
		
	}

}
