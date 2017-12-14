
public class ArrayOut {
	public static void main(String[] args){
		
		String[] strArr ={"Hello","World","!"};
		//使用循环为输出
			/*	for(int i = 0; i<strArr.length;i++)
					System.out.print(strArr[i]);*/
				
		//使用foreach循环输出
				for(String strTemp : strArr)
					System.out.print(strTemp);
				
				int[] intArr = {1,2,5,6,7,0,-9};
				for(int intTemp : intArr){
					System.out.println(intTemp);
				}
	}
}
