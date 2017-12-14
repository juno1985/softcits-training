package softcits;

/**
 * 定义一个Superclass类，在该类中定义private修饰的私有方法print()。然后创建子类与其它类进行访问，并把鼠标停留在有错误的代码位置
 * ，查看Eclipse的Java编译器提示的错误信息。
 */
public class MainClass {
	public static void main(String[] args) {
		SuperClass object = new SuperClass();
		object.print();
	}
}
