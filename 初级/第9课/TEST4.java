package StudentHomework;

public enum TEST4 {

	Phone1("Nokia", "WindowsPhone", 4000), Phone2("Samsung", "Android", 5000), Phone3("iPhone", "iOS", 6000), Phone4(
			"MI", "Android", 1999), Phone5("Vivo", "Android", 3000), Phone6("BlackBerry", "Android", 2500), Phone7(
					"HuaWei", "Android", 2500), Phone8("HTC", "WindowsPhone", 3800), Phone9("OPPO", "Android", 2200);

	private final String brand;
	private final String system;
	private final int price;

	private TEST4(String brand, String system, int price) {
		this.brand = brand;
		this.system = system;
		this.price = price;
	}

	public String getSystem() {
		return this.system;
	}

	public int getPrice() {
		return this.price;
	}

	public String Print() {
		return this.brand + " " + this.system + " " + this.price;
	}

	public static void main(String[] args) {
		if (TEST4.Phone1.getSystem() == "Android" && TEST4.Phone1.getPrice() <= 3000 && TEST4.Phone1.getPrice() >= 2000)
			System.out.println(TEST4.Phone1.Print());
		if (TEST4.Phone2.getSystem() == "Android" && TEST4.Phone2.getPrice() <= 3000 && TEST4.Phone2.getPrice() >= 2000)
			System.out.println(TEST4.Phone2.Print());
		if (TEST4.Phone3.getSystem() == "Android" && TEST4.Phone3.getPrice() <= 3000 && TEST4.Phone3.getPrice() >= 2000)
			System.out.println(TEST4.Phone3.Print());
		if (TEST4.Phone4.getSystem() == "Android" && TEST4.Phone4.getPrice() <= 3000 && TEST4.Phone4.getPrice() >= 2000)
			System.out.println(TEST4.Phone4.Print());
		if (TEST4.Phone5.getSystem() == "Android" && TEST4.Phone5.getPrice() <= 3000 && TEST4.Phone5.getPrice() >= 2000)
			System.out.println(TEST4.Phone5.Print());
		if (TEST4.Phone6.getSystem() == "Android" && TEST4.Phone6.getPrice() <= 3000 && TEST4.Phone6.getPrice() >= 2000)
			System.out.println(TEST4.Phone6.Print());
		if (TEST4.Phone7.getSystem() == "Android" && TEST4.Phone7.getPrice() <= 3000 && TEST4.Phone7.getPrice() >= 2000)
			System.out.println(TEST4.Phone7.Print());
		if (TEST4.Phone8.getSystem() == "Android" && TEST4.Phone8.getPrice() <= 3000 && TEST4.Phone8.getPrice() >= 2000)
			System.out.println(TEST4.Phone8.Print());
		if (TEST4.Phone9.getSystem() == "Android" && TEST4.Phone9.getPrice() <= 3000 && TEST4.Phone9.getPrice() >= 2000)
			System.out.println(TEST4.Phone9.Print());
	}
}
