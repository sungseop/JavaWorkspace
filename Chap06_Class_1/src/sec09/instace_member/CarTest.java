package sec09.instace_member;

class Car {
	String model;  // 모델명
	int    speed;  // 현재 속도
	
	// 생성자
	Car(String model) {
		this.model = model;
	}
	
	// 자동차의 속도를 설정하는 메소드
	// 값만 설정하고 리턴값이 없음.
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// 자동차가 달리는 기능의 메소드
	void run() {
		
		for (int i=0; i<=50; i+=10) {
			setSpeed(i); // 자기가 갖고 있는 메소드 호출(객체 생성없이 사용함)
			
			System.out.println(model+"가 시속 " + speed + "km로 달립니다.");
		}
	}
}

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car("소나타");
		Car car2 = new Car("카니발");

		car1.speed = 50;
		System.out.println("car1의 현재 속도는 " + car1.speed);
		
		car2.speed = 60;
		System.out.println("car2의 현재 속도는 " + car2.speed);
	}

}
