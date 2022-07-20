package sec06_protected.package1;

/*
 * 같은 패키지 내에서 protected 멤버의 사용 가능 여부 테스트
 */
public class B {

	public void method() {
		A a = new A();
		a.fieldA = "123";
		a.method();
	}
}
