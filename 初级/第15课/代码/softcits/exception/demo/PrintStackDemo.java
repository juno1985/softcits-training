package softcits.exception.demo;

public class PrintStackDemo {

	private Integer a;
	private Integer b;
	
	public Integer firstCall(){
		return secondCall();
	}
	public Integer secondCall(){
		return thirdCall();
	}
	public Integer thirdCall(){
		return this.a / this.b;
	}
	
	
	public PrintStackDemo() {
	}
	public PrintStackDemo(Integer a, Integer b) {
		this.a = a;
		this.b = b;
	}
	
	
	public static void main(String[] args) {

		PrintStackDemo psd = new PrintStackDemo(new Integer(args[0]), 
				new Integer(args[1]));
		Integer result = null;
		try{
			result=psd.firstCall();
		}catch(ArrayIndexOutOfBoundsException aiep){
			/*System.out.println(aiep.getMessage());*/
			aiep.printStackTrace();
			System.out.println("输入的位数不够");
		}catch(NumberFormatException nfep){
			/*System.out.println(nfep.getMessage());*/
			nfep.printStackTrace();
			System.out.println("输入的不是数字");
		}catch(ArithmeticException aep){
			aep.printStackTrace();
			System.out.println("除数不能是零");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("程序出现未知异常");
		}finally{
			System.out.println("计算结果是: " + result);
		}
		
		
	}

}
