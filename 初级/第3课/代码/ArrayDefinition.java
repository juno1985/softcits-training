import java.util.Arrays;

public class ArrayDefinition {
	public static void main(String[] args){
		//静态初始化
		int[] intArr;
		intArr = new int[]{1, 2, 3, 4, 5, 6, 9, 22, 10, 89, -1, -99, 0};
		
		String[] objArr = new String[]{"we","are","learning","JAVA", "."};
		//此外还可以简化写法
		String[] objArr2 = {"we","are","learning","JAVA", "."};
		
		/*String a = objArr2[2];
		System.out.println(a);*/
		
		
		//动态初始化
		String[] strArr = new String[5];
		System.out.println("strArr的长度为: "+strArr.length);
	for(int i =0; i<5; i++)
			strArr[i] = "abc";
		//覆盖第一个元素
		strArr[0]="Hello";
		
		for(int i = 0; i< 5 ;i++)
			System.out.println(strArr[i]);
		
	}
}
