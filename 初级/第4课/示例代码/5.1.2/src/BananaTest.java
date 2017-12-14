
public class BananaTest {
	public static void main(String[] args) 
	{
		//创建Banana的对象
		Banana b = new Banana();

		//父类的成员
		b.weight = 100;
		
		//子类自己的成员
		b.origin = "猴子国";
		b.spot = true;
		
		//调用父类的方法
		b.info();
		
		//子类自己的方法
		b.check_quality();
	}
}
