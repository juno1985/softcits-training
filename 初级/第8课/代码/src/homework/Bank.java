package homework;
import java.util.*;
public class Bank implements BankInterface {
	//集合保存所有客户对象
	private List<Customer> customers;
	//保存客户的数量
	private int numOfCus;
	
	
	public Bank() {
		this.customers =new ArrayList<>();
		this.numOfCus = 0;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List customers) {
		this.customers = customers;
	}

	public int getNumOfCus() {
		return numOfCus;
	}

	public void setNumOfCus(int numOfCus) {
		this.numOfCus = numOfCus;
	}

	@Override
	public void addCustomer(CustomerInterface customer) {
		customers.add((Customer)customer);
	}

	@Override
	public boolean loadCustomer(CustomerInterface customer) {
		return customers.contains((Customer)customer);
	}

	@Override
	public void deleteCustomer(CustomerInterface customer) {
		customers.remove((Customer)customer);
	}

	@Override
	public int numCustomer() {
		return customers.size();
	}

}
