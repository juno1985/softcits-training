package StudentHomework;

class Print2 {
	int status = 1;
    
	//上锁
	public synchronized void printABC(String ThreadName, int j) throws InterruptedException {
		int id = Integer.parseInt(ThreadName);
		//等待
		while (status != id) {
			wait();
		}
		if (id == 1)
			System.out.println("线程" + Thread.currentThread().getName() + " 第   " + j + " 次输出->" + "A");
		if (id == 2)
			System.out.println("线程" + Thread.currentThread().getName() + " 第  " + j + " 次输出->" + "B");
		if (id == 3)
			System.out.println("线程" + Thread.currentThread().getName() + " 第  " + j + " 次输出->" + "C");
		//唤醒
		this.notifyAll();
		status = status % 3 + 1;
	}
}

public class TEST3 {

	public static void main(String[] args) {
		Print2 print = new Print2();
		//新建三条线程
		for (int i = 1; i <= 3; i++) {
			new Thread(new Runnable() {
				public void run() {
					//每条线程运行十次
					for (int j = 1; j <= 10; j++) {
						try {
							print.printABC(Thread.currentThread().getName(), j);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}, Integer.toString(i)).start();
		}

	}

}
