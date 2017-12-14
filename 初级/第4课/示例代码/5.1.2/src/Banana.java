public class Banana extends Fruit
{
	//Banana类增加的成员变量
	boolean spot;  //是否有斑点
	String origin; //产地
	
	//Banana类增加的方法
	void check_quality() {
		System.out.print("我产自"+origin+"!");
		if (spot == true){
			System.out.println("我是烂香蕉");
		} else {
			System.out.println("我是好香蕉");
		}
	}
}
