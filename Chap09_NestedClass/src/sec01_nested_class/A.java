package sec01_nested_class;

public class A {
	static int x;
	A() {
		System.out.println("A 객체가 생성됨.");
	}
	
	// 인스턴스 멤버 클래스
	public class B {
		B() {
			System.out.println("B 객체가 생성됨.");
		}
		int field1;
		//static int field2;  // static 멤버 선언 불가능
		
		void method1() {
		}
		
		//static void method2() { } // static 멤버 선언 불가능
	}
	
	// static 멤버 클래스
	static class C {
		C() {
			System.out.println("C 객체가 생성됨");
		}
		static int field1;
		int field2;
		
		static void method1() {
		}
		
		void method2() {
		}
	}
	
	void method() {
		// 로컬 클래스
		class D {
			D() {
				System.out.println("D 객체를 생성합니다.");
			}
			int field1;
			void method1() { }
			//static int field2; // 로컬 클래스 내에 선언 불가능
			//static void method2() { } // 로컬 클래스 내에 선언 불가능
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}












