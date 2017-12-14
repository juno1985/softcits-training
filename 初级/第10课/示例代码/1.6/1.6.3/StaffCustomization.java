import java.io.*;
public class StaffCustomization
	implements java.io.Serializable
{
	private String name;
	private  int age;
	
	public StaffCustomization(String name , int age)
	{
		this.name = name;
		this.age = age;
	}
	private void writeObject(ObjectOutputStream out) throws IOException{
		out.writeObject(this.name + "123");
		out.writeInt(this.age);
	}
	private void readObject(ObjectInputStream in) throws IOException,ClassNotFoundException{
		String temp = in.readObject().toString();
		this.name = temp.substring(0, temp.length()-3);
		this.age = (int) in.readInt();
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
		return "StaffCustomization [name=" + name + ", age=" + age + "]";
	}
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		File f = new File("StaffCus.txt");
		StaffCustomization sc = new StaffCustomization("Jun", 31);
		//serialize the object
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
		out.writeObject(sc);
		//deserialze the object
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
		StaffCustomization sc1 = (StaffCustomization) in.readObject();
		//decrypt the name by cutting last 3 characters
		/*System.out.println("Name is: "+sc1.getName().substring(0, sc1.getName().length()-3) + " and Age is: " + sc1.getAge());*/
		System.out.println(sc1.toString());
		
	}

}