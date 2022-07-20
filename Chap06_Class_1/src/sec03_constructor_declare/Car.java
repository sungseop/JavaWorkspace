package sec03_constructor_declare;

public class Car {

	// 멤버변수
	String company = "현대자동차";
	String model = "소나타";
	String color = "흰색";
	int maxSpeed = 250;
	int speed;	// 현재 자동차의 속력
	
	// 기본 생성자
	Car() { }
	
	// 매개변수가 있는 생성자
	Car(String c, String m) {
		color = c;
		model = m;
	}
	
}
