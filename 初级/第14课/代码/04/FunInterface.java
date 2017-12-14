package one;
@FunctionalInterface
public interface FunInterface {
	static void foo(){
		System.out.println("类方法");
	}
	default void bar(){
		System.out.println("默认方法");
	}
	void test();
	//void test2();
}
