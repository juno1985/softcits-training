

public class addLargeInt {
	
	public static void main(String[] args){
		//声明被加数数组
		int[] a = new int[100];
		//声明加数数组
		int[] b = new int[100];
		//为数组初始化
		for(int i =0;i<100;i++)
			a[i]=(int)(Math.random()*10);
		for(int i =0;i<100;i++)
			b[i]=(int)(Math.random()*10);

		int maxLength = a.length;
		//初始化result数组用来保存结果，位数为100+1
		int[] result = new int[maxLength+1];
		//数组的最高下标保存整数最低位
		for(int i = maxLength -1; i>=0;i--)
		{
			int tempResult = a[i] + b[i];
			if(tempResult>9)
			{
				result[i+1] = tempResult%10;
				if(i==0) result[i]=1;
				else a[i-1]+=1;
			}
			else result[i+1]=tempResult;
		}
	}
}
