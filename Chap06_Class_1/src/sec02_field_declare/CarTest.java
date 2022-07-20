package sec02_field_declare;

public class CarTest {

	public static void main(String[] args) {
		// Car 객체 생성 
		Car myCar = new Car();

		// 필드값 읽기
		System.out.println("제조회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("속도: " + myCar.speed);
		
		// 필드값 변경
		myCar.speed = 60;
		System.out.println("현재 속도는 " + myCar.speed);
		
	}

}
