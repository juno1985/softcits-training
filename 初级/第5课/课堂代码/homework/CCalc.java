package homework;

public class CCalc {
	public double area(int base, int height){
		return (double)base*height/2;
	}
	double area(int radius){
		double pi = 3.14;
		
		return Math.PI * radius * radius;
	}
	public double area(int upper, int base, int height){
		return (double)(upper + base)*height/2;
	}
	public static void main(String[] args) {
		
	}
}
