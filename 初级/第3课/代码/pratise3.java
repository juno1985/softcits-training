
public class pratise3 {
	public static void main(String[] args){
		//用来保存临时数据
		int temp ;
		int intArr[] = {49,38,65,97,76,13,22,45,68,90,23,56,21,1,3,9,999,3457,877};
		//第一层循环控制遍历次数
		for (int i = 0; i < intArr.length -1 ; i++)
		{
			//第二层循环控制遍历比较大小
			for(int j =0 ; j < intArr.length - 1 - i;j++){
				if(intArr[j] > intArr[j+1])
				{
					temp = intArr[j+1];
					intArr[j+1] = intArr[j];
					intArr[j] = temp;
				}
 			}
		}
		for(int a : intArr)
			System.out.println(a);
	}
}
