package homework;

public abstract class autoProduction {
	public abstract void startEngine();
	public abstract void turnOffEngine();
	public abstract void alarm();
	public void run(){
		startEngine();
		alarm();
		turnOffEngine();
	}
}
