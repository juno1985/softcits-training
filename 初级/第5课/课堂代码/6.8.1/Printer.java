package six.eight.one;

import java.text.SimpleDateFormat;
import java.util.Date;

// 定义一个Product接口
interface Product
{
	String getProduceTime();
}
// 让Printer类实现Output和Product接口
public class Printer implements Output , Product
{
	private String[] printData
		= new String[MAX_CACHE_LINE];
	// 用以记录当前需打印的作业数
	private int dataNum = 0;
	public void out()
	{
		// 只要还有作业，继续打印
		while(dataNum > 0)
		{
			System.out.println("打印机打印：" + printData[0]);
			// 把作业队列整体前移一位，并将剩下的作业数减1
			System.arraycopy(printData , 1
				, printData, 0, --dataNum);
		}
	}
	public void getData(String msg)
	{
		if (dataNum >= MAX_CACHE_LINE)
		{
			System.out.println("输出队列已满，添加失败");
		}
		else
		{
			// 把打印数据添加到队列里，已保存数据的数量加1。
			printData[dataNum++] = msg;
		}
	}
	public String getProduceTime()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); 
		return sdf.format(new Date().getTime());
	}
	public static void main(String[] args)
	{
		// 创建一个Printer对象，当成Output使用
		Output o = new Printer();
		o.getData("小隋打印作业");
		o.getData("丹丹打印照片");
		o.out();
		o.getData("李腾达打印新闻");
		o.getData("李若星打印论文");
		o.out();

		o.getData("连续打印1");
		o.getData("连续打印2");
		o.getData("连续打印3");
		o.getData("连续打印4");
		o.getData("连续打印5");
		o.getData("连续打印6");
		o.out();
		o.getData("连续打印7");
		o.out();
		
		// 调用Output接口中定义的默认方法
		o.print("孙悟空" , "猪八戒" , "白骨精");
		o.test();
		
		// 创建一个Printer对象，当成Product使用
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		// 所有接口类型的引用变量都可直接赋给Object类型的变量
		Object obj = p;
	}
}
