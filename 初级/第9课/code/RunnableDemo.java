
public class RunnableDemo implements Runnable {
	//使用Runnable实现类，多线程之间可以共享实例变量！！！
	private int i;
	
	@Override
	public void run() {
		for(; i < 10; i++){
			//获取当前线程名字
			System.out.println(Thread.currentThread().getName() +"运行第: "+ i +"次");
		}
	}
	public static void main(String[] args){
		for(int i = 0; i < 10; i++){
			//通过Thread的静态方法currentThread获取当前线程
			//main方法是JVM启动的主线程
			System.out.println(Thread.currentThread().getName() +"运行第: "+ i +"次");
			if(i == 3){
				//创建Runnable接口实现类的实例
				RunnableDemo rd = new RunnableDemo();
				//所有新创建的线程共享Runnable接口实现类实例
				new Thread(rd, "线程1").start();
				new Thread(rd, "线程2").start();
			}
		}
	}

}
