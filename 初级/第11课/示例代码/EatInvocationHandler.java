import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EatInvocationHandler implements InvocationHandler{
	//需要被代理的对象
	private Object target;

	//执行动态代理对象的所有方法时，都会被替代执行如下的invoke方法
	//各参数含义
	//proxy - 代表动态代理对象
	//method - 代表正在执行的方法
	//args - 代表调用目标方法时传入的实参
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		TableAction ta = new TableAction();
		ta.prepareTable();
		
		//以target对象作为主调，来执行method方法
		Object result = method.invoke(target, args);
		
		ta.cleanTable();
		return result;
	}

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}
	

}
