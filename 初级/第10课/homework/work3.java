package homework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintLetter{
	private char letter = 'A';
	public void print(){
		System.out.print(letter);
	}
	public void nextLetter(){
		switch(letter){
		case 'A':
			letter = 'B';
			break;
		case 'B':
			letter = 'C';
			break;
		case 'C':
			letter = 'A';
			break;
		}
	}
	public char getLetter(){
		return letter;
	}
}
class PrintRunnable implements Runnable{
	private PrintLetter printLetter = null;
	private char letter = ' ';
	
	public PrintRunnable(PrintLetter printLetter, char letter) {
		this.printLetter = printLetter;
		this.letter = letter;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++){
			synchronized(printLetter){
				while(letter != printLetter.getLetter()){
					try{
						printLetter.wait();
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
				printLetter.print();
				printLetter.nextLetter();
				printLetter.notifyAll();
			}
		}
	}
	
}
public class work3 {
	public static void main(String[] args){
		PrintLetter pl = new PrintLetter();
		ExecutorService threadService = Executors.newFixedThreadPool(3);
		threadService.execute(new PrintRunnable(pl,'A'));
		threadService.execute(new PrintRunnable(pl,'B'));
		threadService.execute(new PrintRunnable(pl,'C'));
		threadService.shutdown();
		
	}
}
