package sec16.constructor_access.package1;

public class B {
	A a1 = new A(true);  // 같은 패키지 내에서 public 생성자 사용 가능
	A a2 = new A(1);     // 같은 패키지 내에서 default 생성자 사용 가능
	A a3 = new A("Hello");	// 같은 패키지 내에서 private 생성자 사용 불가능 
}
