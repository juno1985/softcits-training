package reflect.demo.cn;
import java.util.*;
import java.lang.reflect.*;
import java.lang.annotation.*;

public class ClassTest
{
	// 为该类定义一个私有的构造器
	private ClassTest()
	{
	}
	// 定义一个有参数的构造器
	public ClassTest(String name)
	{
		System.out.println("执行有参数的构造器");
	}
	// 定义一个无参数的info方法
	public void info()
	{
		System.out.println("执行无参数的info方法");
	}
	// 定义一个有参数的info方法
	public void info(String str)
	{
		System.out.println("执行有参数的info方法"
			+ "，其str参数值：" + str);
	}
	// 定义一个测试用的内部类
	class Inner
	{
	}
	public static void main(String[] args)
		throws Exception
	{
		// 下面代码可以获取ClassTest对应的Class
		Class<ClassTest> clazz = ClassTest.class;
		// 获取该Class对象所对应类的全部构造器
		Constructor[] ctors = clazz.getDeclaredConstructors();
		System.out.println("ClassTest的全部构造器如下：");
		for (Constructor c : ctors)
		{
			System.out.println(c);
		}
		// 获取该Class对象所对应类的全部public构造器
	   Constructor[] publicCtors = clazz.getConstructors();
		System.out.println("ClassTest的全部public构造器如下：");
		for (Constructor c : publicCtors)
		{
			System.out.println(c);
		}
		// 获取该Class对象所对应类的全部public方法
		Method[] mtds = clazz.getMethods();
		System.out.println("ClassTest的全部public方法如下：");
		for (Method md : mtds)
		{
			System.out.println(md);
		}
		// 获取该Class对象所对应类的指定方法
		System.out.println("ClassTest里带一个字符串参数的info()方法为："
			+ clazz.getMethod("info" , String.class));
		// 获取该Class对象所对应类的上的全部注解
		Annotation[] anns = clazz.getAnnotations();
	
		// 获取该Class对象所对应类的全部内部类
		Class<?>[] inners = clazz.getDeclaredClasses();
		System.out.println("ClassTest的全部内部类如下：");
		for (Class c : inners)
		{
			System.out.println(c);
		}
		// 使用Class.forName方法加载ClassTest的Inner内部类
		Class inClazz = Class.forName("reflect.demo.cn.ClassTest$Inner");
		// 通过getDeclaringClass()访问该类所在的外部类
		System.out.println("inClazz对应类的外部类为：" +
			inClazz.getDeclaringClass());
		System.out.println("ClassTest的包为：" + clazz.getPackage());
		System.out.println("ClassTest的父类为：" + clazz.getSuperclass());
	}
}

