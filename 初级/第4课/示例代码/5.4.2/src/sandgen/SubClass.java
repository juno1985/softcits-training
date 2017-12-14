package sandgen;

import softcits.Superclass;

public class SubClass extends Superclass {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        System.out.println("子类SubClass调用父类Superclass的print方法：");
        obj.print();
    }
}

