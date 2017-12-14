package reflect.demo.cn;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {
	private String rt = "Reflection Testing";
	
	public ReflectionTest() {
	}

	public void printHello(){
		System.out.println("Hello!");
	}
	
	public void printString(String a){
		System.out.println(a);
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException{
		// 根据字符串来获取对应的Class对象
//	Class<?> clazz = Class.forName("reflect.demo.cn.ReflectionTest");
//		Class clazz = ReflectionTest.class;
	    ReflectionTest rt1 = new ReflectionTest();
		Class clazz = rt1.getClass();
		//生成没有参数的方法
		Method mtd = clazz.getMethod("printHello");
		//生成实列
		Object obj = clazz.newInstance();
		//调用无参方法
		mtd.invoke(obj);
		
		//生成参数为String类型 名字为pringString 的方法
		mtd = clazz.getMethod("printString", String.class);
		//设定参数为input string，调用方法
		mtd.invoke(obj, "input string");
		
		//生成成员变量
		Field fd = clazz.getDeclaredField("rt");
		//设置私有成员变量可访问
		fd.setAccessible(true); 
		
		//访问成员变量值
		System.out.println("Filed rt vaule is: "+ fd.get(obj));
	}

}
