package sec05_final_method;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}
	
	// 부모 클래스의  final 메소드를 오버라이드해서 정의할 수 없음.
	public void stop() {
	}
}
