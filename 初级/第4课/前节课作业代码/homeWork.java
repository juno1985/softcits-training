

/**
 * 下列整型数组，求出数组元素的和，平均数，数组元素的最大值和最小值， 并输出所求的结果。 78,64,35,92,48,98,87,94,80,83
 */
public abstract class homeWork {
	static int sum = 0;
	static int min;
	static int max;
	static int avg;
	static int[] array = { 78, 64, 35, 92, 48, 98, 87, 94, 80, 83 };
	public static void main(String[] args) {
		
		
		min = array[0];
		max = array[0];
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			if (min > array[i])
				min = array[i];
			if (max < array[i])
				max = array[i];
		}
		avg = sum / array.length;
		System.out.println("max: " + max + " min:" + min + " sum:" + sum + " avg:" + avg);
	}

}
