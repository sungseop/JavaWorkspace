package sec05_final_method;

public class Car {
	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	
	public final void stop() {
		System.out.println("���� ����ϴ�.");
		speed = 0;
	}
}
