package sec02_nested_class_member_access;

public class InnerEx1 {
	class InstanceInner { }	// 인스턴스 멤버 클래스
	static class StaticInner { }  // static 멤버 클래스
	
	// 인스턴스 변수에 인스턴스 멤버 클래스 객체를 대입 가능? : 가능함
	InstanceInner iv = new InstanceInner();
	// static 타입의 변수에 static 클래스 멤버 객체를 대입 가능? : 가능함. 
	static StaticInner cv = new StaticInner();
	
	// static 메소드에서 instance 멤버 타입 사용 가능? 사용 불가능
	static void staticMethod() {
		InstanceInner obj1 = new InstanceInner();
		// static 메소드에서 인스턴스 멤버 타입을 사용하려면 외부클래스의 객체 생성후 사용
		InnerEx1 outer = new InnerEx1();
		InstanceInner obj2 = outer.new InstanceInner();
		
		StaticInner obj3 = new StaticInner();
	}
	
	// 인스턴스 메소드에서 static 멤버 클래스 타입과 인스턴스 멤버 클래스 타입 모두 사용 가능함.
	// 왜냐하면 인스턴스 메소드는 인스턴스가 있는 상태에서 호출될 것이기 때문
	void instanceMethod() {
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		// 다른 메소드에 선언된 로컬 클래스의 사용여부: 접근 불가능
		LocalInner lv = new LocalInner();
	}
	
	// 
	void myMethod() {
		class LocalInner { }  // 로컬 클래스
		
		LocalInner lv = new LocalInner();
	}
}







