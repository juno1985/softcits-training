
abstract class autoProduction {
	public abstract void startEngine();
	public abstract void turnOffEngine();
	public abstract void alarm();
	public void run(){
		startEngine();
		alarm();
		turnOffEngine();
	}

}
class HondaCar extends autoProduction {

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("start Honda engine!");
	}

	@Override
	public void turnOffEngine() {
		// TODO Auto-generated method stub
		System.out.println("turn off Honda engine!");
	}

	@Override
	public void alarm() {
		// TODO Auto-generated method stub
		System.out.println("press Honda alarm!");
	}

}
public class produceCar {
	//Ä£°åÄ£Ê½
	public static void main(String[] args) {
		autoProduction honda = new HondaCar();
		honda.run();
	}

}
