
class Chinese{
	static String nation;
	int age;
	boolean sex;
	public Chinese(String nation){
		this.nation = nation;
	}
}

public class ChineseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chinese mzd = new Chinese("中华民国");
		Chinese zel = new Chinese("中华民国");
		Chinese dxp = new Chinese("中华民国");
		System.out.println("毛泽东："+mzd.nation);
		System.out.println("周恩来："+zel.nation);
		System.out.println("邓小平："+dxp.nation);
		Chinese.nation = "中华人民共和国";
		System.out.println("毛泽东："+mzd.nation);
		System.out.println("周恩来："+zel.nation);
		System.out.println("邓小平："+dxp.nation);
	}

}
