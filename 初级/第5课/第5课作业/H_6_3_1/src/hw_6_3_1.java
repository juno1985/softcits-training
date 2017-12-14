//图形类
abstract class CShape {	
	protected int width;
	protected int height;
	
	public void show() {
		System.out.println("width=" + width);
		System.out.println("height=" + height);
		System.out.println("area=" + area());
	}
	public abstract int area();	//计算图形面积
}

//三角形类
class CTriangle extends CShape{
	//请完成这个部分的程序代码
}

public class hw_6_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTriangle tri = new CTriangle(5,7);
		tri.show();
	}

}
