package other.sandgen;

import test.trion.Superclass;

public class SubClassOutofPack extends Superclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClassOutofPack obj = new SubClassOutofPack();
        System.out.println("外部包的子类SubClass调用父类Superclass的print方法：");
        obj.print();
	}

}
