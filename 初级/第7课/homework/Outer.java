package homework;

public class Outer {
	
	private class Inner{
		Inner(){}
	}
	private Inner function(){
		return new Inner();
	}
	public static void main(){
		Outer.Inner in = new Outer().new Inner();
	}
}
