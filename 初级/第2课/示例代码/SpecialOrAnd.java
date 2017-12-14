
public class SpecialOrAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 简洁或 和 非简洁或 的区别
		 */
		//两个判断都会被执行
	/*	int i = 3;
		if ((i++ > 2) | (i++ < 9)) {
			System.out.println(i);
		}*/
		//后面的判断不会被执行
		/*int i = 3;
		if ((i++ > 2) || (i++ < 9)) {
			System.out.println(i);
		}*/
		
		int j = 3;
		if((j++ > 5)&&(j++ <9)){
			
		}
		System.out.println(j);
		j=3;
		if((j++ > 5)&(j++ <9)){
			
		}
		System.out.println(j);
		
	}

}
