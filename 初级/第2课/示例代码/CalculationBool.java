
public class CalculationBool {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 2;									            //声明int型变量a
		int b = 5; 									            //声明int型变量b
		boolean result = ((a > b) && (a != b));			        //逻辑与&&运算
		boolean result2 = ((a > b) || (a != b));				//逻辑或||运算
		System.out.println("(2 > 5) && (2 != 5) : "+result);	//变量result输出
		System.out.println("(2 > 5) || (2 != 5) : "+result2);	//变量result2输出
		System.out.println("!(5 > 2) = " +!(5 > 2));			//逻辑非！运算
		
		// 直接对false求非运算，将返回true
		System.out.println(!false);
		// 5>3返回true，'6'转换为整数54，'6'>10返回true，求与后返回true
		System.out.println(5 > 3 && '6' > 10);
		// 4>=5返回false，'c'>'a'返回true。求或后返回true
		System.out.println(4 >= 5 || 'c' > 'a');
		// 4>=5返回false，'c'>'a'返回true。两个不同的操作数求异或返回true
		System.out.println(4 >= 5 ^ 'c' > 'a');
	}
}
