package sec03_constructor_declare;

public class Car {

	// �������
	String company = "�����ڵ���";
	String model = "�ҳ�Ÿ";
	String color = "���";
	int maxSpeed = 250;
	int speed;	// ���� �ڵ����� �ӷ�
	
	// �⺻ ������
	Car() { }
	
	// �Ű������� �ִ� ������
	Car(String c, String m) {
		color = c;
		model = m;
	}
	
}
