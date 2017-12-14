import java.util.ArrayList;
import java.util.List;

public class GenericUpperBound {
	//设定类型通配符的上限，
	public void print(List<? extends Apple> apples){
		for(Apple a : apples)
			System.out.println(a.getInfo());
	}
	public static void main(String[] args) {
		List<Apple> listA = new ArrayList<>();
		//创建Apple的子类对象
		A1 a1 = new A1("红苹果");
		A1 a2 = new A1("青苹果");
		A1 a3 = new A1("黄苹果");
		
		listA.add(a1);
		listA.add(a2);
		listA.add(a3);
		
		GenericUpperBound gub = new GenericUpperBound();
		//由于A1是Apple的子类，以下可以正常运行
		gub.print(listA);
	}

}
