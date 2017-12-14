
public class StartEat {
	public static void main(String[] args){
		//创建一个原始的EatMc对象，用来生成被代理对象
		Eat target = new EatMc();
		
		//生成代理对象
		Eat eat =(Eat) EatProxyFactory.getProxy(target);
		//调用eat任意方法，prepareTable 与 cleanTable会被自动插入
		eat.eat("humbuger");
		//调用eat任意方法，prepareTable 与 cleanTable会被自动插入
		eat.drink();
	}

}