package softcits.exception.demo;

public class DivTest {
	
	private Integer a;
	private Integer b;

	public static void main(String[] args) {
		
		DivTest dt = new DivTest();
		Integer result = null;
		try{
			//将String转化成Integer类型
			dt.a = new Integer(args[0]);
			
			dt.b = new Integer(args[1]);
			
			result = dt.a / dt.b;
		}catch(ArrayIndexOutOfBoundsException aiep){
			/*System.out.println(aiep.getMessage());*/
			System.out.println("输入的位数不够");
		}catch(NumberFormatException nfep){
			/*System.out.println(nfep.getMessage());*/
			System.out.println("输入的不是数字");
		}catch(ArithmeticException aep){
			System.out.println("除数不能是零");
		}catch(Exception e){
			System.out.println("程序出现未知异常");
		}
		/*result.toString();*/
		
		System.out.println("结果是: " + result);
	}

}
