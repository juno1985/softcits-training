package lx1;

public class CCalc {
	public static double area(int base, int height){
		return(base*height)/2;
	}
	public double area(int radius){
		return(3.14159*radius*radius);
	}
	public static double area(int upper, int base, int height){
		return(upper+base)*height/2;
	}
}
