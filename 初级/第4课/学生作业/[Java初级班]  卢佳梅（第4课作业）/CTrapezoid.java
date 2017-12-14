package lx1;

public class CTrapezoid {
	public float upper;
	public float base;
	public float height;

	// public CTrapezoid(float upper, float base,float height)
	// this.upper =upper;
	// this.base =base;
	// this.height=height;
	public float area() {
		return (upper + base) * height / 2;
	}
	public void show() {
		System.out.println("upper:"+ upper + "\t");
		System.out.println("base:"+ base + "\t");
		System.out.println("height:"+height);
	}
}
