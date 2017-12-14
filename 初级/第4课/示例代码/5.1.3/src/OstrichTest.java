
public class OstrichTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建Ostrich对象
		Ostrich os = new Ostrich();
		//执行Ostrich对象的fly方法，将输出"我只能在地上奔跑..."
		//此时，子类自己的方法最优先，也就是覆盖
		os.fly();
	}

}
