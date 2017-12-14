//实现Logistics接口
public class EatMc implements Eat{
	//重写接口中的方法
	//这里的方法只是模拟实际业务中的主方法
	public void eat(String stuff){
		System.out.println("Eating the " + stuff + "!");
	};
	public void drink(){
		System.out.println("Driking the cocacola!");
	};

}
