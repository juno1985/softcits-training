package six.nine.four;

public class Cow
{
	private double weight;
	// 外部类的两个重载的构造器
	public Cow(){}
	public Cow(double weight)
	{
		this.weight = weight;
	}
	// 定义一个非静态内部类
	private class CowLeg
	{
		// 非静态内部类的两个实例变量
		private double length;
		private String color;
		// 非静态内部类的两个重载的构造器
		public CowLeg(){}
		public CowLeg(double length , String color)
		{
			this.length = length;
			this.color = color;
		}
		public void setLength(double length)
		{
			this.length = length;
		}
		public double getLength()
		{
			return this.length;
		}
		public void setColor(String color)
		{
			this.color = color;
		}
		public String getColor()
		{
			return this.color;
		}
		// 非静态内部类的实例方法
		public void info()
		{
			System.out.println("当前牛腿颜色是："
				+ color + ", 高：" + length);
			// 直接访问外部类的private修饰的成员变量
			System.out.println("本牛腿所属奶牛重：" + weight);   //##访问了外部类的private成员
		}
	}
	public void test()
	{
		//省略部位的Test代码
		CowLeg cl = new CowLeg(1.12 , "黑白相间");
		cl.info();
		//下面试图访问内部类的成员，会出现编译错误
		//System.out.println("内部类成员访问color：" + color); 
		//外部类可以通过内部类的对象访问内部类成员（但是最好通过getter和setter方法访问）
	//	cl.color = "红";
		cl.setColor("黑");
		cl.info();
	}
	public static void main(String[] args)
	{
		Cow cow = new Cow(378.9);
		cow.test();
	}
}
