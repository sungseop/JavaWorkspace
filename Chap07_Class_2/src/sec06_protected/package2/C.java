package sec06_protected.package2;

import sec06_protected.package1.A;

/*
 * �ٸ� ��Ű���� �ִ� protected ����� ��� ���� ����
 * ��� �Ұ����� 
 */
public class C {
	public void method() {
		A a = new A();
		a.fieldA = "123";
		a.method();
	}
}
