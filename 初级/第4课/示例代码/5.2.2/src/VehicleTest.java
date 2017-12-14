class Vehicle {
	void drive() {
		System.out.println("发动机运行，提供动力");
	}
}

class Car extends Vehicle {
	void drive() {
		super.drive();
		System.out.println("发动机带动轮子转动，汽车前进");
	}
}

class Plane extends Vehicle {
	void drive() {
		super.drive();
		System.out.println("发动机带动螺旋桨转动，飞机飞行");
	}
}

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.drive();
		
		Plane p = new Plane();
		p.drive();
	}

}
