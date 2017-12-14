
import java.util.concurrent.*;
public class ThreadPoolTest
{
	public static void main(String[] args)
		throws Exception
	{
		// 创建一个具有固定线程数（6）的线程池
		ExecutorService pool = Executors.newFixedThreadPool(6);
		// 向线程池中提交两个线程
		pool.submit(new Runnable(){

			@Override
			public void run() {
				Thread.currentThread().setName("子线程1");
				for (int i = 0; i < 10 ; i++ )
				{
					System.out.println(Thread.currentThread().getName()
						+ " 执行次数: " + i);
				}
				
			}});
		
		pool.submit(new Runnable(){
			@Override
			public void run() {
				Thread.currentThread().setName("子线程2");
				for (int i = 0; i < 15 ; i++ )
				{
					System.out.println(Thread.currentThread().getName()
						+ " 执行次数: " + i);
				}
				
			}
		});
		// 关闭线程池
		pool.shutdown();
	}
}

