package sec13_static_final;

public class StaticFinalTest {
	
	static final double PI = 3.141592; // 상수.
	
	public StaticFinalTest(double pi) {
		this.PI = pi;  // 생성자에서 초기화할 수 없음.
	}
	
	public static void main(String[] args) {
		System.out.println("원의 면적은  " + (5.0*5.0*PI));

		PI = 3.14;	// 값을 수정할 수 없음.
	}

}
