
class TV {
	String brand;
	String location;
	int size;
	double price;
	public TV(String brand,String location,int size,double price){
		this.brand=brand;
		this.location=location;
		this.size=size;
		this.price=price;
	}
	public void print(){
//		System.out.println("品牌:"+brand);
//		System.out.println("产地:"+location);
//		System.out.println("尺寸:"+size);
//		System.out.println("价格:"+price);
//		if (price>10000){
//			System.out.println("我是土豪机");
		if (price>10000){
		System.out.println(brand+"\t"+location+"\t"+size+"\t"+price+"\t\t我是土豪机");
		}
		else
		System.out.println(brand+"\t"+location+"\t"+size+"\t"+price);
	}
}


public class TVTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV t1 = new TV("三星","韩国",60,12800);
		TV t2 = new TV("小米","中国",70,9999);
		TV t3 = new TV("海尔","中国",65,8888);
		TV t4 = new TV("苹果","美国",60,16800);
		System.out.println("品牌\t产地\t尺寸\t价格");
		t1.print();
		t2.print();
		t3.print();
		t4.print();
	}

}
