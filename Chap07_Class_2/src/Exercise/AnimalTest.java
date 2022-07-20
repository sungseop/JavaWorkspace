package Exercise;

abstract class Animal {
	int legs;
	
	Animal(int legs) {
		this.legs = legs;
	}
	
	public abstract void move();
	
	public abstract void eat();
}

class Spider extends Animal {
	
	public Spider() {
		super(8);
	}

	@Override
	public void move() {
		
		System.out.printf("거미는 %d개의 다리를 이용하여 움직입니다.\n", legs);
	}

	@Override
	public void eat() {
		
		System.out.println("거미는 곤충을 잡아먹습니다.");
	}
}

class Cat extends Animal {
	public String name;
	
	public Cat() {
		super(4);
	}
	
	public Cat(String name) {
		super(4);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void move() {
		
		System.out.printf("고양이는 %d개의 다리를 이용하여 뜁니다.\n", legs);
	}

	@Override
	public void eat() {
		
		System.out.println("고양이는 쥐를 잡아먹습니다.");
	}
}

class Fish extends Animal {
	public String name;
	
	public Fish() {
		super(0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void move() {
		
		System.out.println("물고기는 지느러미로 헤엄칩니다.");
	}

	@Override
	public void eat() {
		
		System.out.println("물고기는 작은 물고기를 잡아먹습니다.");
	}

}

public class AnimalTest {

	public static void main(String[] args) {
		Cat c = new Cat("나비");
		
		c.eat();
		System.out.println("고양이의 이름은 " + c.getName());
		c.move();
		
		Animal a = new Fish();
		a.eat();
		if (a instanceof Fish) {
			((Fish)a).setName("금붕어");
		}
		a.move();
	}

}






