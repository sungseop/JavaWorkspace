package sec07_method_call;

public class Car {
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
