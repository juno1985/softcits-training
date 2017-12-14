
class CCalc {
	
	public static double area(int base,int height){
		return (double)(base*height)/2;
	}
	public static double area(int radius){
		return (Math.PI*radius*radius);
	}
	public static double area(int upper,int base,int height){
		return (double)(upper+base)*height/2;
	}
}

public class CCalcTest{
	public static void main(String[] args){
	System.out.println(CCalc.area(2));
	System.out.println(CCalc.area(4,3));
	System.out.println(CCalc.area(5,4,3));
	System.out.println(CCalc.area(3));
	System.out.println(CCalc.area(3,2));
	System.out.println(CCalc.area(4,4,2));
	}
}
