package sec09.static_member;

class Calculator {
	static double pi = 3.14159;
}

public class CalculatorTest {

	public static void main(String[] args) {
		// �������� 10.0�� ���� �������ϱ� 
		double area = 10.0 * 10.0 * Calculator.pi;
		System.out.println("�������� 10.0�� ���� ������ " + area);

	}

}
