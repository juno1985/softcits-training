package lx1;

public class TVtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prize = 0;
		TV tv1 = new TV();
		tv1.brand = "三星";
		tv1.add = "韩国";
		tv1.size = 60;
		tv1.prize = 12800;

		TV tv2 = new TV();
		tv2.brand = "小米";
		tv2.add = "中国";
		tv2.size = 60;
		tv2.prize = 9999;
		TV tv3 = new TV();
		tv3.brand = "海尔";
		tv3.add = "中国";
		tv3.size = 60;
		tv3.prize = 8888;
		TV tv4 = new TV();
		tv4.brand = "苹果";
		tv4.add = "美国";
		tv4.size = 60;
		tv4.prize = 12800;
		if (prize > 10000);
		{
			System.out.println("海尔：" + "我是土豪机");
			System.out.println("苹果：" + "我是土豪机");
			System.out.println("小米：" + "我是土豪机");
			System.out.println("三星：" + "我是土豪机");
		}
	}
}
