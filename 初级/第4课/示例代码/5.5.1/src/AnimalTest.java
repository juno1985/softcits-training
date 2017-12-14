
class Animal {
	public void say() {
		System.out.println("我叫啊叫啊叫");
	}
}

class Chicken extends Animal {
	//重写方法
	public void say() {
		System.out.println("咯咯哒");
	}	
}

class Dog extends Animal {
	//重写方法
	public void say() {
		System.out.println("汪汪汪");
	}	
}

class Wolf extends Animal {
	//重写方法
	public void say() {
		System.out.println("呜嗷~~");
	}	
}

public class AnimalTest {

	public static void main(String[] args) {
		//父类引用指向子类，但调用的是子类自己方法（运行时根据具体子类来定）
		Animal a1 = new Chicken();
		a1.say();
		
		Animal a2 = new Dog();
		a2.say();
		
		Animal a3 = new Wolf();
		a3.say();
		
		//反之子类引用则不能指向父类对象
//		Dog d = new Animal();
	}

}
