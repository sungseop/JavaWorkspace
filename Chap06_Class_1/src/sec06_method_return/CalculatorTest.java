package sec06_method_return;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int sum = cal.add(5, 4); // �޼ҵ带 ȣ���ϸ� �޼ҵ忡�� ����� ��������� ġȯ

		System.out.println("sum(5,4)="+sum);
		
		// �μ��� ������ �����ϱ� ���� subtract() ȣ��
		int a = 10;
		int b = 7;
		System.out.println(cal.subtract(a, b)); // ������ ����(argument)�� �Է� ����
		
		// ��ȯ���� ���� �޼ҵ� ȣ��
		cal.multiply(a, b);
		
		// ���� ����� ��� 
		cal.displayResult();
	}

}
