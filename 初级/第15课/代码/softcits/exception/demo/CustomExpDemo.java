package softcits.exception.demo;

public class CustomExpDemo {

	private static String mobile;
	
	public static void judgeMobile(){
		if(mobile.length() < 11) {
			//抛出业务异常
			throw new CustomExeption("手机位数不对");
		}
		
		/*else if(//手机号码里必须为数字。。。。。)
		{
			
			
			throw new CustomExeption("手机号必须为数字");
		}else if(//手机号不能为空。。。。。。。){
				throw new CustomExeption("手机号不能为空");
				}*/
	}
	
	public static void main(String[] args) {

		mobile = "150";
		
		try{
			judgeMobile();
		}catch(CustomExeption ce){
			System.out.println(ce.getMessage());
		}
		
	}

}
