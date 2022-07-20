package sec01_nested_class;

public class NestedTest {

	public static void main(String[] args) {
		// 인스턴스 멤버 클래스 객체 생성 
		A a = new A();  // 외부 클래스 객체 생성 
		A.B b = a.new B();  // 내부 클래스 객체 생성 
		b.field1 = 5;
		b.method1();

		// static 멤버 클래스 객체 생성
		A.C c = new A.C();
		// static 멤버 변수 사용
		A.x = 10;
		A.C.field1 = 1; // 중첩클래스의 static 멤버 사용
		c.field2 = 5;

		c.method2();    // 인스턴스 메소드 호출
		A.C.method1();  // static 메소드 호출
		
		// 로컬 클래스 사용예
		a.method();
	}

}
