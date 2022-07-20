package sec11_MemberCall;

/*
 * static 멤버, instance 멤버 간의 사용 여부
 */
public class MemberCall {
	int iv = 10;	// 인스턴스 변수
	static int cv = 20;	// static(클래스) 변수
	
	// static 메소드
	static void staticMethod1() {
		System.out.println(cv);
		System.out.println(iv);
		
	}
	
	// 인스턴스 메소드
	void instanceMethod1() {
		System.out.println(cv); // static 변수 사용
		System.out.println(iv); // 인스턴스 변수 사용
	}
	
	// static 메소드
	static void staticMethod2() {
		staticMethod1();
		instanceMethod1();  // 인스턴스 메소드 호출 불가능 
	}
	
	void instanceMethod2() {
		staticMethod1();   // static 메소드 호출 가능
		instanceMethod1(); // 인스턴스 메소드 호출 가능
	}
	
	public static void main(String[] args) {
		MemberCall.staticMethod1();  // static 메소드 호출
		MemberCall.staticMethod2();
		
		MemberCall mc = new MemberCall();
		mc.instanceMethod1();
	}

}
