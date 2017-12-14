
class CTrapezoid {
	float upper;
	float base;
	float height;
	public CTrapezoid(float upper,float base,float height){
		this.upper = upper;
		this.base = base;
		this.height = height;
	}
	public void show(){
		System.out.println("upper:"+upper);
		System.out.println("base:"+base);
		System.out.println("height:"+height);
	}
	public float area(){
		return (upper+base)*height/2;
	}
}

public class CTrapezoidTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTrapezoid c1 = new CTrapezoid(4,9,5);
		c1.show();
		System.out.println("Ãæ»ý£º"+ c1.area());
	}

}
