package lx1;

public class chinesetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chinese newchainese1=new chinese();//创建中国人的对象
		chinese newchainese2=new chinese();
		chinese newchainese3=new chinese();
		chinese.printnationality();
	
		System.out.println("周恩来的国籍："+newchainese1.nationality);
		System.out.println("毛泽东的国籍："+newchainese2.nationality);
		System.out.println("邓小平的国籍："+newchainese3.nationality);
		newchainese1.nationality="中华人民共和国";
		System.out.println("========================");
		System.out.println("周恩来的国籍："+newchainese1.nationality);
		System.out.println("毛泽东的国籍："+newchainese2.nationality);
		System.out.println("邓小平的国籍："+newchainese3.nationality);
	}

}
