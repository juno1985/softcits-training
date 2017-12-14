package homework;

public class BankCus {

	public static void main(String[] args) {
		Customer cus1 = new Customer();
		cus1.setFirstName("峰");
		cus1.setLastName("乔");
		
		Customer cus2 = new Customer();
		cus2.setFirstName("誉");
		cus2.setLastName("段");

		Customer cus3 = new Customer();
		cus3.setFirstName("竹");
		cus3.setLastName("虚");
		
		Bank bank = new Bank();
		bank.addCustomer(cus1);
		bank.addCustomer(cus2);
		bank.addCustomer(cus3);
//		System.out.println(bank.getCustomers());
		
		bank.deleteCustomer(cus1);
//		System.out.println("是否包含用户: " + bank.loadCustomer(cus1));
		
		System.out.println(bank.getCustomers());
		
		System.out.println("当前客户数量: "+bank.numCustomer());
		
	}

}
