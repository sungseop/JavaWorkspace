package sec03_interface_polymorphism;

interface Vehicle {
	public void run();
}

class Bus implements Vehicle {

	@Override
	public void run() {
		
		System.out.println("버스가 달립니다.");
	}
}

class Taxi implements Vehicle {

	@Override
	public void run() {
		
		System.out.println("택시가 달립니다.");
	}
}
public class VehicleTest {

	public static void main(String[] args) {
		
		Vehicle v1 = new Bus();
		v1.run();
		
		v1 = new Taxi();
		v1.run();
	}
}
