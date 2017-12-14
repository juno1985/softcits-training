package lx1;

public class CCalctest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CCalc count1=new CCalc();
		int upper=5;
		int base=7;
		int height=8;
		int radius=3;
		count1.area(radius);{
			System.out.println(count1.area(radius));
			System.out.println(count1.area(base, height));
			System.out.println(count1.area(upper, base, height));
		}
	}

}
