package sec03_constructor_declare;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();

		System.out.println("����ȸ��: " + myCar.company);
		System.out.println("�𵨸�: " + myCar.model);
		System.out.println("����: " + myCar.color);
		
		Car myCar2 = new Car("������", "�׷���");
		System.out.println("����ȸ��: " + myCar2.company);
		System.out.println("�𵨸�: " + myCar2.model);
		System.out.println("����: " + myCar2.color);
	}

}
