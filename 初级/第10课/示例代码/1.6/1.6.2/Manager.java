import java.io.*;
public class Manager implements java.io.Serializable{
	private String name;
	private Staff staff;
	public Manager (String name, Staff staff)
	{
		this.setName(name);
		this.setStaff(staff);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	
	@Override
	public String toString() {
		return "Manager [name=" + name + ", staff=" + staff + "]";
	}
	public static void main(String[] args){
		try{
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("manager.txt"));
			//define the staff
			Staff st1 = new Staff("Allen", 30);
			//define 2 managers
			Manager m1 = new Manager("Jack", st1);
			Manager m2 = new Manager("Alex", st1);
			//object output
			oos.writeObject(st1);
			oos.writeObject(m1);
			oos.writeObject(m2);
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
}
