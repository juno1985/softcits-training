
public class homeWork3 {
	public static void main(String[] args){
		float cash = 10000;
		float interest = 0.003f;
		int years = 5;
		while(years-- > 0){
		// 	cash = cash + cash * interest;
		//	cash = cash * (1 + interest);
			cash += cash * interest;
		//	cash *= (1+interest);
		}
		System.out.println(cash);
	}
}
