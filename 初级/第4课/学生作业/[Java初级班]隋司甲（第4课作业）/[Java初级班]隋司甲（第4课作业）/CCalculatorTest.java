
class CCalculator {
	private int a;
	private int b;
	private int c;
	public CCalculator(int i,int j,int k){
		set_value(i,j,k);
		add();
		sub();
		mul();
		avg();
	}
	public void set_value(int x,int y,int z){
		a=x;
		b=y;
		c=z;
	}
	public void show(){
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}
	public int add(){
		return (a+b+c);
	}
	public int sub(){
		return (a-b-c);
	}
	public int mul(){
		return (a*b*c);
	}
	public double avg(){
		return (double)add()/3;
	}
}
public class CCalculatorTest{
	public static void main(String[] args){
		CCalculator c1 = new CCalculator(1,2,2);
		CCalculator c2 = new CCalculator(3,4,5);
		CCalculator c3 = new CCalculator(2,5,6);
		System.out.println("\tadd\tsub\tmul\tavg");
		System.out.println("c1:\t"+c1.add()+"\t"+c1.sub()+"\t"+c1.mul()+"\t"+c1.avg());
		System.out.println("c2:\t"+c2.add()+"\t"+c2.sub()+"\t"+c2.mul()+"\t"+c2.avg());
		System.out.println("c3:\t"+c3.add()+"\t"+c3.sub()+"\t"+c3.mul()+"\t"+c3.avg());
	}
}

