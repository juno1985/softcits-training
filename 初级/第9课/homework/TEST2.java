package StudentHomework;

class printResult {
	// 标志位，用来控制线程1，2，3的执行顺序
	private int state = 1;
	// 线程1，2，3共享的变量
	private int num = 1;

	public synchronized void printNumbers(String threadName) {
		int id = Integer.parseInt(threadName);
		// 如果不是该轮到当前线程执行的话，则等待
		while (state != id) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// 如果是当前线程执行的，则打印
		for (int i = 1; i <= 3; i++) {
			System.out.println("当前线程 " + threadName + " 打印:" + num++);
		}
		// state的值以 2,3,1,2,3,1...循环取值
		state = state % 3 + 1;
		//忘记唤醒其他线程
		this.notifyAll();
	}
}
/*class printThread implements Runnable{
	private printResult pr;
	
	public printThread(printResult pr) {
		super();
		this.pr = pr;
	}

	public void run() {
		for (int j = 0; j < 5; j++) {
			pr.printNumbers(Thread.currentThread().getName());
		}
	}
}*/

public class TEST2 {

	public static void main(String[] args) {
		printResult pr = new printResult();

		// 一共创建三个线程
		for (int i = 1; i <= 3; i++) {
			// 通过匿名类创建子线程1，2，3
			new Thread(new Runnable() {
				// 重写匿名类Runnable的run方法，从而创建实现类对象
				public void run() {
					for (int j = 0; j < 5; j++) {
						pr.printNumbers(Thread.currentThread().getName());
					}
				}
			}, Integer.toString(i)).start();
			
//			new Thread(new printThread(pr), Integer.toString(i)).start();
		}
	}

}
