//定义TableAction类，其中的方法为了使用时通过代理实现自动插入
public class TableAction {
	//吃饭之前，摆好桌子
	public void prepareTable(){
		System.out.println("Prepare the table!");
	};
	//吃饭之后，清理桌子
	public void cleanTable(){
		System.out.println("Clean the table");
	};

}
