package lx1;

public class CTrapezoidtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float s;
		CTrapezoid count1 = new CTrapezoid();
		count1.upper = 4;
		count1.base = 9;
		count1.height = 5;
		System.out.println("Arae is " + count1.area());
		s = count1.area();
		System.out.println("Arae is " + s);
		count1.show();
	}

}
