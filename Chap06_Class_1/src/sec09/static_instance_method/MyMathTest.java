package sec09.static_instance_method;

class MyMath {
	long a;
	long b;
	
	// 인스턴스 메소드
	long add() {
		return a + b;
	}
	
	// static 메소드
	static long add(long x, long y) {
		return x + y;
	}
}

public class MyMathTest {

	public static void main(String[] args) {
		// static 메소드의 사용
		System.out.println(MyMath.add(120L, 130L));
		
		// instance 메소드의 사용
		MyMath mm = new MyMath();
		mm.a = 123L;
		mm.b = 234L;
		System.out.println(mm.add()); // 객체 생성후 사용가능한 메소드

	}

}
