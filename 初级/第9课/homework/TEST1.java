package StudentHomework;


	public class TEST1 {  
		  public static void main(String[] args) {  
			    Print print = new Print();  
		 
		        Num n = new Num(print);  
		        Alphabetical a = new Alphabetical(print);  
		        //新建两个线程
		        Thread t1 = new Thread(n);  
		        Thread t2 = new Thread(a);  
		        //线程运行
		        t1.start();  
		        t2.start();  
		    }  
		}  
		  
		class Print { 
			//用来判断打印数字或字母的标志
		    boolean flag = false;  
		    //
		    public synchronized void printnum() throws InterruptedException {  
		        for (int i = 1; i <= 9; i++) {  
		        	//只有flag为false的情况才打印数字num
		          while (flag == true) {
		        	  //否则等待
		                this.wait();  
		            }  
		          //打印数字
		            System.out.print(i);  
//		            if (i % 1 == 0) {  
		               flag = true;  
		               this.notify();  
//		            }  
		       }  
		    }  
		  
		    public synchronized void printa() throws InterruptedException {  
		        for (int i = 1; i <= 9; i++) { 
		        	//只有flag为true的情况才打印字母
		            while (flag == false) { 
		            	//否则等待
		                this.wait();  
		            }  
		            //打印字母
		            System.out.println((char) (i + 64));  
		            flag = false;  
		            this.notify();  
		  
	        }  
		   }  
		}  
	 
		class Num implements Runnable {  
		    Print p;  
		  
		    public Num(Print p) {  
		        super();  
		        this.p = p;  
		    }  
		  
		    @Override  
	    public void run() {  
		       try {  
		            p.printnum();  
		        } catch (InterruptedException e) {  
		            // TODO Auto-generated catch block  
		            e.printStackTrace();  
		        }  
		    }  
		  
		}  
		  
		class Alphabetical implements Runnable {  
		    Print p;  
		  
		    public Alphabetical(Print p) {  
		        super();  
		        this.p = p;  
		    }  
		 
	    @Override  
	    public void run() {  
		        try {  
		           p.printa();  
		        } catch (InterruptedException e) {  
		            e.printStackTrace();  
		        }  
		    }  
		  
		}  


