
public class homeWork2 {
	public static void main(String[] args){
		//复杂度- 一个程序中计算的次数
		/*for(int i = 1; i <= 100; i++)
		{
			if(i % 7 == 0) System.out.println(i);
		}*/
		//优化后的算法
		int count;
		count = 100/7;
		for(int i = 1; i <= count ; i++){
			if(i != 1)System.out.print(",");
			System.out.print(i*7);
		
		}
	}
}
