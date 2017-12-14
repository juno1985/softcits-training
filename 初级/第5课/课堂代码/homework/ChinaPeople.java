package homework;

public class ChinaPeople {
	private String nationality = "中华民国";

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public static void main(String[] args){
		ChinaPeople p = new ChinaPeople();
		p.setNationality("中华人民共和国");
		System.out.println(p.getNationality());
	}
	
}
