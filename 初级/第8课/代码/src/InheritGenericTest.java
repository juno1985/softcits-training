import java.util.ArrayList;
import java.util.List;

public class InheritGenericTest {

	public void print(List<Object> l){
		for (int i = 0; i < l.size(); i++)
			System.out.println(l.get(i));
	}
	public static void main(String[] args) {
		List<String> listStr = new ArrayList<>();
		listStr.add("流川枫");
		listStr.add("樱木");
		InheritGenericTest igt = new InheritGenericTest();
		//由于List<Object>并不是List<String>的父类，下面将引发错误
		igt.print(listStr);
	}
}
