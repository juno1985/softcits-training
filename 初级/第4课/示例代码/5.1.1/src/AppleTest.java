
public class AppleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建Apple的对象
		Apple a = new Apple();
		//Apple对象本身没有weight Field
		//因为Apple的父类有weight Field，所以Apple对象也有weight
		a.weight = 56;
		//同理Apple对象也有info方法
		a.info();
	}

}
