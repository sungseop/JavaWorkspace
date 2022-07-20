package sec11_MemberCall;

/*
 * static ���, instance ��� ���� ��� ����
 */
public class MemberCall {
	int iv = 10;	// �ν��Ͻ� ����
	static int cv = 20;	// static(Ŭ����) ����
	
	// static �޼ҵ�
	static void staticMethod1() {
		System.out.println(cv);
		System.out.println(iv);
		
	}
	
	// �ν��Ͻ� �޼ҵ�
	void instanceMethod1() {
		System.out.println(cv); // static ���� ���
		System.out.println(iv); // �ν��Ͻ� ���� ���
	}
	
	// static �޼ҵ�
	static void staticMethod2() {
		staticMethod1();
		instanceMethod1();  // �ν��Ͻ� �޼ҵ� ȣ�� �Ұ��� 
	}
	
	void instanceMethod2() {
		staticMethod1();   // static �޼ҵ� ȣ�� ����
		instanceMethod1(); // �ν��Ͻ� �޼ҵ� ȣ�� ����
	}
	
	public static void main(String[] args) {
		MemberCall.staticMethod1();  // static �޼ҵ� ȣ��
		MemberCall.staticMethod2();
		
		MemberCall mc = new MemberCall();
		mc.instanceMethod1();
	}

}
