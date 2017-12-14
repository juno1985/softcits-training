public class IntegerValTest
{
	public static void main(String[] args)
	{
		// 下面代码是正确的，系统会自动把56当成byte类型处理
		byte a = 56;
		/*
		下面代码是错的，系统不会把9999999999999当成long类型处理，
		所以超出int的表数范围，从而引起错误
		*/
//		 long bigValue = 9999999999999;
		// 下面代码是正确的，在巨大的整数值后使用L后缀，强制使用long类型
		long bigValue2 = 9223372036854775807L;

		// 以0开头的整数值是8进制的整数
		int octalValue = 013;
		System.out.println("八进制测试：" + octalValue);
		// 以0x或0X开头的整数值是16进制的整数
		int hexValue1 = 0x23;
		int hexValue2 = 0XaF;

		System.out.println("我的年龄：" + hexValue1);
		System.out.println(hexValue2);

		// 定义一个32位的二进制数,最高位是符号位。
		int binVal1 = 0b11010100;
		int binVal2 = 0B10000000000000000000000000000011;
		System.out.println(binVal1);
		System.out.println(binVal2); 
		
		/*
		 定义一个8位的二进制，该数值默认占32位，因此它是一个正数。
		 只是强制类型转换成byte时产生了溢出，最终导致binVal4变成了-23
		 */
		byte binVal3 = (byte)0b11101001;
		System.out.println(binVal3);
		
		/*
		  定义一个32位的二进制数,最高位是1。
		  但由于数值后添加了L后缀，因此该整数的实际占64位，第32位的1不是符号位。
		  因此binVal5的值等于2的31次方 + 2 + 1
		 */
		long binVal4 = 0B10000000000000000000000000000011L;
		System.out.println(binVal4); 
	}
}