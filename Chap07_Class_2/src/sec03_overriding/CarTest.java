package sec03_overriding;

class Car {
	public void speedLimit() {
		System.out.println("�ִ� �ӵ��� 200km/h �Դϴ�.");
	}
}

class Sonata extends Car {
	@Override
	public void speedLimit() {
		System.out.println("�ִ� �ӵ���  240km/h �Դϴ�.");
	}
}

public class CarTest {

	public static void main(String[] args) {
		Sonata s1 = new Sonata();
		s1.speedLimit();
	}

}
