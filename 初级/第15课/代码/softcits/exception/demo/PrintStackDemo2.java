package softcits.exception.demo;

public class PrintStackDemo2 {

	private Integer a;
	private Integer b;
	
	public Integer firstCall() throws Exception{
		return secondCall();
	}
	public Integer secondCall() throws Exception{
		return thirdCall();
	}
	public Integer thirdCall() throws Exception{
		
		return this.a / this.b;
		
/*		try{
			result = this.a / this.b;
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			return result;
		}*/
		 
	}
	
	
	public PrintStackDemo2() {
	}
	public PrintStackDemo2(Integer a, Integer b) {
		this.a = a;
		this.b = b;
	}
	
	
	public static void main(String[] args) {

		PrintStackDemo2 psd = new PrintStackDemo2(new Integer(args[0]), 
				new Integer(args[1]));
		Integer result = null;
		try{
			result = psd.thirdCall();
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}

}
