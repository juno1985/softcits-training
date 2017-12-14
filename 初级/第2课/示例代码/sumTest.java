package class01;
public class sumTest {
	public static int totalNum(int a, int b, int c) {
		int sum = 0;
		for (; a < c; a += b) {
			sum += a;
		}
		return sum;
	}

	public static void main(String[] args) {
		int b = 1;
		System.out.println(totalNum(b, 3, 1000));
		b= 60;
		System.out.println(totalNum(b,6, 9999));
		b =80;
		System.out.println(totalNum(b,9, 1888));
	}
}
