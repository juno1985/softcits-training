package homework;
interface InterfaceA{
	void printCapitalLetter();
} 
interface InterfaceB{
	void printLowercaseLetter();
}
public class Print implements InterfaceA, InterfaceB{

	public static void main(String[] args) {
		InterfaceA IA = new Print();
		IA.printCapitalLetter();
		InterfaceB IB = new Print();
		IB.printLowercaseLetter();
		/*char a = 'a';
		System.out.println((int)a);*/
	}

	@Override
	public void printLowercaseLetter() {
	/*	for(char i = 'a'; i <= 'z'; i++)
			System.out.print(i);
		System.out.println("");*/
		
		char[] lc = new char[26];
		for(int i = 0; i < 26; i++){
			lc[i] = (char)(i + 97);
		}
		System.out.println(lc);
		/*for(char c : lc)
			System.out.print(c);
		System.out.println("");*/
	}

	@Override
	public void printCapitalLetter() {
		for(char i = 'A'; i <= 'Z'; i++)
			System.out.print(i);
		System.out.println("");
	}

}
