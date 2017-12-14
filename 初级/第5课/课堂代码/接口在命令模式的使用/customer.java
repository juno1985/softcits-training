package inter.demo;

public class customer {

	public static void main(String[] args) {
		waitor sangen = new waitor();
		sangen.proceed("面条", new cookNoodle());
		
		sangen.proceed("米饭", new cookRice());
		
		sangen.proceed("鱼", new cook(){
			public void cooking(String material) {
				System.out.println("开始做:" + material);
			}
		});
		
	}

}
