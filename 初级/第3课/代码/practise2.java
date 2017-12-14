
public class practise2 {

	public static void main(String[] args) {
		//保存遍历中发现偶数的个数
		int count = 0;
		int[] intArr ={78,64,35,92,48,98,87,94,80,83};
		//遍历数组-循环语句
		for(int i = 0; i < intArr.length; i++){
			if(intArr[i]%2 == 0)
				count++;
			else
			System.out.println(intArr[i]);
		}
		System.out.println("偶数的个数为: " + count);

	}

}
