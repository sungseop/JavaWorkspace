package sec04_super;

class Parent {
	int x = 10;
}

class Child extends Parent {
	int x = 20;
	
	void method1() {
		
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
}

public class SuperTest {

	public static void main(String[] args) {
		Child c = new Child();
		c.method1();
	}

}
