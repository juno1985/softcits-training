package homework;

public class CCalculator {
	private int a;
	private int b;
	private int c;
	
	public void set_value(int x, int y, int z){
		this.a = x;
		this.b = y;
		this.c = z;
	}
	public int add(){
		return this.a + this.b + this.c;
	}
	public int sub(){
		return this.a - this.b - this.c;
	}
	public int mul(){
		return a * b * c;
	}
	public double avg(){
		return (double)add()/3;
	}
	public static void main(String[] args) {
		CCalculator cc = new CCalculator(	);
		cc.set_value(2, 3, 4);
	}

}
