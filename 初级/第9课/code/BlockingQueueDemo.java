import java.util.concurrent.*;

class Producer extends Thread
{
	private BlockingQueue<String> bq;
	public Producer(BlockingQueue<String> bq)
	{
		this.bq = bq;
	}
	public void run()
	{
		String[] strArr = new String[]
		{
			"Java",
			"Struts",
			"Spring"
		};
		for (int i = 0 ; i < 10 ; i++ )
		{
			try
			{
				Thread.sleep(200);
				// 尝试放入元素，如果队列已满，线程被阻塞
				bq.put(strArr[i % 3]);
			}
			catch (Exception ex){ex.printStackTrace();}
			System.out.println(getName() + "生产完成");
		}
	}
}
class Consumer extends Thread
{
	private BlockingQueue<String> bq;
	public Consumer(BlockingQueue<String> bq)
	{
		this.bq = bq;
	}
	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(200);
				// 尝试取出元素，如果队列已空，线程被阻塞
				bq.take();
			}
			catch (Exception ex){ex.printStackTrace();}
			System.out.println(getName() + "消费完成");
		}
	}
}
public class BlockingQueueDemo
{
	public static void main(String[] args)
	{
		// 创建一个容量为1的BlockingQueue
		BlockingQueue<String> bq = new ArrayBlockingQueue<>(3);
		// 启动3条生产者线程
		new Producer(bq).start();
		new Producer(bq).start();
		new Producer(bq).start();
		// 启动一条消费者线程
		new Consumer(bq).start();
	}
}