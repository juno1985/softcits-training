package student.sort;

public class Student implements Comparable{
	//学号
	private int id;
	//姓名
	private String name;
	//手机号
	private String mobile;
	//无参数构造器
	public Student(){}
	
	//多参数构造器
	public Student(int id, String name, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public int compareTo(Object o) {
		Student s = (Student)o;
	/*	if (this.getId() > s.getId()) return 1;
		else if(this.getId() < s.getId()) return -1;
		else return 0;*/
		
		return this.getId() > s.getId() ? 
				1 : this.getId() < s.getId() ? -1 : 0;
	}

	@Override
	public String toString() {
		return "(id=" + id + ", name=" + name + ", mobile=" + mobile + ")";
	}
	
}
