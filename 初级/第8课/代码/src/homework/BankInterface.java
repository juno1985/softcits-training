package homework;

public interface BankInterface {
	//增加客户
	void addCustomer(CustomerInterface customer);
	//查找客户 ture/false
	boolean loadCustomer(CustomerInterface customer);
	//删除客户
	void deleteCustomer(CustomerInterface customer);
	//返回该银行的客户数量
	int numCustomer();
}
