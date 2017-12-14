package inter;

public class Male implements Person {

	private Bread bread;
	
	public void setBread(Bread bread) {
		this.bread = bread;
	}

	@Override
	public void eatBread() {
		System.out.println(bread.eaten());
	}

}
