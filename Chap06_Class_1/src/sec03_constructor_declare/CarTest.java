package sec03_constructor_declare;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();

		System.out.println("제조회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		
		Car myCar2 = new Car("검정색", "그랜저");
		System.out.println("제조회사: " + myCar2.company);
		System.out.println("모델명: " + myCar2.model);
		System.out.println("색깔: " + myCar2.color);
	}

}
