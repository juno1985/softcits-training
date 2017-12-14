package spring;

public class Person {
	private Bread bread;

	public Bread getBread() {
		return bread;
	}
	//setter method will be auto triggered in beans.xml
	public void setBread(Bread bread) {
		this.bread = bread;
	}
	
	public void eatBread(){
		System.out.println("Meal begins:");
		//bread object will be auto injected thru setter
		System.out.println(bread.eaten());
	}
	public Person() {
	}
	public Person(Bread brd) {
		this.bread = brd;
	}
	
}
