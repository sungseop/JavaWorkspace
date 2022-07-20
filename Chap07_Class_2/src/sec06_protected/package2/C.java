package sec06_protected.package2;

import sec06_protected.package1.A;

/*
 * 다른 패키지에 있는 protected 멤버의 사용 가능 여부
 * 사용 불가능함 
 */
public class C {
	public void method() {
		A a = new A();
		a.fieldA = "123";
		a.method();
	}
}
