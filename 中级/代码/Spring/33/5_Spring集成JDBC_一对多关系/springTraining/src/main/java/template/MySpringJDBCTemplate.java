package template;

public class MySpringJDBCTemplate {
	public void init(){
		System.out.println("创建数据库连接,准备执行SQL!");
	}
	
	public void destroy(){
		System.out.println("数据库操作结束,关闭连接!");
	}
	
	public void execute(MyCallBackAction mca){
		init();
		//你要做的业务add/delete/update/query
		mca.run();
		destroy();
	}
	
	public void add(){
		execute(new addAction());
	}
	
	public void delete(){
		execute(new MyCallBackAction(){

			@Override
			public void run() {
				System.out.println("删除数据");
			}
			
		});
	}
	
	public class addAction implements MyCallBackAction{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("添加数据");
		}
		
	}
}
