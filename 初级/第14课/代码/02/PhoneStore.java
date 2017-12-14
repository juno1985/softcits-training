package one;
class Nokia{
	@Deprecated
	public void phone(){
		System.out.println("Nokia's phone");
	}
}
public class PhoneStore {
	public static void main(String[] args){
		new Nokia().phone();
	}
}
