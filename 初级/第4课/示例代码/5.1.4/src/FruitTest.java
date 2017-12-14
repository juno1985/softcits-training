
public class FruitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a = new Apple();
		a.weight = 250;
		a.color = "Red";
		a.info();
		
		Banana b = new Banana();
		b.origin = "ÖÐ¹ú";
		b.spot = false;
		b.weight = 100;
		b.info();
		b.check_quality();
	}

}
