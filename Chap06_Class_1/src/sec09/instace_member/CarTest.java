package sec09.instace_member;

class Car {
	String model;  // �𵨸�
	int    speed;  // ���� �ӵ�
	
	// ������
	Car(String model) {
		this.model = model;
	}
	
	// �ڵ����� �ӵ��� �����ϴ� �޼ҵ�
	// ���� �����ϰ� ���ϰ��� ����.
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// �ڵ����� �޸��� ����� �޼ҵ�
	void run() {
		
		for (int i=0; i<=50; i+=10) {
			setSpeed(i); // �ڱⰡ ���� �ִ� �޼ҵ� ȣ��(��ü �������� �����)
			
			System.out.println(model+"�� �ü� " + speed + "km�� �޸��ϴ�.");
		}
	}
}

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car("�ҳ�Ÿ");
		Car car2 = new Car("ī�Ϲ�");

		car1.speed = 50;
		System.out.println("car1�� ���� �ӵ��� " + car1.speed);
		
		car2.speed = 60;
		System.out.println("car2�� ���� �ӵ��� " + car2.speed);
	}

}
