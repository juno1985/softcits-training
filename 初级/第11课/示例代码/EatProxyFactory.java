import java.lang.reflect.Proxy;

public class EatProxyFactory {
	//为传入的target对象生成动态代理对象
	public static Object getProxy(Object target){
		//创建一个InvocationHandler对象
		EatInvocationHandler eatIH = new EatInvocationHandler();
		
		//传入被代理对象
		eatIH.setTarget(target);
				
		//创建并返回一个动态代理
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), eatIH);
	}

}
