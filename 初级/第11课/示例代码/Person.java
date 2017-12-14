
public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object anotherPerson) {
		Person ap = (Person) anotherPerson;
		if(this.getClass()==ap.getClass() 
				&& this.getAge()==ap.getAge()
				&&this.getName().equals(ap.getName())){
		return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Person p1 = new Person("张三", 30);
		Person p2 = new Person("张三", 30);
		System.out.println(p1.equals(p2));
	}

}
