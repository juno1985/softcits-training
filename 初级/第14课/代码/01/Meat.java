package one;

public class Meat {
	public void price(){
		System.out.println("Meat的方法...");
	}
}
class Beef extends Meat{
	//更改price的拼写会报错
	@Override
	public void price(){
		System.out.println("牛肉重写Meat的方法...");
	}
}