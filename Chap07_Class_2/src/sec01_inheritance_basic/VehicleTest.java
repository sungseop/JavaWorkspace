package sec01_inheritance_basic;

class Vehicle {
	String color;
	int speed;
	int size;
	
	void display() {
		System.out.println("color: " + color);
		System.out.println("speed: " + speed);
		System.out.println("size: " + size);
	}
}

class Car extends Vehicle {
	int CC;
	int gears;
	
	void displayCar() {
		System.out.println("�ڵ��� color: " + color);
		System.out.println("�ڵ��� speed: " + speed);
		System.out.println("�ڵ��� size: " + size);
		System.out.println("�ڵ��� CC : " + CC);
		System.out.println("�ڵ��� ���� : " + gears);
	}
}

public class VehicleTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "���";
		c1.speed = 100;
		c1.size = 20;
		c1.display();
		
		c1.CC = 2000;
		c1.gears = 5;
		c1.displayCar();
	}
}
