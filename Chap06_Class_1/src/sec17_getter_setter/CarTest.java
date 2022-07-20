package sec17_getter_setter;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car();

		//car1.speed = 10; // speed 멤버 직접 설정 불가능 
		
		car1.setSpeed(-10);
		System.out.println("car1의 속도는 " + car1.getSpeed());
		
		car1.setSpeed(50);
		System.out.println("car1의 속도는 " + car1.getSpeed());
		car1.setStop(true);
		System.out.println("car1이 정지상태 인가요?" + car1.isStop());
		System.out.println("car1의 속도는 " + car1.getSpeed());
	}

}
