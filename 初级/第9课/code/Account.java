public class Account
{
	// 封装账户编号、账户余额的两个成员变量
	private String accountNo;
	private double balance;
	public Account(){}
	// 构造器
	public Account(String accountNo , double balance)
	{
		this.accountNo = accountNo;
		this.balance = balance;
	}
	// accountNo的setter和getter方法
	public void setAccountNo(String accountNo)
	{
		this.accountNo = accountNo;
	}
	public String getAccountNo()
	{
		return this.accountNo;
	}

	// balance的setter和getter方法
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public double getBalance()
	{
		return this.balance;
	}
}