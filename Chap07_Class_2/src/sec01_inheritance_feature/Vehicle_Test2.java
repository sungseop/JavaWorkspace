package sec01_inheritance_feature;

class Vehicle {
	String color;
	private int speed;
	private int size;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
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
		System.out.println("�ڵ��� speed: " + getSpeed());
		System.out.println("�ڵ��� size: " + getSize());
		System.out.println("�ڵ��� CC : " + CC);
		System.out.println("�ڵ��� ���� : " + gears);
	}
}

public class Vehicle_Test2 {
	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "���";
		c1.setSpeed(100);
		c1.setSize(20);
		c1.display();
		
		c1.CC = 2000;
		c1.gears = 5;
		c1.displayCar();
	}
}
