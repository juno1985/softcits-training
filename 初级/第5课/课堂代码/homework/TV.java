package homework;

public class TV {
	private String tradeMark;
	private String country;
	private int size;
	private int price;
	
	public TV(){}
	
	public TV(String tradeMark, String country, int size, int price) {
		super();
		this.tradeMark = tradeMark;
		this.country = country;
		this.size = size;
		this.price = price;
	}

	public String getTradeMark() {
		return tradeMark;
	}
	public void setTradeMark(String tradeMark) {
		this.tradeMark = tradeMark;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void print(){
		if(this.price > 10000)
			System.out.println("我是土豪机");
	}
	public static void main(String[] args){
		TV tv1 = new TV("三星", "韩国", 60, 12800);
		tv1.print();
	}
}
