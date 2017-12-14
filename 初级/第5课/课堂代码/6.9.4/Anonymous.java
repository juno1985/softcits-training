package six.nine.four;

class CInner {
	int num;
	void set_sum(int n) {
	}
}

public class Anonymous {

	public static void main(String[] args) {
		(new CInner(){
			void set_num(int n) {
				num = n;
				System.out.println("num="+num);
			}
		}).set_num(5);
	}

}
