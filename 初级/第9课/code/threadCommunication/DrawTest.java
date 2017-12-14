package threadCommunication;


public class DrawTest
{
	public static void main(String[] args)
	{
		// 创建一个账户
		Account acct = new Account("工商银行卡" , 0);
		
		new DepositThread("张三存款" , acct , 800).start();
		new DrawThread("儿子取款" , acct , 800).start();
		new DrawThread("女儿取款" , acct , 800).start();
		new DrawThread("老婆取款" , acct , 800).start();

	}
}
