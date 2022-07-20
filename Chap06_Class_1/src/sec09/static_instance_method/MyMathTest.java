package sec09.static_instance_method;

class MyMath {
	long a;
	long b;
	
	// �ν��Ͻ� �޼ҵ�
	long add() {
		return a + b;
	}
	
	// static �޼ҵ�
	static long add(long x, long y) {
		return x + y;
	}
}

public class MyMathTest {

	public static void main(String[] args) {
		// static �޼ҵ��� ���
		System.out.println(MyMath.add(120L, 130L));
		
		// instance �޼ҵ��� ���
		MyMath mm = new MyMath();
		mm.a = 123L;
		mm.b = 234L;
		System.out.println(mm.add()); // ��ü ������ ��밡���� �޼ҵ�

	}

}
