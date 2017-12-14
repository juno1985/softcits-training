
public class ArrayParseValue {
	public static void main(String[] args){
		char[] str_a =  {'a','b','c'};
		//声明数组str_b
		char[] str_b = new char[2];
		//将str_a赋给str_b
		str_b = str_a;
	for(char temp: str_b)
			System.out.println(temp);
	
	System.out.println(str_b.length);
	}
}
