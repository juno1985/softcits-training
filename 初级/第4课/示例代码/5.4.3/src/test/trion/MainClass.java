package test.trion;

public class MainClass {
    public static void main(String[] args) {
        Superclass object = new Superclass();
        System.out.println("同一个包的OtherClass类调用Superclass类的print方法：");
        object.print();
    }
}
