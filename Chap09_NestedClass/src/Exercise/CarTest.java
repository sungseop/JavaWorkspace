package Exercise;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car("포르쉐");
		Car.Tire tire = car.new Tire(20);
		tire.display();
		
		Car car1 = new Car("모닝");
		Car.Tire tire1 = car1.new Tire(15);
		tire1.display();
		
		Car car2 = new Car("아반테");
		Car.Tire tire2 = car2.new Tire(16);
		tire2.display();
	}

}
