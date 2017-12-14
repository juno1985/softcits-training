public class Staff
	implements java.io.Serializable
{
	private String name;
	private int age;
	// 参数的构造器
	public Staff(String name , int age)
	{
		this.name = name;
		this.age = age;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", age=" + age + "]";
	}
}