package homework;

public class CTrapezoid {
	public double upper;
	public double base;
	public double height;
	public double area(){
		return (upper+base)*height/2;
	}
	
	public CTrapezoid(double upper, double base, double height) {
		super();
		this.upper = upper;
		this.base = base;
		this.height = height;
	}
	public void show(){
		System.out.println("upper: " + upper + "base: " + base
				+ "height: " + height);}

	
	@Override
	public String toString() {
		return "CTrapezoid [upper=" + upper + 
				", ubase=" + base + ", height=" + height + "]";
	}

	public static void main(String[] args) {
		CTrapezoid cz = new CTrapezoid(4,9,5);
		/*System.out.println(cz.area());
		cz.show();*/
		System.out.println(cz);
	}

}
