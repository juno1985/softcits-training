
public class practise1 {
	public static void main(String[] args){
		//声明一个10个长度的int数组
		int[] intArr = new int[10];
	/*	intArr[0]...intArr[9];*/
		//使用循环为每个元素赋值
		for(int i = 0; i < 10 ; i++){
			intArr[i] = i + 1;
		}
		//遍历输出数组元素
		for(int temp:intArr)
			System.out.print(temp+" ");
		
		//遍历输出数组元素的另一种写法
		/*for(int i = 0; i< 10; i++)
			System.out.print(intArr[i]+" ");*/
	
	}
}
