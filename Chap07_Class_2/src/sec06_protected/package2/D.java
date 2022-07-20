package sec06_protected.package2;

import sec06_protected.package1.A;

/*
 * 상속관계에 있을 때 다른 패키지에 있는  protected 멤버 사용 가능함.
 */
public class D extends A {
	public D() {
		super();
		this.fieldA = "abc";
		this.method();
	}
}
