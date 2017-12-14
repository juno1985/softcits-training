package app.factory;

import app.service.impl.*;
import app.service.*;

public class BeingFactory
{
	// 返回Being实例的静态工厂方法
	// arg参数决定返回哪个Being类的实例
	public static Being getBeing(String arg)
	{
		// 调用此静态方法的参数为dog，则返回Dog实例
		if (arg.equalsIgnoreCase("dog"))
		{
			return new Dog();
		}
		// 否则返回Cat实例
		else
		{
			return new Cat();
		}
	}
}
