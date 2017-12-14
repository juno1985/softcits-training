
public class ThreadDemo extends Thread {
	//使用继承Thread主类创建的线程，多线程之间无法共享实例变量！！！
	private int i;
	
	@Override
	public void run() {
		for(; i < 10; i++){
			//使用getName可以获取当前线程名字
			System.out.println(getName() +"运行第: "+ i +"次");
		}
	}
	public static void main(String[] args){
		int j = 0;
		for(int i = 0; i < 10; i++){
			//通过Thread的静态方法currentThread获取当前线程
			//main方法是JVM启动的主线程
			System.out.println(Thread.currentThread().getName() +"运行第: "+ i +"次");
			if(i == 3){
				//创建第一个线程实例
				ThreadDemo td1 = new ThreadDemo();
				//给线程设置名称
				td1.setName("线程编号:" + Integer.toString(++j));
				td1.start();
				//创建第二个线程实例
				ThreadDemo td2 = new ThreadDemo();
				td2.setName("线程编号:" + Integer.toString(++j));
				td2.start();
			}
		}
	}

}
