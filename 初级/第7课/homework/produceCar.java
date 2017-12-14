package homework;

public class produceCar {
	//模板模式
	public static void main(String[] args) {
		/*autoProduction toyota = new ToyotaCar();
		toyota.run();
		autoProduction dasAuto = new dasAutoCar();
		dasAuto.run();
		
		autoProduction dasAuto1 = new dasAutoCar();
		dasAuto.run();
		
		produceCar pc = new produceCar();*/
		
		//匿名内部类
		(new autoProduction(){
			public void startEngine(){
				System.out.println("Start Poscher Engine!");
			}
			public void turnOffEngine(){
				System.out.println("TurnOff Poscher Engine!");
			}
			public void alarm(){
				System.out.println("Press alarm of Poscher!");
			}
		}).run();
	}

}
