import java.io.*;

public class ReadManager {
	public static void main(String[] args) {

		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream("manager.txt"));
			Staff st1 = (Staff) ois.readObject();
			Manager m1 = (Manager) ois.readObject();
			Manager m2 = (Manager) ois.readObject();
			
			System.out.println("if m1's quote variable equals st1?:" +(m1.getStaff()==st1));
			System.out.println(st1.toString());
			System.out.println(m1.toString());
			System.out.println(m2.toString());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
