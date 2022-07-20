package sec16.constructor_access.package2;

import sec16.constructor_access.package1.A;

public class C {
	A a1 = new A(true);  // 다른 패키지 내에서 public 생성자 사용 가능
	A a2 = new A(1);     // 다른 패키지 내에서 default 생성자 사용 불가능
	A a3 = new A("Hello");	// 다른 패키지 내에서 private 생성자 사용 불가능
}
