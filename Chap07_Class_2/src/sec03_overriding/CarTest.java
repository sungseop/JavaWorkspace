package sec03_overriding;

class Car {
	public void speedLimit() {
		System.out.println("최대 속도는 200km/h 입니다.");
	}
}

class Sonata extends Car {
	@Override
	public void speedLimit() {
		System.out.println("최대 속도는  240km/h 입니다.");
	}
}

public class CarTest {

	public static void main(String[] args) {
		Sonata s1 = new Sonata();
		s1.speedLimit();
	}

}
