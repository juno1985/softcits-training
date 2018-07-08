package jvm.mem.stack;
/**
 * VM Args: -Xss128k 设置虚拟机栈的大小为128k
 * @author juno
 * 在递归中无限创建方法栈，最终会导致StackOverFlow
 */
public class StackOverFlowErrTest {
	
	private int stackLength = 1;
	public void stackLeak() {
		System.out.println(stackLength);
		Long a = new Long(0);
		stackLength++;
		stackLeak();
		
	}

	public static void main(String[] args) {
		StackOverFlowErrTest sof = new StackOverFlowErrTest();
		
			sof.stackLeak();
	
	}

}