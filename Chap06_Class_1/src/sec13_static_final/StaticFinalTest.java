package sec13_static_final;

public class StaticFinalTest {
	
	static final double PI = 3.141592; // ���.
	
	public StaticFinalTest(double pi) {
		this.PI = pi;  // �����ڿ��� �ʱ�ȭ�� �� ����.
	}
	
	public static void main(String[] args) {
		System.out.println("���� ������  " + (5.0*5.0*PI));

		PI = 3.14;	// ���� ������ �� ����.
	}

}
