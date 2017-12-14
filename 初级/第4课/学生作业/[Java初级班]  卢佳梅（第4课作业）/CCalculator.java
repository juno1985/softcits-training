package lx1;

public class CCalculator {
	public int a;
	public int b;
	public int c;
	public void set_value(int x, int y, int z){
		
	}
	public void show(){
		System.out.print(a+"\t");
		System.out.print(b+"\t");
		System.out.print(c+"\t");
	}
	public float add(){
		return(a+b+c);
	}
	public float sub(){
		return(a-b-c);
	}
	public float mul(){
		return(a*b*c);
	}
	public double avg(){
		return(double)(a+b+c)/3;
	}
}
