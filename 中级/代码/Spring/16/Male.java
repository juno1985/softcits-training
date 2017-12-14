package inter;

public class Male implements Person {

	private Bread bread;
//没有提供setter方法，而是通过构造器注入	
	public Male(Bread bread) {
		this.bread = bread;
	}

	@Override
	public void eatBread() {
		System.out.println(bread.eaten());
	}

}
