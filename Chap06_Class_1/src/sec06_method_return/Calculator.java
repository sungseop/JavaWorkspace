package sec06_method_return;

public class Calculator {
	int mul_result;	// ��������� �����ϴ� �������
	
	// ���� ������ �����ϴ� �޼ҵ�
	// ��ȯŸ��: int
	int add(int a, int b) {
		int result = 0;
		
		result = a + b;
		
		return result;
	}
	
	// ���� ������ �����ϴ� �޼ҵ�: �޼ҵ��->subtract
	// ��ȯ Ÿ��: int
	// �Է� �Ķ����: a, b
	int subtract(int a, int b) {
		int result = a - b;
		
		return result;
	}
	
	// ��ȯ���� ���� �޼ҵ�
	// ������ ����� ��� ����
	void multiply(int a, int b) {
		mul_result = a * b;
	}
	
	// ������� mulResult �� ���� ���
	void displayResult() {
		System.out.println(mul_result);
	}
}







