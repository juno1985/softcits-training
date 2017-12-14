
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Moblie phone : Moblie.values())
		{
			if (phone.getOs().equals("Android")
				&& phone.getPrice() <= 3000
				&& phone.getPrice() >= 2000) {
				System.out.println(phone.toString()+":"+phone.getPrice());
			}
		}
	}

}
