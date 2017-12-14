package one;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
//使JVM能够通过反射提取该annotation信息
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTag {
	//定义两个成员变量，成员变量以方法的形式来定义
	String name() default "alex";
	int age() default 32;
}
